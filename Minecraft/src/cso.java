/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cso
/*    */ {
/* 10 */   public static final Codec<cso> c = gm.ab.dispatch("predicate_type", cso::a, csp::codec);
/*    */   
/*    */   public abstract boolean a(fx paramfx1, fx paramfx2, fx paramfx3, Random paramRandom);
/*    */   
/*    */   protected abstract csp<?> a();
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\cso.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */