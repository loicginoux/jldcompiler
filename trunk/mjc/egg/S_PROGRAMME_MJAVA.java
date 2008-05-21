package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_PROGRAMME_MJAVA {
LEX_MJAVA scanner;
  S_PROGRAMME_MJAVA() {
    }
  S_PROGRAMME_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  MJAVASourceFile att_source;
  LEX_MJAVA att_scanner;
  AbstractMachine glob_0_machine;
  private void regle0() throws Exception {

    //declaration
    S_IMPORTS_MJAVA x_3 = new S_IMPORTS_MJAVA(scanner) ;
    S_DEFCLASSE_MJAVA x_4 = new S_DEFCLASSE_MJAVA(scanner) ;
    //appel
      action_auto_inh_0(x_3, x_4);
      action_init_0(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
      action_gen_0(x_3, x_4);
  }
private void action_init_0(S_IMPORTS_MJAVA x_3, S_DEFCLASSE_MJAVA x_4) throws Exception {
try {
// locales
// instructions
glob_0_machine=this.att_source.getMachine();
}catch(RuntimeException e) {		//e.printStackTrace();
	}
  }
private void action_gen_0(S_IMPORTS_MJAVA x_3, S_DEFCLASSE_MJAVA x_4) throws Exception {
try {
// locales
// instructions
    glob_0_machine.writeCode(this.att_source.getFileName(), "");
}catch(RuntimeException e) {		//e.printStackTrace();
	}
  }
private void action_auto_inh_0(S_IMPORTS_MJAVA x_3, S_DEFCLASSE_MJAVA x_4) throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_import : // 4
        regle0 () ;
      break ;
      case LEX_MJAVA.token_classe : // 21
        regle0 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
