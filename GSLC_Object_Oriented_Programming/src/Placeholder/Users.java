package Placeholder;
import java.util.ArrayList;
import Repository.RepositoryUser;
import Main.Connections;

public class Users extends Placeholder implements RepositoryUser{
	private String NIM;
	private String name;
	public Users(String NIM, String name, Integer teamID){
		super(teamID);
		this.NIM = NIM;
		this.name = name;
	}
	public Users() {
	}
	public void insert(String NIM, String name, String teamName, Connections connect){
		connect.writeUser(NIM, name, teamName);
	}
	public ArrayList<Users> find(String filtered, String[] filter, Boolean join, String table, Connections connect){
		if(filtered == null || filter == null || (join == null && table != null) || (join == true && table == null)){
			return null;
		}
		return connect.findUser(filtered, filter, join, table);
	}
	public Users findOne(String filtered, String[] filter, Boolean join, String table, Connections connect){
		if(filtered == null || filter == null || (join == null && table != null) || (join == true && table == null)){
			return null;
		}
		return connect.findOneUser(filtered, filter, join, table);
	}
	public ArrayList<Users> getUsers(Connections connect){
		return connect.getUsers();
	}
	public String getName(){
		return name;
	}
	public String getNIM(){
		return NIM;
	}
	public Integer getTeamID(){
		return teamID;
	}
}