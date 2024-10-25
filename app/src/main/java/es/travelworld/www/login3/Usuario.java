package es.travelworld.www.login3;

import com.google.android.material.textfield.TextInputEditText;

public class Usuario {
    private String login;
    private int password;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", password=" + password +
                '}';
    }

    public Usuario(String login, int password){
        this.login = login;
        this.password = password;


}
}
