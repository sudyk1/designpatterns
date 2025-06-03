package learn.designpatterns.behavioral.chainofresponsibility.officer;

import learn.designpatterns.behavioral.chainofresponsibility.message.Message;

public class General extends Officer {
    private static final int CODE = 100;
    private static final String NAME = "General Powell";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL)
                && message.getCode() == CODE) {
            System.out.println(NAME + " received a message: " + message.getContent());
        } else {
//            getSuperiorOfficer().processMessage(message);
            System.out.println("Message didn't find a receiver.");
        }
    }
}
