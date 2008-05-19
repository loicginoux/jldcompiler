package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_IMPORTS_MJAVA {
LEX_MJAVA scanner;
  S_IMPORTS_MJAVA() {
    }
  S_IMPORTS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle1() throws Exception {

    //declaration
    //appel
      action_auto_inh_1();
  }
  private void regle2() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    S_IMPORTS_MJAVA x_5 = new S_IMPORTS_MJAVA(scanner) ;
    //appel
      action_auto_inh_2(x_3, x_5);
    x_2.analyser(LEX_MJAVA.token_import);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser(LEX_MJAVA.token_pv);
    x_5.analyser() ;
  }
private void action_auto_inh_1() throws Exception {
  }
private void action_auto_inh_2(T_MJAVA x_3, S_IMPORTS_MJAVA x_5) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_classe : // 21
        regle1 () ;
      break ;
      case LEX_MJAVA.token_import : // 4
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
