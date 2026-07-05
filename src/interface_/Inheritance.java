package interface_;

interface CEO {
    void manageCompany();
    void makeDecisions();
}

interface Manager extends CEO {
    void manageTeams();
}

class Employee implements Manager {
    @Override
    public void manageCompany() {
        System.out.println("Managing the company.");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Making important decisions.");
    }

    @Override
    public void manageTeams() {
        System.out.println("Managing teams and projects.");
    }

    public void work() {
        System.out.println("Working on tasks and responsibilities.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.manageCompany();
        employee.makeDecisions();
        employee.manageTeams();
        employee.work();
    }
}
