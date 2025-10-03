package ZomatoLLD;

import java.util.List;

public interface FoodDao {
    List<MenuItem> find(String input);
}
