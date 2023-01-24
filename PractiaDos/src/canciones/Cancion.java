package canciones;

public class Cancion {
	
	private String tituloCancion;
	private String artista;
	private int duracionCancion;
	
	public Cancion(String tituloCancion, String artista, int duracionCancion) {
		super();
		this.tituloCancion = tituloCancion;
		this.artista = artista;
		this.duracionCancion = duracionCancion;
	}

	public Cancion() {
		// TODO Auto-generated constructor stub
	}

	public String getTituloCancion() {
		return tituloCancion;
	}

	public void setTituloCancion(String tituloCancion) {
		this.tituloCancion = tituloCancion;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracionCancion() {
		return duracionCancion;
	}

	public void setDuracionCancion(int duracionCancion) {
		this.duracionCancion = duracionCancion;
	}

	@Override
	public String toString() {
		return "Cancion [tituloCancion=" + tituloCancion + ", artista=" + artista + ", duracionCancion="
				+ duracionCancion + "]";
	}
	
	
	
	
	
	

}
