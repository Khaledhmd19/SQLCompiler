-- Simple SQL test for AST demo
SELECT id, name, email FROM users WHERE active = 1;

INSERT INTO products (name, price) VALUES ('Widget', 19.99);

UPDATE customers SET status = 'active' WHERE id = 100;

DELETE FROM logs WHERE created_at < '2024-01-01';
