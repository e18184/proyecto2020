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

public class DatosDAO {
	public static Datos loadDatosByORMID(proyecto.Usuarios idusu, String login) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDatosByORMID(session, idusu, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos getDatosByORMID(proyecto.Usuarios idusu, String login) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getDatosByORMID(session, idusu, login);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos loadDatosByORMID(proyecto.Usuarios idusu, String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDatosByORMID(session, idusu, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos getDatosByORMID(proyecto.Usuarios idusu, String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getDatosByORMID(session, idusu, login, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos loadDatosByORMID(PersistentSession session, proyecto.Usuarios idusu, String login) throws PersistentException {
		try {
			Datos datos = new proyecto.Datos();
			datos.setORM_Idusu(idusu);
			datos.setLogin(login);
			
			return (Datos) session.load(proyecto.Datos.class, datos);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos getDatosByORMID(PersistentSession session, proyecto.Usuarios idusu, String login) throws PersistentException {
		try {
			Datos datos = new proyecto.Datos();
			datos.setORM_Idusu(idusu);
			datos.setLogin(login);
			
			return (Datos) session.get(proyecto.Datos.class, datos);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos loadDatosByORMID(PersistentSession session, proyecto.Usuarios idusu, String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Datos datos = new proyecto.Datos();
			datos.setORM_Idusu(idusu);
			datos.setLogin(login);
			
			return (Datos) session.load(proyecto.Datos.class, datos, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos getDatosByORMID(PersistentSession session, proyecto.Usuarios idusu, String login, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Datos datos = new proyecto.Datos();
			datos.setORM_Idusu(idusu);
			datos.setLogin(login);
			
			return (Datos) session.get(proyecto.Datos.class, datos, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatos(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryDatos(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatos(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryDatos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos[] listDatosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listDatosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos[] listDatosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listDatosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatos(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Datos as Datos");
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
	
	public static List queryDatos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Datos as Datos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Datos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos[] listDatosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDatos(session, condition, orderBy);
			return (Datos[]) list.toArray(new Datos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos[] listDatosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDatos(session, condition, orderBy, lockMode);
			return (Datos[]) list.toArray(new Datos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos loadDatosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDatosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos loadDatosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDatosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos loadDatosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Datos[] datoses = listDatosByQuery(session, condition, orderBy);
		if (datoses != null && datoses.length > 0)
			return datoses[0];
		else
			return null;
	}
	
	public static Datos loadDatosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Datos[] datoses = listDatosByQuery(session, condition, orderBy, lockMode);
		if (datoses != null && datoses.length > 0)
			return datoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDatosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateDatosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDatosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateDatosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDatosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Datos as Datos");
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
	
	public static java.util.Iterator iterateDatosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Datos as Datos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Datos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos createDatos() {
		return new proyecto.Datos();
	}
	
	public static boolean save(proyecto.Datos datos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(datos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Datos datos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(datos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Datos datos)throws PersistentException {
		try {
			proyecto.Usuarios idusu = datos.getIdusu();
			if (datos.getIdusu() != null) {
				datos.getIdusu().datos.remove(datos);
			}
			datos.setORM_Idusu(idusu);
			
			return delete(datos);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Datos datos, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Usuarios idusu = datos.getIdusu();
			if (datos.getIdusu() != null) {
				datos.getIdusu().datos.remove(datos);
			}
			datos.setORM_Idusu(idusu);
			
			try {
				session.delete(datos);
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
	
	public static boolean refresh(proyecto.Datos datos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(datos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Datos datos) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(datos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
