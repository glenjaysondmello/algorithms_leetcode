// Version 1: Uses early return with OR (||) and negations to exit on invalid conditions quickly.
class Bank {
    private final long[] balance;
    private final int len;

    public Bank(long[] balance) {
        this.balance = balance;
        this.len = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(!isValid(account1) || !isValid(account2) || this.balance[account1 - 1] < money) return false;
        this.balance[account1 - 1] -= money;
        this.balance[account2 - 1] += money;

        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(!isValid(account)) return false;
        this.balance[account - 1] += money;

        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isValid(account) || this.balance[account - 1] < money) return false;
        this.balance[account - 1] -= money;

        return true;
    }

    public boolean isValid(int account) {
        return account > 0 && account <= len;
    }
}

// Version 2: Uses positive logic with AND (&&) to perform the operation only when all conditions are valid.
class Bank {
    private final long[] balance;
    private final int len;

    public Bank(long[] balance) {
        this.balance = balance;
        this.len = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(isValid(account1) && isValid(account2) && this.balance[account1 - 1] >= money) {
            this.balance[account1 - 1] -= money;
            this.balance[account2 - 1] += money;

            return true;
        }

        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(isValid(account)) {
            this.balance[account - 1] += money;

            return true;
        }

        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if(isValid(account) && this.balance[account - 1] >= money) {
            this.balance[account - 1] -= money;

            return true;
        }

        return false;
    }

    public boolean isValid(int account) {
        return account > 0 && account <= len;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */

// Example 1:

// Input
// ["Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"]
// [[[10, 100, 20, 50, 30]], [3, 10], [5, 1, 20], [5, 20], [3, 4, 15], [10, 50]]

// Output
// [null, true, true, true, false, false]

// Explanation
// Bank bank = new Bank([10, 100, 20, 50, 30]);
// bank.withdraw(3, 10);    -> return true, account 3 has a balance of $20, so it is valid to withdraw $10.
//                             Account 3 has $20 - $10 = $10.
// bank.transfer(5, 1, 20); -> return true, account 5 has a balance of $30, so it is valid to transfer $20.
//                             Account 5 has $30 - $20 = $10, and account 1 has $10 + $20 = $30.
// bank.deposit(5, 20);     -> return true, it is valid to deposit $20 to account 5.
//                             Account 5 has $10 + $20 = $30.
// bank.transfer(3, 4, 15); -> return false, the current balance of account 3 is $10,
//                             so it is invalid to transfer $15 from it.
// bank.withdraw(10, 50);   -> return false, it is invalid because account 10 does not exist.

