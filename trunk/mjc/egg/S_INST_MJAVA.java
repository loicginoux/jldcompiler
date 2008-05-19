package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_INST_MJAVA {
LEX_MJAVA scanner;
  S_INST_MJAVA() {
    }
  S_INST_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle35() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_35(x_3);
    x_2.analyser(LEX_MJAVA.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_pv);
  }
  private void regle29() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_AFFX_MJAVA x_4 = new S_AFFX_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_29(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_pv);
  }
  private void regle36() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_4 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_6 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_36(x_4, x_6);
    x_2.analyser(LEX_MJAVA.token_tantque);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
    x_6.analyser() ;
  }
  private void regle32() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_4 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_6 = new S_BLOC_MJAVA(scanner) ;
    S_SIX_MJAVA x_7 = new S_SIX_MJAVA(scanner) ;
    //appel
      action_auto_inh_32(x_4, x_6, x_7);
    x_2.analyser(LEX_MJAVA.token_si);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
    x_6.analyser() ;
    x_7.analyser() ;
  }
  private void regle31() throws Exception {

    //declaration
    S_BLOC_MJAVA x_2 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_31(x_2);
    x_2.analyser() ;
  }
  private void regle30() throws Exception {

    //declaration
    S_E_MJAVA x_2 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_30(x_2);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_pv);
  }
private void action_auto_inh_36(S_E_MJAVA x_4, S_BLOC_MJAVA x_6) throws Exception {
  }
private void action_auto_inh_31(S_BLOC_MJAVA x_2) throws Exception {
  }
private void action_auto_inh_29(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_AFFX_MJAVA x_4) throws Exception {
  }
private void action_auto_inh_30(S_E_MJAVA x_2) throws Exception {
  }
private void action_auto_inh_35(S_E_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_32(S_E_MJAVA x_4, S_BLOC_MJAVA x_6, S_SIX_MJAVA x_7) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 19
        regle29 () ;
      break ;
      case LEX_MJAVA.token_bool : // 20
        regle29 () ;
      break ;
      case LEX_MJAVA.token_ident : // 49
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 49
            regle29 () ;
          break ;
          case LEX_MJAVA.token_pt : // 13
            regle30 () ;
          break ;
          case LEX_MJAVA.token_paro : // 5
            regle30 () ;
          break ;
          case LEX_MJAVA.token_mult : // 39
            regle30 () ;
          break ;
          case LEX_MJAVA.token_div : // 40
            regle30 () ;
          break ;
          case LEX_MJAVA.token_mod : // 41
            regle30 () ;
          break ;
          case LEX_MJAVA.token_et : // 42
            regle30 () ;
          break ;
          case LEX_MJAVA.token_plus : // 36
            regle30 () ;
          break ;
          case LEX_MJAVA.token_moins : // 37
            regle30 () ;
          break ;
          case LEX_MJAVA.token_ou : // 38
            regle30 () ;
          break ;
          case LEX_MJAVA.token_inf : // 30
            regle30 () ;
          break ;
          case LEX_MJAVA.token_infeg : // 31
            regle30 () ;
          break ;
          case LEX_MJAVA.token_sup : // 32
            regle30 () ;
          break ;
          case LEX_MJAVA.token_supeg : // 33
            regle30 () ;
          break ;
          case LEX_MJAVA.token_eg : // 34
            regle30 () ;
          break ;
          case LEX_MJAVA.token_neg : // 35
            regle30 () ;
          break ;
          case LEX_MJAVA.token_affect : // 14
            regle30 () ;
          break ;
          case LEX_MJAVA.token_pv : // 12
            regle30 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
        }
      break ;
      case LEX_MJAVA.token_entier : // 48
        regle30 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 44
        regle30 () ;
      break ;
      case LEX_MJAVA.token_faux : // 45
        regle30 () ;
      break ;
      case LEX_MJAVA.token_plus : // 36
        regle30 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle30 () ;
      break ;
      case LEX_MJAVA.token_non : // 43
        regle30 () ;
      break ;
      case LEX_MJAVA.token_nil : // 29
        regle30 () ;
      break ;
      case LEX_MJAVA.token_paro : // 5
        regle30 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 24
        regle30 () ;
      break ;
      case LEX_MJAVA.token_this : // 46
        regle30 () ;
      break ;
      case LEX_MJAVA.token_super : // 47
        regle30 () ;
      break ;
      case LEX_MJAVA.token_aco : // 7
        regle31 () ;
      break ;
      case LEX_MJAVA.token_si : // 15
        regle32 () ;
      break ;
      case LEX_MJAVA.token_retour : // 23
        regle35 () ;
      break ;
      case LEX_MJAVA.token_tantque : // 17
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
