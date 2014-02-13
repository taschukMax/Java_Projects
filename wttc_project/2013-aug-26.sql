--
-- PostgreSQL database dump
--

-- Dumped from database version 9.2.4
-- Dumped by pg_dump version 9.2.2
-- Started on 2013-08-26 15:01:14

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

DROP DATABASE wttc;
--
-- TOC entry 1943 (class 1262 OID 16932)
-- Name: wttc; Type: DATABASE; Schema: -; Owner: -
--

CREATE DATABASE wttc WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';


\connect wttc

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 6 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA public;


--
-- TOC entry 1944 (class 0 OID 0)
-- Dependencies: 6
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- TOC entry 173 (class 3079 OID 11727)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1945 (class 0 OID 0)
-- Dependencies: 173
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_with_oids = false;

--
-- TOC entry 168 (class 1259 OID 16933)
-- Name: event; Type: TABLE; Schema: public; Owner: -
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


--
-- TOC entry 169 (class 1259 OID 16939)
-- Name: event_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE event_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 1946 (class 0 OID 0)
-- Dependencies: 169
-- Name: event_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE event_id_seq OWNED BY event.id;


--
-- TOC entry 170 (class 1259 OID 16941)
-- Name: event_tournamentid_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE event_tournamentid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 1947 (class 0 OID 0)
-- Dependencies: 170
-- Name: event_tournamentid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE event_tournamentid_seq OWNED BY event.tournamentid;


--
-- TOC entry 171 (class 1259 OID 16943)
-- Name: tournament; Type: TABLE; Schema: public; Owner: -
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


--
-- TOC entry 172 (class 1259 OID 16949)
-- Name: tournament_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE tournament_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 1948 (class 0 OID 0)
-- Dependencies: 172
-- Name: tournament_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE tournament_id_seq OWNED BY tournament.id;


--
-- TOC entry 1926 (class 2604 OID 16951)
-- Name: id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY event ALTER COLUMN id SET DEFAULT nextval('event_id_seq'::regclass);


--
-- TOC entry 1927 (class 2604 OID 16952)
-- Name: tournamentid; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY event ALTER COLUMN tournamentid SET DEFAULT nextval('event_tournamentid_seq'::regclass);


--
-- TOC entry 1928 (class 2604 OID 16953)
-- Name: id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY tournament ALTER COLUMN id SET DEFAULT nextval('tournament_id_seq'::regclass);


--
-- TOC entry 1934 (class 0 OID 16933)
-- Dependencies: 168
-- Data for Name: event; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO event VALUES (487, 38, 'Open Singles', 'SUN', 32, true, '$1500', '$750', '$250', NULL, '', NULL, '', NULL, '$50', '', 1, '2:00 PM');
INSERT INTO event VALUES (488, 38, 'Under 2500', 'SUN', 32, true, '$300', '$150', '$75', NULL, '', NULL, '', NULL, '$40', '', 2, '10:00 AM');
INSERT INTO event VALUES (489, 38, 'Under 2350', 'SUN', 48, true, '$200', '$100', '$50', NULL, '', NULL, '', NULL, '$35', '', 3, '3:30 PM');
INSERT INTO event VALUES (496, 38, 'Under 2200', 'SUN', 48, true, '$150', '$75', '$30', NULL, '', NULL, '', NULL, '$30', '', 4, '12:00 PM');
INSERT INTO event VALUES (497, 38, 'Under 2050', 'SUN', 32, true, '$125', '$60', '', NULL, '', NULL, '', NULL, '$30', '', 5, '2:00 PM');
INSERT INTO event VALUES (498, 38, 'Under 1900', 'SUN', 32, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '', 6, '10:00 AM');
INSERT INTO event VALUES (499, 38, 'Under 1750', 'SAT', 32, true, '$50', 'T', '', NULL, '', NULL, '', NULL, '$25', '', 7, '2:00 PM');
INSERT INTO event VALUES (500, 38, 'Under 1600', 'SAT', 32, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 8, '10:00 AM');
INSERT INTO event VALUES (501, 38, 'Under 1450', 'SAT', 24, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 9, '12:00 PM');
INSERT INTO event VALUES (502, 38, 'Under 1300', 'SAT', 24, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 10, '3:30 PM');
INSERT INTO event VALUES (503, 38, 'Under 1150', 'SAT', 24, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 11, '2:00 PM');
INSERT INTO event VALUES (504, 38, 'Under 1000', 'SAT', 24, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 12, '10:00 AM');
INSERT INTO event VALUES (505, 38, '14 & Under', 'SAT', 16, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 13, '11:00 AM');
INSERT INTO event VALUES (506, 38, '40 & Over', 'SAT', 16, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '', 14, '11:00 AM');
INSERT INTO event VALUES (507, 38, 'Handicap*', 'SAT', 32, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$25', '<strong>(*) HANDICAP:</strong> Higher-rated player 
will be handicapped by 1 point for 
every 75-point rating advantage over 
lower-rated player, with a maximum 
of 7 points per 11-point game.', 15, '12:00 PM');
INSERT INTO event VALUES (508, 38, 'Doubles Open**', 'SAT', 16, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30 (team)', '<strong>(**) DOUBLES:</strong> In Doubles U-3000, 
the combined USATT ratings of the 
two players must be under 3000. 
The Doubles Open has no limit. The 
results of all Doubles matches will 
not affect USATT ratings.', 16, '3:00 PM');
INSERT INTO event VALUES (509, 38, 'Doubles U-3000**', 'SAT', 16, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30 (team)', '', 17, '3:00 PM');
INSERT INTO event VALUES (857, 66, 'Open Singles', 'SUN', 32, true, '$1500', '$750', '$250', NULL, '', NULL, '', NULL, '$50', '', 1, '2:00 PM');
INSERT INTO event VALUES (858, 66, 'Under 2500', 'SUN', 32, true, '$300', '$150', '$75', NULL, '', NULL, '', NULL, '$40', '', 2, '10:00 AM');
INSERT INTO event VALUES (859, 66, 'Under 2350', 'SUN', 48, true, '$200', '$100', '$50', NULL, '', NULL, '', NULL, '$35', '', 3, '3:30 PM');
INSERT INTO event VALUES (860, 66, 'Under 2200', 'SUN', 48, true, '$150', '$75', '$30', NULL, '', NULL, '', NULL, '$30', '', 4, '12:00 PM');
INSERT INTO event VALUES (861, 66, 'Under 2050', 'SUN', 32, true, '$125', '$60', '', NULL, '', NULL, '', NULL, '$30', '', 5, '2:00 PM');
INSERT INTO event VALUES (862, 66, 'Under 1900', 'SUN', 32, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '', 6, '10:00 AM');
INSERT INTO event VALUES (863, 66, 'Under 1750', 'SAT', 32, true, '$50', 'T', '', NULL, '', NULL, '', NULL, '$25', '', 7, '2:00 PM');
INSERT INTO event VALUES (864, 66, 'Under 1600', 'SAT', 32, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 8, '10:00 AM');
INSERT INTO event VALUES (865, 66, 'Under 1450', 'SAT', 24, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 9, '12:00 PM');
INSERT INTO event VALUES (866, 66, 'Under 1300', 'SAT', 24, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 10, '3:30 PM');
INSERT INTO event VALUES (867, 66, 'Under 1150', 'SAT', 24, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 11, '2:00 PM');
INSERT INTO event VALUES (868, 66, 'Under 1000', 'SAT', 24, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 12, '10:00 AM');
INSERT INTO event VALUES (869, 66, '14 & Under', 'SAT', 16, true, 'T', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 13, '11:00 AM');
INSERT INTO event VALUES (870, 66, '50 & Over', 'SAT', 16, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '', 14, '11:00 AM');
INSERT INTO event VALUES (871, 66, 'Handicap*', 'SAT', 32, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$25', '<strong>(*) HANDICAP:</strong> Higher-rated player 
will be handicapped by 1 point for 
every 75-point rating advantage over 
lower-rated player, with a maximum 
of 7 points per 11-point game.', 15, '12:00 PM');
INSERT INTO event VALUES (872, 66, 'Doubles U-3500**', 'SAT', 16, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '<strong>(**)</strong> Combined rating under 3500.', 16, '3:00 PM');
INSERT INTO event VALUES (873, 67, 'Open Singles', 'SUN', 32, true, '$1500', '$750', '$250', NULL, '', NULL, '', NULL, '$50', '', 1, '2:00 PM');
INSERT INTO event VALUES (874, 67, 'Under 2500', 'SUN', 32, true, '$300', '$150', '$75', NULL, '', NULL, '', NULL, '$40', '', 2, '10:00 AM');
INSERT INTO event VALUES (875, 67, 'Under 2350', 'SUN', 48, true, '$200', '$100', '$50', NULL, '', NULL, '', NULL, '$35', '', 3, '3:30 PM');
INSERT INTO event VALUES (876, 67, 'Under 2200', 'SUN', 48, true, '$150', '$75', '$30', NULL, '', NULL, '', NULL, '$30', '', 4, '12:00 PM');
INSERT INTO event VALUES (877, 67, 'Under 2050', 'SUN', 32, true, '$125', '$60', '', NULL, '', NULL, '', NULL, '$30', '', 5, '2:00 PM');
INSERT INTO event VALUES (878, 67, 'Under 1900', 'SUN', 32, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '', 6, '10:00 AM');
INSERT INTO event VALUES (879, 67, 'Under 1750', 'SAT', 32, true, '$50', 'T', '', NULL, '', NULL, '', NULL, '$25', '', 7, '2:00 PM');
INSERT INTO event VALUES (880, 67, 'Under 1600', 'SAT', 32, true, '$30', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 8, '10:00 AM');
INSERT INTO event VALUES (881, 67, 'Under 1450', 'SAT', 24, true, '$30', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 9, '12:00 PM');
INSERT INTO event VALUES (882, 67, 'Under 1300', 'SAT', 24, true, '$30', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 10, '3:30 PM');
INSERT INTO event VALUES (883, 67, 'Under 1150', 'SAT', 24, true, '$30', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 11, '2:00 PM');
INSERT INTO event VALUES (884, 67, 'Under 1000', 'SAT', 24, true, '$30', 'T', '', NULL, '', NULL, '', NULL, '$20', '', 12, '10:00 AM');
INSERT INTO event VALUES (885, 67, '14 & Under', 'SAT', 16, true, '$50', 'T', '', NULL, '', NULL, '', NULL, '$25', '', 13, '11:00 AM');
INSERT INTO event VALUES (886, 67, '40 & Over', 'SAT', 16, true, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '', 14, '11:00 AM');
INSERT INTO event VALUES (887, 67, 'Woman', 'SAT', 32, true, '$50', 'T', '', NULL, '', NULL, '', NULL, '$25', '', 15, '11:00 PM');
INSERT INTO event VALUES (888, 67, 'Handicap*', 'SAT', 32, false, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '<strong>(*) HANDICAP:</strong> Higher-rated player will be handicapped by 1 point for every 75-point rating advantage over lower-rated player, with a maximum of 7 points per 11-point game.', 16, '12:00 PM');
INSERT INTO event VALUES (889, 67, 'Doubles U3200**', 'SAT', 16, false, '$100', '$50', '', NULL, '', NULL, '', NULL, '$30', '<strong>(**)</strong> Combined rating under 3200.', 17, '3:00 PM');


--
-- TOC entry 1949 (class 0 OID 0)
-- Dependencies: 169
-- Name: event_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('event_id_seq', 889, true);


--
-- TOC entry 1950 (class 0 OID 0)
-- Dependencies: 170
-- Name: event_tournamentid_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('event_tournamentid_seq', 22, true);


--
-- TOC entry 1937 (class 0 OID 16943)
-- Dependencies: 171
-- Data for Name: tournament; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO tournament VALUES (38, 'WESTCHESTER 2013 JULY OPEN', 'July 20-21, 2013', 3, 'Postal mail entries must 
be received by July 17, 2013. Late entries 
will be accepted, by phone or at the door, 
space permitting.  ', 'USATT ratings of 
July 12, 2013, will be used. No player may
participate in two events that start at the same 
time or more than three events on the same day.', 'Players must be USATT 
members (except for events #15, #16 and #17, 
which are not rated). Non-members must join 
the USATT at the tournament. For the age 
events, players must be in their respective age 
category as of the tournament date. The 
tournament committee may estimate ratings for 
unrated players, if there is an objective basis, 
such as a club league rating. Two players will 
advance from each RR.');
INSERT INTO tournament VALUES (66, 'WESTCHESTER 2013 AUGUST OPEN', 'August 24-25', 3, 'Postal mail entries must 
be received by August 21, 2013. Late entries 
will be accepted, by phone or at the door, space 
permitting.     ', 'USATT ratings of 
August 16, 2013, will be used. No player may
participate in two events that start at the same 
time or more than three events on the same day.', 'Players must be USATT 
members (except for events #15 and #16, 
which are not rated). Non-members must join 
the USATT at the tournament. For the age 
events, players must be in their age category
as of the tournament date. The tournament 
committee may estimate ratings for unrated 
players, if there is an objective basis, such as 
a club league rating. Two players will 
advance from each RR, except for U-2350.');
INSERT INTO tournament VALUES (67, 'Westchester September 2013 Open', 'Sept. 28-29', 3, 'Postal mail entries must
be received by Sept. 25, 2013. Late entries
will be accepted, by phone or at the door, space
permitting.', 'USATT ratings of
Sept. 20, 2013, will be used. No player may
participate in two events that start at the same
time or more than three events on the same day.', 'Players must be USATT
members (except for events #16 and #17,
which are not rated). Non-members must join
the USATT at the tournament. For the age
events, players must be in their age category
as of the tournament date. The tournament
committee may estimate ratings for unrated
players, if there is an objective basis, such as
a club league rating. Two players will
advance from each RR, except for U-2350.');


--
-- TOC entry 1951 (class 0 OID 0)
-- Dependencies: 172
-- Name: tournament_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('tournament_id_seq', 67, true);


--
-- TOC entry 1930 (class 2606 OID 16955)
-- Name: event_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY event
    ADD CONSTRAINT event_pkey PRIMARY KEY (id);


--
-- TOC entry 1932 (class 2606 OID 16957)
-- Name: tournament_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY tournament
    ADD CONSTRAINT tournament_pkey PRIMARY KEY (id);


--
-- TOC entry 1933 (class 2606 OID 16958)
-- Name: event_tournamentid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY event
    ADD CONSTRAINT event_tournamentid_fkey FOREIGN KEY (tournamentid) REFERENCES tournament(id);


-- Completed on 2013-08-26 15:01:14

--
-- PostgreSQL database dump complete
--

