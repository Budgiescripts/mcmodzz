/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqh
/*    */   extends cqo<cmg>
/*    */ {
/*    */   public cqh(Codec<cmg> ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cmg cmg1, fx fx1) {
/* 17 */     int i = ☃.nextInt(8) + 4 + fx1.u();
/* 18 */     int j = ☃.nextInt(8) + 4 + fx1.w();
/* 19 */     return Stream.of(new fx(i, fx1.v(), j));
/*    */   }
/*    */ }


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\cqh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */