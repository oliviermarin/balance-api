CREATE TABLE public.tri_counts (
    id int(11) NOT NULL AUTO_INCREMENT,
    title varchar(50) NOT NULL,
    currency varchar(3) NOT NULL,
    description varchar(200)
);

CREATE TABLE public.attendees (
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    email varchar(100) NOT NULL,
    into_arrears boolean,
    balance double,
    owner boolean,
    tricount_id int(11) NOT NULL REFERENCES public.tri_counts(id)
);

CREATE TABLE public.expenses (
    id int(11) NOT NULL AUTO_INCREMENT,
    title varchar(50) NOT NULL,
    amount double,
    expense_date date,
    buyer_id int(11) NOT NULL REFERENCES public.attendees(id)
);

CREATE TABLE public.expense_attendee (
    expense_id int(11) NOT NULL REFERENCES public.expenses(id),
    attendee_id int(11) NOT NULL REFERENCES public.attendees(id),
);