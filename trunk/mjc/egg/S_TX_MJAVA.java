package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_TX_MJAVA {
LEX_MJAVA scanner;
  S_TX_MJAVA() {
    }
  S_TX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle56() throws Exception {

    //declaration
    S_OPMUL_MJAVA x_2 = new S_OPMUL_MJAVA(scanner) ;
    S_F_MJAVA x_3 = new S_F_MJAVA(scanner) ;
    S_TX_MJAVA x_4 = new S_TX_MJAVA(scanner) ;
    //appel
      action_auto_inh_56(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
  private void regle57() throws Exception {

    //declaration
    //appel
      action_auto_inh_57();
  }
private void action_auto_inh_56(S_OPMUL_MJAVA x_2, S_F_MJAVA x_3, S_TX_MJAVA x_4) throws Exception {
  }
private void action_auto_inh_57() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 39
        regle56 () ;
      break ;
      case LEX_MJAVA.token_div : // 40
        regle56 () ;
      break ;
      case LEX_MJAVA.token_mod : // 41
        regle56 () ;
      break ;
      case LEX_MJAVA.token_et : // 42
        regle56 () ;
      break ;
      case LEX_MJAVA.token_plus : // 36
        regle57 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle57 () ;
      break ;
      case LEX_MJAVA.token_ou : // 38
        regle57 () ;
      break ;
      case LEX_MJAVA.token_inf : // 30
        regle57 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 31
        regle57 () ;
      break ;
      case LEX_MJAVA.token_sup : // 32
        regle57 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 33
        regle57 () ;
      break ;
      case LEX_MJAVA.token_eg : // 34
        regle57 () ;
      break ;
      case LEX_MJAVA.token_neg : // 35
        regle57 () ;
      break ;
      case LEX_MJAVA.token_affect : // 14
        regle57 () ;
      break ;
      case LEX_MJAVA.token_virg : // 11
        regle57 () ;
      break ;
      case LEX_MJAVA.token_pv : // 12
        regle57 () ;
      break ;
      case LEX_MJAVA.token_parf : // 6
        regle57 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
