package listaCanciones;

public class Cancion {

	private String titulo, artista;
	private int duracion;
	
	public Cancion(String titulo, String artista, int duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + "]";
	}
	
}