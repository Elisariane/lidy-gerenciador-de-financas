INSERT INTO TB_USER (id, name, email, password) VALUES ('1', 'John Doe', 'johndoe@gmail.com', '123'), ('2', 'Jane Doe', 'janedoe@gmail.com', '123');

INSERT INTO TB_CATEGORY (id, name, is_sub_category, category_id) VALUES ('1', 'Lazer', false, null ), ('2', 'Streamings', true, 1 );

INSERT INTO TB_ACCOUNT (id, name, initial_value, active, user_owner_id) VALUES ('1', 'Cartão de crédito Banco xyz', 1500.00, true, 1 ), ('2', 'Carteira', 50.00, true, 1);

INSERT INTO TB_TRANSACTION (id, name_transaction, date_transaction, description, type_transaction, account_id, category_id, value_transaction, repeat_transaction, start_installment, final_installment, number_repetitions, frequency_transaction, repeat_endlessly)
VALUES  ('1', 'Spotify', '2022-12-17', null, 'REVENUE', 1, 2, 19.90, true, 1, 12, 1, 'MONTH', false);

