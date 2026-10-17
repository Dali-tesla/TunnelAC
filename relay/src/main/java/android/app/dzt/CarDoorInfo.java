package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarDoorInfo implements Parcelable {
    public static final Parcelable.Creator<CarDoorInfo> CREATOR = new Parcelable.Creator<CarDoorInfo>() { // from class: android.app.dzt.CarDoorInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarDoorInfo createFromParcel(Parcel source) {
            return new CarDoorInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarDoorInfo[] newArray(int size) {
            return new CarDoorInfo[size];
        }
    };
    private boolean isFron1Open;
    private boolean isFron2Open;
    private boolean isFrontCoverOpen;
    private boolean isRear1Open;
    private boolean isRear2Open;
    private boolean isRearCoverOpen;

    public boolean isFron1Open() {
        return this.isFron1Open;
    }

    public void setFron1Open(boolean fron1Open) {
        this.isFron1Open = fron1Open;
    }

    public boolean isFron2Open() {
        return this.isFron2Open;
    }

    public void setFron2Open(boolean fron2Open) {
        this.isFron2Open = fron2Open;
    }

    public boolean isRear1Open() {
        return this.isRear1Open;
    }

    public void setRear1Open(boolean rear1Open) {
        this.isRear1Open = rear1Open;
    }

    public boolean isRear2Open() {
        return this.isRear2Open;
    }

    public void setRear2Open(boolean rear2Open) {
        this.isRear2Open = rear2Open;
    }

    public boolean isFrontCoverOpen() {
        return this.isFrontCoverOpen;
    }

    public void setFrontCoverOpen(boolean frontCoverOpen) {
        this.isFrontCoverOpen = frontCoverOpen;
    }

    public boolean isRearCoverOpen() {
        return this.isRearCoverOpen;
    }

    public void setRearCoverOpen(boolean rearCoverOpen) {
        this.isRearCoverOpen = rearCoverOpen;
    }

    public String toString() {
        return "CarDoorInfo{isFron1Open=" + this.isFron1Open + ", isFron2Open=" + this.isFron2Open + ", isRear1Open=" + this.isRear1Open + ", isRear2Open=" + this.isRear2Open + ", isFrontCoverOpen=" + this.isFrontCoverOpen + ", isRearCoverOpen=" + this.isRearCoverOpen + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isFron1Open ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFron2Open ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRear1Open ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRear2Open ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFrontCoverOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRearCoverOpen ? (byte) 1 : (byte) 0);
    }

    public CarDoorInfo() {
        this.isFron1Open = false;
        this.isFron2Open = false;
        this.isRear1Open = false;
        this.isRear2Open = false;
        this.isFrontCoverOpen = false;
        this.isRearCoverOpen = false;
    }

    protected CarDoorInfo(Parcel in) {
        this.isFron1Open = false;
        this.isFron2Open = false;
        this.isRear1Open = false;
        this.isRear2Open = false;
        this.isFrontCoverOpen = false;
        this.isRearCoverOpen = false;
        this.isFron1Open = in.readByte() != 0;
        this.isFron2Open = in.readByte() != 0;
        this.isRear1Open = in.readByte() != 0;
        this.isRear2Open = in.readByte() != 0;
        this.isFrontCoverOpen = in.readByte() != 0;
        this.isRearCoverOpen = in.readByte() != 0;
    }
}
