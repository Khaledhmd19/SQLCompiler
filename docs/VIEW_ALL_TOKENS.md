# How to View ALL Tokens - Complete Guide

## ✨ What Changed

### **Before:**
```
Tokens Generated:
(Shows first 50 tokens)
...
... (more tokens) ...        ← Only first 50 shown!

Total Tokens Shown: 50
```

### **After (Now!):**
```
Tokens Generated:
(Shows ALL tokens)
...
46:0     GO                   'GO'

Total Tokens Shown: 143      ← ALL tokens shown!
```

---

## 🚀 How to View All Tokens

### **Option 1: View on Screen**
```bash
./scripts/test_detailed.sh tests/input/demo.sql
```
**Shows:** All tokens on screen (can scroll up to see them all)

### **Option 2: Save to File (Recommended)**
```bash
./scripts/test_and_save.sh tests/input/demo.sql
```
**Does:**
- Shows output on screen
- Saves to `tests/input/demo.sql_analysis.txt`
- You can open the file later to review all tokens

---

## 📊 Example Output (tests/input/demo.sql)

### **All 143 Tokens Shown:**

```
Line:Col Token Type           Text
─────────────────────────────────────────────
4:0      DECLARE              'DECLARE'
4:8      USER_VAR             '@count'
4:15     ID                   'INT'
4:18     ';'                  ';'
5:0      DECLARE              'DECLARE'
5:8      USER_VAR             '@name'
5:14     ID                   'NVARCHAR'
5:22     '('                  '('
5:23     INT                  '100'
5:26     ')'                  ')'
5:27     ';'                  ';'
...
(continues to show ALL 143 tokens)
...
46:0     GO                   'GO'

Total Tokens Shown: 143      ← Complete!
```

---

## 🎯 Understanding Token Count

### **Simple SQL (simple_example.sql):**
```sql
SELECT name, age FROM users WHERE age > 18;
```
**Tokens:** 11
- SELECT, name, comma, age, FROM, users, WHERE, age, >, 18, semicolon

### **Demo SQL (tests/input/demo.sql):**
```sql
-- Multiple statements with:
-- Variables, CASE, IF, BEGIN/END, TRY/CATCH
```
**Tokens:** 143
- Much more complex!

### **Complex SQL (phase1_test_input.txt):**
```sql
-- Real-world SQL with many statements
```
**Tokens:** 800+
- Very large file!

---

## 💾 Saving Output to File

### **Why Save to File?**
✅ Can review tokens later without re-running
✅ Can search for specific tokens
✅ Can include in your project report
✅ Easier to analyze large SQL files

### **How to Save:**
```bash
# Method 1: Using script (easiest)
./scripts/test_and_save.sh tests/input/demo.sql
# Output saved to: tests/input/demo.sql_analysis.txt

# Method 2: Manual redirect
./scripts/test_detailed.sh tests/input/demo.sql > demo_output.txt 2>&1
```

### **View Saved File:**
```bash
# View entire file
cat tests/input/demo.sql_analysis.txt

# View with pagination
less tests/input/demo.sql_analysis.txt

# Search for specific token
grep "USER_VAR" tests/input/demo.sql_analysis.txt

# Count total lines
wc -l tests/input/demo.sql_analysis.txt

# Count tokens (lines with quotes)
grep "'" tests/input/demo.sql_analysis.txt | wc -l
```

---

## 📈 Token Analysis Examples

### **Count Different Token Types:**

```bash
# Count all SELECT keywords
./scripts/test_detailed.sh tests/input/demo.sql | grep "SELECT" | wc -l

# Count all identifiers (ID)
./scripts/test_detailed.sh tests/input/demo.sql | grep "ID " | wc -l

# Count all user variables (@var)
./scripts/test_detailed.sh tests/input/demo.sql | grep "USER_VAR" | wc -l

# Count all strings
./scripts/test_detailed.sh tests/input/demo.sql | grep "STRING" | wc -l
```

### **Find Specific Tokens:**

```bash
# Find all variable names
./scripts/test_detailed.sh tests/input/demo.sql | grep "USER_VAR"

# Find all table names (after FROM keyword)
./scripts/test_detailed.sh tests/input/demo.sql | grep -A 1 "FROM"

# Find all numbers
./scripts/test_detailed.sh tests/input/demo.sql | grep "INT "
```

---

## 🎓 For Your Project Report

### **Include These Stats:**

```bash
# Run test and save
./scripts/test_and_save.sh tests/input/parser_test_input.txt

# Now you have:
# - Total tokens count
# - All token types
# - Line/column positions
# - Parse tree structure
# - Success/failure result
```

### **Show Token Distribution:**

Create a table like this:

| Token Type | Count | Example |
|------------|-------|---------|
| Keywords (SELECT, FROM, etc.) | 25 | SELECT |
| Identifiers (ID) | 40 | name, age |
| Operators (>, =, etc.) | 15 | > |
| Numbers (INT) | 12 | 18 |
| Strings | 8 | 'Ali' |
| Punctuation | 30 | , ; ( ) |
| **Total** | **143** | |

---

## 📝 Quick Commands Reference

```bash
# View all tokens on screen
./scripts/test_detailed.sh <file>

# Save all tokens to file
./scripts/test_and_save.sh <file>

# View saved analysis
cat <file>_analysis.txt

# Count tokens
./scripts/test_detailed.sh <file> | grep "'" | wc -l

# Find specific token type
./scripts/test_detailed.sh <file> | grep "USER_VAR"
```

---

## 🔍 Troubleshooting

### **Q: Output scrolls too fast?**
**A:** Use save option:
```bash
./scripts/test_and_save.sh tests/input/demo.sql
cat tests/input/demo.sql_analysis.txt | less
```

### **Q: Want to see only tokens (no tree)?**
**A:** Use grep:
```bash
./scripts/test_detailed.sh tests/input/demo.sql | grep "^[0-9]"
```

### **Q: File too large to view?**
**A:** View first 100 tokens:
```bash
./scripts/test_detailed.sh tests/input/demo.sql | head -120
```

---

## ✅ Summary

**What You Have Now:**

1. ✅ View **ALL tokens** (no 50 limit)
2. ✅ Save output to file for later review
3. ✅ Search and analyze tokens
4. ✅ Include in project documentation

**Commands:**

```bash
# See all tokens on screen
./scripts/test_detailed.sh your_file.sql

# Save all tokens to file
./scripts/test_and_save.sh your_file.sql
```

---

**Your compiler now shows complete token analysis! 🎉**
