package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_PARF_MJAVA {
LEX_MJAVA scanner;
  S_PARF_MJAVA() {
    }
  S_PARF_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle25() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_25(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
  }
private void action_auto_inh_25(S_TYPE_MJAVA x_2, T_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    regle25 () ;
  }
  }
