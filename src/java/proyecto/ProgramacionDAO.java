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

public class ProgramacionDAO {
	public static Programacion loadProgramacionByORMID(int idprog) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProgramacionByORMID(session, idprog);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion getProgramacionByORMID(int idprog) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getProgramacionByORMID(session, idprog);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion loadProgramacionByORMID(int idprog, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProgramacionByORMID(session, idprog, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion getProgramacionByORMID(int idprog, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getProgramacionByORMID(session, idprog, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion loadProgramacionByORMID(PersistentSession session, int idprog) throws PersistentException {
		try {
			return (Programacion) session.load(proyecto.Programacion.class, new Integer(idprog));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion getProgramacionByORMID(PersistentSession session, int idprog) throws PersistentException {
		try {
			return (Programacion) session.get(proyecto.Programacion.class, new Integer(idprog));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion loadProgramacionByORMID(PersistentSession session, int idprog, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Programacion) session.load(proyecto.Programacion.class, new Integer(idprog), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion getProgramacionByORMID(PersistentSession session, int idprog, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Programacion) session.get(proyecto.Programacion.class, new Integer(idprog), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProgramacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryProgramacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProgramacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryProgramacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion[] listProgramacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listProgramacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion[] listProgramacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listProgramacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProgramacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Programacion as Programacion");
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
	
	public static List queryProgramacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Programacion as Programacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Programacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion[] listProgramacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProgramacion(session, condition, orderBy);
			return (Programacion[]) list.toArray(new Programacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion[] listProgramacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProgramacion(session, condition, orderBy, lockMode);
			return (Programacion[]) list.toArray(new Programacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion loadProgramacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProgramacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion loadProgramacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadProgramacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion loadProgramacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Programacion[] programacions = listProgramacionByQuery(session, condition, orderBy);
		if (programacions != null && programacions.length > 0)
			return programacions[0];
		else
			return null;
	}
	
	public static Programacion loadProgramacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Programacion[] programacions = listProgramacionByQuery(session, condition, orderBy, lockMode);
		if (programacions != null && programacions.length > 0)
			return programacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProgramacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateProgramacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProgramacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateProgramacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProgramacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Programacion as Programacion");
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
	
	public static java.util.Iterator iterateProgramacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Programacion as Programacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Programacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Programacion createProgramacion() {
		return new proyecto.Programacion();
	}
	
	public static boolean save(proyecto.Programacion programacion) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(programacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Programacion programacion) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(programacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Programacion programacion)throws PersistentException {
		try {
			if (programacion.getIdusu() != null) {
				programacion.getIdusu().programacion.remove(programacion);
			}
			
			if (programacion.getIdcarr() != null) {
				programacion.getIdcarr().programacion.remove(programacion);
			}
			
			return delete(programacion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Programacion programacion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (programacion.getIdusu() != null) {
				programacion.getIdusu().programacion.remove(programacion);
			}
			
			if (programacion.getIdcarr() != null) {
				programacion.getIdcarr().programacion.remove(programacion);
			}
			
			try {
				session.delete(programacion);
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
	
	public static boolean refresh(proyecto.Programacion programacion) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(programacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Programacion programacion) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(programacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
