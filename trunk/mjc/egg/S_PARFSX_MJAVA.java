package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_PARFSX_MJAVA {
LEX_MJAVA scanner;
  S_PARFSX_MJAVA() {
    }
  S_PARFSX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle24() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_PARF_MJAVA x_3 = new S_PARF_MJAVA(scanner) ;
    S_PARFSX_MJAVA x_4 = new S_PARFSX_MJAVA(scanner) ;
    //appel
      action_auto_inh_24(x_3, x_4);
    x_2.analyser(LEX_MJAVA.token_virg);
    x_3.analyser() ;
    x_4.analyser() ;
  }
  private void regle23() throws Exception {

    //declaration
    //appel
      action_auto_inh_23();
  }
private void action_auto_inh_23() throws Exception {
  }
private void action_auto_inh_24(S_PARF_MJAVA x_3, S_PARFSX_MJAVA x_4) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_parf : // 6
        regle23 () ;
      break ;
      case LEX_MJAVA.token_virg : // 11
        regle24 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
