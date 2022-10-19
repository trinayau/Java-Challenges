package VotingSystem;

public class Voter {
    private int minimumAge = 18;
    private int age;

    public Voter(int age){
        this.age = age;
    }

    public int checkVoter() throws VoterException{
        if (age > minimumAge){
            System.out.println("Voter is qualified.");
        }
        else {
            throw new VoterException("Voter is below the minimum age to vote.");
        }
        return this.age;
    }
}
