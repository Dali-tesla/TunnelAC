package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarFrontAirInfo implements Parcelable {
    public static final Parcelable.Creator<CarFrontAirInfo> CREATOR = new Parcelable.Creator<CarFrontAirInfo>() { // from class: android.app.dzt.CarFrontAirInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarFrontAirInfo createFromParcel(Parcel source) {
            return new CarFrontAirInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarFrontAirInfo[] newArray(int size) {
            return new CarFrontAirInfo[size];
        }
    };
    private boolean isACOpen;
    private boolean isAirOpen;
    private boolean isDownWind_l;
    private boolean isDownWind_r;
    private boolean isDual;
    private boolean isFlatWind_l;
    private boolean isFlatWind_r;
    private boolean isFrontWind_l;
    private boolean isFrontWind_r;
    private boolean isFrontWindfog;
    private boolean isInnerLoop;
    private boolean isModeAuto_l;
    private boolean isModeAuto_r;
    private boolean isRearWindfog;
    private boolean isTempUnitCelsius;
    private boolean isWindAuto_l;
    private boolean isWindAuto_r;
    private double tempVale_l;
    private double tempVale_r;
    private double windValue_l;
    private double windValue_r;

    public boolean isAirOpen() {
        return this.isAirOpen;
    }

    public void setAirOpen(boolean airOpen) {
        this.isAirOpen = airOpen;
    }

    public boolean isACOpen() {
        return this.isACOpen;
    }

    public void setACOpen(boolean ACOpen) {
        this.isACOpen = ACOpen;
    }

    public boolean isInnerLoop() {
        return this.isInnerLoop;
    }

    public void setInnerLoop(boolean innerLoop) {
        this.isInnerLoop = innerLoop;
    }

    public boolean isDual() {
        return this.isDual;
    }

    public void setDual(boolean dual) {
        this.isDual = dual;
    }

    public boolean isFrontWindfog() {
        return this.isFrontWindfog;
    }

    public void setFrontWindfog(boolean frontWindfog) {
        this.isFrontWindfog = frontWindfog;
    }

    public boolean isRearWindfog() {
        return this.isRearWindfog;
    }

    public void setRearWindfog(boolean rearWindfog) {
        this.isRearWindfog = rearWindfog;
    }

    public boolean isFrontWind_l() {
        return this.isFrontWind_l;
    }

    public void setFrontWind_l(boolean frontWind_l) {
        this.isFrontWind_l = frontWind_l;
    }

    public boolean isFlatWind_l() {
        return this.isFlatWind_l;
    }

    public void setFlatWind_l(boolean flatWind_l) {
        this.isFlatWind_l = flatWind_l;
    }

    public boolean isDownWind_l() {
        return this.isDownWind_l;
    }

    public void setDownWind_l(boolean downWind_l) {
        this.isDownWind_l = downWind_l;
    }

    public double getWindValue_l() {
        return this.windValue_l;
    }

    public void setWindValue_l(double windValue_l) {
        this.windValue_l = windValue_l;
    }

    public boolean isFrontWind_r() {
        return this.isFrontWind_r;
    }

    public void setFrontWind_r(boolean frontWind_r) {
        this.isFrontWind_r = frontWind_r;
    }

    public boolean isFlatWind_r() {
        return this.isFlatWind_r;
    }

    public void setFlatWind_r(boolean flatWind_r) {
        this.isFlatWind_r = flatWind_r;
    }

    public boolean isDownWind_r() {
        return this.isDownWind_r;
    }

    public void setDownWind_r(boolean downWind_r) {
        this.isDownWind_r = downWind_r;
    }

    public double getWindValue_r() {
        return this.windValue_r;
    }

    public void setWindValue_r(double windValue_r) {
        this.windValue_r = windValue_r;
    }

    public boolean isWindAuto_l() {
        return this.isWindAuto_l;
    }

    public void setWindAuto_l(boolean windAuto_l) {
        this.isWindAuto_l = windAuto_l;
    }

    public boolean isModeAuto_l() {
        return this.isModeAuto_l;
    }

    public void setModeAuto_l(boolean modeAuto_l) {
        this.isModeAuto_l = modeAuto_l;
    }

    public boolean isWindAuto_r() {
        return this.isWindAuto_r;
    }

    public void setWindAuto_r(boolean windAuto_r) {
        this.isWindAuto_r = windAuto_r;
    }

    public boolean isModeAuto_r() {
        return this.isModeAuto_r;
    }

    public void setModeAuto_r(boolean modeAuto_r) {
        this.isModeAuto_r = modeAuto_r;
    }

    public boolean isTempUnitCelsius() {
        return this.isTempUnitCelsius;
    }

    public void setTempUnitCelsius(boolean tempUnitCelsius) {
        this.isTempUnitCelsius = tempUnitCelsius;
    }

    public double getTempVale_l() {
        return this.tempVale_l;
    }

    public void setTempVale_l(double tempVale_l) {
        this.tempVale_l = tempVale_l;
    }

    public double getTempVale_r() {
        return this.tempVale_r;
    }

    public void setTempVale_r(double tempVale_r) {
        this.tempVale_r = tempVale_r;
    }

    public String toString() {
        return "CarFrontAirInfo{isAirOpen=" + this.isAirOpen + ", isACOpen=" + this.isACOpen + ", isInnerLoop=" + this.isInnerLoop + ", isDual=" + this.isDual + ", isFrontWindfog=" + this.isFrontWindfog + ", isRearWindfog=" + this.isRearWindfog + ", isFrontWind_l=" + this.isFrontWind_l + ", isFlatWind_l=" + this.isFlatWind_l + ", isDownWind_l=" + this.isDownWind_l + ", windValue_l=" + this.windValue_l + ", isFrontWind_r=" + this.isFrontWind_r + ", isFlatWind_r=" + this.isFlatWind_r + ", isDownWind_r=" + this.isDownWind_r + ", windValue_r=" + this.windValue_r + ", isWindAuto_l=" + this.isWindAuto_l + ", isModeAuto_l=" + this.isModeAuto_l + ", isWindAuto_r=" + this.isWindAuto_r + ", isModeAuto_r=" + this.isModeAuto_r + ", isTempUnitCelsius=" + this.isTempUnitCelsius + ", tempVale_l=" + this.tempVale_l + ", tempVale_r=" + this.tempVale_r + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isAirOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isACOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isInnerLoop ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDual ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFrontWindfog ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRearWindfog ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFrontWind_l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFlatWind_l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDownWind_l ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.windValue_l);
        parcel.writeByte(this.isFrontWind_r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFlatWind_r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDownWind_r ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.windValue_r);
        parcel.writeByte(this.isWindAuto_l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isModeAuto_l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isWindAuto_r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isModeAuto_r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isTempUnitCelsius ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.tempVale_l);
        parcel.writeDouble(this.tempVale_r);
    }

    public CarFrontAirInfo() {
        this.isAirOpen = false;
        this.isACOpen = false;
        this.isInnerLoop = false;
        this.isDual = false;
        this.isFrontWindfog = false;
        this.isRearWindfog = false;
        this.isFrontWind_l = false;
        this.isFlatWind_l = false;
        this.isDownWind_l = false;
        this.windValue_l = 0.0d;
        this.isFrontWind_r = false;
        this.isFlatWind_r = false;
        this.isDownWind_r = false;
        this.windValue_r = 0.0d;
        this.isWindAuto_l = false;
        this.isModeAuto_l = false;
        this.isWindAuto_r = false;
        this.isModeAuto_r = false;
        this.isTempUnitCelsius = true;
        this.tempVale_l = 0.0d;
        this.tempVale_r = 0.0d;
    }

    protected CarFrontAirInfo(Parcel in) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        this.isAirOpen = false;
        this.isACOpen = false;
        this.isInnerLoop = false;
        this.isDual = false;
        this.isFrontWindfog = false;
        this.isRearWindfog = false;
        this.isFrontWind_l = false;
        this.isFlatWind_l = false;
        this.isDownWind_l = false;
        this.windValue_l = 0.0d;
        this.isFrontWind_r = false;
        this.isFlatWind_r = false;
        this.isDownWind_r = false;
        this.windValue_r = 0.0d;
        this.isWindAuto_l = false;
        this.isModeAuto_l = false;
        this.isWindAuto_r = false;
        this.isModeAuto_r = false;
        this.isTempUnitCelsius = true;
        this.tempVale_l = 0.0d;
        this.tempVale_r = 0.0d;
        if (in.readByte() == 0) {
            z = false;
        } else {
            z = true;
        }
        this.isAirOpen = z;
        if (in.readByte() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.isACOpen = z2;
        if (in.readByte() == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.isInnerLoop = z3;
        if (in.readByte() == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.isDual = z4;
        if (in.readByte() == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.isFrontWindfog = z5;
        if (in.readByte() == 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.isRearWindfog = z6;
        if (in.readByte() == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        this.isFrontWind_l = z7;
        if (in.readByte() == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.isFlatWind_l = z8;
        if (in.readByte() == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.isDownWind_l = z9;
        this.windValue_l = in.readDouble();
        if (in.readByte() == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.isFrontWind_r = z10;
        if (in.readByte() == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.isFlatWind_r = z11;
        if (in.readByte() == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.isDownWind_r = z12;
        this.windValue_r = in.readDouble();
        if (in.readByte() == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.isWindAuto_l = z13;
        if (in.readByte() == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        this.isModeAuto_l = z14;
        if (in.readByte() == 0) {
            z15 = false;
        } else {
            z15 = true;
        }
        this.isWindAuto_r = z15;
        if (in.readByte() == 0) {
            z16 = false;
        } else {
            z16 = true;
        }
        this.isModeAuto_r = z16;
        this.isTempUnitCelsius = in.readByte() != 0;
        this.tempVale_l = in.readDouble();
        this.tempVale_r = in.readDouble();
    }
}
