# Understanding Compiler Output - Visual Guide

## 📖 What You See When Running Tests

### **Example SQL:**
```sql
SELECT name, age FROM users WHERE age > 18;
```

---

## 🔍 **STEP 1: LEXICAL ANALYSIS (Tokenization)**

**What it does:** Breaks the SQL text into individual "words" (tokens)

### **Visual Breakdown:**

```
SELECT name, age FROM users WHERE age > 18;
  ↓      ↓  ↓  ↓    ↓     ↓     ↓   ↓ ↓  ↓
SELECT  ID  ,  ID  FROM   ID   WHERE ID > INT
```

### **Token Table:**
```
Line:Col  Token Type    Text
────────  ──────────    ────
1:0       SELECT        'SELECT'      ← Keyword
1:7       ID            'name'        ← Identifier (column name)
1:11      ','           ','           ← Punctuation
1:13      ID            'age'         ← Identifier
1:17      FROM          'FROM'        ← Keyword
1:22      ID            'users'       ← Identifier (table name)
1:28      WHERE         'WHERE'       ← Keyword
1:34      ID            'age'         ← Identifier
1:38      '>'           '>'           ← Operator
1:40      INT           '18'          ← Number literal
1:42      ';'           ';'           ← Statement terminator
```

### **What Each Part Means:**

| Token Type | Meaning | Examples |
|------------|---------|----------|
| **SELECT, FROM, WHERE** | Keywords (reserved words) | SQL commands |
| **ID** | Identifiers | Column/table names |
| **INT** | Integer number | 18, 100, 42 |
| **STRING** | Text in quotes | 'Ali', 'hello' |
| **'>', '<', '='** | Operators | Comparison operators |
| **',', ';', '('** | Punctuation | Syntax symbols |

---

## 🌳 **STEP 2: SYNTAX ANALYSIS (Parsing)**

**What it does:** Checks if tokens follow SQL grammar rules and builds a tree structure

### **Parse Tree:**
```
└─ sqlFile                          ← Root (entire file)
   ├─ statement                     ← One SQL statement
   │  ├─ dmlStatement               ← Data Manipulation Language
   │  │  └─ selectStatement         ← SELECT statement
   │  │     ├─ selectClause         ← SELECT part
   │  │     │  └─ "SELECT name, age"
   │  │     ├─ fromClause           ← FROM part
   │  │     │  └─ "FROM users"
   │  │     └─ whereClause          ← WHERE part
   │  │        └─ "WHERE age > 18"
   │  └─ ";"                        ← Semicolon
   └─ <EOF>                         ← End of file
```

### **Visual Explanation:**

```
SELECT name, age FROM users WHERE age > 18;
└────────┬────────┘ └───┬────┘ └────┬──────┘
     selectClause    fromClause  whereClause
         │                │            │
         └────────────────┴────────────┘
                      │
                selectStatement
                      │
                  statement
                      │
                   sqlFile
```

---

## ✅ **STEP 3: SUMMARY**

### **Success Output:**
```
File: simple_example.sql
Tokens: 11                           ← Number of words found
Syntax Errors: 0                     ← No mistakes!
Result: ✅ SUCCESS

🎉 Your SQL was parsed successfully!
The compiler understood all the statements.
```

### **Error Output Example:**
```
File: test_with_error.sql
Tokens: 15

ERROR #1:
  Line: 1, Column: 20                ← Where error occurred
  Message: missing FROM clause       ← What's wrong
  Offending token: 'WHERE'           ← The problematic word

Syntax Errors: 1
Result: ❌ FAILED
```

---

## 🎯 **Real Example Walkthrough**

### **Input SQL:**
```sql
INSERT INTO users (name, age) VALUES ('Ali', 22);
```

### **Step 1: Tokens Generated**
```
INSERT    → INSERT keyword
INTO      → INTO keyword
users     → ID (table name)
(         → Left parenthesis
name      → ID (column name)
,         → Comma
age       → ID (column name)
)         → Right parenthesis
VALUES    → VALUES keyword
(         → Left parenthesis
'Ali'     → STRING (text literal)
,         → Comma
22        → INT (number literal)
)         → Right parenthesis
;         → Semicolon
```

### **Step 2: Parse Tree**
```
└─ sqlFile
   └─ statement
      └─ dmlStatement
         └─ insertStatement
            ├─ "INSERT INTO"
            ├─ tableName: "users"
            ├─ columnList: "(name, age)"
            ├─ "VALUES"
            └─ valuesList: "('Ali', 22)"
```

### **Step 3: Result**
```
✅ SUCCESS - Compiler understood:
- Table: users
- Columns: name, age
- Values: 'Ali', 22
```

---

## 📊 **Understanding Different Test Results**

### **1. Simple SQL Test (parser_test_input.txt)**
```bash
./scripts/test_detailed.sh tests/input/parser_test_input.txt
```
**Shows:** 6 statements (SELECT, INSERT, UPDATE, DELETE, CREATE, DROP)
**Expected:** 0 errors

### **2. Complex SQL Test (phase1_test_input.txt)**
```bash
./scripts/test_detailed.sh tests/input/phase1_test_input.txt
```
**Shows:** Multiple complex statements with variables, IF blocks, TRY/CATCH
**Expected:** 4 errors (only from nested comments on line 80)

### **3. Demo Test (demo.sql)**
```bash
./scripts/test_detailed.sh tests/input/demo.sql
```
**Shows:** Advanced features (CASE, variables, control flow)
**Expected:** 0 errors

---

## How to Use

### **Run Detailed Test:**
```bash
# On any SQL file
./scripts/test_detailed.sh tests/input/your_file.sql

# Or directly:
java -cp "tests:gen:/usr/local/lib/antlr-4.13.2-complete.jar" TestDetailed tests/input/your_file.sql
```

### **Create Your Own SQL Test:**
```bash
# 1. Create SQL file
echo "SELECT * FROM students WHERE grade > 85;" > tests/input/my_test.sql

# 2. Run detailed test
./scripts/test_detailed.sh tests/input/my_test.sql

# 3. Check output:
#    - See tokens generated
#    - See parse tree
#    - Check for errors
```

---

## 🔍 **Debugging with Detailed Output**

### **If You Get Errors:**

1. **Look at STEP 1 (Tokens):**
   - Are all words recognized correctly?
   - Check for typos in keywords

2. **Look at ERROR messages:**
   - Shows exact line and column
   - Shows what was expected vs what was found

3. **Common Issues:**
   - Missing semicolon → "expecting ';'"
   - Wrong keyword order → "unexpected token"
   - Unclosed quote → "unterminated string"

### **Example Error Analysis:**
```
ERROR #1:
  Line: 3, Column: 10
  Message: mismatched input 'FORM' expecting FROM
  Offending token: 'FORM'
```

**Problem:** Typo! "FORM" instead of "FROM"
**Solution:** Fix the typo

---

## 📚 **What Each Component Does**

| Component | Purpose | Output |
|-----------|---------|--------|
| **Lexer** | Breaks text into tokens | List of words with types |
| **Parser** | Checks grammar rules | Parse tree structure |
| **Error Handler** | Detects mistakes | Error messages |

---

## 🎓 **For Your Project Report**

When explaining your compiler:

1. **Show the tokens:** Demonstrates lexical analysis works
2. **Show the parse tree:** Demonstrates syntax analysis works
3. **Show the summary:** Demonstrates overall success

**Use this output as proof that your compiler works!**

---

**Now you can see exactly what your compiler is doing! 🎉**
