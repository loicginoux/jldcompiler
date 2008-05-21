package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ESX_MJAVA {
LEX_MJAVA scanner;
  S_ESX_MJAVA() {
    }
  S_ESX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle51() throws Exception {

    //declaration
    //appel
      action_auto_inh_51();
  }
  private void regle50() throws Exception {

    //declaration
    S_OPADD_MJAVA x_2 = new S_OPADD_MJAVA(scanner) ;
    S_T_MJAVA x_3 = new S_T_MJAVA(scanner) ;
    S_ESX_MJAVA x_4 = new S_ESX_MJAVA(scanner) ;
    //appel
      action_auto_inh_50(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_auto_inh_50(S_OPADD_MJAVA x_2, S_T_MJAVA x_3, S_ESX_MJAVA x_4) throws Exception {
  }
private void action_auto_inh_51() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_plus : // 36
        regle50 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle50 () ;
      break ;
      case LEX_MJAVA.token_ou : // 38
        regle50 () ;
      break ;
      case LEX_MJAVA.token_inf : // 30
        regle51 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 31
        regle51 () ;
      break ;
      case LEX_MJAVA.token_sup : // 32
        regle51 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 33
        regle51 () ;
      break ;
      case LEX_MJAVA.token_eg : // 34
        regle51 () ;
      break ;
      case LEX_MJAVA.token_neg : // 35
        regle51 () ;
      break ;
      case LEX_MJAVA.token_affect : // 14
        regle51 () ;
      break ;
      case LEX_MJAVA.token_virg : // 11
        regle51 () ;
      break ;
      case LEX_MJAVA.token_pv : // 12
        regle51 () ;
      break ;
      case LEX_MJAVA.token_parf : // 6
        regle51 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
