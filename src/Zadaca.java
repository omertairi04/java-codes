public class Zadaca {
    String description;
    int numOfHours;
    boolean status;

    Zadaca(String description, int numOfHours, boolean status) {
        this.description = description;
        this.numOfHours = numOfHours;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Zadaca{" +
                "description='" + description + '\'' +
                ", numOfHours=" + numOfHours +
                ", status=" + status +
                '}';
    }
}
