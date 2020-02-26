package com.geraldovictor.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa JUrídica");
	
	private int codigo;
	private String descricao;
	
	private TipoCliente(int cod, String desc) {
		this.codigo = cod;
		this.descricao = desc;
	}
	
	public int getCod() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
