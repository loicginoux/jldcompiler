package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_BLOC_MJAVA {
LEX_MJAVA scanner;
  S_BLOC_MJAVA() {
    }
  S_BLOC_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle26() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_INSTS_MJAVA x_3 = new S_INSTS_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_26(x_3);
    x_2.analyser(LEX_MJAVA.token_aco);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_acf);
  }
private void action_auto_inh_26(S_INSTS_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    regle26 () ;
  }
  }
