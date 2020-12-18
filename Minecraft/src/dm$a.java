import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

@FunctionalInterface
public interface a {
  Collection<GameProfile> getNames(db paramdb) throws CommandSyntaxException;
}


/* Location:              C:\Users\Eugen\Desktop\1.16.4.jar!\dm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */