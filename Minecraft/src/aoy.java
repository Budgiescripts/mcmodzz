/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface aoy
/*    */ {
/*    */   nr R();
/*    */   
/*    */   default boolean S() {
/* 11 */     return (T() != null);
/*    */   }
/*    */   
/*    */   default nr d() {
/* 15 */     return R();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   default nr T() {
/* 20 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\aoy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */