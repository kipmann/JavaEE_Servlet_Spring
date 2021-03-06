package de.htwBerlin.ai.kbe.rest;

public interface InterfaceAuthContainer {

	public boolean authenticate(String authToken);

	public String getUserIdByToken(String token);

	public String setUserIdByToken(String token, String userId);

}
