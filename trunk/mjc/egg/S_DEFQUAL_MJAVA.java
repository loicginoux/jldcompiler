package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEFQUAL_MJAVA {
LEX_MJAVA scanner;
  S_DEFQUAL_MJAVA() {
    }
  S_DEFQUAL_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle11() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_DEFQUAL_MJAVA x_3 = new S_DEFQUAL_MJAVA(scanner) ;
    //appel
      action_auto_inh_11(x_3);
    x_2.analyser(LEX_MJAVA.token_protect);
    x_3.analyser() ;
  }
  private void regle9() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_DEFQUAL_MJAVA x_3 = new S_DEFQUAL_MJAVA(scanner) ;
    //appel
      action_auto_inh_9(x_3);
    x_2.analyser(LEX_MJAVA.token_public);
    x_3.analyser() ;
  }
  private void regle8() throws Exception {

    //declaration
    //appel
      action_auto_inh_8();
  }
  private void regle10() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_DEFQUAL_MJAVA x_3 = new S_DEFQUAL_MJAVA(scanner) ;
    //appel
      action_auto_inh_10(x_3);
    x_2.analyser(LEX_MJAVA.token_prive);
    x_3.analyser() ;
  }
  private void regle12() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_DEFQUAL_MJAVA x_3 = new S_DEFQUAL_MJAVA(scanner) ;
    //appel
      action_auto_inh_12(x_3);
    x_2.analyser(LEX_MJAVA.token_static);
    x_3.analyser() ;
  }
private void action_auto_inh_10(S_DEFQUAL_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_9(S_DEFQUAL_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_8() throws Exception {
  }
private void action_auto_inh_12(S_DEFQUAL_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_11(S_DEFQUAL_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 19
        regle8 () ;
      break ;
      case LEX_MJAVA.token_bool : // 20
        regle8 () ;
      break ;
      case LEX_MJAVA.token_ident : // 49
        regle8 () ;
      break ;
      case LEX_MJAVA.token_void : // 18
        regle8 () ;
      break ;
      case LEX_MJAVA.token_classe : // 21
        regle8 () ;
      break ;
      case LEX_MJAVA.token_public : // 25
        regle9 () ;
      break ;
      case LEX_MJAVA.token_prive : // 26
        regle10 () ;
      break ;
      case LEX_MJAVA.token_protect : // 27
        regle11 () ;
      break ;
      case LEX_MJAVA.token_static : // 28
        regle12 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
