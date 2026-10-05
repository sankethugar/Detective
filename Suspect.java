public class Suspect {

    int suspectId;
    String name;
    String location;
    String alibi;

    public Suspect(int suspectId, String name, String location, String alibi) {
        this.suspectId = suspectId;
        this.name = name;
        this.location = location;
        this.alibi = alibi;
    }

    public void displaySuspect() {
        System.out.println("ID: " + suspectId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Alibi: " + alibi);
        System.out.println("-------------------------");
    }

    public static void displayAllSuspects(Suspect[] suspects) {
        for (Suspect suspect : suspects) {
            suspect.displaySuspect();
        }
    }
}
