import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;

public interface b<T> {
  JsonElement a(T paramT, JsonSerializationContext paramJsonSerializationContext);
  
  T a(JsonElement paramJsonElement, JsonDeserializationContext paramJsonDeserializationContext);
}


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\cyt$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */