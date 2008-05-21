package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_PARFS_MJAVA {
LEX_MJAVA scanner;
  S_PARFS_MJAVA() {
    }
  S_PARFS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle21() throws Exception {

    //declaration
    //appel
      action_auto_inh_21();
  }
  private void regle22() throws Exception {

    //declaration
    S_PARF_MJAVA x_2 = new S_PARF_MJAVA(scanner) ;
    S_PARFSX_MJAVA x_3 = new S_PARFSX_MJAVA(scanner) ;
    //appel
      action_auto_inh_22(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_21() throws Exception {
  }
private void action_auto_inh_22(S_PARF_MJAVA x_2, S_PARFSX_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_parf : // 6
        regle21 () ;
      break ;
      case LEX_MJAVA.token_int : // 19
        regle22 () ;
      break ;
      case LEX_MJAVA.token_bool : // 20
        regle22 () ;
      break ;
      case LEX_MJAVA.token_ident : // 49
        regle22 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
