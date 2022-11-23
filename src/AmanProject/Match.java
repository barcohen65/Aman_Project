package AmanProject;

import java.util.Comparator;

public class Match{
    String match1;
    String match2;
    int matchGrade;

    public Match(String match1, String match2, int matchGrade) {
        this.match1 = match1;
        this.match2 = match2;
        this.matchGrade = matchGrade;
    }

    public int getMatchGrade() {
        return matchGrade;
    }

    public void setMatchGrade(int matchGrade) {
        this.matchGrade = matchGrade;
    }

    public static Comparator<Match> matchGradeCompare = (match1, match2) -> {

        int matchGrade1 = match1.getMatchGrade();
        int matchGrade2 = match2.getMatchGrade();

        return matchGrade2-matchGrade1;
    };

    @Override
    public String toString() {
        return
                "First match= '" + match1 + '\'' +
                        ", Second match= '" + match2 + '\'' +
                        ", matchGrade= " + matchGrade;
    }
}
