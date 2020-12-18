/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.ProfileLookupCallback;
/*    */ import java.util.concurrent.atomic.AtomicReference;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements ProfileLookupCallback
/*    */ {
/*    */   null(AtomicReference paramAtomicReference) {}
/*    */   
/*    */   public void onProfileLookupSucceeded(GameProfile ☃) {
/* 81 */     this.a.set(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 86 */     this.a.set(null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\acq$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */