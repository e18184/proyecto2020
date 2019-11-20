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

public class UsuariosDAO {
	public static Usuarios loadUsuariosByORMID(int idusu) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadUsuariosByORMID(session, idusu);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios getUsuariosByORMID(int idusu) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getUsuariosByORMID(session, idusu);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByORMID(int idusu, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadUsuariosByORMID(session, idusu, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios getUsuariosByORMID(int idusu, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getUsuariosByORMID(session, idusu, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByORMID(PersistentSession session, int idusu) throws PersistentException {
		try {
			return (Usuarios) session.load(proyecto.Usuarios.class, new Integer(idusu));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios getUsuariosByORMID(PersistentSession session, int idusu) throws PersistentException {
		try {
			return (Usuarios) session.get(proyecto.Usuarios.class, new Integer(idusu));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByORMID(PersistentSession session, int idusu, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuarios) session.load(proyecto.Usuarios.class, new Integer(idusu), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios getUsuariosByORMID(PersistentSession session, int idusu, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuarios) session.get(proyecto.Usuarios.class, new Integer(idusu), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarios(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryUsuarios(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarios(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryUsuarios(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarios(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Usuarios as Usuarios");
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
	
	public static List queryUsuarios(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Usuarios as Usuarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuarios", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarios(session, condition, orderBy);
			return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarios(session, condition, orderBy, lockMode);
			return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios loadUsuariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuarios[] usuarioses = listUsuariosByQuery(session, condition, orderBy);
		if (usuarioses != null && usuarioses.length > 0)
			return usuarioses[0];
		else
			return null;
	}
	
	public static Usuarios loadUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuarios[] usuarioses = listUsuariosByQuery(session, condition, orderBy, lockMode);
		if (usuarioses != null && usuarioses.length > 0)
			return usuarioses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Usuarios as Usuarios");
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
	
	public static java.util.Iterator iterateUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Usuarios as Usuarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuarios", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuarios createUsuarios() {
		return new proyecto.Usuarios();
	}
	
	public static boolean save(proyecto.Usuarios usuarios) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(usuarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Usuarios usuarios) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(usuarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Usuarios usuarios)throws PersistentException {
		try {
			proyecto.Roles[] lIdrols = usuarios.idrol.toArray();
			for(int i = 0; i < lIdrols.length; i++) {
				lIdrols[i].idusu.remove(usuarios);
			}
			proyecto.Datos[] lDatoss = usuarios.datos.toArray();
			for(int i = 0; i < lDatoss.length; i++) {
				lDatoss[i].setIdusu(null);
			}
			if (usuarios.getDocentes() != null) {
				usuarios.getDocentes().setIdusu(null);
			}
			
			if (usuarios.getUniversitarios() != null) {
				usuarios.getUniversitarios().setIdusu(null);
			}
			
			proyecto.Anuncios[] lAnunciosess = usuarios.anuncioses.toArray();
			for(int i = 0; i < lAnunciosess.length; i++) {
				lAnunciosess[i].setUsuarios(null);
			}
			return delete(usuarios);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Usuarios usuarios, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Roles[] lIdrols = usuarios.idrol.toArray();
			for(int i = 0; i < lIdrols.length; i++) {
				lIdrols[i].idusu.remove(usuarios);
			}
			proyecto.Datos[] lDatoss = usuarios.datos.toArray();
			for(int i = 0; i < lDatoss.length; i++) {
				lDatoss[i].setIdusu(null);
			}
			if (usuarios.getDocentes() != null) {
				usuarios.getDocentes().setIdusu(null);
			}
			
			if (usuarios.getUniversitarios() != null) {
				usuarios.getUniversitarios().setIdusu(null);
			}
			
			proyecto.Anuncios[] lAnunciosess = usuarios.anuncioses.toArray();
			for(int i = 0; i < lAnunciosess.length; i++) {
				lAnunciosess[i].setUsuarios(null);
			}
			try {
				session.delete(usuarios);
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
	
	public static boolean refresh(proyecto.Usuarios usuarios) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(usuarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Usuarios usuarios) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(usuarios);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
