package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import bestRings.co.uk.model.jpa.entities.AbstractEntity;

public class AbstractGenericDAO<T extends AbstractEntity> {

	@PersistenceContext
	protected EntityManager entityManager;

	public Long create(T t) {

		entityManager.persist(t);

		return t.getId();
	}

	@SuppressWarnings("unchecked")
	public T findById(Long id, T t) {

		return (T) entityManager.find(t.getClass(), id);

	}

	public T update(T t) {

		entityManager.merge(t);

		return t;
	}

	public void delete(T t) {

		entityManager.remove(t);

	}

}
