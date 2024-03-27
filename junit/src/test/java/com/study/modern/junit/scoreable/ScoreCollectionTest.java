package com.study.modern.junit.scoreable;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ScoreCollectionTest {

    @Test
    void answerArithmeticMeanOfTwoNumbers(){
        //given
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(()->5);
        scoreCollection.add(()->7);

        //when
        int actualResult = scoreCollection.arithmeticMean();

        //then
        assertThat(actualResult).isEqualTo(6);

    }
}
