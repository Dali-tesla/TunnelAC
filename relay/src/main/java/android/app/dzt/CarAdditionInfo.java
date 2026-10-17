package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarAdditionInfo implements Parcelable {
    public static final Parcelable.Creator<CarAdditionInfo> CREATOR = new Parcelable.Creator<CarAdditionInfo>() { // from class: android.app.dzt.CarAdditionInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarAdditionInfo createFromParcel(Parcel in) {
            return new CarAdditionInfo(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarAdditionInfo[] newArray(int size) {
            return new CarAdditionInfo[size];
        }
    };
    private boolean isParkingLight;
    private boolean isRadarLight;

    public boolean isRadarLight() {
        return this.isRadarLight;
    }

    public void setRadarLight(boolean radarLight) {
        this.isRadarLight = radarLight;
    }

    public boolean isParkingLight() {
        return this.isParkingLight;
    }

    public void setParkingLight(boolean parkingLight) {
        this.isParkingLight = parkingLight;
    }

    public CarAdditionInfo() {
    }

    public String toString() {
        return "CarAdditionInfo{isRadarLight=" + this.isRadarLight + ", isParkingLight=" + this.isParkingLight + '}';
    }

    protected CarAdditionInfo(Parcel in) {
        this.isRadarLight = in.readByte() != 0;
        this.isParkingLight = in.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isRadarLight ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isParkingLight ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
