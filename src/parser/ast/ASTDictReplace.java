/* Generated By:JJTree: Do not edit this line. ASTDictReplace.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTDictReplace extends SimpleNode {
  public ASTDictReplace(int id) {
    super(id);
  }

  public ASTDictReplace(Simp p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SimpVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=54c7393f3768f429e6f59890c2765e88 (do not edit this line) */
