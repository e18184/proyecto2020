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

public class GrupoDAO {
	public static Grupo loadGrupoByORMID(int id_grupo) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadGrupoByORMID(session, id_grupo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo getGrupoByORMID(int id_grupo) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getGrupoByORMID(session, id_grupo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByORMID(int id_grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadGrupoByORMID(session, id_grupo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo getGrupoByORMID(int id_grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getGrupoByORMID(session, id_grupo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByORMID(PersistentSession session, int id_grupo) throws PersistentException {
		try {
			return (Grupo) session.load(proyecto.Grupo.class, new Integer(id_grupo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo getGrupoByORMID(PersistentSession session, int id_grupo) throws PersistentException {
		try {
			return (Grupo) session.get(proyecto.Grupo.class, new Integer(id_grupo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByORMID(PersistentSession session, int id_grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grupo) session.load(proyecto.Grupo.class, new Integer(id_grupo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo getGrupoByORMID(PersistentSession session, int id_grupo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grupo) session.get(proyecto.Grupo.class, new Integer(id_grupo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryGrupo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryGrupo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo[] listGrupoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listGrupoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo[] listGrupoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listGrupoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Grupo as Grupo");
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
	
	public static List queryGrupo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Grupo as Grupo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo[] listGrupoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGrupo(session, condition, orderBy);
			return (Grupo[]) list.toArray(new Grupo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo[] listGrupoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGrupo(session, condition, orderBy, lockMode);
			return (Grupo[]) list.toArray(new Grupo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadGrupoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadGrupoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Grupo[] grupos = listGrupoByQuery(session, condition, orderBy);
		if (grupos != null && grupos.length > 0)
			return grupos[0];
		else
			return null;
	}
	
	public static Grupo loadGrupoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Grupo[] grupos = listGrupoByQuery(session, condition, orderBy, lockMode);
		if (grupos != null && grupos.length > 0)
			return grupos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGrupoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateGrupoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateGrupoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Grupo as Grupo");
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
	
	public static java.util.Iterator iterateGrupoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Grupo as Grupo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo createGrupo() {
		return new proyecto.Grupo();
	}
	
	public static boolean save(proyecto.Grupo grupo) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(grupo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Grupo grupo) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(grupo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Grupo grupo)throws PersistentException {
		try {
			if (grupo.getIdcarr() != null) {
				grupo.getIdcarr().materias.remove(grupo);
			}
			
			proyecto.Dicta[] lDictas = grupo.dicta.toArray();
			for(int i = 0; i < lDictas.length; i++) {
				lDictas[i].setIdcarr(null);
			}
			proyecto.Programacion[] lProgramacions = grupo.programacion.toArray();
			for(int i = 0; i < lProgramacions.length; i++) {
				lProgramacions[i].setIdcarr(null);
			}
			return delete(grupo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Grupo grupo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (grupo.getIdcarr() != null) {
				grupo.getIdcarr().materias.remove(grupo);
			}
			
			proyecto.Dicta[] lDictas = grupo.dicta.toArray();
			for(int i = 0; i < lDictas.length; i++) {
				lDictas[i].setIdcarr(null);
			}
			proyecto.Programacion[] lProgramacions = grupo.programacion.toArray();
			for(int i = 0; i < lProgramacions.length; i++) {
				lProgramacions[i].setIdcarr(null);
			}
			try {
				session.delete(grupo);
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
	
	public static boolean refresh(proyecto.Grupo grupo) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(grupo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Grupo grupo) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(grupo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
