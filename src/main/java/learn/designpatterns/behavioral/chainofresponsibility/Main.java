package learn.designpatterns.behavioral.chainofresponsibility;

import learn.designpatterns.behavioral.chainofresponsibility.message.Message;
import learn.designpatterns.behavioral.chainofresponsibility.officer.Captain;
import learn.designpatterns.behavioral.chainofresponsibility.officer.General;
import learn.designpatterns.behavioral.chainofresponsibility.officer.Officer;
import learn.designpatterns.behavioral.chainofresponsibility.officer.Sergeant;

import static learn.designpatterns.behavioral.chainofresponsibility.officer.OfficerRank.CAPTAIN;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Attack!", 60, CAPTAIN);

        Officer sergeant =  new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);
    }
}
