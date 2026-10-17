package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarRadarInfo implements Parcelable {
    public static final Parcelable.Creator<CarRadarInfo> CREATOR = new Parcelable.Creator<CarRadarInfo>() { // from class: android.app.dzt.CarRadarInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarRadarInfo createFromParcel(Parcel source) {
            return new CarRadarInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarRadarInfo[] newArray(int size) {
            return new CarRadarInfo[size];
        }
    };
    private int front1;
    private int front2;
    private int front3;
    private int front4;
    private int front5;
    private int front6;
    private int rear1;
    private int rear2;
    private int rear3;
    private int rear4;
    private int rear5;
    private int rear6;

    public int getFront1() {
        return this.front1;
    }

    public void setFront1(int front1) {
        this.front1 = front1;
    }

    public int getFront2() {
        return this.front2;
    }

    public void setFront2(int front2) {
        this.front2 = front2;
    }

    public int getFront3() {
        return this.front3;
    }

    public void setFront3(int front3) {
        this.front3 = front3;
    }

    public int getFront4() {
        return this.front4;
    }

    public void setFront4(int front4) {
        this.front4 = front4;
    }

    public int getFront5() {
        return this.front5;
    }

    public void setFront5(int front5) {
        this.front5 = front5;
    }

    public int getFront6() {
        return this.front6;
    }

    public void setFront6(int front6) {
        this.front6 = front6;
    }

    public int getRear1() {
        return this.rear1;
    }

    public void setRear1(int rear1) {
        this.rear1 = rear1;
    }

    public int getRear2() {
        return this.rear2;
    }

    public void setRear2(int rear2) {
        this.rear2 = rear2;
    }

    public int getRear3() {
        return this.rear3;
    }

    public void setRear3(int rear3) {
        this.rear3 = rear3;
    }

    public int getRear4() {
        return this.rear4;
    }

    public void setRear4(int rear4) {
        this.rear4 = rear4;
    }

    public int getRear5() {
        return this.rear5;
    }

    public void setRear5(int rear5) {
        this.rear5 = rear5;
    }

    public int getRear6() {
        return this.rear6;
    }

    public void setRear6(int rear6) {
        this.rear6 = rear6;
    }

    public String toString() {
        return "CarRadarInfo{front1=" + this.front1 + ", front2=" + this.front2 + ", front3=" + this.front3 + ", front4=" + this.front4 + ", front5=" + this.front5 + ", front6=" + this.front6 + ", rear1=" + this.rear1 + ", rear2=" + this.rear2 + ", rear3=" + this.rear3 + ", rear4=" + this.rear4 + ", rear5=" + this.rear5 + ", rear6=" + this.rear6 + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.front1);
        dest.writeInt(this.front2);
        dest.writeInt(this.front3);
        dest.writeInt(this.front4);
        dest.writeInt(this.front5);
        dest.writeInt(this.front6);
        dest.writeInt(this.rear1);
        dest.writeInt(this.rear2);
        dest.writeInt(this.rear3);
        dest.writeInt(this.rear4);
        dest.writeInt(this.rear5);
        dest.writeInt(this.rear6);
    }

    public CarRadarInfo() {
    }

    protected CarRadarInfo(Parcel in) {
        this.front1 = in.readInt();
        this.front2 = in.readInt();
        this.front3 = in.readInt();
        this.front4 = in.readInt();
        this.front5 = in.readInt();
        this.front6 = in.readInt();
        this.rear1 = in.readInt();
        this.rear2 = in.readInt();
        this.rear3 = in.readInt();
        this.rear4 = in.readInt();
        this.rear5 = in.readInt();
        this.rear6 = in.readInt();
    }
}
