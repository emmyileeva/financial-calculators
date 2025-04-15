# Financial Calculators

This project contains three Java calculators that help users explore common financial problems like loans, investments, and retirement planning.

---

## Calculators Included

### 1. 🏡 Mortgage Calculator
- Calculates monthly loan payments
- Displays total interest paid over the loan’s life

### 2. 📈 Future Value Calculator
- Calculates how much a one-time deposit grows over time with daily compounding interest

### 3. 📉 Present Value Calculator
- Determines how much you would need to invest today to receive a fixed monthly payout in the future

---

## ✨ Interesting Code Highlight

```java
double monthlyPayment = principal * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
```
## 💡 Why it's interesting
This formula is used in real-world mortgage calculations. It involves exponents and fractions, which makes it more complex than basic arithmetic. Using Math.pow() lets Java handle the heavy lifting for compounded interest. It's a great example of how code can turn financial formulas into functional tools.
