package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ER_MJAVA {
LEX_MJAVA scanner;
  S_ER_MJAVA() {
    }
  S_ER_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle40() throws Exception {

    //declaration
    S_ES_MJAVA x_2 = new S_ES_MJAVA(scanner) ;
    S_ERX_MJAVA x_3 = new S_ERX_MJAVA(scanner) ;
    //appel
      action_auto_inh_40(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_40(S_ES_MJAVA x_2, S_ERX_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    regle40 () ;
  }
  }
