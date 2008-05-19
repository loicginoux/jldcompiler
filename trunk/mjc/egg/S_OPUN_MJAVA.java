package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_OPUN_MJAVA {
LEX_MJAVA scanner;
  S_OPUN_MJAVA() {
    }
  S_OPUN_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle68() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_68();
    x_2.analyser(LEX_MJAVA.token_non);
  }
  private void regle66() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_66();
    x_2.analyser(LEX_MJAVA.token_plus);
  }
  private void regle67() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_67();
    x_2.analyser(LEX_MJAVA.token_moins);
  }
private void action_auto_inh_67() throws Exception {
  }
private void action_auto_inh_66() throws Exception {
  }
private void action_auto_inh_68() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_plus : // 36
        regle66 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle67 () ;
      break ;
      case LEX_MJAVA.token_non : // 43
        regle68 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
