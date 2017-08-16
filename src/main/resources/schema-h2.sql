CREATE TABLE public.attendees (
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    email varchar(100) NOT NULL,
    into_arrears boolean,
    balance bigint
);

CREATE TABLE public.tri_counts (
    id int(11) NOT NULL AUTO_INCREMENT,
    title varchar(50) NOT NULL,
    currency varchar(3) NOT NULL,
    description varchar(200),
    owner_id int(11) NOT NULL REFERENCES public.attendees(id)
);
