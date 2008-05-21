package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEFS_MJAVA {
LEX_MJAVA scanner;
  S_DEFS_MJAVA() {
    }
  S_DEFS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle7() throws Exception {

    //declaration
    S_DEFQUAL_MJAVA x_2 = new S_DEFQUAL_MJAVA(scanner) ;
    S_DEF_MJAVA x_3 = new S_DEF_MJAVA(scanner) ;
    S_DEFS_MJAVA x_4 = new S_DEFS_MJAVA(scanner) ;
    //appel
      action_auto_inh_7(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
  private void regle6() throws Exception {

    //declaration
    //appel
      action_auto_inh_6();
  }
private void action_auto_inh_6() throws Exception {
  }
private void action_auto_inh_7(S_DEFQUAL_MJAVA x_2, S_DEF_MJAVA x_3, S_DEFS_MJAVA x_4) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_acf : // 8
        regle6 () ;
      break ;
      case LEX_MJAVA.token_public : // 25
        regle7 () ;
      break ;
      case LEX_MJAVA.token_prive : // 26
        regle7 () ;
      break ;
      case LEX_MJAVA.token_protect : // 27
        regle7 () ;
      break ;
      case LEX_MJAVA.token_static : // 28
        regle7 () ;
      break ;
      case LEX_MJAVA.token_int : // 19
        regle7 () ;
      break ;
      case LEX_MJAVA.token_bool : // 20
        regle7 () ;
      break ;
      case LEX_MJAVA.token_ident : // 49
        regle7 () ;
      break ;
      case LEX_MJAVA.token_void : // 18
        regle7 () ;
      break ;
      case LEX_MJAVA.token_classe : // 21
        regle7 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
