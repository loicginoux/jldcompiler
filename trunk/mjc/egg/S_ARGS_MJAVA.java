package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ARGS_MJAVA {
LEX_MJAVA scanner;
  S_ARGS_MJAVA() {
    }
  S_ARGS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle79() throws Exception {

    //declaration
    //appel
      action_auto_inh_79();
  }
  private void regle78() throws Exception {

    //declaration
    S_E_MJAVA x_2 = new S_E_MJAVA(scanner) ;
    S_ARGSX_MJAVA x_3 = new S_ARGSX_MJAVA(scanner) ;
    //appel
      action_auto_inh_78(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_78(S_E_MJAVA x_2, S_ARGSX_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_79() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_entier : // 48
        regle78 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 44
        regle78 () ;
      break ;
      case LEX_MJAVA.token_faux : // 45
        regle78 () ;
      break ;
      case LEX_MJAVA.token_plus : // 36
        regle78 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle78 () ;
      break ;
      case LEX_MJAVA.token_non : // 43
        regle78 () ;
      break ;
      case LEX_MJAVA.token_nil : // 29
        regle78 () ;
      break ;
      case LEX_MJAVA.token_paro : // 5
        regle78 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 24
        regle78 () ;
      break ;
      case LEX_MJAVA.token_this : // 46
        regle78 () ;
      break ;
      case LEX_MJAVA.token_super : // 47
        regle78 () ;
      break ;
      case LEX_MJAVA.token_ident : // 49
        regle78 () ;
      break ;
      case LEX_MJAVA.token_parf : // 6
        regle79 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
