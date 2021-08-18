/*
 *
 * This software is copyright protected (c) 2021 by S-Terra CSP
 *
 * Author:              Ilya Zemskov
 * E-mail:              izemskov@s-terra.com
 *
 * Owner:               Ilya Zemskov
 * E-mail:              izemskov@s-terra.com
 *
 * $Header: /cvs/updater/server/tools/updb_convertor/src/test/java/com/sterra/updbconvertor/test/verifydb/SpringBoorVerifyDBTestConfiguration.java,v 1.2 2021/04/08 14:15:35 izemskov Exp $
 *
 */
package com.sterra.testpostgres;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@TestConfiguration
public class SpringBoorVerifyDBTestConfiguration {
    @Value("${st.port}")
    private String port;

    @Value("${st.db}")
    private String db;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://pgdocker:" + port + "/" + db + "?sslmode=disable");
        dataSource.setUsername("postgres");
        dataSource.setPassword("1234567890");

        return dataSource;
    }
}
