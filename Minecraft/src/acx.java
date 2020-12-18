/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class acx<T>
/*    */ {
/*    */   @Nullable
/*    */   private final T a;
/*    */   
/*    */   public acx(@Nullable T ☃) {
/* 12 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   T g() {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   boolean f() {
/* 21 */     return false;
/*    */   }
/*    */   
/*    */   protected abstract void a(JsonObject paramJsonObject);
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\acx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */