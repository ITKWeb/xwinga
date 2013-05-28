package com.itkweb.xwinga.model;

public class Pilot extends Card {

	public enum Team {
		REBEL, IMPERIAL
	}

	public enum Ship {
		XW("XWing", Team.REBEL), YW("YWing", Team.REBEL), TF("Chasseur TIE",
				Team.IMPERIAL), TA("TIE advanced", Team.IMPERIAL);

		private final String name;
		private final Team team;

		Ship(String name, Team team) {
			this.name = name;
			this.team = team;
		}

		public String getName() {
			return name;
		}

		public Team getTeam() {
			return team;
		}

	}

	public enum Crew {
		LS("Luke Skywalker", Ship.XW), BD("Biggs Darklighter", Ship.XW), RP(
				"Pilote de l'escadron Rouge", Ship.XW), BP("Pilote debutant",
				Ship.XW), MM("Mauler Mithel", Ship.TF), DC("Dark Curse",
				Ship.TF), NB("Night Beast", Ship.TF), BSP(
				"Pilote de l'escadron Noir", Ship.TF), OSP(
				"Pilote de l'escadron Obsidian", Ship.TF), AP(
				"Pilote de l'academie", Ship.TF);

		private final Pilot pilot;

		Crew(String name, Ship ship) {
			this.pilot = new Pilot(name, ship);
		}

		public Pilot getPilot() {
			return pilot;
		}

	}

	private Ship ship;

	public Pilot(String name, Ship ship) {
		super(name);
		this.ship = ship;
	}

	public Team getTeam() {
		return ship.getTeam();
	}

	public Ship getShip() {
		return ship;
	}


}
