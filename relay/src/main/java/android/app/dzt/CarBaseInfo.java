package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarBaseInfo implements Parcelable {
    public static final Parcelable.Creator<CarBaseInfo> CREATOR = new Parcelable.Creator<CarBaseInfo>() { // from class: android.app.dzt.CarBaseInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarBaseInfo createFromParcel(Parcel source) {
            return new CarBaseInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarBaseInfo[] newArray(int size) {
            return new CarBaseInfo[size];
        }
    };
    private int backlightBrightness;
    private boolean isAccOpen;
    private boolean isCoDriverSafetyBelt;
    private boolean isDriverSafetyBelt;
    private boolean isFarLightOpen;
    private boolean isFrontFogLightOpen;
    private boolean isGear_D;
    private boolean isGear_N;
    private boolean isGear_P;
    private boolean isHandbrake;
    private boolean isLeftTurnLightOpen;
    private boolean isLightOpen;
    private boolean isNearLightOpen;
    private boolean isRearFogLightOpen;
    private boolean isReverseR;
    private boolean isRightTurnLightOpen;
    private boolean isTempUnitCelsius;
    private double outDoorTemp;
    private int rangeMileage;
    private int totalMileage;

    public boolean isAccOpen() {
        return this.isAccOpen;
    }

    public void setAccOpen(boolean accOpen) {
        this.isAccOpen = accOpen;
    }

    public boolean isReverseR() {
        return this.isReverseR;
    }

    public void setReverseR(boolean reverseR) {
        this.isReverseR = reverseR;
    }

    public boolean isHandbrake() {
        return this.isHandbrake;
    }

    public void setHandbrake(boolean handbrake) {
        this.isHandbrake = handbrake;
    }

    public boolean isDriverSafetyBelt() {
        return this.isDriverSafetyBelt;
    }

    public void setDriverSafetyBelt(boolean driverSafetyBelt) {
        this.isDriverSafetyBelt = driverSafetyBelt;
    }

    public boolean isCoDriverSafetyBelt() {
        return this.isCoDriverSafetyBelt;
    }

    public void setCoDriverSafetyBelt(boolean coDriverSafetyBelt) {
        this.isCoDriverSafetyBelt = coDriverSafetyBelt;
    }

    public boolean isGear_D() {
        return this.isGear_D;
    }

    public void setGear_D(boolean gear_D) {
        this.isGear_D = gear_D;
    }

    public boolean isGear_N() {
        return this.isGear_N;
    }

    public void setGear_N(boolean gear_N) {
        this.isGear_N = gear_N;
    }

    public boolean isGear_P() {
        return this.isGear_P;
    }

    public void setGear_P(boolean gear_P) {
        this.isGear_P = gear_P;
    }

    public boolean isFarLightOpen() {
        return this.isFarLightOpen;
    }

    public void setFarLightOpen(boolean farLightOpen) {
        this.isFarLightOpen = farLightOpen;
    }

    public boolean isNearLightOpen() {
        return this.isNearLightOpen;
    }

    public void setNearLightOpen(boolean nearLightOpen) {
        this.isNearLightOpen = nearLightOpen;
    }

    public boolean isFrontFogLightOpen() {
        return this.isFrontFogLightOpen;
    }

    public void setFrontFogLightOpen(boolean frontFogLightOpen) {
        this.isFrontFogLightOpen = frontFogLightOpen;
    }

    public boolean isRearFogLightOpen() {
        return this.isRearFogLightOpen;
    }

    public void setRearFogLightOpen(boolean rearFogLightOpen) {
        this.isRearFogLightOpen = rearFogLightOpen;
    }

    public boolean isLeftTurnLightOpen() {
        return this.isLeftTurnLightOpen;
    }

    public void setLeftTurnLightOpen(boolean leftTurnLightOpen) {
        this.isLeftTurnLightOpen = leftTurnLightOpen;
    }

    public boolean isRightTurnLightOpen() {
        return this.isRightTurnLightOpen;
    }

    public void setRightTurnLightOpen(boolean rightTurnLightOpen) {
        this.isRightTurnLightOpen = rightTurnLightOpen;
    }

    public boolean isLightOpen() {
        return this.isLightOpen;
    }

    public void setLightOpen(boolean lightOpen) {
        this.isLightOpen = lightOpen;
    }

    public int getBacklightBrightness() {
        return this.backlightBrightness;
    }

    public void setBacklightBrightness(int backlightBrightness) {
        this.backlightBrightness = backlightBrightness;
    }

    public boolean isTempUnitCelsius() {
        return this.isTempUnitCelsius;
    }

    public void setTempUnitCelsius(boolean tempUnitCelsius) {
        this.isTempUnitCelsius = tempUnitCelsius;
    }

    public double getOutDoorTemp() {
        return this.outDoorTemp;
    }

    public void setOutDoorTemp(double outDoorTemp) {
        this.outDoorTemp = outDoorTemp;
    }

    public int getRangeMileage() {
        return this.rangeMileage;
    }

    public void setRangeMileage(int rangeMileage) {
        this.rangeMileage = rangeMileage;
    }

    public int getTotalMileage() {
        return this.totalMileage;
    }

    public void setTotalMileage(int totalMileage) {
        this.totalMileage = totalMileage;
    }

    public String toString() {
        return "CarBaseInfo{isAccOpen=" + this.isAccOpen + ", isReverseR=" + this.isReverseR + ", isHandbrake=" + this.isHandbrake + ", isDriverSafetyBelt=" + this.isDriverSafetyBelt + ", isCoDriverSafetyBelt=" + this.isCoDriverSafetyBelt + ", isGear_D=" + this.isGear_D + ", isGear_N=" + this.isGear_N + ", isGear_P=" + this.isGear_P + ", isFarLightOpen=" + this.isFarLightOpen + ", isNearLightOpen=" + this.isNearLightOpen + ", isFrontFogLightOpen=" + this.isFrontFogLightOpen + ", isRearFogLightOpen=" + this.isRearFogLightOpen + ", isLeftTurnLightOpen=" + this.isLeftTurnLightOpen + ", isRightTurnLightOpen=" + this.isRightTurnLightOpen + ", isLightOpen=" + this.isLightOpen + ", backlightBrightness=" + this.backlightBrightness + ", isTempUnitCelsius=" + this.isTempUnitCelsius + ", outDoorTemp=" + this.outDoorTemp + ", rangeMileage=" + this.rangeMileage + ", totalMileage=" + this.totalMileage + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isAccOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isReverseR ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isHandbrake ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDriverSafetyBelt ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCoDriverSafetyBelt ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isGear_D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isGear_N ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isGear_P ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFarLightOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isNearLightOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFrontFogLightOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRearFogLightOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLeftTurnLightOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRightTurnLightOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLightOpen ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.backlightBrightness);
        parcel.writeByte(this.isTempUnitCelsius ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.outDoorTemp);
        parcel.writeInt(this.rangeMileage);
        parcel.writeInt(this.totalMileage);
    }

    public CarBaseInfo() {
        this.isAccOpen = false;
        this.isReverseR = false;
        this.isHandbrake = false;
        this.isDriverSafetyBelt = false;
        this.isCoDriverSafetyBelt = false;
        this.isGear_D = false;
        this.isGear_N = false;
        this.isGear_P = false;
        this.isFarLightOpen = false;
        this.isNearLightOpen = false;
        this.isFrontFogLightOpen = false;
        this.isRearFogLightOpen = false;
        this.isLeftTurnLightOpen = false;
        this.isRightTurnLightOpen = false;
        this.isLightOpen = false;
        this.backlightBrightness = 0;
        this.isTempUnitCelsius = true;
        this.outDoorTemp = 0.0d;
        this.rangeMileage = 0;
        this.totalMileage = 0;
    }

    protected CarBaseInfo(Parcel in) {
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
        this.isAccOpen = false;
        this.isReverseR = false;
        this.isHandbrake = false;
        this.isDriverSafetyBelt = false;
        this.isCoDriverSafetyBelt = false;
        this.isGear_D = false;
        this.isGear_N = false;
        this.isGear_P = false;
        this.isFarLightOpen = false;
        this.isNearLightOpen = false;
        this.isFrontFogLightOpen = false;
        this.isRearFogLightOpen = false;
        this.isLeftTurnLightOpen = false;
        this.isRightTurnLightOpen = false;
        this.isLightOpen = false;
        this.backlightBrightness = 0;
        this.isTempUnitCelsius = true;
        this.outDoorTemp = 0.0d;
        this.rangeMileage = 0;
        this.totalMileage = 0;
        if (in.readByte() == 0) {
            z = false;
        } else {
            z = true;
        }
        this.isAccOpen = z;
        if (in.readByte() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.isReverseR = z2;
        if (in.readByte() == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.isHandbrake = z3;
        if (in.readByte() == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.isDriverSafetyBelt = z4;
        if (in.readByte() == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.isCoDriverSafetyBelt = z5;
        if (in.readByte() == 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.isGear_D = z6;
        if (in.readByte() == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        this.isGear_N = z7;
        if (in.readByte() == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.isGear_P = z8;
        if (in.readByte() == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.isFarLightOpen = z9;
        if (in.readByte() == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.isNearLightOpen = z10;
        if (in.readByte() == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.isFrontFogLightOpen = z11;
        if (in.readByte() == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.isRearFogLightOpen = z12;
        if (in.readByte() == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.isLeftTurnLightOpen = z13;
        if (in.readByte() == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        this.isRightTurnLightOpen = z14;
        if (in.readByte() == 0) {
            z15 = false;
        } else {
            z15 = true;
        }
        this.isLightOpen = z15;
        this.backlightBrightness = in.readInt();
        this.isTempUnitCelsius = in.readByte() != 0;
        this.outDoorTemp = in.readDouble();
        this.rangeMileage = in.readInt();
        this.totalMileage = in.readInt();
    }
}
