package com.bhn.domain;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Spring data repository interface to extend basic CRUD operations.
 * @author sdu0000
 *
 */
@RepositoryRestResource(collectionResourceRel = "txn", path = "txn")
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
	public List<Transaction> findByProduct(@Param(value = "product") String product);
}