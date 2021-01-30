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

public class DictaDAO {
	public static Dicta loadDictaByORMID(int iddicta, proyecto.Docentes idusu) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDictaByORMID(session, iddicta, idusu);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta getDictaByORMID(int iddicta, proyecto.Docentes idusu) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getDictaByORMID(session, iddicta, idusu);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta loadDictaByORMID(int iddicta, proyecto.Docentes idusu, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDictaByORMID(session, iddicta, idusu, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta getDictaByORMID(int iddicta, proyecto.Docentes idusu, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getDictaByORMID(session, iddicta, idusu, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta loadDictaByORMID(PersistentSession session, int iddicta, proyecto.Docentes idusu) throws PersistentException {
		try {
			Dicta dicta = new proyecto.Dicta();
			dicta.setIddicta(iddicta);
			dicta.setORM_Idusu(idusu);
			
			return (Dicta) session.load(proyecto.Dicta.class, dicta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta getDictaByORMID(PersistentSession session, int iddicta, proyecto.Docentes idusu) throws PersistentException {
		try {
			Dicta dicta = new proyecto.Dicta();
			dicta.setIddicta(iddicta);
			dicta.setORM_Idusu(idusu);
			
			return (Dicta) session.get(proyecto.Dicta.class, dicta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta loadDictaByORMID(PersistentSession session, int iddicta, proyecto.Docentes idusu, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Dicta dicta = new proyecto.Dicta();
			dicta.setIddicta(iddicta);
			dicta.setORM_Idusu(idusu);
			
			return (Dicta) session.load(proyecto.Dicta.class, dicta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta getDictaByORMID(PersistentSession session, int iddicta, proyecto.Docentes idusu, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Dicta dicta = new proyecto.Dicta();
			dicta.setIddicta(iddicta);
			dicta.setORM_Idusu(idusu);
			
			return (Dicta) session.get(proyecto.Dicta.class, dicta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDicta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryDicta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDicta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryDicta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta[] listDictaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listDictaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta[] listDictaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listDictaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDicta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Dicta as Dicta");
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
	
	public static List queryDicta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Dicta as Dicta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Dicta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta[] listDictaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDicta(session, condition, orderBy);
			return (Dicta[]) list.toArray(new Dicta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta[] listDictaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDicta(session, condition, orderBy, lockMode);
			return (Dicta[]) list.toArray(new Dicta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta loadDictaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDictaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta loadDictaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDictaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta loadDictaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Dicta[] dictas = listDictaByQuery(session, condition, orderBy);
		if (dictas != null && dictas.length > 0)
			return dictas[0];
		else
			return null;
	}
	
	public static Dicta loadDictaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Dicta[] dictas = listDictaByQuery(session, condition, orderBy, lockMode);
		if (dictas != null && dictas.length > 0)
			return dictas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDictaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateDictaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDictaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateDictaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDictaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Dicta as Dicta");
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
	
	public static java.util.Iterator iterateDictaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Dicta as Dicta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Dicta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dicta createDicta() {
		return new proyecto.Dicta();
	}
	
	public static boolean save(proyecto.Dicta dicta) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(dicta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Dicta dicta) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(dicta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Dicta dicta)throws PersistentException {
		try {
			proyecto.Docentes idusu = dicta.getIdusu();
			if (dicta.getIdusu() != null) {
				dicta.getIdusu().dicta.remove(dicta);
			}
			dicta.setORM_Idusu(idusu);
			
			if (dicta.getIdcarr() != null) {
				dicta.getIdcarr().dicta.remove(dicta);
			}
			
			return delete(dicta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Dicta dicta, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Docentes idusu = dicta.getIdusu();
			if (dicta.getIdusu() != null) {
				dicta.getIdusu().dicta.remove(dicta);
			}
			dicta.setORM_Idusu(idusu);
			
			if (dicta.getIdcarr() != null) {
				dicta.getIdcarr().dicta.remove(dicta);
			}
			
			try {
				session.delete(dicta);
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
	
	public static boolean refresh(proyecto.Dicta dicta) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(dicta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Dicta dicta) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(dicta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
