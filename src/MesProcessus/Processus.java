/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesProcessus;

import java.util.Date;

/**
 *
 * @author 1895088
 */
public class Processus {

    String message = "Saisir une date inferieur à 2010 ";

    public String processusActivite(String _date) {
        try {
            Date date = new Date(Integer.parseInt(_date));
            if (date.after(new Date(1869))) {
                if (date.before(new Date(1971))) {
                    message = "Il est temps d’aller se promener à travers le monde";
                } else if (date.before(new Date(1981))) {
                    message = "il est temps de commencer à travailler  sérieusement";
                } else if (date.before(new Date(1991))) {
                    message = "Il est grand temps de terminer tes études ";
                } else if (date.before(new Date(2001))) {
                    message = "Fais ce qui te plait, tu as encore le temps! ";

                } else if (date.before(new Date(2011))) {
                    message = "utilisation de ce service non-autorisée !!! ";
                }
            } else {
                message = "La date doit être supérieur à 1869 !! ";
            }
            return message;
        } catch (Exception e) {
            message = "Faut utiliser des dates !!!";
            return message;
        }
    }
}
