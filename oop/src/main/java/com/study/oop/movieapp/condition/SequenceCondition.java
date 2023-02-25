package com.study.oop.movieapp.condition;

import com.study.oop.movieapp.Screening;

public class SequenceCondition{
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }


    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
