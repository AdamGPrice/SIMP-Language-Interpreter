/* Generated By:JJTree: Do not edit this line. ASTCompNequal.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTCompNequal extends SimpleNode {
  public ASTCompNequal(int id) {
    super(id);
  }

  public ASTCompNequal(Simp p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SimpVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=760bef1c12cdda2cd48276bb5dd31cd6 (do not edit this line) */
