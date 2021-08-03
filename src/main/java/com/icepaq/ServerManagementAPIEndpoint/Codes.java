package com.icepaq.ServerManagementAPIEndpoint;

public class Codes {
	String host_name = "jdbc:mysql://localhost:3306/";
	String host = "jdbc:mysql://localhost:3306"; //Used only for setting up the database.
	String db_username = "root";
	String db_password = System.getenv("DATAMYSQLPASS");
}
