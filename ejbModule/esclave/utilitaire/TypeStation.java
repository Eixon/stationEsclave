/**
 * 
 */
package esclave.utilitaire;

/**
 * @author R�my
 *
 */
public enum TypeStation {

	AUTONOME(0), ESCLAVE(1);
	private int typeStation;

	private TypeStation(int typeStation) {
		this.typeStation = typeStation;
	}

	public int getTypeStation() {
		return typeStation;
	}

}