package application.socket;

import application.Interfaces.UserRemoteInt;

import java.rmi.RemoteException;

public class SocketAdapter implements UserRemoteInt {
    @Override
    public boolean logOut() throws RemoteException {
        return false;
    }

    @Override
    public boolean save() throws RemoteException {
        return false;
    }

    @Override
    public void add() throws RemoteException {

    }

    @Override
    public void delete() throws RemoteException {

    }

    @Override
    public void update() throws RemoteException {

    }

    @Override
    public void funzLog() throws RemoteException {

    }
}