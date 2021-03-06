INSERT INTO public.tri_counts(title, currency, description) VALUES ('Opal Festival', 'EUR', 'Festival de musique normand');

INSERT INTO public.attendees(firstname, lastname, email) VALUES 
('Pierre', 'Dupont', 'pierre.dupont@gmail.com'), ('Paul', 'Dupont', 'paul.dupont@gmail.com'), ('Jacques', 'Dupont', 'jacques.dupont@gmail.com');

INSERT INTO public.expenses(title, amount, expense_date, buyer_id) VALUES
('oil', 20,'2017-08-04', 1), ('toll', 15, '2017-08-06', 1), ('picnik', 35, '2017-08-05', 2), 
('air bnb', 110, '2017-08-05', 3), ('toll', 15, '2017-08-06', 2), ('oil', 10,'2017-08-06', 1);

INSERT INTO public.expense_attendee(expense_id, attendee_id) VALUES
(1, 1), (1, 2), (1, 3), 
(2, 1), (2, 2), (2, 3), 
(3, 1), (3, 2), (3, 3), 
(4, 1), (4, 3), 
(5, 1), (5, 2), (5, 3), 
(6, 1), (6, 2), (6, 3);


