package learn.designpatterns.behavioral.visitor;

import learn.designpatterns.behavioral.visitor.activity.Activity;
import learn.designpatterns.behavioral.visitor.activity.Squash;
import learn.designpatterns.behavioral.visitor.activity.Treadmill;
import learn.designpatterns.behavioral.visitor.activity.Weights;
import learn.designpatterns.behavioral.visitor.visitor.Visitor;
import learn.designpatterns.behavioral.visitor.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        Visitor visitor = new VisitorImpl();
        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("-".repeat(40));

        List<Activity> activities = Arrays.asList(treadmill, squash, weights);
        activities.forEach(activity -> activity.accept(visitor));
    }
}
