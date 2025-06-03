package learn.designpatterns.behavioral.visitor.activity;

import learn.designpatterns.behavioral.visitor.visitor.Visitor;

public interface Activity {
    void accept(Visitor visitor);
}
