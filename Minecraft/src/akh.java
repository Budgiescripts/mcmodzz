/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class akh
/*    */   extends agd
/*    */ {
/*    */   public akh(Schema ☃) {
/* 12 */     super(☃, akn.b);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 17 */     return fixTypeEverywhereTyped("PlayerUUIDFix", getInputSchema().getType(this.b), ☃ -> {
/*    */           OpticFinder<?> opticFinder = ☃.getType().findField("RootVehicle");
/*    */           return ☃.updateTyped(opticFinder, opticFinder.type(), ()).update(DSL.remainderFinder(), ());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\akh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */