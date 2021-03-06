public class BaseballTeam {

    private String city;
    private String mascot;
    private int numberOfPlayers;

    public boolean equals(Object object) {
        if (!(object instanceof BaseballTeam)) {
            return false;
        }
        BaseballTeam other = (BaseballTeam) object;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }

    public int hashCode() {
        return numberOfPlayers;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    // геттеры и сеттеры
}