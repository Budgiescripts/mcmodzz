/*    */ public final class vu
/*    */   extends RuntimeException
/*    */ {
/*  4 */   public static final vu a = new vu();
/*    */   
/*    */   private vu() {
/*  7 */     setStackTrace(new StackTraceElement[0]);
/*    */   }
/*    */ 
/*    */   
/*    */   public synchronized Throwable fillInStackTrace() {
/* 12 */     setStackTrace(new StackTraceElement[0]);
/* 13 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\vu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */