package bridge;

/**
 * Refined Abstraction
 * <p/>
 * If I decide I want to further extend the remote I can
 */

public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(TVDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }
}
