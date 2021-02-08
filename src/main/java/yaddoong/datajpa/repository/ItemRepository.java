package yaddoong.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yaddoong.datajpa.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
