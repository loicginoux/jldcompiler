package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_EXTENSION_MJAVA {
LEX_MJAVA scanner;
  S_EXTENSION_MJAVA() {
    }
  S_EXTENSION_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle4() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_4(x_3);
    x_2.analyser(LEX_MJAVA.token_etend);
    x_3.analyser(LEX_MJAVA.token_ident);
  }
  private void regle5() throws Exception {

    //declaration
    //appel
      action_auto_inh_5();
  }
private void action_auto_inh_5() throws Exception {
  }
private void action_auto_inh_4(T_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_etend : // 22
        regle4 () ;
      break ;
      case LEX_MJAVA.token_aco : // 7
        regle5 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
