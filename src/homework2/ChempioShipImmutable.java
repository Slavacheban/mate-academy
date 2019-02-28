package homework2;


public final class ChempioShipImmutable {

    private final String name;
    private final int age;
    private final FootballTeam footballTeam;

    public ChempioShipImmutable(String name, int age, FootballTeam footballTeam) {
        this.name = name;
        this.age = age;
        this.footballTeam = footballTeam;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public FootballTeam getFootballTeam() throws CloneNotSupportedException {
        return (FootballTeam) footballTeam.clone();
    }
}

