package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_TYPE_MJAVA {
LEX_MJAVA scanner;
  S_TYPE_MJAVA() {
    }
  S_TYPE_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle18() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_18();
    x_2.analyser(LEX_MJAVA.token_int);
  }
  private void regle20() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_20(x_2);
    x_2.analyser(LEX_MJAVA.token_ident);
  }
  private void regle19() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_19();
    x_2.analyser(LEX_MJAVA.token_bool);
  }
private void action_auto_inh_18() throws Exception {
  }
private void action_auto_inh_20(T_MJAVA x_2) throws Exception {
  }
private void action_auto_inh_19() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 19
        regle18 () ;
      break ;
      case LEX_MJAVA.token_bool : // 20
        regle19 () ;
      break ;
      case LEX_MJAVA.token_ident : // 49
        regle20 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
