package bridge;

/**
 * Refined Abstraction
 * <p/>
 * If I decide I want to further extend the remote I can
 */

public class DVDRemote extends RemoteButton {
    private boolean play = true;

    public DVDRemote(DVDDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {
        play = !play;
        System.out.println("DVD is Playing: " + play);
    }
}