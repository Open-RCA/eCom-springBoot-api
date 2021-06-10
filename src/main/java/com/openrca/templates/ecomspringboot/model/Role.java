package com.openrca.templates.ecomspringboot.model;


import com.openrca.templates.ecomspringboot.enums.ERoleName;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(length = 60)
	private ERoleName name;

	public Role(ERoleName name) {
		this.name = name;
	}
}
