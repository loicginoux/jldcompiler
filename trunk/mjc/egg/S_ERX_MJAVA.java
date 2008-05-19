package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ERX_MJAVA {
LEX_MJAVA scanner;
  S_ERX_MJAVA() {
    }
  S_ERX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle42() throws Exception {

    //declaration
    S_OPREL_MJAVA x_2 = new S_OPREL_MJAVA(scanner) ;
    S_ES_MJAVA x_3 = new S_ES_MJAVA(scanner) ;
    //appel
      action_auto_inh_42(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle43() throws Exception {

    //declaration
    //appel
      action_auto_inh_43();
  }
private void action_auto_inh_42(S_OPREL_MJAVA x_2, S_ES_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_43() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_inf : // 30
        regle42 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 31
        regle42 () ;
      break ;
      case LEX_MJAVA.token_sup : // 32
        regle42 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 33
        regle42 () ;
      break ;
      case LEX_MJAVA.token_eg : // 34
        regle42 () ;
      break ;
      case LEX_MJAVA.token_neg : // 35
        regle42 () ;
      break ;
      case LEX_MJAVA.token_affect : // 14
        regle43 () ;
      break ;
      case LEX_MJAVA.token_virg : // 11
        regle43 () ;
      break ;
      case LEX_MJAVA.token_pv : // 12
        regle43 () ;
      break ;
      case LEX_MJAVA.token_parf : // 6
        regle43 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
