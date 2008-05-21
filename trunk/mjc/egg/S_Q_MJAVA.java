package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_Q_MJAVA {
LEX_MJAVA scanner;
  S_Q_MJAVA() {
    }
  S_Q_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle77() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_ARGS_MJAVA x_3 = new S_ARGS_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_5 = new S_Q_MJAVA(scanner) ;
    //appel
      action_auto_inh_77(x_3, x_5);
    x_2.analyser(LEX_MJAVA.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_parf);
    x_5.analyser() ;
  }
  private void regle76() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_4 = new S_Q_MJAVA(scanner) ;
    //appel
      action_auto_inh_76(x_3, x_4);
    x_2.analyser(LEX_MJAVA.token_pt);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
  }
  private void regle75() throws Exception {

    //declaration
    //appel
      action_auto_inh_75();
  }
private void action_auto_inh_76(T_MJAVA x_3, S_Q_MJAVA x_4) throws Exception {
  }
private void action_auto_inh_77(S_ARGS_MJAVA x_3, S_Q_MJAVA x_5) throws Exception {
  }
private void action_auto_inh_75() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 39
        regle75 () ;
      break ;
      case LEX_MJAVA.token_div : // 40
        regle75 () ;
      break ;
      case LEX_MJAVA.token_mod : // 41
        regle75 () ;
      break ;
      case LEX_MJAVA.token_et : // 42
        regle75 () ;
      break ;
      case LEX_MJAVA.token_plus : // 36
        regle75 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle75 () ;
      break ;
      case LEX_MJAVA.token_ou : // 38
        regle75 () ;
      break ;
      case LEX_MJAVA.token_inf : // 30
        regle75 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 31
        regle75 () ;
      break ;
      case LEX_MJAVA.token_sup : // 32
        regle75 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 33
        regle75 () ;
      break ;
      case LEX_MJAVA.token_eg : // 34
        regle75 () ;
      break ;
      case LEX_MJAVA.token_neg : // 35
        regle75 () ;
      break ;
      case LEX_MJAVA.token_affect : // 14
        regle75 () ;
      break ;
      case LEX_MJAVA.token_virg : // 11
        regle75 () ;
      break ;
      case LEX_MJAVA.token_pv : // 12
        regle75 () ;
      break ;
      case LEX_MJAVA.token_parf : // 6
        regle75 () ;
      break ;
      case LEX_MJAVA.token_pt : // 13
        regle76 () ;
      break ;
      case LEX_MJAVA.token_paro : // 5
        regle77 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
