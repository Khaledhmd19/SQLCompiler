# SQL Compiler Project - Phase One

## University Information
- **University:** Damascus University - Faculty of Informatics Engineering
- **Year:** Fourth Year
- **Department:** Artificial Intelligence
- **Course:** Practical Compilers

---

## Project Objective

Building a compiler for SQL language (target language) using ANTLR 4 tool.

---

## Phase One: Lexical Analyzer

The lexical analysis is the first phase of compiler construction. The main task of this phase is to read sequences of input characters and produce a series of words or tokens, such as identifiers (table names, column names, stored procedures, etc.), literal strings, numbers, reserved words, punctuation marks, logical and mathematical operations, comments, and more.

### Requirements

Build a lexical analyzer using ANTLR 4 tool to recognize all possible tokens in the language by placing a set of patterns in the rules section of the .g4 file.

#### Deliverables:

1. **Set of patterns** to recognize tokens specific to the language (defining appropriate regular expressions for each token)

2. **Input and Output:**
   - **Input:** A file containing code written in SQL language
   - **Output:** All tokens found in this code

3. **Tokens to be Recognized** (Additional tokens may be added, but these are essential):

   - **Reserved Keywords**
     - Reserved Keywords (Transact-SQL)
   
   - **Numbers**
     - Integer Number
     - Float Number
   
   - **Boolean**
   
   - **String**
     - Literal String
     - Hex String
     - Bit String
   
   - **Operators**
   
   - **Identifiers**
   
   - **User Variables**
   
   - **Comments**
     - Single Line Comment
     - Multi Line Comment

---

## Examples of Special Cases in SQL Statements

| Input | Description | Statement | Output |
|-------|-------------|-----------|--------|
| Escaped Single Quote inside the String | Use two single quotes | `SELECT 'It''s a beautiful day.' AS Value` | - |
| Nested comments | - | `DECLARE @comment AS VARCHAR(20); GO /* SELECT @comment = '/*'; */ */ SELECT @@VERSION AS [Version]; GO` | - |
| Splitting a character string | - | `SELECT 'abc\ def' AS [ColumnResult];` | - |
| Splitting a binary string | - | `SELECT 0xabc\def AS [ColumnResult];` | - |

---
