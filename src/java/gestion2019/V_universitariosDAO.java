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

public class V_universitariosDAO {
	public static V_universitarios loadV_universitariosByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_universitariosByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios getV_universitariosByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return getV_universitariosByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios loadV_universitariosByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_universitariosByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios getV_universitariosByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return getV_universitariosByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios loadV_universitariosByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (V_universitarios) session.load(gestion2019.V_universitarios.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios getV_universitariosByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (V_universitarios) session.get(gestion2019.V_universitarios.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios loadV_universitariosByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (V_universitarios) session.load(gestion2019.V_universitarios.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios getV_universitariosByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (V_universitarios) session.get(gestion2019.V_universitarios.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_universitarios(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return queryV_universitarios(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_universitarios(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return queryV_universitarios(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios[] listV_universitariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return listV_universitariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios[] listV_universitariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return listV_universitariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_universitarios(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_universitarios as V_universitarios");
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
	
	public static List queryV_universitarios(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_universitarios as V_universitarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("V_universitarios", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios[] listV_universitariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryV_universitarios(session, condition, orderBy);
			return (V_universitarios[]) list.toArray(new V_universitarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios[] listV_universitariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryV_universitarios(session, condition, orderBy, lockMode);
			return (V_universitarios[]) list.toArray(new V_universitarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios loadV_universitariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_universitariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios loadV_universitariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_universitariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios loadV_universitariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		V_universitarios[] v_universitarioses = listV_universitariosByQuery(session, condition, orderBy);
		if (v_universitarioses != null && v_universitarioses.length > 0)
			return v_universitarioses[0];
		else
			return null;
	}
	
	public static V_universitarios loadV_universitariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		V_universitarios[] v_universitarioses = listV_universitariosByQuery(session, condition, orderBy, lockMode);
		if (v_universitarioses != null && v_universitarioses.length > 0)
			return v_universitarioses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateV_universitariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return iterateV_universitariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateV_universitariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return iterateV_universitariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateV_universitariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_universitarios as V_universitarios");
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
	
	public static java.util.Iterator iterateV_universitariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_universitarios as V_universitarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("V_universitarios", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_universitarios createV_universitarios() {
		return new gestion2019.V_universitarios();
	}
	
	public static boolean save(gestion2019.V_universitarios v_universitarios) throws PersistentException {
		try {
			proyecto.Proyectofinal2PersistentManager.instance().saveObject(v_universitarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(gestion2019.V_universitarios v_universitarios) throws PersistentException {
		try {
			proyecto.Proyectofinal2PersistentManager.instance().deleteObject(v_universitarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(gestion2019.V_universitarios v_universitarios) throws PersistentException {
		try {
			proyecto.Proyectofinal2PersistentManager.instance().getSession().refresh(v_universitarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(gestion2019.V_universitarios v_universitarios) throws PersistentException {
		try {
			proyecto.Proyectofinal2PersistentManager.instance().getSession().evict(v_universitarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
