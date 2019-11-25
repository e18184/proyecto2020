ALTER TABLE "gestion2019"."datos" DROP CONSTRAINT "fkdatos267216";
ALTER TABLE "gestion2019"."dicta" DROP CONSTRAINT "fkdicta698426";
ALTER TABLE "gestion2019"."dicta" DROP CONSTRAINT "fkdicta501654";
ALTER TABLE "gestion2019"."docentes" DROP CONSTRAINT "fkdocentes899557";
ALTER TABLE "gestion2019"."grupo" DROP CONSTRAINT "fkmaterias750405";
ALTER TABLE "gestion2019"."mepro" DROP CONSTRAINT "fkmepro122433";
ALTER TABLE "gestion2019"."mepro" DROP CONSTRAINT "fkmepro242844";
ALTER TABLE "gestion2019"."programacion" DROP CONSTRAINT "fkprogramaci263409";
ALTER TABLE "gestion2019"."programacion" DROP CONSTRAINT "fkprogramaci480900";
ALTER TABLE "gestion2019"."rolme" DROP CONSTRAINT "fkrolme514925";
ALTER TABLE "gestion2019"."rolme" DROP CONSTRAINT "fkrolme33944";
ALTER TABLE "gestion2019"."universitarios" DROP CONSTRAINT "fkuniversita443786";
ALTER TABLE "gestion2019"."usurol" DROP CONSTRAINT "fkusurol643637";
ALTER TABLE "gestion2019"."usurol" DROP CONSTRAINT "fkusurol734545";
ALTER TABLE "gestion2019"."Observaciones" DROP CONSTRAINT "obs";
ALTER TABLE "gestion2019"."Observaciones" DROP CONSTRAINT "FKObservacio695271";
ALTER TABLE "gestion2019"."Proyectos" DROP CONSTRAINT "FKProyectos61587";
ALTER TABLE "gestion2019"."Proyectos" DROP CONSTRAINT "programacionproyectos";
ALTER TABLE "gestion2019"."Proyectos" DROP CONSTRAINT "tutor";
ALTER TABLE "gestion2019"."Tribunal" DROP CONSTRAINT "Tribunal";
ALTER TABLE "gestion2019"."Tribunal" DROP CONSTRAINT "Tribunal2";
ALTER TABLE "gestion2019"."Proyectos" DROP CONSTRAINT "programa";
ALTER TABLE "gestion2019"."Anuncios" DROP CONSTRAINT "FKAnuncios346335";
DROP VIEW IF EXISTS "gestion2019"."v_usuariorol";
DROP TABLE IF EXISTS "gestion2019"."carreras" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."datos" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."dicta" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."docentes" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."grupo" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."menus" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."mepro" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."procesos" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."programacion" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."roles" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."rolme" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."universitarios" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."usuarios" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."usurol" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."Proyectos" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."Tribunal" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."Observaciones" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."Etapas" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."Area" CASCADE;
DROP TABLE IF EXISTS "gestion2019"."Anuncios" CASCADE;
CREATE TABLE "gestion2019"."carreras" (
  "idcarr"    serial NOT NULL, 
  "nombre"    varchar(40) NOT NULL, 
  "direccion" varchar(60), 
  "telefono"  varchar(15), 
  "activo"    bool NOT NULL, 
  CONSTRAINT "carreras_pkey" 
    PRIMARY KEY ("idcarr"));
COMMENT ON TABLE "gestion2019"."carreras" IS 'Contiene las carreras registradas en el sistema';
COMMENT ON COLUMN "gestion2019"."carreras"."idcarr" IS 'Identificador de la carrera';
COMMENT ON COLUMN "gestion2019"."carreras"."nombre" IS 'Nombre de la carrera';
COMMENT ON COLUMN "gestion2019"."carreras"."direccion" IS 'Dirección de la carrera';
COMMENT ON COLUMN "gestion2019"."carreras"."telefono" IS 'Teléfono principal de la carrera';
COMMENT ON COLUMN "gestion2019"."carreras"."activo" IS 'True, vigente. False, dado de baja';
CREATE TABLE "gestion2019"."datos" (
  "idusu"    int4 NOT NULL, 
  "login"    varchar(15) NOT NULL, 
  "password" varchar(100) NOT NULL, 
  "activo"   bool NOT NULL, 
  CONSTRAINT "datos_pkey" 
    PRIMARY KEY ("idusu", 
  "login"));
COMMENT ON TABLE "gestion2019"."datos" IS 'Login y contraseña de cada usuario registrado';
COMMENT ON COLUMN "gestion2019"."datos"."idusu" IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN "gestion2019"."datos"."login" IS 'Nombre de acceso al sistema del usuario';
COMMENT ON COLUMN "gestion2019"."datos"."password" IS 'Clave encriptada del usuario';
COMMENT ON COLUMN "gestion2019"."datos"."activo" IS 'True, vigente. False, dado de baja';
CREATE TABLE "gestion2019"."dicta" (
  "iddicta"       serial NOT NULL, 
  "idusu"         int4 NOT NULL, 
  "idcarr"        int4, 
  "sigla"         char(6), 
  "gestion"       char(4), 
  "grupoid_grupo" int4, 
  "Estado"        bool NOT NULL, 
  CONSTRAINT "dicta_pkey" 
    PRIMARY KEY ("iddicta", 
  "idusu"));
COMMENT ON TABLE "gestion2019"."dicta" IS 'Asignación de materias a docentes';
COMMENT ON COLUMN "gestion2019"."dicta"."iddicta" IS 'Identificador de la asignación de materias';
COMMENT ON COLUMN "gestion2019"."dicta"."idusu" IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN "gestion2019"."dicta"."idcarr" IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN "gestion2019"."dicta"."sigla" IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN "gestion2019"."dicta"."gestion" IS 'Año que se dicta la materia';
CREATE TABLE "gestion2019"."docentes" (
  "idusu"    int4 NOT NULL, 
  "auxiliar" bool NOT NULL, 
  CONSTRAINT "docentes_pkey" 
    PRIMARY KEY ("idusu"));
COMMENT ON TABLE "gestion2019"."docentes" IS 'Tabla de los docentes';
COMMENT ON COLUMN "gestion2019"."docentes"."idusu" IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN "gestion2019"."docentes"."auxiliar" IS 'true, auxiliar de cátedra; false, docente';
CREATE TABLE "gestion2019"."grupo" (
  "id_grupo"     SERIAL NOT NULL, 
  "idcarr"       int4 NOT NULL, 
  "sigla"        char(6) NOT NULL, 
  "nombre"       varchar(40) NOT NULL, 
  "cargahoraria" int2 NOT NULL, 
  "plan"         varchar(4) NOT NULL, 
  "periodo"      char(1) NOT NULL, 
  "activo"       bool NOT NULL, 
  "grupo"        varchar(10) NOT NULL, 
  CONSTRAINT "materias_pkey" 
    PRIMARY KEY ("id_grupo"));
COMMENT ON TABLE "gestion2019"."grupo" IS 'Contiene los grupo que tienen en el sistema';
COMMENT ON COLUMN "gestion2019"."grupo"."idcarr" IS 'Identificador de la grupo de la materia';
COMMENT ON COLUMN "gestion2019"."grupo"."sigla" IS 'Sigla de la materia';
COMMENT ON COLUMN "gestion2019"."grupo"."nombre" IS 'Nombre de la materia';
COMMENT ON COLUMN "gestion2019"."grupo"."cargahoraria" IS 'Carga horaria (hrs/semana)';
COMMENT ON COLUMN "gestion2019"."grupo"."plan" IS 'Anno del plan de estudios en vigencia';
COMMENT ON COLUMN "gestion2019"."grupo"."periodo" IS '1, Primer semestre; 2, Segundo semestre; A, Anual; N, Nivelación; V, Verano';
COMMENT ON COLUMN "gestion2019"."grupo"."activo" IS 'True, vigente. False, dado de baja';
CREATE TABLE "gestion2019"."menus" (
  "idmenu"      serial NOT NULL, 
  "nombre"      varchar(40) NOT NULL, 
  "activo"      bool NOT NULL, 
  "descripcion" varchar(255), 
  CONSTRAINT "menus_pkey" 
    PRIMARY KEY ("idmenu"));
COMMENT ON TABLE "gestion2019"."menus" IS 'Contiene los menús definidos en el sistema';
COMMENT ON COLUMN "gestion2019"."menus"."idmenu" IS 'Identificador del menú';
COMMENT ON COLUMN "gestion2019"."menus"."nombre" IS 'Nombre del menú';
COMMENT ON COLUMN "gestion2019"."menus"."activo" IS 'True, vigente. False, dado de baja';
CREATE TABLE "gestion2019"."mepro" (
  "idmenu" int4 NOT NULL, 
  "idpro"  int4 NOT NULL, 
  CONSTRAINT "mepro_pkey" 
    PRIMARY KEY ("idmenu", 
  "idpro"));
COMMENT ON TABLE "gestion2019"."mepro" IS 'Relaciona las tablas Menus con Procesos';
COMMENT ON COLUMN "gestion2019"."mepro"."idmenu" IS 'Identificador del menú';
COMMENT ON COLUMN "gestion2019"."mepro"."idpro" IS 'Referencia a la tabla Procesos';
CREATE TABLE "gestion2019"."procesos" (
  "idpro"       serial NOT NULL, 
  "nombre"      varchar(40) NOT NULL, 
  "enlace"      varchar(40) NOT NULL, 
  "descripcion" varchar(60), 
  CONSTRAINT "procesos_pkey" 
    PRIMARY KEY ("idpro"));
COMMENT ON TABLE "gestion2019"."procesos" IS 'Contiene las URLs relativas de todos los procesos u operaciones implementadas, a los que los usuarios acceden desde el navegador.';
COMMENT ON COLUMN "gestion2019"."procesos"."idpro" IS 'Identificador del proceso';
COMMENT ON COLUMN "gestion2019"."procesos"."nombre" IS 'Nombre del proceso';
COMMENT ON COLUMN "gestion2019"."procesos"."enlace" IS 'URL relativa del proceso';
COMMENT ON COLUMN "gestion2019"."procesos"."descripcion" IS 'Descripción del proceso u operación';
CREATE TABLE "gestion2019"."programacion" (
  "idprog"        serial NOT NULL, 
  "idusu"         int4, 
  "grupoid_grupo" int4, 
  "gestion"       char(4), 
  "Notafinal"     varchar(255), 
  "Estado"        bool NOT NULL, 
  CONSTRAINT "programacion_pkey" 
    PRIMARY KEY ("idprog"));
COMMENT ON TABLE "gestion2019"."programacion" IS 'Asignación de materias a estudiantes';
COMMENT ON COLUMN "gestion2019"."programacion"."idprog" IS 'Identificador de la programación';
COMMENT ON COLUMN "gestion2019"."programacion"."idusu" IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN "gestion2019"."programacion"."gestion" IS 'Año que se dicta la materia';
CREATE TABLE "gestion2019"."roles" (
  "idrol"  serial NOT NULL, 
  "nombre" varchar(40) NOT NULL, 
  "activo" bool NOT NULL, 
  CONSTRAINT "roles_pkey" 
    PRIMARY KEY ("idrol"));
COMMENT ON TABLE "gestion2019"."roles" IS 'Contiene los roles definidos en el sistema';
COMMENT ON COLUMN "gestion2019"."roles"."idrol" IS 'Identificador del rol';
COMMENT ON COLUMN "gestion2019"."roles"."nombre" IS 'Nombre del rol';
COMMENT ON COLUMN "gestion2019"."roles"."activo" IS 'True, vigente. False, dado de baja';
CREATE TABLE "gestion2019"."rolme" (
  "idrol"  int4 NOT NULL, 
  "idmenu" int4 NOT NULL, 
  CONSTRAINT "rolme_pkey" 
    PRIMARY KEY ("idrol", 
  "idmenu"));
COMMENT ON TABLE "gestion2019"."rolme" IS 'Relaciona las tablas Menus con Procesos';
COMMENT ON COLUMN "gestion2019"."rolme"."idrol" IS 'Referencia a la tabla Roles';
COMMENT ON COLUMN "gestion2019"."rolme"."idmenu" IS 'Referencia a la tabla Menus';
CREATE TABLE "gestion2019"."universitarios" (
  "idusu" int4 NOT NULL, 
  "ru"    int4 NOT NULL, 
  CONSTRAINT "universitarios_pkey" 
    PRIMARY KEY ("idusu"));
COMMENT ON TABLE "gestion2019"."universitarios" IS 'Tabla de los Universitarios';
COMMENT ON COLUMN "gestion2019"."universitarios"."idusu" IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN "gestion2019"."universitarios"."ru" IS 'Registro universitario';
CREATE TABLE "gestion2019"."usuarios" (
  "idusu"     serial NOT NULL, 
  "nombre"    varchar(40) NOT NULL, 
  "apellido1" varchar(40) NOT NULL, 
  "apellido2" varchar(40), 
  "sexo"      char(1) NOT NULL, 
  "f_nac"     date NOT NULL, 
  "cedula"    varchar(15) NOT NULL, 
  "telefono"  varchar(15), 
  "direccion" varchar(60), 
  "foto"      varchar(60) NOT NULL, 
  "activo"    bool NOT NULL, 
  CONSTRAINT "usuarios_pkey" 
    PRIMARY KEY ("idusu"));
COMMENT ON TABLE "gestion2019"."usuarios" IS 'Contiene los datos de los usuarios del sistema';
COMMENT ON COLUMN "gestion2019"."usuarios"."idusu" IS 'Identificador del usuario';
COMMENT ON COLUMN "gestion2019"."usuarios"."nombre" IS 'Nombre del usuario';
COMMENT ON COLUMN "gestion2019"."usuarios"."apellido1" IS 'Primer apellido';
COMMENT ON COLUMN "gestion2019"."usuarios"."apellido2" IS 'Segundo apellido';
COMMENT ON COLUMN "gestion2019"."usuarios"."sexo" IS 'M, masculino; F, femenino';
COMMENT ON COLUMN "gestion2019"."usuarios"."f_nac" IS 'Fecha de nacimiento';
COMMENT ON COLUMN "gestion2019"."usuarios"."cedula" IS 'Número de identificación personal';
COMMENT ON COLUMN "gestion2019"."usuarios"."telefono" IS 'Teléfono principal del usuario';
COMMENT ON COLUMN "gestion2019"."usuarios"."direccion" IS 'Dirección del usuario';
COMMENT ON COLUMN "gestion2019"."usuarios"."foto" IS 'Ruta relativa y nombre de archivo de la foto del usuario';
COMMENT ON COLUMN "gestion2019"."usuarios"."activo" IS 'True, vigente. False, dado de baja';
CREATE TABLE "gestion2019"."usurol" (
  "idusu" int4 NOT NULL, 
  "idrol" int4 NOT NULL, 
  CONSTRAINT "usurol_pkey" 
    PRIMARY KEY ("idusu", 
  "idrol"));
COMMENT ON TABLE "gestion2019"."usurol" IS 'Relaciona las tablas Usuarios con Roles';
COMMENT ON COLUMN "gestion2019"."usurol"."idusu" IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN "gestion2019"."usurol"."idrol" IS 'Referencia a la tabla Roles';
CREATE TABLE "gestion2019"."Proyectos" (
  "ID"                  varchar(255) NOT NULL, 
  "programacionidprog2" int4 NOT NULL, 
  "AreaID"              int4 NOT NULL, 
  "Nota"                int4 NOT NULL, 
  "Estado"              bool NOT NULL, 
  "Titulo"              varchar(255), 
  "Resumen"             varchar(255), 
  "Archivo"             varchar(255), 
  "programacionidprog"  int4 NOT NULL, 
  "docentesidusu"       int4 NOT NULL, 
  PRIMARY KEY ("ID"));
CREATE TABLE "gestion2019"."Tribunal" (
  "ID"            SERIAL NOT NULL, 
  "Memorandum"    varchar(255), 
  "ProyectosID"   varchar(255) NOT NULL, 
  "docentesidusu" int4 NOT NULL, 
  PRIMARY KEY ("ID"));
CREATE TABLE "gestion2019"."Observaciones" (
  "ID"            SERIAL NOT NULL, 
  "EtapasID"      int4 NOT NULL, 
  "TribunalID"    int4 NOT NULL, 
  "Fecha"         varchar(255), 
  "Archivo"       varchar(255), 
  "Observaciones" varchar(255), 
  PRIMARY KEY ("ID"));
CREATE TABLE "gestion2019"."Etapas" (
  "ID"     SERIAL NOT NULL, 
  "Nombre" varchar(255), 
  PRIMARY KEY ("ID"));
CREATE TABLE "gestion2019"."Area" (
  "ID"     SERIAL NOT NULL, 
  "Nombre" varchar(255), 
  PRIMARY KEY ("ID"));
CREATE TABLE "gestion2019"."Anuncios" (
  "ID"            SERIAL NOT NULL, 
  "usuariosidusu" int4 NOT NULL, 
  "Fecha"         varchar(255), 
  "Titulo"        varchar(255), 
  "Mensaje"       varchar(255), 
  "Estado"        bool NOT NULL, 
  "Archivo"       varchar(255), 
  PRIMARY KEY ("ID"));
create view gestion2019.v_usuariorol as  SELECT row_number() OVER () AS id,
    u.idusu,
    u.nombre AS unombre,
    u.apellido1,
    u.apellido2,
    r.nombre,
    d.login,
    d.password,
    d.activo
   FROM (gestion2019.usuarios u
     JOIN gestion2019.datos d ON ((u.idusu = d.idusu))),
    gestion2019.usurol ur,
    gestion2019.roles r
  WHERE ((u.idusu = ur.idusu) AND (ur.idrol = r.idrol));
ALTER TABLE "gestion2019"."datos" ADD CONSTRAINT "fkdatos267216" FOREIGN KEY ("idusu") REFERENCES "gestion2019"."usuarios" ("idusu") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."dicta" ADD CONSTRAINT "fkdicta698426" FOREIGN KEY ("idusu") REFERENCES "gestion2019"."docentes" ("idusu") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."dicta" ADD CONSTRAINT "fkdicta501654" FOREIGN KEY ("grupoid_grupo") REFERENCES "gestion2019"."grupo" ("id_grupo") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."docentes" ADD CONSTRAINT "fkdocentes899557" FOREIGN KEY ("idusu") REFERENCES "gestion2019"."usuarios" ("idusu") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."grupo" ADD CONSTRAINT "fkmaterias750405" FOREIGN KEY ("idcarr") REFERENCES "gestion2019"."carreras" ("idcarr") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."mepro" ADD CONSTRAINT "fkmepro122433" FOREIGN KEY ("idmenu") REFERENCES "gestion2019"."menus" ("idmenu") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."mepro" ADD CONSTRAINT "fkmepro242844" FOREIGN KEY ("idpro") REFERENCES "gestion2019"."procesos" ("idpro") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."programacion" ADD CONSTRAINT "fkprogramaci263409" FOREIGN KEY ("idusu") REFERENCES "gestion2019"."universitarios" ("idusu") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."programacion" ADD CONSTRAINT "fkprogramaci480900" FOREIGN KEY ("grupoid_grupo") REFERENCES "gestion2019"."grupo" ("id_grupo") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."rolme" ADD CONSTRAINT "fkrolme514925" FOREIGN KEY ("idrol") REFERENCES "gestion2019"."roles" ("idrol") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."rolme" ADD CONSTRAINT "fkrolme33944" FOREIGN KEY ("idmenu") REFERENCES "gestion2019"."menus" ("idmenu") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."universitarios" ADD CONSTRAINT "fkuniversita443786" FOREIGN KEY ("idusu") REFERENCES "gestion2019"."usuarios" ("idusu") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."usurol" ADD CONSTRAINT "fkusurol643637" FOREIGN KEY ("idusu") REFERENCES "gestion2019"."usuarios" ("idusu") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."usurol" ADD CONSTRAINT "fkusurol734545" FOREIGN KEY ("idrol") REFERENCES "gestion2019"."roles" ("idrol") ON UPDATE No action ON DELETE No action;
ALTER TABLE "gestion2019"."Observaciones" ADD CONSTRAINT "obs" FOREIGN KEY ("TribunalID") REFERENCES "gestion2019"."Tribunal" ("ID");
ALTER TABLE "gestion2019"."Observaciones" ADD CONSTRAINT "FKObservacio695271" FOREIGN KEY ("EtapasID") REFERENCES "gestion2019"."Etapas" ("ID");
ALTER TABLE "gestion2019"."Proyectos" ADD CONSTRAINT "FKProyectos61587" FOREIGN KEY ("AreaID") REFERENCES "gestion2019"."Area" ("ID");
ALTER TABLE "gestion2019"."Proyectos" ADD CONSTRAINT "programacionproyectos" FOREIGN KEY ("programacionidprog") REFERENCES "gestion2019"."programacion" ("idprog");
ALTER TABLE "gestion2019"."Proyectos" ADD CONSTRAINT "tutor" FOREIGN KEY ("docentesidusu") REFERENCES "gestion2019"."docentes" ("idusu");
ALTER TABLE "gestion2019"."Tribunal" ADD CONSTRAINT "Tribunal" FOREIGN KEY ("ProyectosID") REFERENCES "gestion2019"."Proyectos" ("ID");
ALTER TABLE "gestion2019"."Tribunal" ADD CONSTRAINT "Tribunal2" FOREIGN KEY ("docentesidusu") REFERENCES "gestion2019"."docentes" ("idusu");
ALTER TABLE "gestion2019"."Proyectos" ADD CONSTRAINT "programa" FOREIGN KEY ("programacionidprog2") REFERENCES "gestion2019"."programacion" ("idprog");
ALTER TABLE "gestion2019"."Anuncios" ADD CONSTRAINT "FKAnuncios346335" FOREIGN KEY ("usuariosidusu") REFERENCES "gestion2019"."usuarios" ("idusu");
INSERT INTO "gestion2019"."carreras"("idcarr", "nombre", "direccion", "telefono", "activo") VALUES (1, 'Informatica', 'campus tejar', '6640265', true);
INSERT INTO "gestion2019"."carreras"("idcarr", "nombre", "direccion", "telefono", "activo") VALUES (2, 'Civil', 'campus universitario', '6644444', true);
INSERT INTO "gestion2019"."usuarios"("idusu", "nombre", "apellido1", "apellido2", "sexo", "f_nac", "cedula", "telefono", "direccion", "foto", "activo") VALUES (1, 'Carlos', 'Perez', 'Cota', 'M', '09/24/2000', '4143805', '591673467', 'barrio moto mendez', 'sin foto', true);
INSERT INTO "gestion2019"."usuarios"("idusu", "nombre", "apellido1", "apellido2", "sexo", "f_nac", "cedula", "telefono", "direccion", "foto", "activo") VALUES (2, 'Richard Henry', 'Sivila', 'Rios', 'M', '09/24/1980', '4143506', '591673467', 'barrio aeropuerto', 'sin foto', true);
INSERT INTO "gestion2019"."usuarios"("idusu", "nombre", "apellido1", "apellido2", "sexo", "f_nac", "cedula", "telefono", "direccion", "foto", "activo") VALUES (3, 'Mariela', 'Fernandez', 'Perez', 'F', '08/30/1988', '4156789', '591567849', 'Barrio tablada', 'sin foto', false);
INSERT INTO "gestion2019"."usuarios"("idusu", "nombre", "apellido1", "apellido2", "sexo", "f_nac", "cedula", "telefono", "direccion", "foto", "activo") VALUES (4, 'Jose ', 'Perez', 'Rivera', 'M', '10/10/2000', '5034563', '591604265', 'Barrio Miraflores', 'sin foto', true);
INSERT INTO "gestion2019"."docentes"("idusu", "auxiliar") VALUES (3, true);
INSERT INTO "gestion2019"."docentes"("idusu", "auxiliar") VALUES (4, false);
INSERT INTO "gestion2019"."grupo"("idcarr", "sigla", "nombre", "cargahoraria", "plan", "periodo", "activo", "grupo") VALUES (1, 'inf102', 'informatica i', 6, '2016', '1', true, 'g1');
INSERT INTO "gestion2019"."grupo"("idcarr", "sigla", "nombre", "cargahoraria", "plan", "periodo", "activo", "grupo") VALUES (1, 'inf102', 'informatica i', 6, '2016', '1', true, 'g2');
INSERT INTO "gestion2019"."grupo"("idcarr", "sigla", "nombre", "cargahoraria", "plan", "periodo", "activo", "grupo") VALUES (2, 'civ101', 'proyectos', 4, '2012', '1', true, 'g1');
INSERT INTO "gestion2019"."grupo"("idcarr", "sigla", "nombre", "cargahoraria", "plan", "periodo", "activo", "grupo") VALUES (2, 'civ101', 'proyectos', 4, '2012', '1', true, 'g2');
INSERT INTO "gestion2019"."dicta"("iddicta", "idusu", "idcarr", "sigla", "gestion", "grupoid_grupo", "Estado") VALUES (1, 3, 1, 'inf102', '2019', 1, true);
INSERT INTO "gestion2019"."dicta"("iddicta", "idusu", "idcarr", "sigla", "gestion", "grupoid_grupo", "Estado") VALUES (2, 3, 1, 'civ101', '2019', 3, true);
INSERT INTO "gestion2019"."menus"("idmenu", "nombre", "activo", "descripcion") VALUES (1, 'anuncios', true, 'opciones de anuncios');
INSERT INTO "gestion2019"."procesos"("idpro", "nombre", "enlace", "descripcion") VALUES (1, 'realiza anuncio', 'ianuncio.htm', 'inserta un anuncio');
INSERT INTO "gestion2019"."mepro"("idmenu", "idpro") VALUES (1, 1);
INSERT INTO "gestion2019"."universitarios"("idusu", "ru") VALUES (1, 4143);
INSERT INTO "gestion2019"."universitarios"("idusu", "ru") VALUES (2, 4145);
INSERT INTO "gestion2019"."roles"("idrol", "nombre", "activo") VALUES (1, 'docente', true);
INSERT INTO "gestion2019"."roles"("idrol", "nombre", "activo") VALUES (2, 'estudiante', true);
INSERT INTO "gestion2019"."rolme"("idrol", "idmenu") VALUES (1, 1);
INSERT INTO "gestion2019"."programacion"("idprog", "idusu", "grupoid_grupo", "gestion", "Notafinal", "Estado") VALUES (1, 1, 1, '2019', '80', true);
INSERT INTO "gestion2019"."programacion"("idprog", "idusu", "grupoid_grupo", "gestion", "Notafinal", "Estado") VALUES (2, 2, 2, '2019', '70', true);
INSERT INTO "gestion2019"."datos"("idusu", "login", "password", "activo") VALUES (1, 'carlos', 'perez', true);
INSERT INTO "gestion2019"."datos"("idusu", "login", "password", "activo") VALUES (2, 'richard', 'sivila', true);
INSERT INTO "gestion2019"."usurol"("idusu", "idrol") VALUES (1, 1);
INSERT INTO "gestion2019"."usurol"("idusu", "idrol") VALUES (1, 2);
INSERT INTO "gestion2019"."usurol"("idusu", "idrol") VALUES (2, 1);
