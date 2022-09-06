package dol;

import static misc.Condicional.Ordenador;
import misc.Servicio;

public class Clinica {
    
    Servicio[] pediatra=new Servicio[5];
    Servicio[] gineco=new Servicio[6];
    Servicio[] cardio=new Servicio[5];
    Servicio[] derma=new Servicio[7];
    Servicio[] gastro=new Servicio[5];
    Servicio[] neuro=new Servicio[7];
    Servicio[] radio=new Servicio[6];
    
    public Clinica(){
        pediatra[0]=new Servicio("1. Consulta externa",40);
        pediatra[1]=new Servicio("2. Atencion medica sobre el desarrollo y crecimiento del menor",30);
        pediatra[2]=new Servicio("3. Orientacion alimenticia a los niños",30);
        pediatra[3]=new Servicio("4. Seguimiento de la salud mental de un menor",30);
        pediatra[4]=new Servicio("5. Diagnostico medico",30);
        
        gineco[0]=new Servicio("1. Consulta externa",40);
        gineco[1]=new Servicio("2. Ecografia",110);
        gineco[2]=new Servicio("3. Servicio obstetricia",30);
        gineco[3]=new Servicio("4. Servicio de ginecologia",160);
        gineco[4]=new Servicio("5. Consulta ginecologa",20);
        gineco[5]=new Servicio("6. Planificacion familiar",60);
        
        cardio[0]=new Servicio("1. Consulta externa",40);
        cardio[1]=new Servicio("2. Cuidado preventivo",163);
        cardio[2]=new Servicio("3. Seguimiento a embarazadas y bebes",50);
        cardio[3]=new Servicio("4. Orientacion medica",30);
        cardio[4]=new Servicio("5. Electrocardiograma",100);
        
        derma[0]=new Servicio("1. Consulta externa",40);
        derma[1]=new Servicio("2. Dermatologia ginecologica",150);
        derma[2]=new Servicio("3. Dermatologia oncologica",102);
        derma[3]=new Servicio("4. Anestesiologia",50);
        derma[4]=new Servicio("5. Dermatologia cosmetica",150);
        derma[5]=new Servicio("6. Dermatologia quirurgica",180);
        derma[6]=new Servicio("7. Dermatologia medica",120);
        
        gastro[0]=new Servicio("1. Consulta esterna",40);
        gastro[1]=new Servicio("2. Endoscopia digestiva superior",90);
        gastro[2]=new Servicio("3. Enfermedades inflamatorias cronicas del intestino",80);
        gastro[3]=new Servicio("4. Manejo de la hipertension portal en la infancia",50);
        gastro[4]=new Servicio("5. Sangramiento digestivo bajo",120);
        
        neuro[0]=new Servicio("1. Consulta externa",40);
        neuro[1]=new Servicio("2. Parkinson y movimientos anormales",100);
        neuro[2]=new Servicio("3. Ictus y enfermedades cerebrovasculares",120);
        neuro[3]=new Servicio("4. Esclerosis nultiple",110);
        neuro[4]=new Servicio("5. Demencias",150);
        neuro[5]=new Servicio("6. Electroencefalografias",90);
        neuro[6]=new Servicio("7. Terapias avanzadas de parkinson",120);
        
        radio[0]=new Servicio("1. Radiologia convencional para niños",80);
        radio[1]=new Servicio("2. Mamografias",90);
        radio[2]=new Servicio("3. Ecografias",110);
        radio[3]=new Servicio("4. Ortopantomografia",120);
        radio[4]=new Servicio("5. Telerradiografis",120);
        radio[5]=new Servicio("6. Densitometria osea",150);
    }
    public String getPediatria(){
        return Ordenador(pediatra);
    }
    public String getGinecoObstetricia(){
        return Ordenador(gineco);
    }
    public String getCardiologia(){
        return Ordenador(cardio);
    }
    public String getDermatologia(){
        return Ordenador(derma);
    }
    public String getGastroenterologia(){
        return Ordenador(gastro);
    }
    public String getNeurologia(){
        return Ordenador(neuro);
    }
    public String getRadiologia(){
        return Ordenador(radio);
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