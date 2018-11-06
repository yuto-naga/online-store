package com.mycompany.store.repository;

import com.mycompany.store.domain.OrderItem;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the OrderItem entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    Page<OrderItem> findAllByOrderCustomerUserLogin(String login, Pageable pageable);

    OrderItem findOneByIdAndOrderCustomerUserLogin(Long id, String login);
}
