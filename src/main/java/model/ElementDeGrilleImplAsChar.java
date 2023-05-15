package model;


/** Implementation d'un élément de grille */
public class ElementDeGrilleImplAsChar implements ElementDeGrille {
    private char value;

    public ElementDeGrilleImplAsChar(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
