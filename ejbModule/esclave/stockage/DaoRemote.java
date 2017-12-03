package esclave.stockage;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Remote;

import ynovm.service.StationPOJO;
@Remote
public interface DaoRemote extends Serializable {

	/**
	 * M�thode retournant la liste des �l�ments de Dao
	 */
	public List<StationPOJO> lireTous();

	/**
	 * Lecture d'un �l�ment de Dao
	 */
	public StationPOJO lire(int cle);

	/**
	 * Insertion d'un �l�ment dans le Dao
	 */
	public void inserer(StationPOJO elt);

	/**
	 * Mise � jour d'un �l�ment de Dao en fonction d'un index
	 */
	public void update(int index, StationPOJO obj);

	// JAVA 8
	/**
	 * Mise � jour d'un �l�ment de Dao en fonction d'un objet seulement
	 */
	public default void update(StationPOJO obj) {
	}

	/**
	 * Effacement d'un �l�ment de Dao
	 */
	public void effacer(int cle);

}
