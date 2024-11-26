package com.generation.helloworld.model;

public class ListaBSM {
	private int id;
	private String objetivos;

	public ListaBSM(int id, String objetivos) {
		this.id = id;
		this.objetivos = objetivos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

}
