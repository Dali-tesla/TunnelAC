package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarEpsInfo implements Parcelable {
    public static final Parcelable.Creator<CarEpsInfo> CREATOR = new Parcelable.Creator<CarEpsInfo>() { // from class: android.app.dzt.CarEpsInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarEpsInfo createFromParcel(Parcel source) {
            return new CarEpsInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarEpsInfo[] newArray(int size) {
            return new CarEpsInfo[size];
        }
    };
    private int angle;
    private boolean isTurnRight;

    public boolean isTurnRight() {
        return this.isTurnRight;
    }

    public void setTurnRight(boolean turnRight) {
        this.isTurnRight = turnRight;
    }

    public int getAngle() {
        return this.angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public String toString() {
        return "CarEpsInfo{isTurnRight=" + this.isTurnRight + ", angle=" + this.angle + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isTurnRight ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.angle);
    }

    public CarEpsInfo() {
        this.isTurnRight = false;
        this.angle = 0;
    }

    protected CarEpsInfo(Parcel in) {
        this.isTurnRight = false;
        this.angle = 0;
        this.isTurnRight = in.readByte() != 0;
        this.angle = in.readInt();
    }
}
