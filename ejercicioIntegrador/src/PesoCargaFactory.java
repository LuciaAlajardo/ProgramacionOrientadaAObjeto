public class PesoCargaFactory {
  private static PesoCargaFactory instance;

  private PesoCargaFactory(){

  }
  public static PesoCargaFactory getInstance(){
   if(instance == null){
       instance = new PesoCargaFactory();
   }
   return instance;
  }

  public PesoCarga crearCarga(String codigo){
      switch (codigo){
          case "uno" :
              return new CargaSimple("TV 32’ LCD","lalal",3.0,false);
          case "dos" :
              return new CargaSimple(" caja de medicamentos","bla",2.0,true);
          case "tres" :
              CargaContenedor cargaContenedor = new CargaContenedor("nose","lele",100.0);
              cargaContenedor.agregarCarga(crearCarga("uno"));
              cargaContenedor.agregarCarga(crearCarga("dos"));
              return cargaContenedor;

      }return null;
  }
}
