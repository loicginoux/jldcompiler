package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_OPMUL_MJAVA {
LEX_MJAVA scanner;
  S_OPMUL_MJAVA() {
    }
  S_OPMUL_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle58() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_58();
    x_2.analyser(LEX_MJAVA.token_mult);
  }
  private void regle61() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_61();
    x_2.analyser(LEX_MJAVA.token_et);
  }
  private void regle60() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_60();
    x_2.analyser(LEX_MJAVA.token_mod);
  }
  private void regle59() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_59();
    x_2.analyser(LEX_MJAVA.token_div);
  }
private void action_auto_inh_61() throws Exception {
  }
private void action_auto_inh_58() throws Exception {
  }
private void action_auto_inh_60() throws Exception {
  }
private void action_auto_inh_59() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 39
        regle58 () ;
      break ;
      case LEX_MJAVA.token_div : // 40
        regle59 () ;
      break ;
      case LEX_MJAVA.token_mod : // 41
        regle60 () ;
      break ;
      case LEX_MJAVA.token_et : // 42
        regle61 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
