package br.com.comandaeletronica.util;

public final class ServicePath {

	///////////////////////////////////////////////////////////////
	// ROOT PATH
	///////////////////////////////////////////////////////////////

	public static final String ALL = "/**";

	public static final String ROOT_PATH = "/api";

	public static final String PUBLIC_ROOT_PATH = ROOT_PATH + "/public";

	public static final String PRIVATE_ROOT_PATH = ROOT_PATH + "/private";

	///////////////////////////////////////////////////////////////
	// PRIVATE PATHS
	///////////////////////////////////////////////////////////////


	public static final String PERMISSION_PATH = PRIVATE_ROOT_PATH + "/permission";

	public static final String USER_PATH = PRIVATE_ROOT_PATH + "/user";
	
	

	///////////////////////////////////////////////////////////////
	// PUBLIC PATHS
	///////////////////////////////////////////////////////////////

	public static final String LOGIN_PATH = PUBLIC_ROOT_PATH + "/login";

	public static final String LOGOUT_PATH = PUBLIC_ROOT_PATH + "/logout";
	
	public static final String INICIO_PATH = PUBLIC_ROOT_PATH + "/inicio";

}
