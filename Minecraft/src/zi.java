/*    */ import java.nio.file.Path;
/*    */ import java.util.function.UnaryOperator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zi
/*    */ {
/*    */   private final Path a;
/*    */   private zh b;
/*    */   
/*    */   public zi(gn ☃, Path path) {
/* 13 */     this.a = path;
/* 14 */     this.b = zh.a(☃, path);
/*    */   }
/*    */   
/*    */   public zh a() {
/* 18 */     return this.b;
/*    */   }
/*    */   
/*    */   public void b() {
/* 22 */     this.b.b(this.a);
/*    */   }
/*    */   
/*    */   public zi a(UnaryOperator<zh> ☃) {
/* 26 */     (this.b = ☃.apply(this.b)).b(this.a);
/* 27 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */