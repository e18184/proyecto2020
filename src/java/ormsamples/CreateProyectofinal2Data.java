/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateProyectofinal2Data {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = proyecto.Proyectofinal2PersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO proyecto.usuarios(idusu, nombre, apellido1, apellido2, sexo, f_nac, cedula, telefono, direccion, foto, activo) VALUES (1, 'Carlos', 'Perez', 'Cota', 'M', '24/09/2000', '4143805', '591673467', null, null, null)");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = proyecto.Proyectofinal2PersistentManager.instance().getSession().beginTransaction();
		try {
			proyecto.Carreras lproyectoCarreras = proyecto.CarrerasDAO.createCarreras();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : materias, activo, nombre
			proyecto.CarrerasDAO.save(lproyectoCarreras);
			proyecto.Datos lproyectoDatos = proyecto.DatosDAO.createDatos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activo, password, login
			proyecto.DatosDAO.save(lproyectoDatos);
			proyecto.Dicta lproyectoDicta = proyecto.DictaDAO.createDicta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : iddicta
			proyecto.DictaDAO.save(lproyectoDicta);
			proyecto.Docentes lproyectoDocentes = proyecto.DocentesDAO.createDocentes();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dicta, auxiliar
			proyecto.DocentesDAO.save(lproyectoDocentes);
			proyecto.Materias lproyectoMaterias = proyecto.MateriasDAO.createMaterias();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activo, periodo, plan, cargahoraria, nombre, sigla
			proyecto.MateriasDAO.save(lproyectoMaterias);
			proyecto.Menus lproyectoMenus = proyecto.MenusDAO.createMenus();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idpro, idrol, activo, nombre
			proyecto.MenusDAO.save(lproyectoMenus);
			proyecto.Procesos lproyectoProcesos = proyecto.ProcesosDAO.createProcesos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idmenu, enlace, nombre
			proyecto.ProcesosDAO.save(lproyectoProcesos);
			proyecto.Programacion lproyectoProgramacion = proyecto.ProgramacionDAO.createProgramacion();
			// Initialize the properties of the persistent object here
			proyecto.ProgramacionDAO.save(lproyectoProgramacion);
			proyecto.Roles lproyectoRoles = proyecto.RolesDAO.createRoles();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idmenu, idusu, activo, nombre
			proyecto.RolesDAO.save(lproyectoRoles);
			proyecto.Universitarios lproyectoUniversitarios = proyecto.UniversitariosDAO.createUniversitarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ru
			proyecto.UniversitariosDAO.save(lproyectoUniversitarios);
			proyecto.Usuarios lproyectoUsuarios = proyecto.UsuariosDAO.createUsuarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : universitarios, docentes, datos, idrol, activo, foto, cedula, f_nac, sexo, apellido1, nombre
			proyecto.UsuariosDAO.save(lproyectoUsuarios);
			proyecto.V_usuariorol lproyectoV_usuariorol = proyecto.V_usuariorolDAO.createV_usuariorol();
			// Initialize the properties of the persistent object here
			proyecto.V_usuariorolDAO.save(lproyectoV_usuariorol);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectofinal2Data createProyectofinal2Data = new CreateProyectofinal2Data();
			try {
				createProyectofinal2Data.createTestData();
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
