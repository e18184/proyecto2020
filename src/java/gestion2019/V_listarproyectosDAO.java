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
package gestion2019;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class V_listarproyectosDAO {
	public static V_listarproyectos loadV_listarproyectosByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_listarproyectosByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos getV_listarproyectosByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return getV_listarproyectosByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos loadV_listarproyectosByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_listarproyectosByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos getV_listarproyectosByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return getV_listarproyectosByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos loadV_listarproyectosByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (V_listarproyectos) session.load(gestion2019.V_listarproyectos.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos getV_listarproyectosByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (V_listarproyectos) session.get(gestion2019.V_listarproyectos.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos loadV_listarproyectosByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (V_listarproyectos) session.load(gestion2019.V_listarproyectos.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos getV_listarproyectosByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (V_listarproyectos) session.get(gestion2019.V_listarproyectos.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_listarproyectos(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return queryV_listarproyectos(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_listarproyectos(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return queryV_listarproyectos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos[] listV_listarproyectosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return listV_listarproyectosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos[] listV_listarproyectosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return listV_listarproyectosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_listarproyectos(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_listarproyectos as V_listarproyectos");
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
	
	public static List queryV_listarproyectos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_listarproyectos as V_listarproyectos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("V_listarproyectos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos[] listV_listarproyectosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryV_listarproyectos(session, condition, orderBy);
			return (V_listarproyectos[]) list.toArray(new V_listarproyectos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos[] listV_listarproyectosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryV_listarproyectos(session, condition, orderBy, lockMode);
			return (V_listarproyectos[]) list.toArray(new V_listarproyectos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos loadV_listarproyectosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_listarproyectosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos loadV_listarproyectosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_listarproyectosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarproyectos loadV_listarproyectosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		V_listarproyectos[] v_listarproyectoses = listV_listarproyectosByQuery(session, condition, orderBy);
		if (v_listarproyectoses != null && v_listarproyectoses.length > 0)
			return v_listarproyectoses[0];
		else
			return null;
	}
	
	public static V_listarproyectos loadV_listarproyectosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		V_listarproyectos[] v_listarproyectoses = listV_listarproyectosByQuery(session, condition, orderBy, lockMode);
		if (v_listarproyectoses != null && v_listarproyectoses.length > 0)
			return v_listarproyectoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateV_listarproyectosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return iterateV_listarproyectosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateV_listarproyectosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return iterateV_listarproyectosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateV_listarproyectosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_listarproyectos as V_listarproyectos");
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
	
	public static java.util.Iterator iterateV_listarproyectosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_listarproyectos as V_listarproyectos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("V_listarproyectos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(gestion2019.V_listarproyectos v_listarproyectos) throws PersistentException {
		try {
			proyecto.Proyectofinal2PersistentManager.instance().getSession().refresh(v_listarproyectos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(gestion2019.V_listarproyectos v_listarproyectos) throws PersistentException {
		try {
			proyecto.Proyectofinal2PersistentManager.instance().getSession().evict(v_listarproyectos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
