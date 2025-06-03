package learn.designpatterns.behavioral.visitor.visitor;

import learn.designpatterns.behavioral.visitor.activity.Squash;
import learn.designpatterns.behavioral.visitor.activity.Treadmill;
import learn.designpatterns.behavioral.visitor.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
