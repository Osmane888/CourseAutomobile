package Models;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Course {

        private int nbTours;
        private HashSet<Modele> concurrents = new HashSet<>();
        private LinkedList<Modele> podium = new LinkedList<>();
        private ArrayList<Circuit> liste = new ArrayList<>();

        public Course(int nbTours){
                this.nbTours = nbTours;
        }

        
        public ArrayList<Circuit> listeCircuits(){
                for (Circuit circuit: Circuit.values()) {
                        liste.add(circuit);
                }
                return liste;
        }
        public Circuit choixCircuit(int choix){
                return getListe().get(choix);
        }

        public void preparationConcurrents(){
                for(Modele participant : Modele.values()){
                        concurrents.add(participant);
                }
        }

        public ArrayList<String> listeConcurrents(){
                ArrayList<String> listeConcurrents = new ArrayList<>();

                for (Modele participant : Modele.values()){
                        listeConcurrents.add(participant.name());
                }
                return listeConcurrents;
        }

        public void course(){
                double distanceTotale = nbTours;
                Random random = new Random();
                for (Modele participant: Modele.values()) {
                        participant.setChrono(distanceTotale);
                }
        }

        //region GET/SET
        public int getNbTours() {
                return nbTours;
        }
        public LinkedList<Modele> getPodium() {
                return podium;
        }
        public HashSet<Modele> getConcurrents() {
                return concurrents;
        }
        public ArrayList<Circuit> getListe(){
                return liste;
        }

        private void setNbTours(int nbTours) {
                this.nbTours = nbTours;
        }
        private void setPodium(LinkedList<Modele> podium) {
                this.podium = podium;
        }
        //endregion
}