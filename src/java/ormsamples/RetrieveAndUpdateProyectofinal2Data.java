/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectofinal2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = proyecto.Proyectofinal2PersistentManager.instance().getSession().beginTransaction();
		try {
			proyecto.Carreras lproyectoCarreras = proyecto.CarrerasDAO.loadCarrerasByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.CarrerasDAO.save(lproyectoCarreras);
			proyecto.Datos lproyectoDatos = proyecto.DatosDAO.loadDatosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.DatosDAO.save(lproyectoDatos);
			proyecto.Dicta lproyectoDicta = proyecto.DictaDAO.loadDictaByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.DictaDAO.save(lproyectoDicta);
			proyecto.Docentes lproyectoDocentes = proyecto.DocentesDAO.loadDocentesByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.DocentesDAO.save(lproyectoDocentes);
			proyecto.Grupo lproyectoGrupo = proyecto.GrupoDAO.loadGrupoByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.GrupoDAO.save(lproyectoGrupo);
			proyecto.Menus lproyectoMenus = proyecto.MenusDAO.loadMenusByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.MenusDAO.save(lproyectoMenus);
			proyecto.Procesos lproyectoProcesos = proyecto.ProcesosDAO.loadProcesosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.ProcesosDAO.save(lproyectoProcesos);
			proyecto.Programacion lproyectoProgramacion = proyecto.ProgramacionDAO.loadProgramacionByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.ProgramacionDAO.save(lproyectoProgramacion);
			proyecto.Roles lproyectoRoles = proyecto.RolesDAO.loadRolesByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.RolesDAO.save(lproyectoRoles);
			proyecto.Universitarios lproyectoUniversitarios = proyecto.UniversitariosDAO.loadUniversitariosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.UniversitariosDAO.save(lproyectoUniversitarios);
			proyecto.Usuarios lproyectoUsuarios = proyecto.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.UsuariosDAO.save(lproyectoUsuarios);
			proyecto.V_usuariorol lproyectoV_usuariorol = proyecto.V_usuariorolDAO.loadV_usuariorolByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.V_usuariorolDAO.save(lproyectoV_usuariorol);
			proyecto.Proyectos lproyectoProyectos = proyecto.ProyectosDAO.loadProyectosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.ProyectosDAO.save(lproyectoProyectos);
			proyecto.Tribunal lproyectoTribunal = proyecto.TribunalDAO.loadTribunalByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.TribunalDAO.save(lproyectoTribunal);
			proyecto.Observaciones lproyectoObservaciones = proyecto.ObservacionesDAO.loadObservacionesByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.ObservacionesDAO.save(lproyectoObservaciones);
			proyecto.Etapas lproyectoEtapas = proyecto.EtapasDAO.loadEtapasByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.EtapasDAO.save(lproyectoEtapas);
			proyecto.Area lproyectoArea = proyecto.AreaDAO.loadAreaByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.AreaDAO.save(lproyectoArea);
			proyecto.Anuncios lproyectoAnuncios = proyecto.AnunciosDAO.loadAnunciosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.AnunciosDAO.save(lproyectoAnuncios);
			gestion2019.V_universitarios lgestion2019V_universitarios = gestion2019.V_universitariosDAO.loadV_universitariosByQuery(null, null);
			// Update the properties of the persistent object
			gestion2019.V_universitariosDAO.save(lgestion2019V_universitarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectofinal2Data retrieveAndUpdateProyectofinal2Data = new RetrieveAndUpdateProyectofinal2Data();
			try {
				retrieveAndUpdateProyectofinal2Data.retrieveAndUpdateTestData();
			}
			finally {
				proyecto.Proyectofinal2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
