/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class vq
/*    */   extends vs
/*    */ {
/*    */   public vq(String ☃, OutputStream outputStream) {
/*  7 */     super(☃, outputStream);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(String ☃) {
/* 12 */     StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
/* 13 */     StackTraceElement stackTraceElement = arrayOfStackTraceElement[Math.min(3, arrayOfStackTraceElement.length)];
/* 14 */     a.info("[{}]@.({}:{}): {}", this.b, stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\vq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */