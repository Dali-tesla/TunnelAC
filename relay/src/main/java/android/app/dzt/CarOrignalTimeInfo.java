package android.app.dzt;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public class CarOrignalTimeInfo implements Parcelable {
    public static final Parcelable.Creator<CarOrignalTimeInfo> CREATOR = new Parcelable.Creator<CarOrignalTimeInfo>() { // from class: android.app.dzt.CarOrignalTimeInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarOrignalTimeInfo createFromParcel(Parcel source) {
            return new CarOrignalTimeInfo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarOrignalTimeInfo[] newArray(int size) {
            return new CarOrignalTimeInfo[size];
        }
    };
    private int day;
    private int hours;
    private boolean is24HourFormat;
    private int min;
    private int month;
    private int sec;
    private int years;

    public int getYears() {
        return this.years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return this.sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public boolean isIs24HourFormat() {
        return this.is24HourFormat;
    }

    public void setIs24HourFormat(boolean is24HourFormat) {
        this.is24HourFormat = is24HourFormat;
    }

    public String toString() {
        return "CarOrignalTimeInfo{years=" + this.years + ", month=" + this.month + ", day=" + this.day + ", hours=" + this.hours + ", min=" + this.min + ", sec=" + this.sec + ", is24HourFormat=" + this.is24HourFormat + '}';
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.years);
        parcel.writeInt(this.month);
        parcel.writeInt(this.day);
        parcel.writeInt(this.hours);
        parcel.writeInt(this.min);
        parcel.writeInt(this.sec);
        parcel.writeByte(this.is24HourFormat ? (byte) 1 : (byte) 0);
    }

    public CarOrignalTimeInfo() {
        this.years = 2022;
        this.month = 10;
        this.day = 10;
        this.hours = 12;
        this.min = 10;
        this.sec = 10;
        this.is24HourFormat = true;
    }

    protected CarOrignalTimeInfo(Parcel in) {
        this.years = 2022;
        this.month = 10;
        this.day = 10;
        this.hours = 12;
        this.min = 10;
        this.sec = 10;
        this.is24HourFormat = true;
        this.years = in.readInt();
        this.month = in.readInt();
        this.day = in.readInt();
        this.hours = in.readInt();
        this.min = in.readInt();
        this.sec = in.readInt();
        this.is24HourFormat = in.readByte() != 0;
    }
}
