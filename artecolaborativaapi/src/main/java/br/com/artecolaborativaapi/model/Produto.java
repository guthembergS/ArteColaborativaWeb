package br.com.artecolaborativaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name= "PRODUTO")
public class Produto {
	@Id
    @Column(name = "ID_PRODUTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idProduto;
	@Column(name="DESCRICAO")
	protected String descricao;
	@Column(name="PRECO")
	protected double preco;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ARTESAO", referencedColumnName = "ID_USUARIO", nullable = false)
    protected Usuario artesao;
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Usuario getArtesao() {
		return artesao;
	}
	public void setArtesao(Usuario artesao) {
		this.artesao = artesao;
	}
	
}
