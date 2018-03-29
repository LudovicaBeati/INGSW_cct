package application.socket;

import application.Interfaces.UserRemote;
import application.contr.Database;
import com.mysql.jdbc.Connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServerSocketImpl extends UnicastRemoteObject {

    private static final String usrname = "root";

    private static final String pw = "Monali2009!"; //123456


    private static final String url = "jdbc:mysql://localhost:3306/Login";    //"jdbc:mysql://127.0.0.1:3306/Login";

    private static final String db = "com.mysql.jdbc.Driver";


    public ServerSocketImpl() throws RemoteException {
        super();
    }

    public ResultSet controllLogin(){
       //nputStream in = getInputStream();
        PreparedStatement st;
        ResultSet result = null;
        String queryLog = "SELECT * FROM sys.login WHERE Username = ? AND Password = ? ";
        try{
            Database receivedCon = new Database();
            Connection connectionOK = receivedCon.databaseCon();
            if(connectionOK != null)
                System.out.println("Connection successful");
            else
                System.out.println("Connection failed");


            st = connectionOK.prepareStatement(queryLog);
            //st.setString(1, String.valueOf(s.getInputStream().read()));
            //st.setString(2, String.valueOf(s.getInputStream().read()));

            result = st.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;

    }
}