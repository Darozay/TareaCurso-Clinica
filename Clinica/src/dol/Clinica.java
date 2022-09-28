package dol;

import static misc.Condicional.Ordenador;
import misc.Servicio;

public class Clinica {
    
    private final Servicio[] pediatra=new Servicio[5];
    private final Servicio[] gineco=new Servicio[6];
    private final Servicio[] cardio=new Servicio[5];
    private final Servicio[] derma=new Servicio[7];
    private final Servicio[] gastro=new Servicio[5];
    private final Servicio[] neuro=new Servicio[7];
    private final Servicio[] radio=new Servicio[6];
    
    public Clinica(){
        pediatra[0]=new Servicio("1. Consulta externa",Doctores.Alberto,40);
        pediatra[1]=new Servicio("2. Atencion medica sobre el desarrollo y crecimiento del menor",Doctores.Alberto,30);
        pediatra[2]=new Servicio("3. Orientacion alimenticia a los niños",Doctores.Alberto,30);
        pediatra[3]=new Servicio("4. Seguimiento de la salud mental de un menor",Doctores.Alberto,30);
        pediatra[4]=new Servicio("5. Diagnostico medico",Doctores.Alberto,30);
        
        gineco[0]=new Servicio("1. Consulta externa",Doctores.Dilan,40);
        gineco[1]=new Servicio("2. Ecografia",Doctores.Dilan,110);
        gineco[2]=new Servicio("3. Servicio obstetricia",Doctores.Dilan,30);
        gineco[3]=new Servicio("4. Servicio de ginecologia",Doctores.Dilan,160);
        gineco[4]=new Servicio("5. Consulta ginecologa",Doctores.Dilan,20);
        gineco[5]=new Servicio("6. Planificacion familiar",Doctores.Dilan,60);
        
        cardio[0]=new Servicio("1. Consulta externa",Doctores.Jose,40);
        cardio[1]=new Servicio("2. Cuidado preventivo",Doctores.Jose,163);
        cardio[2]=new Servicio("3. Seguimiento a embarazadas y bebes",Doctores.Jose,50);
        cardio[3]=new Servicio("4. Orientacion medica",Doctores.Jose,30);
        cardio[4]=new Servicio("5. Electrocardiograma",Doctores.Jose,100);
        
        derma[0]=new Servicio("1. Consulta externa",Doctores.Pablo,40);
        derma[1]=new Servicio("2. Dermatologia ginecologica",Doctores.Pablo,150);
        derma[2]=new Servicio("3. Dermatologia oncologica",Doctores.Pablo,102);
        derma[3]=new Servicio("4. Anestesiologia",Doctores.Pablo,50);
        derma[4]=new Servicio("5. Dermatologia cosmetica",Doctores.Pablo,150);
        derma[5]=new Servicio("6. Dermatologia quirurgica",Doctores.Pablo,180);
        derma[6]=new Servicio("7. Dermatologia medica",Doctores.Pablo,120);
        
        gastro[0]=new Servicio("1. Consulta esterna",Doctores.Ricardo,40);
        gastro[1]=new Servicio("2. Endoscopia digestiva superior",Doctores.Ricardo,90);
        gastro[2]=new Servicio("3. Enfermedades inflamatorias cronicas del intestino",Doctores.Ricardo,80);
        gastro[3]=new Servicio("4. Manejo de la hipertension portal en la infancia",Doctores.Ricardo,50);
        gastro[4]=new Servicio("5. Sangramiento digestivo bajo",Doctores.Ricardo,120);
        
        neuro[0]=new Servicio("1. Consulta externa",Doctores.Rodrigo,40);
        neuro[1]=new Servicio("2. Parkinson y movimientos anormales",Doctores.Rodrigo,100);
        neuro[2]=new Servicio("3. Ictus y enfermedades cerebrovasculares",Doctores.Rodrigo,120);
        neuro[3]=new Servicio("4. Esclerosis nultiple",Doctores.Rodrigo,110);
        neuro[4]=new Servicio("5. Demencias",Doctores.Rodrigo,150);
        neuro[5]=new Servicio("6. Electroencefalografias",Doctores.Rodrigo,90);
        neuro[6]=new Servicio("7. Terapias avanzadas de parkinson",Doctores.Rodrigo,120);
        
        radio[0]=new Servicio("1. Radiologia convencional para niños",Doctores.Stuart,80);
        radio[1]=new Servicio("2. Mamografias",Doctores.Stuart,90);
        radio[2]=new Servicio("3. Ecografias",Doctores.Stuart,110);
        radio[3]=new Servicio("4. Ortopantomografia",Doctores.Stuart,120);
        radio[4]=new Servicio("5. Telerradiografis",Doctores.Stuart,120);
        radio[5]=new Servicio("6. Densitometria osea",Doctores.Stuart,150);
    }
    public String getPediatria(boolean a){
        return Ordenador(pediatra,a);
    }
    public String getGinecoObstetricia(boolean a){
        return Ordenador(gineco,a);
    }
    public String getCardiologia(boolean a){
        return Ordenador(cardio, a);
    }
    public String getDermatologia(boolean a){
        return Ordenador(derma,a);
    }
    public String getGastroenterologia(boolean a){
        return Ordenador(gastro,a);
    }
    public String getNeurologia(boolean a){
        return Ordenador(neuro,a);
    }
    public String getRadiologia(boolean a){
        return Ordenador(radio,a);
    }
    public int precioPediatra(int i){
        return pediatra[i].getPrecio();
    }
    public int precioGineco(int i){
        return gineco[i].getPrecio();
    }
    public int precioCardio(int i){
        return cardio[i].getPrecio();
    }
    public int precioDerma(int i){
        return derma[i].getPrecio();
    }
    public int precioGastro(int i){
        return gastro[i].getPrecio();
    }
    public int precioNeuro(int i){
        return neuro[i].getPrecio();
    }
    public int precioRadio(int i){
        return radio[i].getPrecio();
    }
    public String getPediatra(int i) {
        return pediatra[i].toString();
    }
    public String getGineco(int i) {
        return gineco[i].toString();
    }
    public String getCardio(int i) {
        return cardio[i].toString();
    }
    public String getDerma(int i) {
        return derma[i].toString();
    }
    public String getGastro(int i) {
        return gastro[i].toString();
    }
    public String getNeuro(int i) {
        return neuro[i].toString();
    }
    public String getRadio(int i) {
        return radio[i].toString();
    }
}