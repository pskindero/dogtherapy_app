package com.pskindero.dogtherapy.dogtherapy_war;

public class AboutDogtherapySection {

	private String visible;
	private String hidden;
	
	public AboutDogtherapySection(String visible, String hidden) {
		super();
		this.visible = visible;
		this.hidden = hidden;
	}

	public String getVisible() {
		return visible;
	}
	
	public void setVisible(String visible) {
		this.visible = visible;
	}
	
	public String getHidden() {
		return hidden;
	}
	
	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	@Override
	public String toString() {
		return "AboutDogtherapySection [visible=" + visible + ", hidden=" + hidden + "]";
	}
}
