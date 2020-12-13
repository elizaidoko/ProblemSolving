package problemSolving9.exerciseb;

public abstract class Flora {
    private String classification;
    private String[] continents;

    public Flora(String classification, String[] continents){
        setClassification(classification);
        setContinents(continents);
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String[] getContinents() {
        return continents;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    @Override
    public String toString() {

        String text = "";

        text += "Classification: " + getClassification() + "\nContinents: ";

        if(getContinents() != null){
            for(int i=0; i<getContinents().length; i++){
                text += getContinents()[i]+"  ";
            }
        }
        else
            text += "Continents not specified";

        return text;
    }

    public abstract boolean isInvasive();
}
