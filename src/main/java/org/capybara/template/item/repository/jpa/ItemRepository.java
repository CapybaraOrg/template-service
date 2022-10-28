package org.capybara.template.item.repository.jpa;

import org.capybara.template.item.domain.jpa.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, String> {

    ItemEntity findByName(String name);

}
