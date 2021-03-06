/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_lab7p2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Artistas extends Usuarios {

    private String nombreArtistico;
    private ArrayList<Singles> cancionesPublicados;
    private ArrayList<Albumes> albumesPublicados;

    public Artistas(String nombreArtistico, ArrayList<Singles> cancionesPublicados, ArrayList<Albumes> albumesPublicados, String usuario, String contrasena, int edad) {
        super(usuario, contrasena, edad);
        this.nombreArtistico = nombreArtistico;
        this.cancionesPublicados = cancionesPublicados;
        this.albumesPublicados = albumesPublicados;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Singles> getCancionesPublicados() {
        return cancionesPublicados;
    }

    public void setCancionesPublicados(ArrayList<Singles> cancionesPublicados) {
        this.cancionesPublicados = cancionesPublicados;
    }

    public ArrayList<Albumes> getAlbumesPublicados() {
        return albumesPublicados;
    }

    public void setAlbumesPublicados(ArrayList<Albumes> albumesPublicados) {
        this.albumesPublicados = albumesPublicados;
    }

    @Override
    public String toString() {
        return "Artistas{" + "nombreArtistico=" + nombreArtistico + ", cancionesPublicados=" + cancionesPublicados + ", albumesPublicados=" + albumesPublicados + '}';
    }

}
