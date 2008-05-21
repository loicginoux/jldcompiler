package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_SIX_MJAVA {
LEX_MJAVA scanner;
  S_SIX_MJAVA() {
    }
  S_SIX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle34() throws Exception {

    //declaration
    //appel
      action_auto_inh_34();
  }
  private void regle33() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_3 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_33(x_3);
    x_2.analyser(LEX_MJAVA.token_sinon);
    x_3.analyser() ;
  }
private void action_auto_inh_34() throws Exception {
  }
private void action_auto_inh_33(S_BLOC_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_sinon : // 16
        regle33 () ;
      break ;
      case LEX_MJAVA.token_int : // 19
        regle34 () ;
      break ;
      case LEX_MJAVA.token_bool : // 20
        regle34 () ;
      break ;
      case LEX_MJAVA.token_ident : // 49
        regle34 () ;
      break ;
      case LEX_MJAVA.token_entier : // 48
        regle34 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 44
        regle34 () ;
      break ;
      case LEX_MJAVA.token_faux : // 45
        regle34 () ;
      break ;
      case LEX_MJAVA.token_plus : // 36
        regle34 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle34 () ;
      break ;
      case LEX_MJAVA.token_non : // 43
        regle34 () ;
      break ;
      case LEX_MJAVA.token_nil : // 29
        regle34 () ;
      break ;
      case LEX_MJAVA.token_paro : // 5
        regle34 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 24
        regle34 () ;
      break ;
      case LEX_MJAVA.token_this : // 46
        regle34 () ;
      break ;
      case LEX_MJAVA.token_super : // 47
        regle34 () ;
      break ;
      case LEX_MJAVA.token_aco : // 7
        regle34 () ;
      break ;
      case LEX_MJAVA.token_si : // 15
        regle34 () ;
      break ;
      case LEX_MJAVA.token_retour : // 23
        regle34 () ;
      break ;
      case LEX_MJAVA.token_tantque : // 17
        regle34 () ;
      break ;
      case LEX_MJAVA.token_acf : // 8
        regle34 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
