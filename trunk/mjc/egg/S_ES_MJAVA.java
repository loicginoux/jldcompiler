package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ES_MJAVA {
LEX_MJAVA scanner;
  S_ES_MJAVA() {
    }
  S_ES_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle41() throws Exception {

    //declaration
    S_T_MJAVA x_2 = new S_T_MJAVA(scanner) ;
    S_ESX_MJAVA x_3 = new S_ESX_MJAVA(scanner) ;
    //appel
      action_auto_inh_41(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_41(S_T_MJAVA x_2, S_ESX_MJAVA x_3) throws Exception {
  }
  public void analyser () throws Exception {
    regle41 () ;
  }
  }
