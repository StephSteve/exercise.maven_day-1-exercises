package com.github.perscholas;

import java.sql.Struct;

/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        if (score <= 100 && score >=90){
        }return true;
    }

    public Boolean isGradeB(Double score) {
        return (score <= 89 && score >=80);

    public Boolean isGradeC(Double score) {
            return (score <= 79 && score >=70);
    }

    public Boolean isGradeD(Double score) {
            return (score <= 79 && score >=70);
    }

    public Boolean isGradeF(Double score) {
            return score <= 64;
    }

    public Character getGrade(Double score) {
       if (isGradeA(score)){
           return 'A';
       }
            if (isGradeB(score)){
                return 'B';
            }
            else if (isGradeC(score)){
                return 'C';
            }
            if (isGradeD(score)){
                return 'D';
            }
            if (isGradeF(score)){
                return 'F';
            }
    }
}
