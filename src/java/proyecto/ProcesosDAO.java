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

public class ProcesosDAO {
	public static Procesos loadProcesosByORMID(int idpro) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProcesosByORMID(session, idpro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos getProcesosByORMID(int idpro) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getProcesosByORMID(session, idpro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos loadProcesosByORMID(int idpro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProcesosByORMID(session, idpro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos getProcesosByORMID(int idpro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getProcesosByORMID(session, idpro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos loadProcesosByORMID(PersistentSession session, int idpro) throws PersistentException {
		try {
			return (Procesos) session.load(proyecto.Procesos.class, new Integer(idpro));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos getProcesosByORMID(PersistentSession session, int idpro) throws PersistentException {
		try {
			return (Procesos) session.get(proyecto.Procesos.class, new Integer(idpro));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos loadProcesosByORMID(PersistentSession session, int idpro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Procesos) session.load(proyecto.Procesos.class, new Integer(idpro), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos getProcesosByORMID(PersistentSession session, int idpro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Procesos) session.get(proyecto.Procesos.class, new Integer(idpro), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProcesos(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryProcesos(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProcesos(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryProcesos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos[] listProcesosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listProcesosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos[] listProcesosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listProcesosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProcesos(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Procesos as Procesos");
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
	
	public static List queryProcesos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Procesos as Procesos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Procesos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos[] listProcesosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProcesos(session, condition, orderBy);
			return (Procesos[]) list.toArray(new Procesos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos[] listProcesosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProcesos(session, condition, orderBy, lockMode);
			return (Procesos[]) list.toArray(new Procesos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos loadProcesosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProcesosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos loadProcesosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProcesosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos loadProcesosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Procesos[] procesoses = listProcesosByQuery(session, condition, orderBy);
		if (procesoses != null && procesoses.length > 0)
			return procesoses[0];
		else
			return null;
	}
	
	public static Procesos loadProcesosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Procesos[] procesoses = listProcesosByQuery(session, condition, orderBy, lockMode);
		if (procesoses != null && procesoses.length > 0)
			return procesoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProcesosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateProcesosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProcesosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateProcesosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProcesosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Procesos as Procesos");
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
	
	public static java.util.Iterator iterateProcesosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Procesos as Procesos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Procesos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Procesos createProcesos() {
		return new proyecto.Procesos();
	}
	
	public static boolean save(proyecto.Procesos procesos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(procesos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Procesos procesos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(procesos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Procesos procesos)throws PersistentException {
		try {
			proyecto.Menus[] lIdmenus = procesos.idmenu.toArray();
			for(int i = 0; i < lIdmenus.length; i++) {
				lIdmenus[i].idpro.remove(procesos);
			}
			return delete(procesos);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Procesos procesos, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Menus[] lIdmenus = procesos.idmenu.toArray();
			for(int i = 0; i < lIdmenus.length; i++) {
				lIdmenus[i].idpro.remove(procesos);
			}
			try {
				session.delete(procesos);
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
	
	public static boolean refresh(proyecto.Procesos procesos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(procesos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Procesos procesos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(procesos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
