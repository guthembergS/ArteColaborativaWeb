package br.com.artecolaborativaapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name= "USUARIO")
public class Usuario {
	@Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idUsuario;
	@Column(name="NOME")
	protected String nome;
	@Column(name="SENHA")
    protected String senha;
	@Column(name="EMAIL")
    protected String email;
    @Column(name="MARCA")
    protected String marca;
    @Column(name = "TAXA_VENDA")
    protected double taxaVenda;
    @Column(name = "VL_ALUGUEL")
    protected double aluguel;
    @Column(name = "TP_USUARIO")
    protected String tpUsuario;
    
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "LOJISTA_ARTESAO", joinColumns = {
        @JoinColumn(name = "ID_LOJISTA", referencedColumnName = "ID_USUARIO", nullable = false)},
            inverseJoinColumns = {
                @JoinColumn(name = "ID_ARTESAO", referencedColumnName = "ID_USUARIO", nullable = false)
            }
    )
	public List<Usuario> artesaos = new ArrayList<Usuario>();
    
	
	
    public String getTpUsuario() {
		return tpUsuario;
	}

	public void setTpUsuario(String tpUsuario) {
		this.tpUsuario = tpUsuario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

    public List<Usuario> getArtesaos() {
		return artesaos;
	}

	public void setArtesaos(List<Usuario> artesaos) {
		this.artesaos = artesaos;
	}

	public double getTaxaVenda() {
		return taxaVenda;
	}

	public void setTaxaVenda(double taxaVenda) {
		this.taxaVenda = taxaVenda;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
