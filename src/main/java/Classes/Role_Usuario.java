package Classes;

import javax.management.relation.Role;

public class Role_Usuario {
    private int id_role_usuario;
    private String nome;
    private boolean is_updated;
    private boolean is_deleted;

    public Role_Usuario(int id_role_usuario, String nome, boolean is_updated, boolean is_deleted){
        this.id_role_usuario = id_role_usuario;
        this.nome = nome;
        this.is_updated = is_updated;
        this.is_deleted = is_deleted;
    }

    public int getId_role_usuario() {
        return id_role_usuario;
    }

    public void setId_role_usuario(int id_role_usuario) {
        this.id_role_usuario = id_role_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIs_updated() {
        return is_updated;
    }

    public void setIs_updated(boolean is_updated) {
        this.is_updated = is_updated;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return "Role_Usuario{" +
                "id_role_usuario=" + id_role_usuario +
                ", nome='" + nome + '\'' +
                ", is_updated=" + is_updated +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
