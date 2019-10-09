CREATE TABLE proyecto.carreras (idcarr serial NOT NULL, nombre varchar(40) NOT NULL, direccion varchar(60), telefono varchar(15), activo bool NOT NULL, CONSTRAINT carreras_pkey PRIMARY KEY (idcarr));
COMMENT ON TABLE proyecto.carreras IS 'Contiene las carreras registradas en el sistema';
COMMENT ON COLUMN proyecto.carreras.idcarr IS 'Identificador de la carrera';
COMMENT ON COLUMN proyecto.carreras.nombre IS 'Nombre de la carrera';
COMMENT ON COLUMN proyecto.carreras.direccion IS 'Dirección de la carrera';
COMMENT ON COLUMN proyecto.carreras.telefono IS 'Teléfono principal de la carrera';
COMMENT ON COLUMN proyecto.carreras.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.datos (idusu int4 NOT NULL, login varchar(15) NOT NULL, password varchar(100) NOT NULL, activo bool NOT NULL, CONSTRAINT datos_pkey PRIMARY KEY (idusu, login));
COMMENT ON TABLE proyecto.datos IS 'Login y contraseña de cada usuario registrado';
COMMENT ON COLUMN proyecto.datos.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.datos.login IS 'Nombre de acceso al sistema del usuario';
COMMENT ON COLUMN proyecto.datos.password IS 'Clave encriptada del usuario';
COMMENT ON COLUMN proyecto.datos.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.dicta (iddicta serial NOT NULL, idusu int4 NOT NULL, idcarr int4, sigla char(6), gestion char(4), materiasparalelo char(1), CONSTRAINT dicta_pkey PRIMARY KEY (iddicta, idusu));
COMMENT ON TABLE proyecto.dicta IS 'Asignación de materias a docentes';
COMMENT ON COLUMN proyecto.dicta.iddicta IS 'Identificador de la asignación de materias';
COMMENT ON COLUMN proyecto.dicta.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.dicta.idcarr IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN proyecto.dicta.sigla IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN proyecto.dicta.gestion IS 'Año que se dicta la materia';
CREATE TABLE proyecto.docentes (idusu int4 NOT NULL, auxiliar bool NOT NULL, CONSTRAINT docentes_pkey PRIMARY KEY (idusu));
COMMENT ON TABLE proyecto.docentes IS 'Tabla de los docentes';
COMMENT ON COLUMN proyecto.docentes.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.docentes.auxiliar IS 'true, auxiliar de cátedra; false, docente';
CREATE TABLE proyecto.grupo (idcarr int4 NOT NULL, sigla char(6) NOT NULL, paralelo char(1) NOT NULL, nombre varchar(40) NOT NULL, cargahoraria int2 NOT NULL, "plan" varchar(4) NOT NULL, periodo char(1) NOT NULL, activo bool NOT NULL, CONSTRAINT materias_pkey PRIMARY KEY (idcarr, sigla, paralelo));
COMMENT ON TABLE proyecto.grupo IS 'Contiene las materias registradas en el sistema';
COMMENT ON COLUMN proyecto.grupo.idcarr IS 'Identificador de la materia';
COMMENT ON COLUMN proyecto.grupo.sigla IS 'Sigla de la materia';
COMMENT ON COLUMN proyecto.grupo.paralelo IS 'Paralelo de la materia';
COMMENT ON COLUMN proyecto.grupo.nombre IS 'Nombre de la materia';
COMMENT ON COLUMN proyecto.grupo.cargahoraria IS 'Carga horaria (hrs/semana)';
COMMENT ON COLUMN proyecto.grupo."plan" IS 'Año del plan de estudios en vigencia';
COMMENT ON COLUMN proyecto.grupo.periodo IS '1, Primer semestre; 2, Segundo semestre; A, Anual; N, Nivelación; V, Verano';
COMMENT ON COLUMN proyecto.grupo.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.menus (idmenu serial NOT NULL, nombre varchar(40) NOT NULL, activo bool NOT NULL, descripcion varchar(255), CONSTRAINT menus_pkey PRIMARY KEY (idmenu));
COMMENT ON TABLE proyecto.menus IS 'Contiene los menús definidos en el sistema';
COMMENT ON COLUMN proyecto.menus.idmenu IS 'Identificador del menú';
COMMENT ON COLUMN proyecto.menus.nombre IS 'Nombre del menú';
COMMENT ON COLUMN proyecto.menus.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.mepro (idmenu int4 NOT NULL, idpro int4 NOT NULL, CONSTRAINT mepro_pkey PRIMARY KEY (idmenu, idpro));
COMMENT ON TABLE proyecto.mepro IS 'Relaciona las tablas Menus con Procesos';
COMMENT ON COLUMN proyecto.mepro.idmenu IS 'Identificador del menú';
COMMENT ON COLUMN proyecto.mepro.idpro IS 'Referencia a la tabla Procesos';
CREATE TABLE proyecto.procesos (idpro serial NOT NULL, nombre varchar(40) NOT NULL, enlace varchar(40) NOT NULL, descripcion varchar(60), CONSTRAINT procesos_pkey PRIMARY KEY (idpro));
COMMENT ON TABLE proyecto.procesos IS 'Contiene las URLs relativas de todos los procesos u operaciones implementadas, a los que los usuarios acceden desde el navegador.';
COMMENT ON COLUMN proyecto.procesos.idpro IS 'Identificador del proceso';
COMMENT ON COLUMN proyecto.procesos.nombre IS 'Nombre del proceso';
COMMENT ON COLUMN proyecto.procesos.enlace IS 'URL relativa del proceso';
COMMENT ON COLUMN proyecto.procesos.descripcion IS 'Descripción del proceso u operación';
CREATE TABLE proyecto.programacion (idprog serial NOT NULL, idusu int4, idcarr int4, sigla char(6), gestion char(4), materiasparalelo char(1), CONSTRAINT programacion_pkey PRIMARY KEY (idprog));
COMMENT ON TABLE proyecto.programacion IS 'Asignación de materias a estudiantes';
COMMENT ON COLUMN proyecto.programacion.idprog IS 'Identificador de la programación';
COMMENT ON COLUMN proyecto.programacion.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.programacion.idcarr IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN proyecto.programacion.sigla IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN proyecto.programacion.gestion IS 'Año que se dicta la materia';
CREATE TABLE proyecto.roles (idrol serial NOT NULL, nombre varchar(40) NOT NULL, activo bool NOT NULL, CONSTRAINT roles_pkey PRIMARY KEY (idrol));
COMMENT ON TABLE proyecto.roles IS 'Contiene los roles definidos en el sistema';
COMMENT ON COLUMN proyecto.roles.idrol IS 'Identificador del rol';
COMMENT ON COLUMN proyecto.roles.nombre IS 'Nombre del rol';
COMMENT ON COLUMN proyecto.roles.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.rolme (idrol int4 NOT NULL, idmenu int4 NOT NULL, CONSTRAINT rolme_pkey PRIMARY KEY (idrol, idmenu));
COMMENT ON TABLE proyecto.rolme IS 'Relaciona las tablas Menus con Procesos';
COMMENT ON COLUMN proyecto.rolme.idrol IS 'Referencia a la tabla Roles';
COMMENT ON COLUMN proyecto.rolme.idmenu IS 'Referencia a la tabla Menus';
CREATE TABLE proyecto.universitarios (idusu int4 NOT NULL, ru int4 NOT NULL, CONSTRAINT universitarios_pkey PRIMARY KEY (idusu));
COMMENT ON TABLE proyecto.universitarios IS 'Tabla de los Universitarios';
COMMENT ON COLUMN proyecto.universitarios.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.universitarios.ru IS 'Registro universitario';
CREATE TABLE proyecto.usuarios (idusu serial NOT NULL, nombre varchar(40) NOT NULL, apellido1 varchar(40) NOT NULL, apellido2 varchar(40), sexo char(1) NOT NULL, f_nac date NOT NULL, cedula varchar(15) NOT NULL, telefono varchar(15), direccion varchar(60), foto varchar(60) NOT NULL, activo bool NOT NULL, CONSTRAINT usuarios_pkey PRIMARY KEY (idusu));
COMMENT ON TABLE proyecto.usuarios IS 'Contiene los datos de los usuarios del sistema';
COMMENT ON COLUMN proyecto.usuarios.idusu IS 'Identificador del usuario';
COMMENT ON COLUMN proyecto.usuarios.nombre IS 'Nombre del usuario';
COMMENT ON COLUMN proyecto.usuarios.apellido1 IS 'Primer apellido';
COMMENT ON COLUMN proyecto.usuarios.apellido2 IS 'Segundo apellido';
COMMENT ON COLUMN proyecto.usuarios.sexo IS 'M, masculino; F, femenino';
COMMENT ON COLUMN proyecto.usuarios.f_nac IS 'Fecha de nacimiento';
COMMENT ON COLUMN proyecto.usuarios.cedula IS 'Número de identificación personal';
COMMENT ON COLUMN proyecto.usuarios.telefono IS 'Teléfono principal del usuario';
COMMENT ON COLUMN proyecto.usuarios.direccion IS 'Dirección del usuario';
COMMENT ON COLUMN proyecto.usuarios.foto IS 'Ruta relativa y nombre de archivo de la foto del usuario';
COMMENT ON COLUMN proyecto.usuarios.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.usurol (idusu int4 NOT NULL, idrol int4 NOT NULL, CONSTRAINT usurol_pkey PRIMARY KEY (idusu, idrol));
COMMENT ON TABLE proyecto.usurol IS 'Relaciona las tablas Usuarios con Roles';
COMMENT ON COLUMN proyecto.usurol.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.usurol.idrol IS 'Referencia a la tabla Roles';
create view v_usuariorol as  SELECT row_number() OVER () AS id,
    u.idusu,
    u.nombre AS unombre,
    u.apellido1,
    u.apellido2,
    r.nombre,
    d.login,
    d.password,
    d.activo
   FROM (proyecto.usuarios u
     JOIN proyecto.datos d ON ((u.idusu = d.idusu))),
    proyecto.usurol ur,
    proyecto.roles r
  WHERE ((u.idusu = ur.idusu) AND (ur.idrol = r.idrol));
ALTER TABLE proyecto.datos ADD CONSTRAINT fkdatos267216 FOREIGN KEY (idusu) REFERENCES proyecto.usuarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.dicta ADD CONSTRAINT fkdicta698426 FOREIGN KEY (idusu) REFERENCES proyecto.docentes (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.dicta ADD CONSTRAINT fkdicta501654 FOREIGN KEY (idcarr, sigla, materiasparalelo) REFERENCES proyecto.grupo (idcarr, sigla, paralelo) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.docentes ADD CONSTRAINT fkdocentes899557 FOREIGN KEY (idusu) REFERENCES proyecto.usuarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.grupo ADD CONSTRAINT fkmaterias750405 FOREIGN KEY (idcarr) REFERENCES proyecto.carreras (idcarr) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.mepro ADD CONSTRAINT fkmepro122433 FOREIGN KEY (idmenu) REFERENCES proyecto.menus (idmenu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.mepro ADD CONSTRAINT fkmepro242844 FOREIGN KEY (idpro) REFERENCES proyecto.procesos (idpro) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.programacion ADD CONSTRAINT fkprogramaci263409 FOREIGN KEY (idusu) REFERENCES proyecto.universitarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.programacion ADD CONSTRAINT fkprogramaci480900 FOREIGN KEY (idcarr, sigla, materiasparalelo) REFERENCES proyecto.grupo (idcarr, sigla, paralelo) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.rolme ADD CONSTRAINT fkrolme514925 FOREIGN KEY (idrol) REFERENCES proyecto.roles (idrol) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.rolme ADD CONSTRAINT fkrolme33944 FOREIGN KEY (idmenu) REFERENCES proyecto.menus (idmenu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.universitarios ADD CONSTRAINT fkuniversita443786 FOREIGN KEY (idusu) REFERENCES proyecto.usuarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.usurol ADD CONSTRAINT fkusurol643637 FOREIGN KEY (idusu) REFERENCES proyecto.usuarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.usurol ADD CONSTRAINT fkusurol734545 FOREIGN KEY (idrol) REFERENCES proyecto.roles (idrol) ON UPDATE No action ON DELETE No action;
INSERT INTO proyecto.usuarios(idusu, nombre, apellido1, apellido2, sexo, f_nac, cedula, telefono, direccion, foto, activo) VALUES (1, 'Carlos', 'Perez', 'Cota', 'M', '24/09/2000', '4143805', '591673467', null, null, null);
