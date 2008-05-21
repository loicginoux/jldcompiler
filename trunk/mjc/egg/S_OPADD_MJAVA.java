package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_OPADD_MJAVA {
LEX_MJAVA scanner;
  S_OPADD_MJAVA() {
    }
  S_OPADD_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle52() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_52();
    x_2.analyser(LEX_MJAVA.token_plus);
  }
  private void regle54() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_54();
    x_2.analyser(LEX_MJAVA.token_ou);
  }
  private void regle53() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_53();
    x_2.analyser(LEX_MJAVA.token_moins);
  }
private void action_auto_inh_54() throws Exception {
  }
private void action_auto_inh_52() throws Exception {
  }
private void action_auto_inh_53() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_plus : // 36
        regle52 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle53 () ;
      break ;
      case LEX_MJAVA.token_ou : // 38
        regle54 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
