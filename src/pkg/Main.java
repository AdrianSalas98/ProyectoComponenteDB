package pkg;

import componentDB.GestorDBBean;

public class Main {

	public static void main(String[] args) {
		GestorDBBean gdb = new GestorDBBean();

		gdb.conectarDB("test", "localhost", "root", "", "3306");

		gdb.queryConsulta("SELECT * FROM CLIENTES");

		gdb.queryInsert("INSERT INTO CLIENTES (usuario, password, cuentacorriente) "
				+ "VALUES ('Nach', '1234567890', 'ASE777')");

		gdb.queryDelete("DELETE FROM CLIENTES WHERE USUARIO = 'Nach'");

		gdb.queryStoreProcedure("CALL myProcedure");

		gdb.printarDatosConsulta("test", "SELECT");

		gdb.printarDatosConsulta("test", "root");

		gdb.printarDatosConsulta("test", "root", "INSERT");

		gdb.printarArrayList();

		gdb.desconectarDB();

		gdb.conectarDB("querys_en_general", "localhost", "root", "", "3306");

		gdb.queryConsulta("SELECT * FROM EMPLEADOS");

		gdb.queryInsert("INSERT INTO EMPLEADOS (id_empleado, nombre, id_jefe) "
				+ "VALUES ('5', 'Adrian', '2')");

		gdb.queryDelete("DELETE FROM EMPLEADOS WHERE NOMBRE = 'Adrian'");

		gdb.queryStoreProcedure("CALL rutinaEmpleados");

		gdb.printarDatosConsulta("test", "SELECT");

		gdb.printarDatosConsulta("test", "root");

		gdb.printarDatosConsulta("test", "root", "INSERT");

		gdb.printarArrayList();

		gdb.desconectarDB();

	}

}
