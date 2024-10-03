import java.util.List;

public class Kompanija {
    List<Vraboten> vraboten;

    public Vraboten najangaziran() {
        Vraboten mostEngaged = vraboten.get(0);
        double maxHours = vraboten.get(0).getTotalHours(); // Use total hours, not task count
        for (int i = 1; i < vraboten.size(); i++) {
            double currentHours = vraboten.get(i).getTotalHours();
            if (currentHours > maxHours) {
                maxHours = currentHours;
                mostEngaged = vraboten.get(i);
            }
        }
        return mostEngaged;
    }

    public void sortBySuccess() {
        for (int i = 0; i < vraboten.size(); i++) {
            for (int j = 0; j < vraboten.size() - 1; j++) {
                if (vraboten.get(j).getNumOfPoints() < vraboten.get(j + 1).getNumOfPoints()) {
                    Vraboten temp = vraboten.get(j);
                    vraboten.set(j, vraboten.get(j + 1));
                    vraboten.set(j + 1, temp);
                }
            }
        }
    }

    public void pecatiPoUspesnost() {
        sortBySuccess();
        for (Vraboten v : vraboten) {
            System.out.println(v.getName() + " " + v.getLastName() + " " + v.getNumOfPoints());
        }
    }

}
