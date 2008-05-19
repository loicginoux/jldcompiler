package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEFCLASSE_MJAVA {
LEX_MJAVA scanner;
  S_DEFCLASSE_MJAVA() {
    }
  S_DEFCLASSE_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle3() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_EXTENSION_MJAVA x_4 = new S_EXTENSION_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_DEFS_MJAVA x_6 = new S_DEFS_MJAVA(scanner) ;
    T_MJAVA x_7 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_3(x_3, x_4, x_6);
    x_2.analyser(LEX_MJAVA.token_classe);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_aco);
    x_6.analyser() ;
    x_7.analyser(LEX_MJAVA.token_acf);
  }
private void action_auto_inh_3(T_MJAVA x_3, S_EXTENSION_MJAVA x_4, S_DEFS_MJAVA x_6) throws Exception {
  }
  public void analyser () throws Exception {
    regle3 () ;
  }
  }
