/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class amb
/*    */   extends aln
/*    */ {
/*    */   public amb(int ☃, Schema schema) {
/* 11 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 16 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 18 */     map.remove("minecraft:flower_pot");
/* 19 */     map.remove("minecraft:noteblock");
/*    */     
/* 21 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\amb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */