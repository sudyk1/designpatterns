package learn.designpatterns.behavioral.visitor.activity;

import learn.designpatterns.behavioral.visitor.visitor.Visitor;

public class Squash implements Activity {
    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
