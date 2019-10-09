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

public class MateriasDAO {
	public static Materias loadMateriasByORMID(proyecto.Carreras idcarr, String sigla, char paralelo) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadMateriasByORMID(session, idcarr, sigla, paralelo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias getMateriasByORMID(proyecto.Carreras idcarr, String sigla, char paralelo) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getMateriasByORMID(session, idcarr, sigla, paralelo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias loadMateriasByORMID(proyecto.Carreras idcarr, String sigla, char paralelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadMateriasByORMID(session, idcarr, sigla, paralelo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias getMateriasByORMID(proyecto.Carreras idcarr, String sigla, char paralelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getMateriasByORMID(session, idcarr, sigla, paralelo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias loadMateriasByORMID(PersistentSession session, proyecto.Carreras idcarr, String sigla, char paralelo) throws PersistentException {
		try {
			Materias materias = new proyecto.Materias();
			materias.setORM_Idcarr(idcarr);
			materias.setSigla(sigla);
			materias.setParalelo(paralelo);
			
			return (Materias) session.load(proyecto.Materias.class, materias);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias getMateriasByORMID(PersistentSession session, proyecto.Carreras idcarr, String sigla, char paralelo) throws PersistentException {
		try {
			Materias materias = new proyecto.Materias();
			materias.setORM_Idcarr(idcarr);
			materias.setSigla(sigla);
			materias.setParalelo(paralelo);
			
			return (Materias) session.get(proyecto.Materias.class, materias);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias loadMateriasByORMID(PersistentSession session, proyecto.Carreras idcarr, String sigla, char paralelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Materias materias = new proyecto.Materias();
			materias.setORM_Idcarr(idcarr);
			materias.setSigla(sigla);
			materias.setParalelo(paralelo);
			
			return (Materias) session.load(proyecto.Materias.class, materias, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias getMateriasByORMID(PersistentSession session, proyecto.Carreras idcarr, String sigla, char paralelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Materias materias = new proyecto.Materias();
			materias.setORM_Idcarr(idcarr);
			materias.setSigla(sigla);
			materias.setParalelo(paralelo);
			
			return (Materias) session.get(proyecto.Materias.class, materias, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterias(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryMaterias(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterias(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryMaterias(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias[] listMateriasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listMateriasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias[] listMateriasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listMateriasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterias(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Materias as Materias");
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
	
	public static List queryMaterias(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Materias as Materias");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Materias", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias[] listMateriasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMaterias(session, condition, orderBy);
			return (Materias[]) list.toArray(new Materias[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias[] listMateriasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMaterias(session, condition, orderBy, lockMode);
			return (Materias[]) list.toArray(new Materias[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias loadMateriasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadMateriasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias loadMateriasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadMateriasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias loadMateriasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Materias[] materiases = listMateriasByQuery(session, condition, orderBy);
		if (materiases != null && materiases.length > 0)
			return materiases[0];
		else
			return null;
	}
	
	public static Materias loadMateriasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Materias[] materiases = listMateriasByQuery(session, condition, orderBy, lockMode);
		if (materiases != null && materiases.length > 0)
			return materiases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMateriasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateMateriasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMateriasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateMateriasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMateriasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Materias as Materias");
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
	
	public static java.util.Iterator iterateMateriasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Materias as Materias");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Materias", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materias createMaterias() {
		return new proyecto.Materias();
	}
	
	public static boolean save(proyecto.Materias materias) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(materias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Materias materias) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(materias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Materias materias)throws PersistentException {
		try {
			proyecto.Carreras idcarr = materias.getIdcarr();
			if (materias.getIdcarr() != null) {
				materias.getIdcarr().materias.remove(materias);
			}
			materias.setORM_Idcarr(idcarr);
			
			proyecto.Dicta[] lDictas = materias.dicta.toArray();
			for(int i = 0; i < lDictas.length; i++) {
				lDictas[i].setIdcarr(null);
			}
			proyecto.Programacion[] lProgramacions = materias.programacion.toArray();
			for(int i = 0; i < lProgramacions.length; i++) {
				lProgramacions[i].setIdcarr(null);
			}
			return delete(materias);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Materias materias, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Carreras idcarr = materias.getIdcarr();
			if (materias.getIdcarr() != null) {
				materias.getIdcarr().materias.remove(materias);
			}
			materias.setORM_Idcarr(idcarr);
			
			proyecto.Dicta[] lDictas = materias.dicta.toArray();
			for(int i = 0; i < lDictas.length; i++) {
				lDictas[i].setIdcarr(null);
			}
			proyecto.Programacion[] lProgramacions = materias.programacion.toArray();
			for(int i = 0; i < lProgramacions.length; i++) {
				lProgramacions[i].setIdcarr(null);
			}
			try {
				session.delete(materias);
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
	
	public static boolean refresh(proyecto.Materias materias) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(materias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Materias materias) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(materias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
