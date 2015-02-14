package de.webapp.web;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
class UserModel{
	@Id
	long id;
}
