--
-- PostgreSQL database dump
--

-- Dumped from database version 11.2
-- Dumped by pg_dump version 11.2

-- Started on 2021-08-18 18:32:44

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 197 (class 1259 OID 520483)
-- Name: st_table_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.st_table_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.st_table_sequence OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 520476)
-- Name: st_table; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.st_table (
    id bigint DEFAULT nextval('public.st_table_sequence'::regclass) NOT NULL,
    name character varying(255)
);


ALTER TABLE public.st_table OWNER TO postgres;

--
-- TOC entry 2809 (class 0 OID 520476)
-- Dependencies: 196
-- Data for Name: st_table; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.st_table (id, name) FROM stdin;
12	test
\.


--
-- TOC entry 2816 (class 0 OID 0)
-- Dependencies: 197
-- Name: st_table_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.st_table_sequence', 12, true);


--
-- TOC entry 2687 (class 2606 OID 520480)
-- Name: st_table st_table_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.st_table
    ADD CONSTRAINT st_table_pkey PRIMARY KEY (id);


-- Completed on 2021-08-18 18:32:45

--
-- PostgreSQL database dump complete
--

