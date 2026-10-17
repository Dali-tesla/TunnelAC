package android.app.dzt;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public interface ICANSinkListener extends IInterface {
    void notifyCarAdditionInfo(CarAdditionInfo carAdditionInfo) throws RemoteException;

    void notifyCarBaseInfo(CarBaseInfo carBaseInfo) throws RemoteException;

    void notifyCarCanVersion(String str) throws RemoteException;

    void notifyCarDoorInfo(CarDoorInfo carDoorInfo) throws RemoteException;

    void notifyCarDriverKeyInfo(int i, int i2) throws RemoteException;

    void notifyCarDynamicInfo(CarDynamicInfo carDynamicInfo) throws RemoteException;

    void notifyCarEpsInfo(CarEpsInfo carEpsInfo) throws RemoteException;

    void notifyCarFrontAirInfo(CarFrontAirInfo carFrontAirInfo) throws RemoteException;

    void notifyCarFrontSeatInfo(CarFrontSeatInfo carFrontSeatInfo) throws RemoteException;

    void notifyCarLearnKeyInfo(CarLearnKeyInfo carLearnKeyInfo) throws RemoteException;

    void notifyCarMessageInfo(CarMessageInfo carMessageInfo) throws RemoteException;

    void notifyCarOrignalTimeInfo(CarOrignalTimeInfo carOrignalTimeInfo) throws RemoteException;

    void notifyCarRadarInfo(CarRadarInfo carRadarInfo) throws RemoteException;

    void notifyCarRearAirInfo(CarRearAirInfo carRearAirInfo) throws RemoteException;

    void notifyCarRearSeatInfo(CarRearSeatInfo carRearSeatInfo) throws RemoteException;

    void notifyCarTpmsInfo(CarTpmsInfo carTpmsInfo) throws RemoteException;

    /* loaded from: /tmp/claude-0/w/fj/classes.dex */
    public static abstract class Stub extends Binder implements ICANSinkListener {
        private static final String DESCRIPTOR = "android.app.dzt.ICANSinkListener";
        static final int TRANSACTION_notifyCarAdditionInfo = 9;
        static final int TRANSACTION_notifyCarBaseInfo = 10;
        static final int TRANSACTION_notifyCarCanVersion = 16;
        static final int TRANSACTION_notifyCarDoorInfo = 8;
        static final int TRANSACTION_notifyCarDriverKeyInfo = 1;
        static final int TRANSACTION_notifyCarDynamicInfo = 11;
        static final int TRANSACTION_notifyCarEpsInfo = 7;
        static final int TRANSACTION_notifyCarFrontAirInfo = 2;
        static final int TRANSACTION_notifyCarFrontSeatInfo = 4;
        static final int TRANSACTION_notifyCarLearnKeyInfo = 14;
        static final int TRANSACTION_notifyCarMessageInfo = 15;
        static final int TRANSACTION_notifyCarOrignalTimeInfo = 12;
        static final int TRANSACTION_notifyCarRadarInfo = 6;
        static final int TRANSACTION_notifyCarRearAirInfo = 3;
        static final int TRANSACTION_notifyCarRearSeatInfo = 5;
        static final int TRANSACTION_notifyCarTpmsInfo = 13;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICANSinkListener asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin != null && (iin instanceof ICANSinkListener)) {
                return (ICANSinkListener) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarDriverKeyInfo(parcel.readInt(), parcel.readInt());
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarFrontAirInfo(parcel.readInt() != 0 ? CarFrontAirInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarRearAirInfo(parcel.readInt() != 0 ? CarRearAirInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarFrontSeatInfo(parcel.readInt() != 0 ? CarFrontSeatInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarRearSeatInfo(parcel.readInt() != 0 ? CarRearSeatInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarRadarInfo(parcel.readInt() != 0 ? CarRadarInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarEpsInfo(parcel.readInt() != 0 ? CarEpsInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarDoorInfo(parcel.readInt() != 0 ? CarDoorInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarAdditionInfo(parcel.readInt() != 0 ? CarAdditionInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarBaseInfo(parcel.readInt() != 0 ? CarBaseInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarDynamicInfo(parcel.readInt() != 0 ? CarDynamicInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarOrignalTimeInfo(parcel.readInt() != 0 ? CarOrignalTimeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarTpmsInfo(parcel.readInt() != 0 ? CarTpmsInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarLearnKeyInfo(parcel.readInt() != 0 ? CarLearnKeyInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarMessageInfo(parcel.readInt() != 0 ? CarMessageInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyCarCanVersion(parcel.readString());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: /tmp/claude-0/w/fj/classes.dex */
        private static class Proxy implements ICANSinkListener {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarDriverKeyInfo(int key, int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    _data.writeInt(value);
                    this.mRemote.transact(1, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarFrontAirInfo(CarFrontAirInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(2, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarRearAirInfo(CarRearAirInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(3, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarFrontSeatInfo(CarFrontSeatInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(4, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarRearSeatInfo(CarRearSeatInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(5, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarRadarInfo(CarRadarInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(6, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarEpsInfo(CarEpsInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(7, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarDoorInfo(CarDoorInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(8, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarAdditionInfo(CarAdditionInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(9, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarBaseInfo(CarBaseInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(10, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarDynamicInfo(CarDynamicInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(11, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarOrignalTimeInfo(CarOrignalTimeInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(12, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarTpmsInfo(CarTpmsInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(13, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarLearnKeyInfo(CarLearnKeyInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(14, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarMessageInfo(CarMessageInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(15, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSinkListener
            public void notifyCarCanVersion(String version) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(version);
                    this.mRemote.transact(16, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }
        }
    }
}
