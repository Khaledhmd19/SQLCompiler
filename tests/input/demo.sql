-- Demo: Your SQL Compiler in Action!

-- Variable declarations
DECLARE @count INT;
DECLARE @name NVARCHAR(100);

-- Set variables
SET @count = 0;
SET @name = N'Damascus University';

-- Complex SELECT with CASE
SELECT
    student_id,
    name,
    CASE
        WHEN grade >= 90 THEN 'Excellent'
        WHEN grade >= 75 THEN 'Very Good'
        WHEN grade >= 60 THEN 'Good'
        ELSE 'Pass'
    END AS result
FROM students
WHERE grade > 50 AND department IN ('AI', 'CS');

-- Control flow
IF NOT EXISTS (SELECT 1 FROM sys.tables WHERE name = 'results')
BEGIN
    CREATE TABLE results (
        id INT NOT NULL PRIMARY KEY,
        score DECIMAL(5,2),
        status VARCHAR(50)
    );
    SET @count += 1;
END

-- Simple UPDATE with compound operator
SET @count += 10;

-- Try/Catch block
BEGIN TRY
    UPDATE students SET grade = grade + 5;
END TRY
BEGIN CATCH
    SELECT @name = ERROR_MESSAGE();
END CATCH

GO
