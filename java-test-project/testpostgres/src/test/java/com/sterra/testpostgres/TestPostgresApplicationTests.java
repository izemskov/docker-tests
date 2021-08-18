package com.sterra.testpostgres;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootTest
@RunWith(SpringRunner.class)
@Import(SpringBoorVerifyDBTestConfiguration.class)
public class TestPostgresApplicationTests {
	@Autowired
	private DataSource dataSource;

	@Before
	public void setup() throws SQLException {
		Connection connection = dataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("TRUNCATE TABLE st_table");
		statement.executeUpdate();
	}

	@Test
	public void test1() throws SQLException {
		Connection connection = dataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("INSERT INTO st_table (name) VALUES ('test')");
		statement.executeUpdate();

		statement = connection.prepareStatement("SELECT name FROM st_table");
		statement.executeQuery();
		ResultSet resultSet = statement.getResultSet();
		resultSet.next();

		String name = resultSet.getString(1);

		Assert.assertEquals(name, "test");
	}
}
