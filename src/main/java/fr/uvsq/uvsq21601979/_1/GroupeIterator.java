package fr.uvsq.uvsq21601979._1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * class groupeIterator.
 * @author Tanguy
 */
public class GroupeIterator implements Iterator<Groupe> {
    /**
     * liste de groupe l.
     */
    private ArrayList<Groupe> l;
    /**
     * conteur qui reprèsente l'indice de l'élément actuel.
     */
    private int cont = 0;

    /**
     * constructeur de groupeIterator.
     * @param l liste
     */
    public GroupeIterator(final ArrayList<Groupe> l) {
        this.l = l;
        }

    /**
     * renvois si il existe un éllement suivant dans la liste.
     * @return bool
     */
    public boolean hasNext() {
        if (cont < l.size()) {
            return true;
            }
        return false;
        }

    /**
     * revoi l'élément suivant de la liste.
     * @return groupe suivant
     */
    public Groupe next() {
        return l.get(cont);
        }
}
