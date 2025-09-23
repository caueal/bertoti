package main.java.com.thehecklers.sburrestdemo.repository;
import com.thehecklers.sburrestdemo.entity.model.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}