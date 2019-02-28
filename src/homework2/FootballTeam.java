package homework2;

public class FootballTeam implements Cloneable {
    private String goalkeeper;
    private String back;
    private String halfBack;
    private String forvard;
    private String fullBack;
    private String vinger;
    private String coach;

    public FootballTeam(FootballTeamBuilder buildTeam) {
        goalkeeper = buildTeam.goalkeeper;
        back = buildTeam.back;
        halfBack = buildTeam.halfBack;
        forvard = buildTeam.forvard;
        fullBack = buildTeam.fullBack;
        vinger = buildTeam.vinger;
        coach = buildTeam.coach;
    }

    public String getGoalkeeper() {
        return goalkeeper;
    }

    public String getBack() {
        return back;
    }

    public String getHalfBack() {
        return halfBack;
    }

    public String getForvard() {
        return forvard;
    }

    public String getFullBack() {
        return fullBack;
    }

    public String getVinger() {
        return vinger;
    }

    public String getCoach() {
        return coach;
    }

    public static FootballTeamBuilder builder() {
        return new FootballTeamBuilder();
    }

    public static class FootballTeamBuilder {
        private String goalkeeper;
        private String back;
        private String halfBack;
        private String forvard;
        private String fullBack;
        private String vinger;
        private String coach;

        public FootballTeamBuilder setGoalkeeper(String goalkeeper) {
            this.goalkeeper = goalkeeper;
            return this;
        }

        public FootballTeamBuilder setBack(String back) {
            this.back = back;
            return this;
        }

        public FootballTeamBuilder setHalfBack(String halfBack) {
            this.halfBack = halfBack;
            return this;
        }

        public FootballTeamBuilder setForvard(String forvard) {
            this.forvard = forvard;
            return this;
        }

        public FootballTeamBuilder setFullBack(String fullBack) {
            this.fullBack = fullBack;
            return this;
        }

        public FootballTeamBuilder setVinger(String vinger) {
            this.vinger = vinger;
            return this;
        }

        public FootballTeamBuilder setCoach(String coach) {
            this.coach = coach;
            return this;
        }

        private FootballTeamBuilder() {

        }

        public FootballTeam build() {
            return new FootballTeam(this);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
