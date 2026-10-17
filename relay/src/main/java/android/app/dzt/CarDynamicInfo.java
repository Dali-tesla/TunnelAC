package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarDynamicInfo implements Parcelable {
    public static final Parcelable.Creator<CarDynamicInfo> CREATOR = new Parcelable.Creator<CarDynamicInfo>() { // from class: android.app.dzt.CarDynamicInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarDynamicInfo createFromParcel(Parcel source) {
            return new CarDynamicInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarDynamicInfo[] newArray(int size) {
            return new CarDynamicInfo[size];
        }
    };
    private int rpm;
    private int speed;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRpm() {
        return this.rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String toString() {
        return "CarDynamicInfo{speed=" + this.speed + ", rpm=" + this.rpm + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.speed);
        dest.writeInt(this.rpm);
    }

    public CarDynamicInfo() {
        this.speed = 0;
        this.rpm = 0;
    }

    protected CarDynamicInfo(Parcel in) {
        this.speed = 0;
        this.rpm = 0;
        this.speed = in.readInt();
        this.rpm = in.readInt();
    }
}
