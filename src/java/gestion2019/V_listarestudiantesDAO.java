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

public class V_listarestudiantesDAO {
	public static V_listarestudiantes loadV_listarestudiantesByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_listarestudiantesByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes getV_listarestudiantesByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return getV_listarestudiantesByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes loadV_listarestudiantesByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_listarestudiantesByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes getV_listarestudiantesByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return getV_listarestudiantesByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes loadV_listarestudiantesByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (V_listarestudiantes) session.load(gestion2019.V_listarestudiantes.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes getV_listarestudiantesByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (V_listarestudiantes) session.get(gestion2019.V_listarestudiantes.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes loadV_listarestudiantesByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (V_listarestudiantes) session.load(gestion2019.V_listarestudiantes.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes getV_listarestudiantesByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (V_listarestudiantes) session.get(gestion2019.V_listarestudiantes.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_listarestudiantes(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return queryV_listarestudiantes(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_listarestudiantes(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return queryV_listarestudiantes(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes[] listV_listarestudiantesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return listV_listarestudiantesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes[] listV_listarestudiantesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return listV_listarestudiantesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryV_listarestudiantes(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_listarestudiantes as V_listarestudiantes");
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
	
	public static List queryV_listarestudiantes(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_listarestudiantes as V_listarestudiantes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("V_listarestudiantes", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes[] listV_listarestudiantesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryV_listarestudiantes(session, condition, orderBy);
			return (V_listarestudiantes[]) list.toArray(new V_listarestudiantes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes[] listV_listarestudiantesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryV_listarestudiantes(session, condition, orderBy, lockMode);
			return (V_listarestudiantes[]) list.toArray(new V_listarestudiantes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes loadV_listarestudiantesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_listarestudiantesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes loadV_listarestudiantesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return loadV_listarestudiantesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static V_listarestudiantes loadV_listarestudiantesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		V_listarestudiantes[] v_listarestudianteses = listV_listarestudiantesByQuery(session, condition, orderBy);
		if (v_listarestudianteses != null && v_listarestudianteses.length > 0)
			return v_listarestudianteses[0];
		else
			return null;
	}
	
	public static V_listarestudiantes loadV_listarestudiantesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		V_listarestudiantes[] v_listarestudianteses = listV_listarestudiantesByQuery(session, condition, orderBy, lockMode);
		if (v_listarestudianteses != null && v_listarestudianteses.length > 0)
			return v_listarestudianteses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateV_listarestudiantesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return iterateV_listarestudiantesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateV_listarestudiantesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
			return iterateV_listarestudiantesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateV_listarestudiantesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_listarestudiantes as V_listarestudiantes");
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
	
	public static java.util.Iterator iterateV_listarestudiantesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From gestion2019.V_listarestudiantes as V_listarestudiantes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("V_listarestudiantes", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(gestion2019.V_listarestudiantes v_listarestudiantes) throws PersistentException {
		try {
			proyecto.Proyectofinal2PersistentManager.instance().getSession().refresh(v_listarestudiantes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(gestion2019.V_listarestudiantes v_listarestudiantes) throws PersistentException {
		try {
			proyecto.Proyectofinal2PersistentManager.instance().getSession().evict(v_listarestudiantes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
