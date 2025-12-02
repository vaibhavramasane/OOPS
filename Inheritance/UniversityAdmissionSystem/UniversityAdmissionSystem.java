import java.util.*;

class Applicant {
    String name;
    int score;

    public Applicant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getRankScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " with rank score: " + getRankScore();
    }
}

class SportsQuota extends Applicant {
    public SportsQuota(String name, int score) {
        super(name, score);
    }

    @Override
    public int getRankScore() {
        return score + 15;
    }
}

class DefenseQuota extends Applicant {
    public DefenseQuota(String name, int score) {
        super(name, score);
    }

    @Override
    public int getRankScore() {
        return score + 10;
    }
}

class General extends Applicant {
    public General(String name, int score) {
        super(name, score);
    }
}

class NRIQuota extends Applicant {
    int feeMultiplier = 3;

    public NRIQuota(String name, int score) {
        super(name, score);
    }

    @Override
    public int getRankScore() {
        return score + 20;
    }

    public int getFee() {
        return 3 * score; // Fee is 3 times the normal score.
    }
}

public class UniversityAdmissionSystem {
    public static void main(String[] args) {
        // Creating 12 applicants
        Applicant[] applicants = new Applicant[] {
            new SportsQuota("John", 80),
            new DefenseQuota("Mary", 85),
            new General("Alice", 75),
            new NRIQuota("Eve", 90),
            new SportsQuota("Paul", 70),
            new DefenseQuota("Linda", 78),
            new General("Tom", 88),
            new NRIQuota("Zara", 92),
            new SportsQuota("Henry", 95),
            new DefenseQuota("Rachel", 82),
            new General("Sophia", 76),
            new NRIQuota("Carlos", 84)
        };

        // Sorting the applicants based on rank score (high to low)
        Arrays.sort(applicants, (a1, a2) -> Integer.compare(a2.getRankScore(), a1.getRankScore()));

        // Printing the top 3 shortlisted candidates
        System.out.println("Top 3 shortlisted candidates:");
        for (int i = 0; i < 3; i++) {
            System.out.println(applicants[i]);
        }
    }
}
