package model;

import java.sql.Date;

public class Faltas {
	
	private int ra_aluno;
	private int codigoDisciplina;
	private Date data;
	private int presenca;
	
	public int getRa_aluno() {
		return ra_aluno;
	}
	public void setRa_aluno(int ra_aluno) {
		this.ra_aluno = ra_aluno;
	}
	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getPresenca() {
		return presenca;
	}
	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}
	
	
}
