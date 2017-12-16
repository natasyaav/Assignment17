public class loan implements java.io.Serializable {
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private java.util.Date loanDate;

        public loan() {
            this(2.5, 1, 1000);
        }
        public loan(double v, int i, int i1) {
        }

        public loan(double annualInterestRate, int numberOfYears,
                    double loanAmount) {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();
        }
        public double getAnnualInterestRate() {
            return annualInterestRate;
        }
        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }
        public int getNumberOfYears() {
            return numberOfYears;
        }
        public void setNumberOfYears(int numberOfYears) {
            this.numberOfYears = numberOfYears;
        }
        public double getLoanAmount() {
            return loanAmount;
        }
        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
        }
        public double getMonthlyPayment() {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                    (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;
        }
        public double getTotalPayment() {
            double totalPayment = getMonthlyPayment() * numberOfYears * 12;
            return totalPayment;
        }
        public java.util.Date getLoanDate() {
            return loanDate;
        }

        @Override /** Override the toString method in the Object class */
        public String toString() {
            return "Date: " + loanDate + "\nAnnual interest Rate: " +
                    annualInterestRate + "\nYears: " + numberOfYears +
                    "\nLoan amount: " + loanAmount;
        }
    }

