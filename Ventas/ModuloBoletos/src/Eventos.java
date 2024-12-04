import java.util.ArrayList;

public class Eventos {
    private ArrayList<ListaEventos> funciones;

    public Eventos(){
        this.funciones = new ArrayList<>();
        for (ListaEventos tipo: ListaEventos.values()){
            funciones.add(tipo);
        }
    }

    public ArrayList<ListaEventos> getFunciones() {
        return funciones;
    }

    public void verFunciones() {
        if(funciones.isEmpty()){
            System.out.println("Lo sentimos no existen funciones por el momento");
        }else{
            for(int i=0;i< funciones.size();i++){
                System.out.println((i+1)+" , "+ funciones.get(i));
            }
        }

    }
}
