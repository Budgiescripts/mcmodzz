/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class ait extends ajv {
/*    */   public ait(Schema ☃, String str) {
/* 10 */     super(☃, false, "Gossip for for " + str, akn.p, str);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 15 */     return ☃.update(DSL.remainderFinder(), ☃ -> ☃.update("Gossips", ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\ait.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */