package uni.aed.directorio;
import uni.aed.model.Persona;
import uni.aed.ordenamiento.SortObjectPerson;

public class DirectorioV1 implements Directorio{
    private static final int DEFAULT_SIZE=25;    
    
    // Es un arreglo de objetos de tipo Personaque se utilizará para 
    //almacenar las entradas del directorio.
    private Persona[] entry;  
    
    //count: Es una variable entera que lleva la cuenta de 
    //cuántas personas se han agregado al directorio.
    private int count;

    
    //Este constructor sin argumentos llama al constructor con un argumento this(DEFAULT_SIZE)para 
    //inicializar el directorio con el tamaño predeterminado.
    public DirectorioV1() {
        this(DEFAULT_SIZE);        
    }
    
    //DirectorioV1(int size): Este constructor permite inicializar el directorio con 
    //un tamaño específico, y también verifica si el tamaño proporcionado es válido 
    //(mayor que cero). Lanza una excepción IllegalArgumentExceptionsi el tamaño es inválido.
    
    public DirectorioV1(int size) {
        count=0;
        //size es tamaño
        if(size<=0){
            throw new IllegalArgumentException("Tamaño debe ser positivo");
        }
        //entry =entrada
        entry=new Persona[size];
    }
    
    //MétodogetEntry() : Este método permite obtener el arreglo de personas ( entry) y 
    //se utiliza para acceder a las entradas del directorio desde fuera de la clase.
    public Persona[] getEntry() {
        return entry;
    }
    
    
    //Métodoadd(Persona newPersona) : Este método se implementa de acuerdo con la interfaz 
    //Directorio. Agrega una nueva persona al directorio. Si el número de personas en el directorio 
    //( count) alcanza el tamaño máximo del arreglo, se llama al método enlarge()para aumentar 
    //el tamaño del arreglo y luego se agrega la nueva persona.
    @Override
    public void add(Persona newPersona) {
        if(count==entry.length)
            enlarge();
        entry[count]=newPersona;
        count++;
    }

    @Override
    
    
    //public Persona[] sort(int attribute, String algoritmo): Este es el encabezado del método. Indica que
    //el método se llama sort, recibe dos argumentos: attribute(un número entero) y algoritmo(una 
    //cadena de texto), y devuelve un arreglo de objetos Persona. Este método se utiliza para ordenar 
    //un arreglo de personas en función de un atributo y un algoritmo de ordenamiento.
    public Persona[] sort(int attribute, String algoritmo) {
        
        
        //if (!(attribute == Persona.NAME || attribute == Persona.AGE)) { throw new IllegalArgumentException(); }: 
        //Esta línea verifica si el valor de attributees igual a Persona.NAMEo Persona.AGE. Si no es ninguno de 
        //estos dos valores, lanza una excepción IllegalArgumentException, que es una forma de indicar que se 
        //proporcionó un valor incorrecto para el atributo.
        if(!(attribute==Persona.NAME || attribute==Persona.AGE))
            throw new IllegalArgumentException();
        
        //Persona[] sortedList = new Persona[count];: Se creará un nuevo arreglo llamado sortedListque se utilizará para 
        //almacenar las personas ordenadas. El tamaño del nuevo arreglo es igual a la cantidad de personas en el 
        //directorio, que se almacena en la variable count.
        Persona[] sortedList=new Persona[count];
        
        //El siguiente bucle forcopia las personas del arreglo original entryal nuevo arreglo sortedList. 
        //Esto se hace para que podamos ordenar sortedListsin afectar el arreglo original.
        for(int i=0;i< count;i++)
            sortedList[i]=entry[i];        
        
        //SortObjectPerson o = new SortObjectPerson();: Se crea una instancia de la clase SortObjectPerson. Esta instancia 
        //se utilizará para invocar el método de ordenamiento adecuado más adelante.
        SortObjectPerson o = new SortObjectPerson();
        
        
        //convierte la cadena algoritmoa letras mayúsculas (usando el método toUpperCase()), lo que significa que el 
        //valor de algoritmose tratará en mayúsculas. 
        switch(algoritmo.toUpperCase()){
            case "BURBUJA"->{
                
                //El metodo Burbuja()se llama consortedList, que es un arreglo que se desea ordenar, yattribute, que 
                //es un número entero que indica el atributo por el cual se desea realizar el ordenamiento.
                o.Burbuja(sortedList, attribute);
            }
        }
        
        //Finalmente, el arreglo sortedListque ahora está ordenado, se devuelve como resultado del método.
        return sortedList;
    }
    
    //Métodoenlarge() : Este método privado se utiliza para aumentar el 
    //tamaño del arreglo entrycuando se alcanza su capacidad máxima. Duplica el tamaño 
    //del arreglo y copia las entradas existentes al nuevo arreglo.
    private void enlarge(){
        int newLenght=(int)(1.5*entry.length);
        Persona[] temp=new Persona[newLenght];
        for(int i=0;i<entry.length;i++)
            temp[i]=entry[i];
        entry=temp;
    }
    
}
