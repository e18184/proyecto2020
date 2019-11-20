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

public class DocentesDAO {
	public static List queryDocentes(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryDocentes(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocentes(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryDocentes(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Docentes[] listDocentesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listDocentesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Docentes[] listDocentesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listDocentesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocentes(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Docentes as Docentes");
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
	
	public static List queryDocentes(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Docentes as Docentes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Docentes", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Docentes[] listDocentesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDocentes(session, condition, orderBy);
			return (Docentes[]) list.toArray(new Docentes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Docentes[] listDocentesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDocentes(session, condition, orderBy, lockMode);
			return (Docentes[]) list.toArray(new Docentes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Docentes loadDocentesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDocentesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Docentes loadDocentesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadDocentesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Docentes loadDocentesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Docentes[] docenteses = listDocentesByQuery(session, condition, orderBy);
		if (docenteses != null && docenteses.length > 0)
			return docenteses[0];
		else
			return null;
	}
	
	public static Docentes loadDocentesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Docentes[] docenteses = listDocentesByQuery(session, condition, orderBy, lockMode);
		if (docenteses != null && docenteses.length > 0)
			return docenteses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDocentesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateDocentesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocentesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateDocentesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocentesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Docentes as Docentes");
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
	
	public static java.util.Iterator iterateDocentesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Docentes as Docentes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Docentes", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Docentes createDocentes() {
		return new proyecto.Docentes();
	}
	
	public static boolean save(proyecto.Docentes docentes) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(docentes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Docentes docentes) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(docentes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Docentes docentes)throws PersistentException {
		try {
			proyecto.Usuarios idusu = docentes.getIdusu();
			if (docentes.getIdusu() != null) {
				docentes.getIdusu().setDocentes(null);
			}
			docentes.setIdusu(idusu);
			
			proyecto.Dicta[] lDictas = docentes.dicta.toArray();
			for(int i = 0; i < lDictas.length; i++) {
				lDictas[i].setIdusu(null);
			}
			proyecto.Tribunal[] lTribunalss = docentes.tribunals.toArray();
			for(int i = 0; i < lTribunalss.length; i++) {
				lTribunalss[i].setDocentes(null);
			}
			proyecto.Proyectos[] lProyectoss = docentes.proyectos.toArray();
			for(int i = 0; i < lProyectoss.length; i++) {
				lProyectoss[i].setDocentesidusu(null);
			}
			return delete(docentes);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Docentes docentes, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Usuarios idusu = docentes.getIdusu();
			if (docentes.getIdusu() != null) {
				docentes.getIdusu().setDocentes(null);
			}
			docentes.setIdusu(idusu);
			
			proyecto.Dicta[] lDictas = docentes.dicta.toArray();
			for(int i = 0; i < lDictas.length; i++) {
				lDictas[i].setIdusu(null);
			}
			proyecto.Tribunal[] lTribunalss = docentes.tribunals.toArray();
			for(int i = 0; i < lTribunalss.length; i++) {
				lTribunalss[i].setDocentes(null);
			}
			proyecto.Proyectos[] lProyectoss = docentes.proyectos.toArray();
			for(int i = 0; i < lProyectoss.length; i++) {
				lProyectoss[i].setDocentesidusu(null);
			}
			try {
				session.delete(docentes);
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
	
	public static boolean refresh(proyecto.Docentes docentes) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(docentes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Docentes docentes) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(docentes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
