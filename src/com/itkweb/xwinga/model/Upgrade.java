package com.itkweb.xwinga.model;

public class Upgrade extends Card {

	public Upgrade(String name) {
		super(name);
	}

	private FeaturePart part;

	public FeaturePart getPart() {
		return part;
	}

	public void setPart(FeaturePart part) {
		this.part = part;
	}

	public enum FeaturePart {
		TP("Torpille"), DR("Astromech Droids "), TR("Turret Weapons "), MD("Elite Pilot Talents"), MS(
				"Missiles "), CR("Crew"), SU ("Ship Upgrades "), BM("Bombs"), BF("BFG's");

		private String part;

		FeaturePart(String part) {
			this.part = part;
		}

		public String getPart() {
			return part;
		}

	}

}
