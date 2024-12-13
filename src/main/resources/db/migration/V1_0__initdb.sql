create sequence schedule_seq;

CREATE TABLE schedule (
                          id BIGINT primary key default nextval('schedule_seq'),
                          room character varying(50),
                          date character varying(50),
                          weekday character varying(50),
                          teacher character varying(255),
                          group_number character varying(50)
);
