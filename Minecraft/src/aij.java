/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class aij
/*    */   extends DataFix {
/*    */   public aij(Schema ☃, boolean bool) {
/* 13 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 18 */     return fixTypeEverywhereTyped("EntityStringUuidFix", getInputSchema().getType(akn.p), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\aij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */