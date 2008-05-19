package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_F_MJAVA {
LEX_MJAVA scanner;
  S_F_MJAVA() {
    }
  S_F_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle64() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_64();
    x_2.analyser(LEX_MJAVA.token_faux);
  }
  private void regle73() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_3 = new S_Q_MJAVA(scanner) ;
    //appel
      action_auto_inh_73(x_3);
    x_2.analyser(LEX_MJAVA.token_super);
    x_3.analyser() ;
  }
  private void regle71() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_TYPE_MJAVA x_3 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_ARGS_MJAVA x_5 = new S_ARGS_MJAVA(scanner) ;
    T_MJAVA x_6 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_71(x_3, x_5);
    x_2.analyser(LEX_MJAVA.token_nouveau);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_paro);
    x_5.analyser() ;
    x_6.analyser(LEX_MJAVA.token_parf);
  }
  private void regle62() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_62(x_2);
    x_2.analyser(LEX_MJAVA.token_entier);
  }
  private void regle69() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_69();
    x_2.analyser(LEX_MJAVA.token_nil);
  }
  private void regle74() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_3 = new S_Q_MJAVA(scanner) ;
    //appel
      action_auto_inh_74(x_2, x_3);
    x_2.analyser(LEX_MJAVA.token_ident);
    x_3.analyser() ;
  }
  private void regle72() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_Q_MJAVA x_3 = new S_Q_MJAVA(scanner) ;
    //appel
      action_auto_inh_72(x_3);
    x_2.analyser(LEX_MJAVA.token_this);
    x_3.analyser() ;
  }
  private void regle70() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_70(x_3);
    x_2.analyser(LEX_MJAVA.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_parf);
  }
  private void regle63() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_63();
    x_2.analyser(LEX_MJAVA.token_vrai);
  }
  private void regle65() throws Exception {

    //declaration
    S_OPUN_MJAVA x_2 = new S_OPUN_MJAVA(scanner) ;
    S_F_MJAVA x_3 = new S_F_MJAVA(scanner) ;
    //appel
      action_auto_inh_65(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_72(S_Q_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_63() throws Exception {
  }
private void action_auto_inh_71(S_TYPE_MJAVA x_3, S_ARGS_MJAVA x_5) throws Exception {
  }
private void action_auto_inh_69() throws Exception {
  }
private void action_auto_inh_74(T_MJAVA x_2, S_Q_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_73(S_Q_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_65(S_OPUN_MJAVA x_2, S_F_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_62(T_MJAVA x_2) throws Exception {
  }
private void action_auto_inh_70(S_E_MJAVA x_3) throws Exception {
  }
private void action_auto_inh_64() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_entier : // 48
        regle62 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 44
        regle63 () ;
      break ;
      case LEX_MJAVA.token_faux : // 45
        regle64 () ;
      break ;
      case LEX_MJAVA.token_plus : // 36
        regle65 () ;
      break ;
      case LEX_MJAVA.token_moins : // 37
        regle65 () ;
      break ;
      case LEX_MJAVA.token_non : // 43
        regle65 () ;
      break ;
      case LEX_MJAVA.token_nil : // 29
        regle69 () ;
      break ;
      case LEX_MJAVA.token_paro : // 5
        regle70 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 24
        regle71 () ;
      break ;
      case LEX_MJAVA.token_this : // 46
        regle72 () ;
      break ;
      case LEX_MJAVA.token_super : // 47
        regle73 () ;
      break ;
      case LEX_MJAVA.token_ident : // 49
        regle74 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
