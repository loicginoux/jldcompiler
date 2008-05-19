package mjc.egg;
import java.util.Arrays;
import mg.egg.eggc.compiler.libjava.EGGException;
import mg.egg.eggc.compiler.libjava.messages.NLS;
import mg.egg.eggc.compiler.libjava.lex.LEXICAL4;
import mg.egg.eggc.compiler.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.compiler.libjava.problem.IProblemReporter;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import mg.egg.eggc.compiler.libjava.problem.ProblemSeverities;
import mjc.compiler.*;
import mjc.gc.*;
public class LEX_MJAVA extends LEXICAL4  {
 public static final int EOF = 0 ;
 public static final int token_faux = 1 ;
 public static final int token_sinon = 2 ;
 public static final int token_void = 3 ;
 public static final int token_public = 4 ;
 public static final int token_mod = 5 ;
 public static final int token_mult = 6 ;
 public static final int token_eg = 7 ;
 public static final int token_protect = 8 ;
 public static final int token_this = 9 ;
 public static final int token_import = 10 ;
 public static final int token_ident = 11 ;
 public static final int token_div = 12 ;
 public static final int token_pv = 13 ;
 public static final int token_vrai = 14 ;
 public static final int token_pt = 15 ;
 public static final int token_int = 16 ;
 public static final int token_nouveau = 17 ;
 public static final int token_aco = 18 ;
 public static final int token_inf = 19 ;
 public static final int token_acf = 20 ;
 public static final int token_ou = 21 ;
 public static final int token_static = 22 ;
 public static final int token_etend = 23 ;
 public static final int token_bool = 24 ;
 public static final int token_moins = 25 ;
 public static final int token_neg = 26 ;
 public static final int token_tantque = 27 ;
 public static final int token_affect = 28 ;
 public static final int token_retour = 29 ;
 public static final int token_virg = 30 ;
 public static final int token_entier = 31 ;
 public static final int token_si = 32 ;
 public static final int token_paro = 33 ;
 public static final int token_cro = 34 ;
 public static final int token_classe = 35 ;
 public static final int token_sup = 36 ;
 public static final int token_separateur = 37 ;
 public static final int token_comm = 38 ;
 public static final int token_parf = 39 ;
 public static final int token_crf = 40 ;
 public static final int token_super = 41 ;
 public static final int token_prive = 42 ;
 public static final int token_nil = 43 ;
 public static final int token_supeg = 44 ;
 public static final int token_plus = 45 ;
 public static final int token_non = 46 ;
 public static final int token_infeg = 47 ;
 public static final int token_et = 48 ;
  static final int token_autre = 49 ;
  public static final String[][] tokenImages = {
    {"<EOF>"} ,{"faux"},
{"sinon"},
{"void"},
{"public"},
{"mod"},
{"mult"},
{"eg"},
{"protect"},
{"this"},
{"import"},
    {"ident"} ,
{"div"},
{"pv"},
{"vrai"},
{"pt"},
{"int"},
{"nouveau"},
{"aco"},
{"inf"},
{"acf"},
{"ou"},
{"static"},
{"etend"},
{"bool"},
{"moins"},
{"neg"},
{"tantque"},
{"affect"},
{"retour"},
{"virg"},
    {"entier"} ,
{"si"},
{"paro"},
{"cro"},
{"classe"},
{"sup"},
    {"separateur"} ,
    {"comm"} ,
{"parf"},
{"crf"},
{"super"},
{"prive"},
{"nil"},
{"supeg"},
{"plus"},
{"non"},
{"infeg"},
{"et"},
  } ;
  private int [] separateurs = { 
token_separateur
, token_comm
    } ;
  public int[] getSeparateurs(){
    return separateurs;
    }
  private int [] comments = { 
    } ;
  public int[] getComments(){
    return comments;
    }
  private int le_comment = -1;
  public int getComment(){
    return le_comment;
    }
  public LEX_MJAVA(IProblemReporter pr, LEX_CONTEXTE lc, int k) {
    super(pr, lc,k);
    dernier_accepte = 0 ;
    analyseur = new JLEX_MJAVA();
  }
  public void setSource ( LEXICAL4 scanner) throws EGGException{
    scanner.analyseur.toContext(scanner.contexte);
    analyseur.fromContext(scanner.contexte);
  }
  public void setReader ( LEXICAL4 scanner) {
    scanner.analyseur.setReader(scanner.contexte.source);
  }
  public void accepter_sucre ( int t ) throws EGGException {
    if ( fenetre[0].code == t ) {
      dernier_accepte = fenetre[0].ligne ;
      recovery = false;
      decaler () ;
    }else {
      _interrompre(IProblem.Syntax,getBeginLine(), IMJAVAMessages.id_MJAVA_expected_token, MJAVAMessages.MJAVA_expected_token,new Object[]{fenetre[0].getNom(), Arrays.asList(tokenImages[t])});
    }
  }
  public void accepter_fds() throws EGGException {
    lit ( 1 ) ;
    if ( fenetre[0].code != EOF ) {
      _interrompre(IProblem.Syntax,getBeginLine(), IMJAVAMessages.id_MJAVA_expected_token, MJAVAMessages.MJAVA_expected_eof, new Object[]{fenetre[0].getNom()});
      }
     else {
      dernier_accepte = fenetre[0].ligne ;
      }
    }
  public int ligneDepart () {
    return getBeginLine() + getEndLine() ;
    }
  public void _interrompre (int cat,  int line, int id,  String c , Object [] m )  {
      recovery = true;
      contexte.errors++;
        problemReporter.handle(cat, id,line  , NLS.bind(c,m), getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Error,m);
    }
    public void _signaler ( int cat, int line, int id, String c , Object [] m )  {
        problemReporter.handle(cat , id, line  , NLS.bind(c,m),getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Warning,m);
    }
  }
