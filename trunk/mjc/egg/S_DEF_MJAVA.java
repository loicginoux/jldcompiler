package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEF_MJAVA {
LEX_MJAVA scanner;
  S_DEF_MJAVA() {
    }
  S_DEF_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle14() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_5 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_6 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_7 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_14(x_2, x_3, x_5, x_7);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_paro);
    x_5.analyser() ;
    x_6.analyser(LEX_MJAVA.token_parf);
    x_7.analyser() ;
  }
  private void regle15() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_5 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_6 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_7 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_15(x_3, x_5, x_7);
    x_2.analyser(LEX_MJAVA.token_void);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_paro);
    x_5.analyser() ;
    x_6.analyser(LEX_MJAVA.token_parf);
    x_7.analyser() ;
  }
  private void regle17() throws Exception {

    //declaration
    S_DEFCLASSE_MJAVA x_2 = new S_DEFCLASSE_MJAVA(scanner) ;
    //appel
      action_auto_inh_17(x_2);
    x_2.analyser() ;
  }
  private void regle13() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_13(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_pv);
  }
  private void regle16() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_PARFS_MJAVA x_4 = new S_PARFS_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_6 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_16(x_2, x_4, x_6);
    x_2.analyser(LEX_MJAVA.token_ident);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
    x_6.analyser() ;
  }
private void action_auto_inh_16(T_MJAVA x_2, S_PARFS_MJAVA x_4, S_BLOC_MJAVA x_6) throws Exception {
  }
private void action_auto_inh_14(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_7) throws Exception {
  }
private void action_auto_inh_17(S_DEFCLASSE_MJAVA x_2) throws Exception {
  }
private void action_auto_inh_15(T_MJAVA x_3, S_PARFS_MJAVA x_5, S_BLOC_MJAVA x_7) throws Exception {
  }
private void action_auto_inh_13(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 19
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 49
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 12
                regle13 () ;
              break ;
              case LEX_MJAVA.token_paro : // 5
                regle14 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
            }
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
        }
      break ;
      case LEX_MJAVA.token_bool : // 20
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 49
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 12
                regle13 () ;
              break ;
              case LEX_MJAVA.token_paro : // 5
                regle14 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
            }
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
        }
      break ;
      case LEX_MJAVA.token_ident : // 49
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 49
            scanner.lit ( 3 ) ;
            switch ( scanner.fenetre[2].code ) {
              case LEX_MJAVA.token_pv : // 12
                regle13 () ;
              break ;
              case LEX_MJAVA.token_paro : // 5
                regle14 () ;
              break ;
              default :
                       scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[2].getNom()});
            }
          break ;
          case LEX_MJAVA.token_paro : // 5
            regle16 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
        }
      break ;
      case LEX_MJAVA.token_void : // 18
        regle15 () ;
      break ;
      case LEX_MJAVA.token_classe : // 21
        regle17 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
