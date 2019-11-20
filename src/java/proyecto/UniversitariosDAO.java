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

public class UniversitariosDAO {
	public static List queryUniversitarios(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryUniversitarios(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUniversitarios(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryUniversitarios(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Universitarios[] listUniversitariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listUniversitariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Universitarios[] listUniversitariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listUniversitariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUniversitarios(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Universitarios as Universitarios");
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
	
	public static List queryUniversitarios(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Universitarios as Universitarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Universitarios", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Universitarios[] listUniversitariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUniversitarios(session, condition, orderBy);
			return (Universitarios[]) list.toArray(new Universitarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Universitarios[] listUniversitariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUniversitarios(session, condition, orderBy, lockMode);
			return (Universitarios[]) list.toArray(new Universitarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Universitarios loadUniversitariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadUniversitariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Universitarios loadUniversitariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadUniversitariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Universitarios loadUniversitariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Universitarios[] universitarioses = listUniversitariosByQuery(session, condition, orderBy);
		if (universitarioses != null && universitarioses.length > 0)
			return universitarioses[0];
		else
			return null;
	}
	
	public static Universitarios loadUniversitariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Universitarios[] universitarioses = listUniversitariosByQuery(session, condition, orderBy, lockMode);
		if (universitarioses != null && universitarioses.length > 0)
			return universitarioses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUniversitariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateUniversitariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUniversitariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateUniversitariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUniversitariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Universitarios as Universitarios");
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
	
	public static java.util.Iterator iterateUniversitariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Universitarios as Universitarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Universitarios", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Universitarios createUniversitarios() {
		return new proyecto.Universitarios();
	}
	
	public static boolean save(proyecto.Universitarios universitarios) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(universitarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Universitarios universitarios) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(universitarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Universitarios universitarios)throws PersistentException {
		try {
			proyecto.Usuarios idusu = universitarios.getIdusu();
			if (universitarios.getIdusu() != null) {
				universitarios.getIdusu().setUniversitarios(null);
			}
			universitarios.setIdusu(idusu);
			
			proyecto.Programacion[] lProgramacions = universitarios.programacion.toArray();
			for(int i = 0; i < lProgramacions.length; i++) {
				lProgramacions[i].setIdusu(null);
			}
			return delete(universitarios);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Universitarios universitarios, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Usuarios idusu = universitarios.getIdusu();
			if (universitarios.getIdusu() != null) {
				universitarios.getIdusu().setUniversitarios(null);
			}
			universitarios.setIdusu(idusu);
			
			proyecto.Programacion[] lProgramacions = universitarios.programacion.toArray();
			for(int i = 0; i < lProgramacions.length; i++) {
				lProgramacions[i].setIdusu(null);
			}
			try {
				session.delete(universitarios);
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
	
	public static boolean refresh(proyecto.Universitarios universitarios) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(universitarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Universitarios universitarios) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(universitarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
