/* Generated By:JJTree: Do not edit this line. ASTUnaryNot.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTUnaryNot extends SimpleNode {
  public ASTUnaryNot(int id) {
    super(id);
  }

  public ASTUnaryNot(Simp p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SimpVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=952a274bc99907ecab996e2f54418bd7 (do not edit this line) */
