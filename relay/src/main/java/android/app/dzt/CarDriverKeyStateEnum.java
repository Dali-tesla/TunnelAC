package android.app.dzt;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public enum CarDriverKeyStateEnum {
    BTN_UP(0),
    BTN_DOWN(1),
    BTN_LONG_PRESS(2);

    private int code;

    CarDriverKeyStateEnum(int value) {
        this.code = value;
    }

    public byte getCode() {
        return (byte) this.code;
    }
}
