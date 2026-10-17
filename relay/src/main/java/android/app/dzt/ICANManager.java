package android.app.dzt;

import android.app.dzt.ICANSinkListener;
import android.app.dzt.ICANSourceListener;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public interface ICANManager extends IInterface {
    CarAdditionInfo getCarAdditionInfo() throws RemoteException;

    CarBaseInfo getCarBaseInfo() throws RemoteException;

    String getCarCanVersion() throws RemoteException;

    CarDoorInfo getCarDoorInfo() throws RemoteException;

    CarDynamicInfo getCarDynamicInfo() throws RemoteException;

    CarEpsInfo getCarEpsInfo() throws RemoteException;

    CarFrontAirInfo getCarFrontAirInfo() throws RemoteException;

    CarFrontSeatInfo getCarFrontSeatInfo() throws RemoteException;

    CarLearnKeyInfo getCarLearnKeyInfo() throws RemoteException;

    CarOrignalTimeInfo getCarOrignalTimeInfo() throws RemoteException;

    CarRadarInfo getCarRadarInfo() throws RemoteException;

    CarRearAirInfo getCarRearAirInfo() throws RemoteException;

    CarRearSeatInfo getCarRearSeatInfo() throws RemoteException;

    CarTpmsInfo getCarTpmsInfo() throws RemoteException;

    void registerSinkListener(ICANSinkListener iCANSinkListener) throws RemoteException;

    void registerSourceListener(ICANSourceListener iCANSourceListener) throws RemoteException;

    void requestCarCanVersion() throws RemoteException;

    void requestCarCommand2(int i, int i2) throws RemoteException;

    void requestCarCommand3(int i, int i2, int i3) throws RemoteException;

    void requestCarCommand4(int i, int i2, int i3, int i4) throws RemoteException;

    void requestCarCommand5(int i, int i2, int i3, int i4, int i5) throws RemoteException;

    void requestCarCommand6(int i, int i2, int i3, int i4, int i5, int i6) throws RemoteException;

    void requestCarLearnKey(int i, int i2) throws RemoteException;

    void requestCarMessage(CarMessageInfo carMessageInfo) throws RemoteException;

    void requestCarMmi(int i) throws RemoteException;

    void setCarAdditionInfo(CarAdditionInfo carAdditionInfo) throws RemoteException;

    void setCarBaseInfo(CarBaseInfo carBaseInfo) throws RemoteException;

    void setCarCanVersion(String str) throws RemoteException;

    void setCarDoorInfo(CarDoorInfo carDoorInfo) throws RemoteException;

    void setCarDriverKeyInfo(int i, int i2) throws RemoteException;

    void setCarDynamicInfo(CarDynamicInfo carDynamicInfo) throws RemoteException;

    void setCarEpsInfo(CarEpsInfo carEpsInfo) throws RemoteException;

    void setCarFrontAirInfo(CarFrontAirInfo carFrontAirInfo) throws RemoteException;

    void setCarFrontSeatInfo(CarFrontSeatInfo carFrontSeatInfo) throws RemoteException;

    void setCarLearnKeyInfo(CarLearnKeyInfo carLearnKeyInfo) throws RemoteException;

    void setCarMessageInfo(CarMessageInfo carMessageInfo) throws RemoteException;

    void setCarOrignalTimeInfo(CarOrignalTimeInfo carOrignalTimeInfo) throws RemoteException;

    void setCarRadarInfo(CarRadarInfo carRadarInfo) throws RemoteException;

    void setCarRearAirInfo(CarRearAirInfo carRearAirInfo) throws RemoteException;

    void setCarRearSeatInfo(CarRearSeatInfo carRearSeatInfo) throws RemoteException;

    void setCarTpmsInfo(CarTpmsInfo carTpmsInfo) throws RemoteException;

    void unregisterSinkListener(ICANSinkListener iCANSinkListener) throws RemoteException;

    void unregisterSourceListener(ICANSourceListener iCANSourceListener) throws RemoteException;

    /* loaded from: /tmp/claude-0/w/fj/classes.dex */
    public static abstract class Stub extends Binder implements ICANManager {
        private static final String DESCRIPTOR = "android.app.dzt.ICANManager";
        static final int TRANSACTION_getCarAdditionInfo = 20;
        static final int TRANSACTION_getCarBaseInfo = 22;
        static final int TRANSACTION_getCarCanVersion = 33;
        static final int TRANSACTION_getCarDoorInfo = 18;
        static final int TRANSACTION_getCarDynamicInfo = 24;
        static final int TRANSACTION_getCarEpsInfo = 16;
        static final int TRANSACTION_getCarFrontAirInfo = 6;
        static final int TRANSACTION_getCarFrontSeatInfo = 10;
        static final int TRANSACTION_getCarLearnKeyInfo = 30;
        static final int TRANSACTION_getCarOrignalTimeInfo = 26;
        static final int TRANSACTION_getCarRadarInfo = 14;
        static final int TRANSACTION_getCarRearAirInfo = 8;
        static final int TRANSACTION_getCarRearSeatInfo = 12;
        static final int TRANSACTION_getCarTpmsInfo = 28;
        static final int TRANSACTION_registerSinkListener = 1;
        static final int TRANSACTION_registerSourceListener = 3;
        static final int TRANSACTION_requestCarCanVersion = 35;
        static final int TRANSACTION_requestCarCommand2 = 37;
        static final int TRANSACTION_requestCarCommand3 = 38;
        static final int TRANSACTION_requestCarCommand4 = 39;
        static final int TRANSACTION_requestCarCommand5 = 40;
        static final int TRANSACTION_requestCarCommand6 = 41;
        static final int TRANSACTION_requestCarLearnKey = 42;
        static final int TRANSACTION_requestCarMessage = 43;
        static final int TRANSACTION_requestCarMmi = 36;
        static final int TRANSACTION_setCarAdditionInfo = 21;
        static final int TRANSACTION_setCarBaseInfo = 23;
        static final int TRANSACTION_setCarCanVersion = 34;
        static final int TRANSACTION_setCarDoorInfo = 19;
        static final int TRANSACTION_setCarDriverKeyInfo = 5;
        static final int TRANSACTION_setCarDynamicInfo = 25;
        static final int TRANSACTION_setCarEpsInfo = 17;
        static final int TRANSACTION_setCarFrontAirInfo = 7;
        static final int TRANSACTION_setCarFrontSeatInfo = 11;
        static final int TRANSACTION_setCarLearnKeyInfo = 31;
        static final int TRANSACTION_setCarMessageInfo = 32;
        static final int TRANSACTION_setCarOrignalTimeInfo = 27;
        static final int TRANSACTION_setCarRadarInfo = 15;
        static final int TRANSACTION_setCarRearAirInfo = 9;
        static final int TRANSACTION_setCarRearSeatInfo = 13;
        static final int TRANSACTION_setCarTpmsInfo = 29;
        static final int TRANSACTION_unregisterSinkListener = 2;
        static final int TRANSACTION_unregisterSourceListener = 4;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICANManager asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin != null && (iin instanceof ICANManager)) {
                return (ICANManager) iin;
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
                    registerSinkListener(ICANSinkListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterSinkListener(ICANSinkListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerSourceListener(ICANSourceListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterSourceListener(ICANSourceListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarDriverKeyInfo(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarFrontAirInfo carFrontAirInfo = getCarFrontAirInfo();
                    parcel2.writeNoException();
                    if (carFrontAirInfo != null) {
                        parcel2.writeInt(1);
                        carFrontAirInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarFrontAirInfo(parcel.readInt() != 0 ? CarFrontAirInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarRearAirInfo carRearAirInfo = getCarRearAirInfo();
                    parcel2.writeNoException();
                    if (carRearAirInfo != null) {
                        parcel2.writeInt(1);
                        carRearAirInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarRearAirInfo(parcel.readInt() != 0 ? CarRearAirInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarFrontSeatInfo carFrontSeatInfo = getCarFrontSeatInfo();
                    parcel2.writeNoException();
                    if (carFrontSeatInfo != null) {
                        parcel2.writeInt(1);
                        carFrontSeatInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarFrontSeatInfo(parcel.readInt() != 0 ? CarFrontSeatInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarRearSeatInfo carRearSeatInfo = getCarRearSeatInfo();
                    parcel2.writeNoException();
                    if (carRearSeatInfo != null) {
                        parcel2.writeInt(1);
                        carRearSeatInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarRearSeatInfo(parcel.readInt() != 0 ? CarRearSeatInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarRadarInfo carRadarInfo = getCarRadarInfo();
                    parcel2.writeNoException();
                    if (carRadarInfo != null) {
                        parcel2.writeInt(1);
                        carRadarInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarRadarInfo(parcel.readInt() != 0 ? CarRadarInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarEpsInfo carEpsInfo = getCarEpsInfo();
                    parcel2.writeNoException();
                    if (carEpsInfo != null) {
                        parcel2.writeInt(1);
                        carEpsInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarEpsInfo(parcel.readInt() != 0 ? CarEpsInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarDoorInfo carDoorInfo = getCarDoorInfo();
                    parcel2.writeNoException();
                    if (carDoorInfo != null) {
                        parcel2.writeInt(1);
                        carDoorInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarDoorInfo(parcel.readInt() != 0 ? CarDoorInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarAdditionInfo carAdditionInfo = getCarAdditionInfo();
                    parcel2.writeNoException();
                    if (carAdditionInfo != null) {
                        parcel2.writeInt(1);
                        carAdditionInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarAdditionInfo(parcel.readInt() != 0 ? CarAdditionInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarBaseInfo carBaseInfo = getCarBaseInfo();
                    parcel2.writeNoException();
                    if (carBaseInfo != null) {
                        parcel2.writeInt(1);
                        carBaseInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarBaseInfo(parcel.readInt() != 0 ? CarBaseInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarDynamicInfo carDynamicInfo = getCarDynamicInfo();
                    parcel2.writeNoException();
                    if (carDynamicInfo != null) {
                        parcel2.writeInt(1);
                        carDynamicInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarDynamicInfo(parcel.readInt() != 0 ? CarDynamicInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarOrignalTimeInfo carOrignalTimeInfo = getCarOrignalTimeInfo();
                    parcel2.writeNoException();
                    if (carOrignalTimeInfo != null) {
                        parcel2.writeInt(1);
                        carOrignalTimeInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarOrignalTimeInfo(parcel.readInt() != 0 ? CarOrignalTimeInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarTpmsInfo carTpmsInfo = getCarTpmsInfo();
                    parcel2.writeNoException();
                    if (carTpmsInfo != null) {
                        parcel2.writeInt(1);
                        carTpmsInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarTpmsInfo(parcel.readInt() != 0 ? CarTpmsInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    CarLearnKeyInfo carLearnKeyInfo = getCarLearnKeyInfo();
                    parcel2.writeNoException();
                    if (carLearnKeyInfo != null) {
                        parcel2.writeInt(1);
                        carLearnKeyInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarLearnKeyInfo(parcel.readInt() != 0 ? CarLearnKeyInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarMessageInfo(parcel.readInt() != 0 ? CarMessageInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    String carCanVersion = getCarCanVersion();
                    parcel2.writeNoException();
                    parcel2.writeString(carCanVersion);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCarCanVersion(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarCanVersion();
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarMmi(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarCommand2(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarCommand3(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarCommand4(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarCommand5(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarCommand6(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarLearnKey(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestCarMessage(parcel.readInt() != 0 ? CarMessageInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: /tmp/claude-0/w/fj/classes.dex */
        private static class Proxy implements ICANManager {
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

            @Override // android.app.dzt.ICANManager
            public void registerSinkListener(ICANSinkListener listener) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.mRemote.transact(1, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void unregisterSinkListener(ICANSinkListener listener) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.mRemote.transact(2, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void registerSourceListener(ICANSourceListener listener) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.mRemote.transact(3, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void unregisterSourceListener(ICANSourceListener listener) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeStrongBinder(listener != null ? listener.asBinder() : null);
                    this.mRemote.transact(4, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarDriverKeyInfo(int key, int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    _data.writeInt(value);
                    this.mRemote.transact(5, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarFrontAirInfo getCarFrontAirInfo() throws RemoteException {
                CarFrontAirInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(6, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarFrontAirInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarFrontAirInfo(CarFrontAirInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(7, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarRearAirInfo getCarRearAirInfo() throws RemoteException {
                CarRearAirInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(8, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarRearAirInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarRearAirInfo(CarRearAirInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(9, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarFrontSeatInfo getCarFrontSeatInfo() throws RemoteException {
                CarFrontSeatInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(10, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarFrontSeatInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarFrontSeatInfo(CarFrontSeatInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(11, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarRearSeatInfo getCarRearSeatInfo() throws RemoteException {
                CarRearSeatInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(12, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarRearSeatInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarRearSeatInfo(CarRearSeatInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(13, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarRadarInfo getCarRadarInfo() throws RemoteException {
                CarRadarInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(14, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarRadarInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarRadarInfo(CarRadarInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(15, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarEpsInfo getCarEpsInfo() throws RemoteException {
                CarEpsInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(16, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarEpsInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarEpsInfo(CarEpsInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(17, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarDoorInfo getCarDoorInfo() throws RemoteException {
                CarDoorInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(18, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarDoorInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarDoorInfo(CarDoorInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(19, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarAdditionInfo getCarAdditionInfo() throws RemoteException {
                CarAdditionInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(20, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarAdditionInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarAdditionInfo(CarAdditionInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(21, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarBaseInfo getCarBaseInfo() throws RemoteException {
                CarBaseInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(22, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarBaseInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarBaseInfo(CarBaseInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(23, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarDynamicInfo getCarDynamicInfo() throws RemoteException {
                CarDynamicInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(24, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarDynamicInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarDynamicInfo(CarDynamicInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(25, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarOrignalTimeInfo getCarOrignalTimeInfo() throws RemoteException {
                CarOrignalTimeInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(26, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarOrignalTimeInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarOrignalTimeInfo(CarOrignalTimeInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(27, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarTpmsInfo getCarTpmsInfo() throws RemoteException {
                CarTpmsInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(28, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarTpmsInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarTpmsInfo(CarTpmsInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(29, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public CarLearnKeyInfo getCarLearnKeyInfo() throws RemoteException {
                CarLearnKeyInfo _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(30, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = CarLearnKeyInfo.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarLearnKeyInfo(CarLearnKeyInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(31, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarMessageInfo(CarMessageInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(32, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public String getCarCanVersion() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(33, _data, _reply, 0);
                    _reply.readException();
                    String _result = _reply.readString();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void setCarCanVersion(String version) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(version);
                    this.mRemote.transact(34, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarCanVersion() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(35, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarMmi(int req) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req);
                    this.mRemote.transact(36, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarCommand2(int req0, int req1) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    this.mRemote.transact(37, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarCommand3(int req0, int req1, int req2) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    _data.writeInt(req2);
                    this.mRemote.transact(38, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarCommand4(int req0, int req1, int req2, int req3) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    _data.writeInt(req2);
                    _data.writeInt(req3);
                    this.mRemote.transact(39, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarCommand5(int req0, int req1, int req2, int req3, int req4) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    _data.writeInt(req2);
                    _data.writeInt(req3);
                    _data.writeInt(req4);
                    this.mRemote.transact(40, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarCommand6(int req0, int req1, int req2, int req3, int req4, int req5) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    _data.writeInt(req2);
                    _data.writeInt(req3);
                    _data.writeInt(req4);
                    _data.writeInt(req5);
                    this.mRemote.transact(41, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarLearnKey(int cmd, int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(cmd);
                    _data.writeInt(key);
                    this.mRemote.transact(42, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANManager
            public void requestCarMessage(CarMessageInfo info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (info != null) {
                        _data.writeInt(1);
                        info.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    this.mRemote.transact(43, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }
    }
}
