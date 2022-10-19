package VotingSystem;

public class Driver {
    public static void main(String[] args) {
        Voter voter = new Voter(15);
        try{
            voter.checkVoter();
        } catch(VoterException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Voter has been checked.");
    }
}
