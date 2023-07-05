import java.util.concurrent.Callable;

public class MultiThreading implements Callable<Double> {

    Array arrayValores;

    public MultiThreading(Array arrayValores){
        this.arrayValores = arrayValores;
    }

    public Double call(){
        arrayValores.result = 0.0;
        for(int i = 0; i < arrayValores.listaValores.size(); i++){
            arrayValores.result += arrayValores.listaValores.get(i);
        }
        /* calcula a media */
        arrayValores.result = arrayValores.result / arrayValores.listaValores.size();
        return arrayValores.result;
    }

}
