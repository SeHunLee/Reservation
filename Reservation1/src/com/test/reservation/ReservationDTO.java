package com.test.reservation;

public class ReservationDTO {
	private String ch;
	
	@Override
	public String toString() {
		return "ReservationDTO [ch=" + ch + "]";
	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}

	public ReservationDTO(String ch) {
		super();
		this.ch = ch;
	}

	public ReservationDTO() {
		super();
		
	}
	
}
