/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package proyecto;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CarrerasDAO {
	public static Carreras loadCarrerasByORMID(int idcarr) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadCarrerasByORMID(session, idcarr);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras getCarrerasByORMID(int idcarr) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getCarrerasByORMID(session, idcarr);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras loadCarrerasByORMID(int idcarr, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadCarrerasByORMID(session, idcarr, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras getCarrerasByORMID(int idcarr, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getCarrerasByORMID(session, idcarr, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras loadCarrerasByORMID(PersistentSession session, int idcarr) throws PersistentException {
		try {
			return (Carreras) session.load(proyecto.Carreras.class, new Integer(idcarr));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras getCarrerasByORMID(PersistentSession session, int idcarr) throws PersistentException {
		try {
			return (Carreras) session.get(proyecto.Carreras.class, new Integer(idcarr));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras loadCarrerasByORMID(PersistentSession session, int idcarr, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Carreras) session.load(proyecto.Carreras.class, new Integer(idcarr), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras getCarrerasByORMID(PersistentSession session, int idcarr, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Carreras) session.get(proyecto.Carreras.class, new Integer(idcarr), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCarreras(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryCarreras(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCarreras(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryCarreras(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras[] listCarrerasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listCarrerasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras[] listCarrerasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listCarrerasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCarreras(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Carreras as Carreras");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCarreras(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Carreras as Carreras");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Carreras", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras[] listCarrerasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCarreras(session, condition, orderBy);
			return (Carreras[]) list.toArray(new Carreras[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras[] listCarrerasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCarreras(session, condition, orderBy, lockMode);
			return (Carreras[]) list.toArray(new Carreras[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras loadCarrerasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadCarrerasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras loadCarrerasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadCarrerasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras loadCarrerasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Carreras[] carrerases = listCarrerasByQuery(session, condition, orderBy);
		if (carrerases != null && carrerases.length > 0)
			return carrerases[0];
		else
			return null;
	}
	
	public static Carreras loadCarrerasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Carreras[] carrerases = listCarrerasByQuery(session, condition, orderBy, lockMode);
		if (carrerases != null && carrerases.length > 0)
			return carrerases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCarrerasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateCarrerasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCarrerasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateCarrerasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCarrerasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Carreras as Carreras");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCarrerasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Carreras as Carreras");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Carreras", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carreras createCarreras() {
		return new proyecto.Carreras();
	}
	
	public static boolean save(proyecto.Carreras carreras) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(carreras);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Carreras carreras) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(carreras);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Carreras carreras)throws PersistentException {
		try {
			proyecto.Materias[] lMateriass = carreras.materias.toArray();
			for(int i = 0; i < lMateriass.length; i++) {
				lMateriass[i].setIdcarr(null);
			}
			return delete(carreras);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Carreras carreras, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Materias[] lMateriass = carreras.materias.toArray();
			for(int i = 0; i < lMateriass.length; i++) {
				lMateriass[i].setIdcarr(null);
			}
			try {
				session.delete(carreras);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(proyecto.Carreras carreras) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(carreras);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Carreras carreras) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(carreras);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
