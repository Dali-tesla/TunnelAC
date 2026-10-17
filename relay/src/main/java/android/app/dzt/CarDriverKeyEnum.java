package android.app.dzt;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public enum CarDriverKeyEnum {
    NONE(0),
    K_MODE(1),
    K_UP(2),
    K_DN(3),
    K_LEFT(4),
    K_RIGHT(5),
    K_OK(6),
    K_BT(7),
    K_PICUP(8),
    K_HANGDN(9),
    K_VOL_UP(10),
    K_VOL_DN(11),
    K_MUTE(12),
    K_SPEEH(13),
    K_NAV(14),
    K_PRE(15),
    K_NEXT(16),
    P_CLIMATE(32),
    P_CAMERA(33),
    C_VOL_UP(64),
    C_VOL_DN(65),
    C_MUTE(66),
    C_NAVI(67),
    C_RADIO(68),
    C_MEDIA(69),
    C_MENU(70),
    C_HOME(71),
    C_TEL(72),
    C_CAR(73),
    C_STAR(74),
    C_PRE(75),
    C_NEXT(76),
    C_UP(77),
    C_DN(78),
    C_TLEFT(79),
    C_RIGHT(80),
    C_OK(81),
    C_RETURN(82),
    C_POWER(83),
    C_SEL_LEFT(84),
    C_SEL_RIGHT(85);

    private int code;

    CarDriverKeyEnum(int value) {
        this.code = value;
    }

    public byte getCode() {
        return (byte) this.code;
    }
}
