package rocklee.utility;

import java.util.regex.Pattern;

public class Config
{

	public static final String TYPE_NEW_IDENTITY = "newidentity";
	public static final String TYPE_INDENTITY_CHANGE = "identitychange";
	public static final String TYPE_JOIN = "join";
	public static final String TYPE_ROOM_CHANGE = "roomchange";
	public static final String TYPE_ROOM_CONTENTS = "roomcontents";
	public static final String TYPE_WHO = "who";
	public static final String TYPE_LIST = "list";
	public static final String TYPE_ROOM_LIST = "roomlist";
	public static final String TYPE_CREATE_ROOM = "createroom";
	public static final String TYPE_KICK = "kick";
	public static final String TYPE_DELETE = "delete";
	public static final String TYPE_MESSAGE = "message";
	public static final String TYPE_QUIT = "quit";

	public static final String VALID_IDENTITY_REX = "^[a-zA-Z][a-zA-Z0-9]{2,15}";
	public static final String VALID_ROOM_ID_REX = "^[a-zA-Z][a-zA-Z0-9]{2,31}";

	
	//===============================================
	//new custom TYPE
	public static final String TYPE_RSA_VERIFY="rsaverify";
	public static final String TYPE_SIGNATURE="signature";
	public static final String TYPE_LOGIN="login";
	public static final String TYPE_LOGIN_SUCCESS="success";
	public static final String TYPE_LOGIN_FAILURE="failure";
	
	
	public static  boolean validIdentity(String identity)
	{
		return Pattern.matches(Config.VALID_IDENTITY_REX, identity);
	}

	public static  boolean validRoomId(String room_id)
	{
		return Pattern.matches(Config.VALID_ROOM_ID_REX, room_id);
	}

}
