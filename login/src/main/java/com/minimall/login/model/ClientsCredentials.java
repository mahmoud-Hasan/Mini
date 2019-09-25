package com.minimall.login.model;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
@Table("clients_credintials")
public class ClientsCredentials implements UserDetails{
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey(value="user_name")
	@NotNull
    @NotEmpty
	private String username;
	
	@NotNull
    @NotEmpty
	private String password;
	
	@Column("is_active")
	private boolean isActive;
	
	@Column("company_name")
	private String companyName;
	
	@Email
	private String email;
	
	@NotNull
	@NotEmpty
	private List<String> roles;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
