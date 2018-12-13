package com.mycompany.store.repository;

import com.mycompany.store.domain.OrderItem;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the OrderItem entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    Page<OrderItem> findAllByOrderCustomerUserLogin(String login, Pageable pageable);

    OrderItem findOneByIdAndOrderCustomerUserLogin(Long id, String login);
}
