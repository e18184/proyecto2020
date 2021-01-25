/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListProyectofinal2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Carreras...");
		proyecto.Carreras[] proyectoCarrerases = proyecto.CarrerasDAO.listCarrerasByQuery(null, null);
		int length = Math.min(proyectoCarrerases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoCarrerases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Datos...");
		proyecto.Datos[] proyectoDatoses = proyecto.DatosDAO.listDatosByQuery(null, null);
		length = Math.min(proyectoDatoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoDatoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Dicta...");
		proyecto.Dicta[] proyectoDictas = proyecto.DictaDAO.listDictaByQuery(null, null);
		length = Math.min(proyectoDictas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoDictas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Docentes...");
		proyecto.Docentes[] proyectoDocenteses = proyecto.DocentesDAO.listDocentesByQuery(null, null);
		length = Math.min(proyectoDocenteses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoDocenteses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Grupo...");
		proyecto.Grupo[] proyectoGrupos = proyecto.GrupoDAO.listGrupoByQuery(null, null);
		length = Math.min(proyectoGrupos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoGrupos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Menus...");
		proyecto.Menus[] proyectoMenuses = proyecto.MenusDAO.listMenusByQuery(null, null);
		length = Math.min(proyectoMenuses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoMenuses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Procesos...");
		proyecto.Procesos[] proyectoProcesoses = proyecto.ProcesosDAO.listProcesosByQuery(null, null);
		length = Math.min(proyectoProcesoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoProcesoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Programacion...");
		proyecto.Programacion[] proyectoProgramacions = proyecto.ProgramacionDAO.listProgramacionByQuery(null, null);
		length = Math.min(proyectoProgramacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoProgramacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Roles...");
		proyecto.Roles[] proyectoRoleses = proyecto.RolesDAO.listRolesByQuery(null, null);
		length = Math.min(proyectoRoleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoRoleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Universitarios...");
		proyecto.Universitarios[] proyectoUniversitarioses = proyecto.UniversitariosDAO.listUniversitariosByQuery(null, null);
		length = Math.min(proyectoUniversitarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoUniversitarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuarios...");
		proyecto.Usuarios[] proyectoUsuarioses = proyecto.UsuariosDAO.listUsuariosByQuery(null, null);
		length = Math.min(proyectoUsuarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoUsuarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing V_usuariorol...");
		proyecto.V_usuariorol[] proyectoV_usuariorols = proyecto.V_usuariorolDAO.listV_usuariorolByQuery(null, null);
		length = Math.min(proyectoV_usuariorols.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoV_usuariorols[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Proyectos...");
		proyecto.Proyectos[] proyectoProyectoses = proyecto.ProyectosDAO.listProyectosByQuery(null, null);
		length = Math.min(proyectoProyectoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoProyectoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tribunal...");
		proyecto.Tribunal[] proyectoTribunals = proyecto.TribunalDAO.listTribunalByQuery(null, null);
		length = Math.min(proyectoTribunals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoTribunals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Observaciones...");
		proyecto.Observaciones[] proyectoObservacioneses = proyecto.ObservacionesDAO.listObservacionesByQuery(null, null);
		length = Math.min(proyectoObservacioneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoObservacioneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Etapas...");
		proyecto.Etapas[] proyectoEtapases = proyecto.EtapasDAO.listEtapasByQuery(null, null);
		length = Math.min(proyectoEtapases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoEtapases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Area...");
		proyecto.Area[] proyectoAreas = proyecto.AreaDAO.listAreaByQuery(null, null);
		length = Math.min(proyectoAreas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoAreas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Anuncios...");
		proyecto.Anuncios[] proyectoAnuncioses = proyecto.AnunciosDAO.listAnunciosByQuery(null, null);
		length = Math.min(proyectoAnuncioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoAnuncioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing V_universitarios...");
		gestion2019.V_universitarios[] gestion2019V_universitarioses = gestion2019.V_universitariosDAO.listV_universitariosByQuery(null, null);
		length = Math.min(gestion2019V_universitarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(gestion2019V_universitarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectofinal2Data listProyectofinal2Data = new ListProyectofinal2Data();
			try {
				listProyectofinal2Data.listTestData();
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
