--
-- PostgreSQL database dump
--

-- Dumped from database version 9.2.2
-- Dumped by pg_dump version 9.2.2
-- Started on 2013-08-13 19:48:32

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 173 (class 3079 OID 11727)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1946 (class 0 OID 0)
-- Dependencies: 173
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 168 (class 1259 OID 24657)
-- Name: event; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE event (
    id integer NOT NULL,
    tournamentid integer NOT NULL,
    eventname character varying(25),
    eventdate character varying(20),
    maxparticipants integer,
    usatt boolean,
    firstpl character varying(25),
    secondpl character varying(25),
    thirdpl character varying(25),
    fourthpl character varying(25),
    fifthpl character varying(25),
    sixthpl character varying(25),
    seventhpl character varying(25),
    eighth character varying(25),
    fee character varying(10),
    "fineText" character varying(2048),
    eventorder integer,
    eventtime character varying(10)
);


ALTER TABLE public.event OWNER TO postgres;

--
-- TOC entry 169 (class 1259 OID 24663)
-- Name: event_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE event_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.event_id_seq OWNER TO postgres;

--
-- TOC entry 1947 (class 0 OID 0)
-- Dependencies: 169
-- Name: event_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE event_id_seq OWNED BY event.id;


--
-- TOC entry 170 (class 1259 OID 24665)
-- Name: event_tournamentid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE event_tournamentid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.event_tournamentid_seq OWNER TO postgres;

--
-- TOC entry 1948 (class 0 OID 0)
-- Dependencies: 170
-- Name: event_tournamentid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE event_tournamentid_seq OWNED BY event.tournamentid;


--
-- TOC entry 171 (class 1259 OID 24667)
-- Name: tournament; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tournament (
    id integer NOT NULL,
    tname character varying(100),
    date character varying(100),
    stars integer,
    deadline character varying(2048),
    policy character varying(2048),
    eligibility character varying(2048)
);


ALTER TABLE public.tournament OWNER TO postgres;

--
-- TOC entry 172 (class 1259 OID 24670)
-- Name: tournament_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tournament_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tournament_id_seq OWNER TO postgres;

--
-- TOC entry 1949 (class 0 OID 0)
-- Dependencies: 172
-- Name: tournament_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tournament_id_seq OWNED BY tournament.id;


--
-- TOC entry 1926 (class 2604 OID 24672)
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY event ALTER COLUMN id SET DEFAULT nextval('event_id_seq'::regclass);


--
-- TOC entry 1927 (class 2604 OID 24673)
-- Name: tournamentid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY event ALTER COLUMN tournamentid SET DEFAULT nextval('event_tournamentid_seq'::regclass);


--
-- TOC entry 1928 (class 2604 OID 24674)
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tournament ALTER COLUMN id SET DEFAULT nextval('tournament_id_seq'::regclass);


--
-- TOC entry 1934 (class 0 OID 24657)
-- Dependencies: 168
-- Data for Name: event; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY event (id, tournamentid, eventname, eventdate, maxparticipants, usatt, firstpl, secondpl, thirdpl, fourthpl, fifthpl, sixthpl, seventhpl, eighth, fee, "fineText", eventorder, eventtime) FROM stdin;
822	64	Open Singles	SUN	32	t	$1500	$750	$250	\N		\N		\N	$50		1	2:00 PM
823	64	Under 2500	SUN	32	t	$300	$150	$75	\N		\N		\N	$40		2	10:00 AM
824	64	Under 2350	SUN	48	t	$200	$100	$50	\N		\N		\N	$35		3	3:30 PM
825	64	Under 2200	SUN	48	t	$150	$75	$30	\N		\N		\N	$30		4	12:00 PM
826	64	Under 2050	SUN	32	t	$125	$60		\N		\N		\N	$30		5	2:00 PM
827	64	Under 1900	SUN	32	t	$100	$50		\N		\N		\N	$30		6	10:00 AM
828	64	Under 1750	SAT	32	t	$50	T		\N		\N		\N	$25		7	2:00 PM
829	64	Under 1600	SAT	32	t	T	T		\N		\N		\N	$20		8	10:00 AM
830	64	Under 1450	SAT	24	t	T	T		\N		\N		\N	$20		9	12:00 PM
831	64	Under 1300	SAT	24	t	T	T		\N		\N		\N	$20		10	3:30 PM
832	64	Under 1150	SAT	24	t	T	T		\N		\N		\N	$20		11	2:00 PM
833	64	Under 1000	SAT	24	t	T	T		\N		\N		\N	$20		12	10:00 AM
834	64	14 & Under	SAT	16	t	T	T		\N		\N		\N	$20		13	11:00 AM
835	64	40 & Over	SAT	16	t	$100	$50		\N		\N		\N	$30		14	11:00 AM
487	38	Open Singles	SUN	32	t	$1500	$750	$250	\N		\N		\N	$50		1	2:00 PM
488	38	Under 2500	SUN	32	t	$300	$150	$75	\N		\N		\N	$40		2	10:00 AM
489	38	Under 2350	SUN	48	t	$200	$100	$50	\N		\N		\N	$35		3	3:30 PM
496	38	Under 2200	SUN	48	t	$150	$75	$30	\N		\N		\N	$30		4	12:00 PM
497	38	Under 2050	SUN	32	t	$125	$60		\N		\N		\N	$30		5	2:00 PM
498	38	Under 1900	SUN	32	t	$100	$50		\N		\N		\N	$30		6	10:00 AM
499	38	Under 1750	SAT	32	t	$50	T		\N		\N		\N	$25		7	2:00 PM
500	38	Under 1600	SAT	32	t	T	T		\N		\N		\N	$20		8	10:00 AM
501	38	Under 1450	SAT	24	t	T	T		\N		\N		\N	$20		9	12:00 PM
502	38	Under 1300	SAT	24	t	T	T		\N		\N		\N	$20		10	3:30 PM
503	38	Under 1150	SAT	24	t	T	T		\N		\N		\N	$20		11	2:00 PM
504	38	Under 1000	SAT	24	t	T	T		\N		\N		\N	$20		12	10:00 AM
505	38	14 & Under	SAT	16	t	T	T		\N		\N		\N	$20		13	11:00 AM
506	38	40 & Over	SAT	16	t	$100	$50		\N		\N		\N	$30		14	11:00 AM
507	38	Handicap*	SAT	32	t	$100	$50		\N		\N		\N	$25	<strong>(*) HANDICAP:</strong> Higher-rated player \r\nwill be handicapped by 1 point for \r\nevery 75-point rating advantage over \r\nlower-rated player, with a maximum \r\nof 7 points per 11-point game.	15	12:00 PM
508	38	Doubles Open**	SAT	16	t	$100	$50		\N		\N		\N	$30 (team)	<strong>(**) DOUBLES:</strong> In Doubles U-3000, \r\nthe combined USATT ratings of the \r\ntwo players must be under 3000. \r\nThe Doubles Open has no limit. The \r\nresults of all Doubles matches will \r\nnot affect USATT ratings.	16	3:00 PM
509	38	Doubles U-3000**	SAT	16	t	$100	$50		\N		\N		\N	$30 (team)		17	3:00 PM
836	64	Handicap*	SAT	32	t	$100	$50		\N		\N		\N	$25	<strong>(*) HANDICAP:</strong> Higher-rated player \r\nwill be handicapped by 1 point for \r\nevery 75-point rating advantage over \r\nlower-rated player, with a maximum \r\nof 7 points per 11-point game.	15	12:00 PM
837	64	Doubles Open**	SAT	16	t	$100	$50		\N		\N		\N	$30 (team)	<strong>(**) DOUBLES:</strong> In Doubles U-3000, \r\nthe combined USATT ratings of the \r\ntwo players must be under 3000. \r\nThe Doubles Open has no limit. The \r\nresults of all Doubles matches will \r\nnot affect USATT ratings.	16	3:00 PM
838	64	Doubles U-3000**	SAT	16	t	$100	$50		\N		\N		\N	$30 (team)		17	3:00 PM
\.


--
-- TOC entry 1950 (class 0 OID 0)
-- Dependencies: 169
-- Name: event_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('event_id_seq', 838, true);


--
-- TOC entry 1951 (class 0 OID 0)
-- Dependencies: 170
-- Name: event_tournamentid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('event_tournamentid_seq', 22, true);


--
-- TOC entry 1937 (class 0 OID 24667)
-- Dependencies: 171
-- Data for Name: tournament; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tournament (id, tname, date, stars, deadline, policy, eligibility) FROM stdin;
38	July	July 20-21, 2013	3	\N	\N	\N
64	Testing	Testing date	5	testing 1	testing 2	testing 3
\.


--
-- TOC entry 1952 (class 0 OID 0)
-- Dependencies: 172
-- Name: tournament_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('tournament_id_seq', 64, true);


--
-- TOC entry 1930 (class 2606 OID 24676)
-- Name: event_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY event
    ADD CONSTRAINT event_pkey PRIMARY KEY (id);


--
-- TOC entry 1932 (class 2606 OID 24678)
-- Name: tournament_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tournament
    ADD CONSTRAINT tournament_pkey PRIMARY KEY (id);


--
-- TOC entry 1933 (class 2606 OID 24679)
-- Name: event_tournamentid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY event
    ADD CONSTRAINT event_tournamentid_fkey FOREIGN KEY (tournamentid) REFERENCES tournament(id);


--
-- TOC entry 1945 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2013-08-13 19:48:33

--
-- PostgreSQL database dump complete
--

