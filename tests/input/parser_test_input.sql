SELECT name, age
FROM users
WHERE age > 18;

INSERT INTO users (name, age)
VALUES ('Ali', 22);

UPDATE users
SET age = age + 1
WHERE name = 'Ali';

DELETE FROM users
WHERE age < 18;

CREATE TABLE employees (
    id INT,
    name VARCHAR
);

DROP TABLE employees;
