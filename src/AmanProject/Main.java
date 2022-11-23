package AmanProject;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader;
        ArrayList<List<String>> personList = new ArrayList<>();
        ArrayList<Male> maleList = new ArrayList<>();
        ArrayList<Female> femaleList = new ArrayList<>();
        ArrayList<Match> matchList = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\Michael\\Desktop\\aman.txt"));
            String line = reader.readLine();
            while (line != null) {
                personList.add(Arrays.asList(line.split(", ")));
                if(personList.get(personList.size()-1).get(1).equals("male")){
                    Male male = new Male(personList.get(personList.size()-1).get(0), personList.get(personList.size()-1).get(1), personList.get(personList.size()-1).get(2), personList.get(personList.size()-1).get(3), personList.get(personList.size()-1).get(4), personList.get(personList.size()-1).get(5), personList.get(personList.size()-1).get(6), personList.get(personList.size()-1).get(7), personList.get(personList.size()-1).get(8), personList.get(personList.size()-1).get(9));
                    maleList.add(male);
                }
                else{
                Female female = new Female(personList.get(personList.size()-1).get(0), personList.get(personList.size()-1).get(1), personList.get(personList.size()-1).get(2), personList.get(personList.size()-1).get(3), personList.get(personList.size()-1).get(4), personList.get(personList.size()-1).get(5), personList.get(personList.size()-1).get(6), personList.get(personList.size()-1).get(7), personList.get(personList.size()-1).get(8), personList.get(personList.size()-1).get(9));
                femaleList.add(female);
            }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Male male : maleList){
            if(male.getPreferredGender().equals("male")) {
                for (int i = maleList.indexOf(male) + 1; i < maleList.size(); i++) {
                    if (maleList.get(i).getPreferredGender().equals("male")) {
                        Match match = new Match(male.getFullName(), maleList.get(i).getFullName(), 0);
                        if (Integer.parseInt(male.getPreferredMaxAge()) >= Integer.parseInt(maleList.get(i).getAge()) && Integer.parseInt(maleList.get(i).getPreferredMaxAge()) >= Integer.parseInt(male.getAge())) {
                            match.matchGrade++;
                        }
                        if (male.getPreferredCharacter().equals(maleList.get(i).getDominatedCharacter()) && maleList.get(i).getPreferredCharacter().equals(male.getDominatedCharacter())) {
                            match.matchGrade++;
                        }
                        if (male.getPreferredProfession().equals(maleList.get(i).getProfession()) && maleList.get(i).getPreferredProfession().equals(male.getProfession())) {
                            match.matchGrade++;
                        }
                        matchList.add(match);

                    }
                }
            }
                else{
                    for(int i=0;i< femaleList.size();i++){
                        if(femaleList.get(i).getPreferredGender().equals("male")){
                            Match match=new Match(male.getFullName(),femaleList.get(i).getFullName(),0);
                            if(Integer.parseInt(male.getPreferredMaxAge())>=Integer.parseInt(femaleList.get(i).getAge()) && Integer.parseInt(femaleList.get(i).getPreferredMaxAge())>=Integer.parseInt(male.getAge())){
                                match.matchGrade++;
                            }
                            if(male.getPreferredCharacter().equals(femaleList.get(i).getDominatedCharacter()) && femaleList.get(i).getPreferredCharacter().equals(male.getDominatedCharacter())){
                                match.matchGrade++;
                            }
                            if(male.getPreferredProfession().equals(femaleList.get(i).getProfession()) && femaleList.get(i).getPreferredProfession().equals(male.getProfession())){
                                match.matchGrade++;
                            }
                            matchList.add(match);

                        }
                    }

                }
            }
        for(Female female : femaleList){
            if(female.getPreferredGender().equals("female")) {
                for (int i = femaleList.indexOf(female) + 1; i < femaleList.size(); i++) {
                    if (femaleList.get(i).getPreferredGender().equals("female")) {
                            Match match = new Match(female.getFullName(), femaleList.get(i).getFullName(), 0);
                            if (Integer.parseInt(female.getPreferredMaxAge()) >= Integer.parseInt(femaleList.get(i).getAge())
                                    && Integer.parseInt(femaleList.get(i).getPreferredMaxAge()) >= Integer.parseInt(female.getAge())) {
                                match.matchGrade++;
                            }
                            if (female.getPreferredCharacter().equals(femaleList.get(i).getDominatedCharacter())
                                    && femaleList.get(i).getPreferredCharacter().equals(female.getDominatedCharacter())) {
                                match.matchGrade++;
                            }
                            if (female.getPreferredProfession().equals(femaleList.get(i).getProfession())
                                    && femaleList.get(i).getPreferredProfession().equals(female.getProfession())) {
                                match.matchGrade++;
                            }
                            matchList.add(match);

                        }

                    }
                }
        }

        matchList.sort(Match.matchGradeCompare);
        for(Match match : matchList)
        System.out.println("Match number "+ (matchList.indexOf(match)+1)+": " + match.toString());

    }

}
