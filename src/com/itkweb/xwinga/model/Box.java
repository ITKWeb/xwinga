package com.itkweb.xwinga.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box {

	private String name;

	private String picture;

	private int id;

	private List<Pilot> pilots;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}

	public enum BoxSet {
		b1("Boite de base", "sw01"),
		b2("X-wing", "sw02"), b3(
				"Chasseur TIE", "sw03"), b4("Y-wing", "sw04"), b5(
				"TIE advanced", "sw05"), b6("Faucon Millenium", "sw06"), b7(
				"Slave 1", "sw07"), b8("A-wing", "sw08"), b9(
				"Intercepteur TIE", "sw09");

		private final String name;
		private final String picture;
		private final List<Pilot> pilots = new ArrayList<Pilot>();

		BoxSet(String name, String picture) {
			this.name = name;
			this.picture = picture;
		}

		BoxSet(String name, String picture, List<Pilot> pilots) {
			this.name = name;
			this.picture = picture;
			this.pilots.addAll(pilots);
		}

		public String getName() {
			return name;
		}

		public String getPicture() {
			return picture;
		}

	}

}
