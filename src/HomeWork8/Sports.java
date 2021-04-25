package HomeWork8;

public class Sports {

    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Socerr extends Sports {


    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }

    public static void main(String[] args) {
        Sports sports = new Socerr();
        Sports sports1 = new Sports();
        System.out.println(sports1.getName());
        sports1.getNumberOfTeamMembers();
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();

    }


}


