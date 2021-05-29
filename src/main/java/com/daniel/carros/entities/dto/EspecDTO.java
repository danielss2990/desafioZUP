package com.daniel.carros.entities.dto;

public class EspecDTO {
	
	
	  private String  valor;
	  private String  marca;
	  private String  modelo;
	  private Integer anoModelo;
	  private String  combustivel;
	  private String  codigoFipe;
	  private String  mesReferencia;
	  private Integer tipoVeiculo;
	  private String  siglaCombustivel;
	  
	  
	  public EspecDTO() {
		  
	  }


	public EspecDTO(String valor, String marca, String modelo, Integer anoModelo, String combustivel, String codigoFipe,
			String mesReferencia, Integer tipoVeiculo, String siglaCombustivel) {
		super();
		this.valor = valor;
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.combustivel = combustivel;
		this.codigoFipe = codigoFipe;
		this.mesReferencia = mesReferencia;
		this.tipoVeiculo = tipoVeiculo;
		this.siglaCombustivel = siglaCombustivel;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Integer getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public String getCodigoFipe() {
		return codigoFipe;
	}


	public void setCodigoFipe(String codigoFipe) {
		this.codigoFipe = codigoFipe;
	}


	public String getMesReferencia() {
		return mesReferencia;
	}


	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}


	public Integer getTipoVeiculo() {
		return tipoVeiculo;
	}


	public void setTipoVeiculo(Integer tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	public String getSiglaCombustivel() {
		return siglaCombustivel;
	}


	public void setSiglaCombustivel(String siglaCombustivel) {
		this.siglaCombustivel = siglaCombustivel;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoModelo == null) ? 0 : anoModelo.hashCode());
		result = prime * result + ((codigoFipe == null) ? 0 : codigoFipe.hashCode());
		result = prime * result + ((combustivel == null) ? 0 : combustivel.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((mesReferencia == null) ? 0 : mesReferencia.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((siglaCombustivel == null) ? 0 : siglaCombustivel.hashCode());
		result = prime * result + ((tipoVeiculo == null) ? 0 : tipoVeiculo.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EspecDTO other = (EspecDTO) obj;
		if (anoModelo == null) {
			if (other.anoModelo != null)
				return false;
		} else if (!anoModelo.equals(other.anoModelo))
			return false;
		if (codigoFipe == null) {
			if (other.codigoFipe != null)
				return false;
		} else if (!codigoFipe.equals(other.codigoFipe))
			return false;
		if (combustivel == null) {
			if (other.combustivel != null)
				return false;
		} else if (!combustivel.equals(other.combustivel))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (mesReferencia == null) {
			if (other.mesReferencia != null)
				return false;
		} else if (!mesReferencia.equals(other.mesReferencia))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (siglaCombustivel == null) {
			if (other.siglaCombustivel != null)
				return false;
		} else if (!siglaCombustivel.equals(other.siglaCombustivel))
			return false;
		if (tipoVeiculo == null) {
			if (other.tipoVeiculo != null)
				return false;
		} else if (!tipoVeiculo.equals(other.tipoVeiculo))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	  
	 
	

}
