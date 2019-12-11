package com.example.co;

    public class COMICDB extends SQLiteOpenHelper {
        /*public COMICDB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, "Prueba", factory, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table datos(nombre text,apellido text)");

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
        public String guardar (String nombre, String apellido){
            String mensaje = "";
            SQLiteDatabase database = this.getWritableDatabase();
            ContentValues contenedor = new ContentValues();
            contenedor.put("nombre", nombre);
            contenedor.put("apellido", apellido);

            try {
                database.insertOrThrow("datos",null, contenedor);
                mensaje = "Ingresado Correctamente";
            }catch (SQLException e){
                mensaje = "NO Ingresado";
            }

            return mensaje;
        }*/
}

        /* PARA LEER USUARIOS
        public ArrayList llenar_lv(){

            ArrayList<String> lista = new ArrayList<>();
            SQLiteDatabase database = this.getWritableDatabase();
            String q = "SELECT * FROM datos";
            Cursor registros = database.rawQuery(q, null);

            if (registros.moveToFirst()){
                do{
                    lista.add(registros.getString(0));
                    //lista.add();
                }while (registros.moveToNext());

            }
            return lista;
        }*/
