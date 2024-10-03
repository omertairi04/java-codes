import java.util.Arrays;

public class Vraboten {
    String name;
    String lastName;
    static double onePoint;
    double salary;
    int workExp;
    int numOfPoints;
    Zadaca[] listOfTasks = new Zadaca[10];
    int numOfTasks;

    public Vraboten(String lastName, String name, int numOfPoints, int workExp) {
        this.numOfPoints = numOfPoints;
        this.workExp = workExp;
        this.lastName = lastName;
        this.name = name;
    }

    public Vraboten() {
    }

    public int addTask(Zadaca task) {
        if (numOfTasks == 10) {
            System.out.println("Vraboten has no more tasks");
            return -1;
        }
        listOfTasks[numOfTasks] = task;
        numOfTasks++;
        return 1;
    }

    public double getTotalHours() {
        int totalHours = 0;
        for (int i = 0; i < numOfTasks; i++) {
            totalHours += listOfTasks[i].getNumOfHours();
        }
        return totalHours;
    }

    public double getCompletionPercentage() {
        int completedTasks = 0;
        for (int i = 0; i < numOfTasks; i++) {
            if (listOfTasks[i].isStatus()) {
                completedTasks++;
            }
        }
        return (completedTasks / (double) numOfTasks) * 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static double getOnePoint() {
        return onePoint;
    }

    public static void setOnePoint(double onePoint) {
        Vraboten.onePoint = onePoint;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public int getNumOfPoints() {
        return numOfPoints;
    }

    public void setNumOfPoints(int numOfPoints) {
        this.numOfPoints = numOfPoints;
    }

    public Zadaca[] getListOfTasks() {
        return listOfTasks;
    }

    public void setListOfTasks(Zadaca[] listOfTasks) {
        this.listOfTasks = listOfTasks;
    }

    public int getNumOfTasks() {
        return numOfTasks;
    }

    public void setNumOfTasks(int numOfTasks) {
        this.numOfTasks = numOfTasks;
    }

    @Override
    public String toString() {
        return "Vraboten{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", workExp=" + workExp +
                ", numOfPoints=" + numOfPoints +
                ", listOfTasks=" + Arrays.toString(listOfTasks) +
                ", numOfTasks=" + numOfTasks +
                '}';
    }
}
