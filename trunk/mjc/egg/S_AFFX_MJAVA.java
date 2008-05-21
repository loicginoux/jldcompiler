package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_AFFX_MJAVA {
LEX_MJAVA scanner;
  S_AFFX_MJAVA() {
    }
  S_AFFX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle39() throws Exception {

    //declaration
    //appel
      action_auto_inh_39();
  }
  private void regle38() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_ER_MJAVA x_3 = new S_ER_MJAVA(scanner) ;
    //appel
      action_auto_inh_38(x_3);
    x_2.analyser(LEX_MJAVA.token_affect);
    x_3.analyser() ;
  }
private void action_auto_inh_38(S_ER_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_39() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_affect : // 14
        regle38 () ;
      break ;
      case LEX_MJAVA.token_pv : // 12
        regle39 () ;
      break ;
      case LEX_MJAVA.token_virg : // 11
        regle39 () ;
      break ;
      case LEX_MJAVA.token_parf : // 6
        regle39 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
