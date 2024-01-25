class Employee extends Person {
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public String getPosition() {
        return "Employee";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return getSalary();
    }
}
