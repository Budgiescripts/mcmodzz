/*    */ import java.util.Collection;
/*    */ 
/*    */ public interface aj
/*    */ {
/*    */   static {
/*  6 */     a = (☃ -> {
/*    */         String[][] arrayOfString = new String[☃.size()][];
/*    */         int i = 0;
/*    */         for (String str : ☃) {
/*    */           (new String[1])[0] = str;
/*    */           arrayOfString[i++] = new String[1];
/*    */         } 
/*    */         return arrayOfString;
/*    */       });
/* 15 */     b = (☃ -> new String[][] { (String[])☃.toArray((Object[])new String[0]) });
/*    */   }
/*    */   
/*    */   public static final aj a;
/*    */   public static final aj b;
/*    */   
/*    */   String[][] createRequirements(Collection<String> paramCollection);
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */