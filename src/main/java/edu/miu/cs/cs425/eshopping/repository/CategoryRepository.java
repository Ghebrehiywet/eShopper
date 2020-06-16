package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
