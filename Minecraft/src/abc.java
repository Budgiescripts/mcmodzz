import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface abc {
  void a();
  
  void b();
  
  CompletableFuture<Optional<String>> a(String paramString);
  
  CompletableFuture<Optional<List<String>>> a(List<String> paramList);
}


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\abc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */