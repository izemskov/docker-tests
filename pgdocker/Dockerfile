FROM postgres:11.2

ENV POSTGRES_DB sttest
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 1234567890

COPY create.sql /docker-entrypoint-initdb.d/
