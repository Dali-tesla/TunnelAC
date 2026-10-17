package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarLearnKeyInfo implements Parcelable {
    public static final Parcelable.Creator<CarLearnKeyInfo> CREATOR = new Parcelable.Creator<CarLearnKeyInfo>() { // from class: android.app.dzt.CarLearnKeyInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarLearnKeyInfo createFromParcel(Parcel source) {
            return new CarLearnKeyInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarLearnKeyInfo[] newArray(int size) {
            return new CarLearnKeyInfo[size];
        }
    };
    private int key;
    private int status;
    private double volt;

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public double getVolt() {
        return this.volt;
    }

    public void setVolt(double volt) {
        this.volt = volt;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.status);
        dest.writeInt(this.key);
        dest.writeDouble(this.volt);
    }

    public CarLearnKeyInfo() {
    }

    protected CarLearnKeyInfo(Parcel in) {
        this.status = in.readInt();
        this.key = in.readInt();
        this.volt = in.readDouble();
    }

    public String toString() {
        return "CarLearnKeyInfo{status=" + this.status + ", key=" + this.key + ", volt=" + this.volt + '}';
    }
}
