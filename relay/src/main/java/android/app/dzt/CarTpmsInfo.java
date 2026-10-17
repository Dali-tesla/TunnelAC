package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarTpmsInfo implements Parcelable {
    public static final Parcelable.Creator<CarTpmsInfo> CREATOR = new Parcelable.Creator<CarTpmsInfo>() { // from class: android.app.dzt.CarTpmsInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarTpmsInfo createFromParcel(Parcel source) {
            return new CarTpmsInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarTpmsInfo[] newArray(int size) {
            return new CarTpmsInfo[size];
        }
    };
    private int front1Psi;
    private int front2Psi;
    private boolean isUnitBar;
    private int rear1Psi;
    private int rear2Psi;

    public boolean isUnitBar() {
        return this.isUnitBar;
    }

    public void setUnitBar(boolean unitBar) {
        this.isUnitBar = unitBar;
    }

    public int getFront1Psi() {
        return this.front1Psi;
    }

    public void setFront1Psi(int front1Psi) {
        this.front1Psi = front1Psi;
    }

    public int getFront2Psi() {
        return this.front2Psi;
    }

    public void setFront2Psi(int front2Psi) {
        this.front2Psi = front2Psi;
    }

    public int getRear1Psi() {
        return this.rear1Psi;
    }

    public void setRear1Psi(int rear1Psi) {
        this.rear1Psi = rear1Psi;
    }

    public int getRear2Psi() {
        return this.rear2Psi;
    }

    public void setRear2Psi(int rear2Psi) {
        this.rear2Psi = rear2Psi;
    }

    public String toString() {
        return "CarTpmsInfo{isUnitBar=" + this.isUnitBar + ", front1Psi=" + this.front1Psi + ", front2Psi=" + this.front2Psi + ", rear1Psi=" + this.rear1Psi + ", rear2Psi=" + this.rear2Psi + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isUnitBar ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.front1Psi);
        parcel.writeInt(this.front2Psi);
        parcel.writeInt(this.rear1Psi);
        parcel.writeInt(this.rear2Psi);
    }

    public CarTpmsInfo() {
        this.isUnitBar = true;
        this.front1Psi = 0;
        this.front2Psi = 0;
        this.rear1Psi = 0;
        this.rear2Psi = 0;
    }

    protected CarTpmsInfo(Parcel in) {
        this.isUnitBar = true;
        this.front1Psi = 0;
        this.front2Psi = 0;
        this.rear1Psi = 0;
        this.rear2Psi = 0;
        this.isUnitBar = in.readByte() != 0;
        this.front1Psi = in.readInt();
        this.front2Psi = in.readInt();
        this.rear1Psi = in.readInt();
        this.rear2Psi = in.readInt();
    }
}
