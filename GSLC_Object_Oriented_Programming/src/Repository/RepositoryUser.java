package Repository;
import java.util.ArrayList;
import Main.Connections;
import Placeholder.Users;

public interface RepositoryUser{
	void insert(String NIM, String name, String teamName, Connections connect);
	
	ArrayList<Users> find(String filtered, String[] filter, Boolean join, String table, Connections connect);
	
	Users findOne(String filtered, String[] filter, Boolean join, String table, Connections connect);
	
	ArrayList<Users> getUsers(Connections connect);
}
