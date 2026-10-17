package android.app.dzt;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /tmp/claude-0/w/fj/classes.dex */
public interface ICANSourceListener extends IInterface {
    void requestCarCanVersion() throws RemoteException;

    void requestCarCommand2(int i, int i2) throws RemoteException;

    void requestCarCommand3(int i, int i2, int i3) throws RemoteException;

    void requestCarCommand4(int i, int i2, int i3, int i4) throws RemoteException;

    void requestCarCommand5(int i, int i2, int i3, int i4, int i5) throws RemoteException;

    void requestCarCommand6(int i, int i2, int i3, int i4, int i5, int i6) throws RemoteException;

    void requestCarLearnKey(int i, int i2) throws RemoteException;

    void requestCarMessage(CarMessageInfo carMessageInfo) throws RemoteException;

    void requestCarMmi(int i) throws RemoteException;

    /* loaded from: /tmp/claude-0/w/fj/classes.dex */
    public static abstract class Stub extends Binder implements ICANSourceListener {
        private static final String DESCRIPTOR = "android.app.dzt.ICANSourceListener";
        static final int TRANSACTION_requestCarCanVersion = 1;
        static final int TRANSACTION_requestCarCommand2 = 3;
        static final int TRANSACTION_requestCarCommand3 = 4;
        static final int TRANSACTION_requestCarCommand4 = 5;
        static final int TRANSACTION_requestCarCommand5 = 6;
        static final int TRANSACTION_requestCarCommand6 = 7;
        static final int TRANSACTION_requestCarLearnKey = 8;
        static final int TRANSACTION_requestCarMessage = 9;
        static final int TRANSACTION_requestCarMmi = 2;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICANSourceListener asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin != null && (iin instanceof ICANSourceListener)) {
                return (ICANSourceListener) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            CarMessageInfo _arg0;
            if (code == 1598968902) {
                reply.writeString(DESCRIPTOR);
                return true;
            }
            switch (code) {
                case 1:
                    data.enforceInterface(DESCRIPTOR);
                    requestCarCanVersion();
                    return true;
                case 2:
                    data.enforceInterface(DESCRIPTOR);
                    int _arg02 = data.readInt();
                    requestCarMmi(_arg02);
                    return true;
                case 3:
                    data.enforceInterface(DESCRIPTOR);
                    int _arg03 = data.readInt();
                    int _arg1 = data.readInt();
                    requestCarCommand2(_arg03, _arg1);
                    return true;
                case 4:
                    data.enforceInterface(DESCRIPTOR);
                    int _arg04 = data.readInt();
                    int _arg12 = data.readInt();
                    int _arg2 = data.readInt();
                    requestCarCommand3(_arg04, _arg12, _arg2);
                    return true;
                case 5:
                    data.enforceInterface(DESCRIPTOR);
                    int _arg05 = data.readInt();
                    int _arg13 = data.readInt();
                    int _arg22 = data.readInt();
                    int _arg3 = data.readInt();
                    requestCarCommand4(_arg05, _arg13, _arg22, _arg3);
                    return true;
                case 6:
                    data.enforceInterface(DESCRIPTOR);
                    int _arg06 = data.readInt();
                    int _arg14 = data.readInt();
                    int _arg23 = data.readInt();
                    int _arg32 = data.readInt();
                    int _arg4 = data.readInt();
                    requestCarCommand5(_arg06, _arg14, _arg23, _arg32, _arg4);
                    return true;
                case 7:
                    data.enforceInterface(DESCRIPTOR);
                    int _arg07 = data.readInt();
                    int _arg15 = data.readInt();
                    int _arg24 = data.readInt();
                    int _arg33 = data.readInt();
                    int _arg42 = data.readInt();
                    int _arg5 = data.readInt();
                    requestCarCommand6(_arg07, _arg15, _arg24, _arg33, _arg42, _arg5);
                    return true;
                case 8:
                    data.enforceInterface(DESCRIPTOR);
                    int _arg08 = data.readInt();
                    int _arg16 = data.readInt();
                    requestCarLearnKey(_arg08, _arg16);
                    return true;
                case 9:
                    data.enforceInterface(DESCRIPTOR);
                    if (data.readInt() != 0) {
                        _arg0 = CarMessageInfo.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    requestCarMessage(_arg0);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        /* loaded from: /tmp/claude-0/w/fj/classes.dex */
        private static class Proxy implements ICANSourceListener {
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

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarCanVersion() throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarMmi(int req) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req);
                    this.mRemote.transact(2, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarCommand2(int req0, int req1) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    this.mRemote.transact(3, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarCommand3(int req0, int req1, int req2) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    _data.writeInt(req2);
                    this.mRemote.transact(4, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarCommand4(int req0, int req1, int req2, int req3) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    _data.writeInt(req2);
                    _data.writeInt(req3);
                    this.mRemote.transact(5, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarCommand5(int req0, int req1, int req2, int req3, int req4) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    _data.writeInt(req2);
                    _data.writeInt(req3);
                    _data.writeInt(req4);
                    this.mRemote.transact(6, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarCommand6(int req0, int req1, int req2, int req3, int req4, int req5) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(req0);
                    _data.writeInt(req1);
                    _data.writeInt(req2);
                    _data.writeInt(req3);
                    _data.writeInt(req4);
                    _data.writeInt(req5);
                    this.mRemote.transact(7, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarLearnKey(int cmd, int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(cmd);
                    _data.writeInt(key);
                    this.mRemote.transact(8, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // android.app.dzt.ICANSourceListener
            public void requestCarMessage(CarMessageInfo info) throws RemoteException {
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
        }
    }
}
