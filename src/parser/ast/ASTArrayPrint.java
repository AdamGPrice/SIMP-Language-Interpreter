/* Generated By:JJTree: Do not edit this line. ASTArrayPrint.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTArrayPrint extends SimpleNode {
  public ASTArrayPrint(int id) {
    super(id);
  }

  public ASTArrayPrint(Simp p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SimpVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8c86baa1de8edeb35ea6e1888a4df230 (do not edit this line) */
