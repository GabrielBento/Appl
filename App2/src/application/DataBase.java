package application;

import java.sql.*;
	
	public class DataBase
	{
		static boolean conf_log;
		static boolean conf_sen;
		static boolean conf_newuser;
		static boolean conf_newsenha;
		static Connection Conec = null;
	    static  Statement sttm = null;
	  public static void cadastro()
	  {
		cadastro cadas = new cadastro(); 
	    try {
	      Class.forName("org.sqlite.JDBC");
	      Conec = DriverManager.getConnection("jdbc:sqlite:test.db");
	      System.out.println("Opened database successfully");
	      sttm = Conec.createStatement();
	      Conec.setAutoCommit(false);
			sttm = Conec.createStatement();
			ResultSet lastPosition = sttm.executeQuery("select max(ID) as local from CODEC");
			int Position = lastPosition.getInt("local");
			int newPosition = Position + 1;
			ResultSet results = sttm.executeQuery( "SELECT * FROM CODEC;");
			if(cadas.getConfir() == true){
				String stq = "INSERT INTO CODEC(ID,NAME,EMAIL,SENHA) " 
	     				+ "VALUES("+newPosition+", '"+ cadas.getNome() +"' ,'"+ cadas.getEmail() +"','"+cadas.getSenha()+"') ;";
					sttm.executeUpdate(stq);
			}
			Conec.commit();
		    results.close();
		    sttm.close();
			Conec.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	  }
	  
	  public static void login() {
		  try{
			  inicio login = new inicio();
			  Class.forName("org.sqlite.JDBC");
			  Conec = DriverManager.getConnection("jdbc:sqlite:test.db");
			  sttm = Conec.createStatement();
			  Conec.setAutoCommit(false);
			  ResultSet results = sttm.executeQuery("SELECT * FROM CODEC; ");
			  conf_log = false;
			  conf_sen = false;
			  while(results.next()){
				  String Nome = results.getString("email");
				  String Senha = results.getString("SENHA");
				  String conf_nome = login.getEmail();
				  String conf_senha = login.getSenha();
				  if(conf_nome.equals(Nome)  ){
					 conf_log = true;
				  }
				  if(conf_senha.equals(Senha))
				  {
					  conf_sen = true;
				  }
			  }
			  	Conec.commit();
			    results.close();
			    sttm.close();
				Conec.close();
		  } catch (Exception e){
			  System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		  }
	  }
	  public static boolean getConf(){
		  login();
		  return conf_log;
	  }
	  public static boolean getSen()
	  {
		  login();
		  return conf_sen;
	  }
	  public static void config(){
		  try{
			  Configura config = new Configura();
			  Class.forName("org.sqlite.JDBC");
			  Conec = DriverManager.getConnection("jdbc:sqlite:test.db");
			  Conec.setAutoCommit(false);
			  sttm = Conec.createStatement();
			  ResultSet results = sttm.executeQuery("SELECT * FROM CODEC; ");
			  conf_newsenha = false;
			  conf_newuser = false;
			  while(results.next()){
				  int id = results.getInt("ID");
				  String senha = results.getString("senha");
				  String email = results.getString("email");
				  if(config.getEmail().equals(email)){
					  conf_newuser = true;
					  if(config.getSenha().equals(senha)){
						  conf_newsenha = true;
						  String novo = "UPDATE CODEC set EMAIL = '"+config.getNewEmail()+"' where ID="+id+";";
						  sttm.executeUpdate(novo);
						  novo = "";
					  }
				  }
			  }
			  
			  Conec.commit();
			  results.close();
			  sttm.close();
			  Conec.close();
		  } catch(Exception e){
			  System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		  }
	  }
	  public static boolean getConfigEmail(){
		  config();
		  return conf_newuser;
	  }
	  public static boolean getConfigSenha()
	  {
		  config();
		  return conf_newsenha;
	  }
	  
	 
	}

