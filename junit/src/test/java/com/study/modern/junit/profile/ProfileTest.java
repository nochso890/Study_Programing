package com.study.modern.junit.profile;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProfileTest {

    private static Profile profile;
    private static BooleanQuestion question;
    private static Criteria criteria;

    @BeforeAll
    static void create(){
        profile = new Profile("Bull Hockey, Inc.");
        question = new BooleanQuestion(1,"Got bonuses?");
        criteria = new Criteria();
    }

    @Test
    void matchAnswersFalseWhenMustMatchCriteriaNotMet(){
        Answer profileAnswer = new Answer(question,Bool.FALSE);
        profile.add(profileAnswer);
        Answer criteriaAnswer = new Answer(question, Bool.TURE);
        Criterion criterion = new Criterion(criteriaAnswer,Weight.MustMatch);
        criteria.add(criterion);

        boolean matches = profile.matches(criteria);

        assertFalse(matches);
    }

    @Test
    void matchAnswersTrueForAnyDontCareCriteria(){
        Answer profileAnswer = new Answer(question,Bool.FALSE);
        profile.add(profileAnswer);
        Answer criteriaAnswer = new Answer(question, Bool.TURE);
        Criterion criterion = new Criterion(criteriaAnswer,Weight.Dontcare);
        criteria.add(criterion);

        boolean matches = profile.matches(criteria);

        assertTrue(matches);
    }

}
