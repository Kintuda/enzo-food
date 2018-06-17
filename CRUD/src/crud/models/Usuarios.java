/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Kin
 */
@Entity
/*@NamedQueries({
 @NamedQuery(name="usuarios.findAll", query = "SELECT c FROM usuarios c"),
 @NamedQuery(name="usuarios.findById", query = "SELECT c FROM usuarios c WHERE c.id= :id"),
 @NamedQuery(name="usuarios.findByNome", query = "SELECT c FROM usuarios c WHERE c.nome= :nome")
})*/
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String nome;
    @Column
    private String cidade;
    @Column
    private String endereco;
    @Column 
    private String telefone;
    @Column 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public Date getData() {
        return dataCadastro;
    }

    public void setData(Date data) {
        this.dataCadastro = data;
    }
    
    
}
