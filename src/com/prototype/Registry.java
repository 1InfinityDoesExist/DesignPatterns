package com.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<GameType, Game> games = new HashMap<GameType, Game>();

	public Registry() {
		this.initialize();
	}

	private void initialize() {
		Ludo ludo = new Ludo();
		ludo.setName("LUDO");

		PubG pubG = new PubG();
		pubG.setName("PUBG");

		games.put(GameType.LUDO, ludo);
		games.put(GameType.PUBG, pubG);
	}

	public Game getGame(GameType type) throws CloneNotSupportedException {
		return (Game) games.get(type).clone();
	}
}
