package UF5_Act2.Notícies;

public interface GestorNot {
	public void novaCategoria(String nom);
	public void assignaParaulesCategoria(String categoria, String[] paraules);
    public void eliminarParaulesCategoria(String categoria, String[] paraules);
    public void novaNoticia(String texto);
    public void reassignarCategories();
    public void veureNoticiesCategoria(String cat);
    public void veureCategoriesNoticies(); 
}
