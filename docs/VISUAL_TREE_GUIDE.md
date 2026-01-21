# 🎨 Visual Parse Tree Guide

## ✨ Beautiful Tree Visualization!

### **What You Get:**

**Before (Old):**
```
└─ sqlFile
   └─ statement
      └─ selectStatement
         └─ selectClause
```
Plain text, hard to read 😞

**After (New!):**
```
[COLORFUL WITH ICONS]
└── sqlFile                    (Blue, Bold)
    ├── statement              (Blue, Bold)
    │   ├── selectStatement    (Magenta)
    │   │   ├── selectClause   (Green)
    │   │   ├── fromClause     (Green)
    │   │   └── whereClause    (Green)
    │   └── ";"                (Yellow)
    └── "<EOF>"                (Yellow)
```
Colorful, clear structure, easy to read! 🎉

---

## 🚀 Quick Start

### **Basic Usage:**
```bash
./scripts/show_tree.sh tests/input/simple_example.sql
```

### **With Graphical Window:**
```bash
./scripts/show_tree.sh tests/input/simple_example.sql --gui
```

### **Full Detailed Tree:**
```bash
./scripts/show_tree.sh tests/input/demo.sql --full-tree
```

### **Without Colors (for screenshots):**
```bash
./scripts/show_tree.sh tests/input/demo.sql --no-color
```

---

## 🎨 Color Scheme

The tree uses colors to help you understand the structure:

| Color | Meaning | Examples |
|-------|---------|----------|
| 🔵 **Blue (Bold)** | Main structures | sqlFile, statement |
| 🟢 **Green** | Clauses & Expressions | selectClause, whereClause |
| 🟣 **Magenta** | Statement types | selectStatement, insertStatement |
| 🟡 **Yellow** | Terminals (actual text) | "SELECT", "FROM", ";" |
| 🔵 **Cyan** | Tree lines | ├──, └──, │ |

---

## 📊 Visual Examples

### **Example 1: Simple SELECT**

**SQL:**
```sql
SELECT name FROM users WHERE age > 18;
```

**Tree Output:**
```
╔════════════════════════════════════════════════════════════╗
║           SQL COMPILER - VISUAL PARSE TREE                 ║
╚════════════════════════════════════════════════════════════╝

File: tests/input/simple_example.sql

✓ Parsing successful!

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
PARSE TREE VISUALIZATION
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

└── sqlFile
    ├── statement
    │   ├── dmlStatement
    │   │   └── selectStatement
    │   │       ├── selectClause
    │   │       ├── fromClause
    │   │       └── whereClause
    │   └── ";"
    └── "<EOF>"

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

TREE STATISTICS:
  Nodes: 60
  Depth: 18
  Result: ✓ SUCCESS
```

---

### **Example 2: Complex SQL with CASE**

**SQL:**
```sql
SELECT
  CASE
    WHEN grade >= 90 THEN 'Excellent'
    WHEN grade >= 75 THEN 'Very Good'
    ELSE 'Pass'
  END AS result
FROM students;
```

**Tree Output:**
```
└── sqlFile
    └── statement
        └── dmlStatement
            └── selectStatement
                ├── selectClause
                │   └── selectList
                │       └── selectItem
                │           ├── expression
                │           │   └── caseExpression
                │           │       ├── "CASE"
                │           │       ├── whenClause
                │           │       ├── whenClause
                │           │       ├── "ELSE"
                │           │       └── "END"
                │           └── "AS"
                └── fromClause
```

---

## 🖼️ Graphical Tree (--gui option)

### **What is it?**
ANTLR has a built-in GUI that shows the tree as an actual graphical diagram!

### **How to use:**
```bash
./scripts/show_tree.sh tests/input/demo.sql --gui
```

**This will:**
1. Parse your SQL
2. Show text tree in terminal
3. Open a window with graphical tree
4. You can zoom in/out
5. Click nodes to see details

### **Requirements:**
- Must have GUI environment (X11 or Wayland)
- Works on desktop Linux
- May not work on SSH/remote terminal

### **Screenshot of GUI:**
```
┌─────────────────────────────────────────┐
│  ANTLR Parse Tree Inspector             │
├─────────────────────────────────────────┤
│                                         │
│       [sqlFile]                         │
│           │                             │
│      [statement]                        │
│           │                             │
│    [selectStatement]                    │
│       /    |    \                       │
│  [select][from][where]                  │
│                                         │
│  (Interactive - Click to expand!)       │
└─────────────────────────────────────────┘
```

---

## 📐 Tree Depth Control

### **Default View (4 levels):**
```bash
./scripts/show_tree.sh tests/input/demo.sql
```
Shows: Main structure without too much detail

### **Full Tree (All levels):**
```bash
./scripts/show_tree.sh tests/input/demo.sql --full-tree
```
Shows: Every single node (can be very long!)

---

## 💡 Understanding Tree Statistics

**Example Output:**
```
TREE STATISTICS:
  Nodes: 466      ← Total nodes in parse tree
  Depth: 27       ← Maximum depth of tree
  Result: ✓ SUCCESS
```

### **What do the numbers mean?**

| Metric | Meaning | Good Range |
|--------|---------|------------|
| **Nodes** | Total elements in tree | 50-500 for typical SQL |
| **Depth** | How nested your SQL is | 5-20 for readable code |

**Examples:**
- Simple `SELECT * FROM users;` → ~30 nodes, depth 10
- Complex query with joins → ~200 nodes, depth 25
- Full script with procedures → ~1000+ nodes, depth 40+

---

## 🎓 For Your Project Report

### **Show These Visuals:**

1. **Simple Statement Tree:**
   ```bash
   ./scripts/show_tree.sh tests/input/simple_example.sql --no-color > simple_tree.txt
   ```

2. **Complex Statement Tree:**
   ```bash
   ./scripts/show_tree.sh tests/input/demo.sql --no-color > complex_tree.txt
   ```

3. **Statistics Comparison:**
   | File | Nodes | Depth | Result |
   |------|-------|-------|--------|
   | tests/input/simple_example.sql | 60 | 18 | ✓ |
   | tests/input/demo.sql | 466 | 27 | ✓ |
   | tests/input/phase1_test_input.txt | 3000+ | 35+ | ⚠️ |

---

## 🔧 All Options

```bash
./scripts/show_tree.sh <file>              # Basic colorful tree
./scripts/show_tree.sh <file> --gui        # Open graphical window
./scripts/show_tree.sh <file> --full-tree  # Show all nodes
./scripts/show_tree.sh <file> --no-color   # Plain text (for export)
```

**Combine options:**
```bash
./scripts/show_tree.sh tests/input/demo.sql --gui --full-tree
```

---

## 📝 Saving Tree to File

### **Save Colorful Version:**
```bash
./scripts/show_tree.sh tests/input/demo.sql > tree_colored.txt
```

### **Save Plain Version:**
```bash
./scripts/show_tree.sh tests/input/demo.sql --no-color > tree_plain.txt
```

### **View Saved File:**
```bash
cat tree_colored.txt
less -R tree_colored.txt    # -R shows colors
```

---

## 🔍 Comparing Different SQL

### **Test Series:**
```bash
# Test 1: Simple SELECT
echo "SELECT * FROM users;" > test1.sql
./scripts/show_tree.sh test1.sql

# Test 2: With WHERE
echo "SELECT * FROM users WHERE age > 18;" > test2.sql
./scripts/show_tree.sh test2.sql

# Test 3: With JOIN
echo "SELECT * FROM users u JOIN orders o ON u.id = o.user_id;" > test3.sql
./scripts/show_tree.sh test3.sql
```

**Compare:**
- Test 1: ~20 nodes, depth 10
- Test 2: ~35 nodes, depth 15
- Test 3: ~60 nodes, depth 18

---

## 🎨 Terminal Color Support

### **If colors don't show:**

1. **Check terminal:**
   ```bash
   echo $TERM
   # Should show: xterm-256color or similar
   ```

2. **Enable colors:**
   ```bash
   export TERM=xterm-256color
   ./scripts/show_tree.sh tests/input/demo.sql
   ```

3. **Or use no-color mode:**
   ```bash
   ./scripts/show_tree.sh tests/input/demo.sql --no-color
   ```

---

## 🆚 Comparison: Old vs New

### **Old Display:**
```
Parse Tree:
(sqlFile (statement (dmlStatement (selectStatement...
```
- One long line
- Hard to read
- No visual structure

### **New Display:**
```
└── sqlFile
    ├── statement
    │   └── selectStatement
    │       ├── selectClause  [GREEN]
    │       ├── fromClause    [GREEN]
    │       └── whereClause   [GREEN]
    └── "<EOF>"               [YELLOW]
```
- Clear hierarchy
- Color-coded
- Easy to understand

---

## ✅ Quick Command Reference

```bash
# Basic tree
./scripts/show_tree.sh myfile.sql

# With GUI
./scripts/show_tree.sh myfile.sql --gui

# Full detail
./scripts/show_tree.sh myfile.sql --full-tree

# Plain text
./scripts/show_tree.sh myfile.sql --no-color

# Save to file
./scripts/show_tree.sh myfile.sql > output.txt
```

---

**Your parse tree is now beautiful and easy to read! 🎉**
