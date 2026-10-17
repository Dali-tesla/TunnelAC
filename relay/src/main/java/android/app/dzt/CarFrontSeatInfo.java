package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarFrontSeatInfo implements Parcelable {
    public static final Parcelable.Creator<CarFrontSeatInfo> CREATOR = new Parcelable.Creator<CarFrontSeatInfo>() { // from class: android.app.dzt.CarFrontSeatInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarFrontSeatInfo createFromParcel(Parcel source) {
            return new CarFrontSeatInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarFrontSeatInfo[] newArray(int size) {
            return new CarFrontSeatInfo[size];
        }
    };
    private boolean isLeftBackSel;
    private boolean isLeftCushionSel;
    private boolean isLeftSeatHeat;
    private boolean isLeftSeatVent;
    private boolean isRightBackSel;
    private boolean isRightCushionSel;
    private boolean isRightSeatHeat;
    private boolean isRightSeatVent;
    private int leftRank;
    private int rightRank;

    public boolean isLeftSeatHeat() {
        return this.isLeftSeatHeat;
    }

    public void setLeftSeatHeat(boolean leftSeatHeat) {
        this.isLeftSeatHeat = leftSeatHeat;
    }

    public boolean isLeftSeatVent() {
        return this.isLeftSeatVent;
    }

    public void setLeftSeatVent(boolean leftSeatVent) {
        this.isLeftSeatVent = leftSeatVent;
    }

    public int getLeftRank() {
        return this.leftRank;
    }

    public void setLeftRank(int leftRank) {
        this.leftRank = leftRank;
    }

    public boolean isLeftBackSel() {
        return this.isLeftBackSel;
    }

    public void setLeftBackSel(boolean leftBackSel) {
        this.isLeftBackSel = leftBackSel;
    }

    public boolean isLeftCushionSel() {
        return this.isLeftCushionSel;
    }

    public void setLeftCushionSel(boolean leftCushionSel) {
        this.isLeftCushionSel = leftCushionSel;
    }

    public boolean isRightSeatHeat() {
        return this.isRightSeatHeat;
    }

    public void setRightSeatHeat(boolean rightSeatHeat) {
        this.isRightSeatHeat = rightSeatHeat;
    }

    public boolean isRightSeatVent() {
        return this.isRightSeatVent;
    }

    public void setRightSeatVent(boolean rightSeatVent) {
        this.isRightSeatVent = rightSeatVent;
    }

    public int getRightRank() {
        return this.rightRank;
    }

    public void setRightRank(int rightRank) {
        this.rightRank = rightRank;
    }

    public boolean isRightBackSel() {
        return this.isRightBackSel;
    }

    public void setRightBackSel(boolean rightBackSel) {
        this.isRightBackSel = rightBackSel;
    }

    public boolean isRightCushionSel() {
        return this.isRightCushionSel;
    }

    public void setRightCushionSel(boolean rightCushionSel) {
        this.isRightCushionSel = rightCushionSel;
    }

    public String toString() {
        return "CarFrontSeatInfo{isLeftSeatHeat=" + this.isLeftSeatHeat + ", isLeftSeatVent=" + this.isLeftSeatVent + ", leftRank=" + this.leftRank + ", isLeftBackSel=" + this.isLeftBackSel + ", isLeftCushionSel=" + this.isLeftCushionSel + ", isRightSeatHeat=" + this.isRightSeatHeat + ", isRightSeatVent=" + this.isRightSeatVent + ", rightRank=" + this.rightRank + ", isRightBackSel=" + this.isRightBackSel + ", isRightCushionSel=" + this.isRightCushionSel + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isLeftSeatHeat ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLeftSeatVent ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.leftRank);
        parcel.writeByte(this.isLeftBackSel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLeftCushionSel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRightSeatHeat ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRightSeatVent ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.rightRank);
        parcel.writeByte(this.isRightBackSel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRightCushionSel ? (byte) 1 : (byte) 0);
    }

    public CarFrontSeatInfo() {
        this.isLeftSeatHeat = false;
        this.isLeftSeatVent = false;
        this.leftRank = 0;
        this.isLeftBackSel = false;
        this.isLeftCushionSel = false;
        this.isRightSeatHeat = false;
        this.isRightSeatVent = false;
        this.rightRank = 0;
        this.isRightBackSel = false;
        this.isRightCushionSel = false;
    }

    protected CarFrontSeatInfo(Parcel in) {
        this.isLeftSeatHeat = false;
        this.isLeftSeatVent = false;
        this.leftRank = 0;
        this.isLeftBackSel = false;
        this.isLeftCushionSel = false;
        this.isRightSeatHeat = false;
        this.isRightSeatVent = false;
        this.rightRank = 0;
        this.isRightBackSel = false;
        this.isRightCushionSel = false;
        this.isLeftSeatHeat = in.readByte() != 0;
        this.isLeftSeatVent = in.readByte() != 0;
        this.leftRank = in.readInt();
        this.isLeftBackSel = in.readByte() != 0;
        this.isLeftCushionSel = in.readByte() != 0;
        this.isRightSeatHeat = in.readByte() != 0;
        this.isRightSeatVent = in.readByte() != 0;
        this.rightRank = in.readInt();
        this.isRightBackSel = in.readByte() != 0;
        this.isRightCushionSel = in.readByte() != 0;
    }
}
