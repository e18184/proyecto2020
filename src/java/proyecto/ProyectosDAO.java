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

public class ProyectosDAO {
	public static Proyectos loadProyectosByORMID(String idproyecto) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProyectosByORMID(session, idproyecto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos getProyectosByORMID(String idproyecto) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getProyectosByORMID(session, idproyecto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos loadProyectosByORMID(String idproyecto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProyectosByORMID(session, idproyecto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos getProyectosByORMID(String idproyecto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getProyectosByORMID(session, idproyecto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos loadProyectosByORMID(PersistentSession session, String idproyecto) throws PersistentException {
		try {
			return (Proyectos) session.load(proyecto.Proyectos.class, idproyecto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos getProyectosByORMID(PersistentSession session, String idproyecto) throws PersistentException {
		try {
			return (Proyectos) session.get(proyecto.Proyectos.class, idproyecto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos loadProyectosByORMID(PersistentSession session, String idproyecto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Proyectos) session.load(proyecto.Proyectos.class, idproyecto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos getProyectosByORMID(PersistentSession session, String idproyecto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Proyectos) session.get(proyecto.Proyectos.class, idproyecto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProyectos(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryProyectos(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProyectos(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryProyectos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos[] listProyectosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listProyectosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos[] listProyectosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listProyectosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProyectos(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Proyectos as Proyectos");
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
	
	public static List queryProyectos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Proyectos as Proyectos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Proyectos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos[] listProyectosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProyectos(session, condition, orderBy);
			return (Proyectos[]) list.toArray(new Proyectos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos[] listProyectosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProyectos(session, condition, orderBy, lockMode);
			return (Proyectos[]) list.toArray(new Proyectos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos loadProyectosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProyectosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos loadProyectosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProyectosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos loadProyectosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Proyectos[] proyectoses = listProyectosByQuery(session, condition, orderBy);
		if (proyectoses != null && proyectoses.length > 0)
			return proyectoses[0];
		else
			return null;
	}
	
	public static Proyectos loadProyectosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Proyectos[] proyectoses = listProyectosByQuery(session, condition, orderBy, lockMode);
		if (proyectoses != null && proyectoses.length > 0)
			return proyectoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProyectosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateProyectosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProyectosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateProyectosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProyectosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Proyectos as Proyectos");
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
	
	public static java.util.Iterator iterateProyectosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Proyectos as Proyectos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Proyectos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proyectos createProyectos() {
		return new proyecto.Proyectos();
	}
	
	public static boolean save(proyecto.Proyectos proyectos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(proyectos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Proyectos proyectos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(proyectos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Proyectos proyectos)throws PersistentException {
		try {
			if (proyectos.getArea() != null) {
				proyectos.getArea().proyectoses.remove(proyectos);
			}
			
			if (proyectos.getProgramacionidprog() != null) {
				proyectos.getProgramacionidprog().proyectos.remove(proyectos);
			}
			
			if (proyectos.getDocentesidusu() != null) {
				proyectos.getDocentesidusu().proyectos.remove(proyectos);
			}
			
			proyecto.Tribunal[] lTribunalss = proyectos.tribunals.toArray();
			for(int i = 0; i < lTribunalss.length; i++) {
				lTribunalss[i].setProyectos(null);
			}
			return delete(proyectos);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Proyectos proyectos, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (proyectos.getArea() != null) {
				proyectos.getArea().proyectoses.remove(proyectos);
			}
			
			if (proyectos.getProgramacionidprog() != null) {
				proyectos.getProgramacionidprog().proyectos.remove(proyectos);
			}
			
			if (proyectos.getDocentesidusu() != null) {
				proyectos.getDocentesidusu().proyectos.remove(proyectos);
			}
			
			proyecto.Tribunal[] lTribunalss = proyectos.tribunals.toArray();
			for(int i = 0; i < lTribunalss.length; i++) {
				lTribunalss[i].setProyectos(null);
			}
			try {
				session.delete(proyectos);
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
	
	public static boolean refresh(proyecto.Proyectos proyectos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(proyectos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Proyectos proyectos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(proyectos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
