package com.example.cats_catalog.data.models;

public enum VoteType {
    UP_VOTE(1),
    DOWN_VOTE(0);

    private final int vote;

    VoteType(int vote) {
        this.vote = vote;
    }

    public int asInteger() {
        return vote;
    }
}
