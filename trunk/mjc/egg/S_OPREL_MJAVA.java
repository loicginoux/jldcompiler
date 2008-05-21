package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_OPREL_MJAVA {
LEX_MJAVA scanner;
  S_OPREL_MJAVA() {
    }
  S_OPREL_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle45() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_45();
    x_2.analyser(LEX_MJAVA.token_infeg);
  }
  private void regle47() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_47();
    x_2.analyser(LEX_MJAVA.token_supeg);
  }
  private void regle49() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_49();
    x_2.analyser(LEX_MJAVA.token_neg);
  }
  private void regle44() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_44();
    x_2.analyser(LEX_MJAVA.token_inf);
  }
  private void regle46() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_46();
    x_2.analyser(LEX_MJAVA.token_sup);
  }
  private void regle48() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_48();
    x_2.analyser(LEX_MJAVA.token_eg);
  }
private void action_auto_inh_47() throws Exception {
  }
private void action_auto_inh_44() throws Exception {
  }
private void action_auto_inh_45() throws Exception {
  }
private void action_auto_inh_49() throws Exception {
  }
private void action_auto_inh_46() throws Exception {
  }
private void action_auto_inh_48() throws Exception {
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_inf : // 30
        regle44 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 31
        regle45 () ;
      break ;
      case LEX_MJAVA.token_sup : // 32
        regle46 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 33
        regle47 () ;
      break ;
      case LEX_MJAVA.token_eg : // 34
        regle48 () ;
      break ;
      case LEX_MJAVA.token_neg : // 35
        regle49 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
