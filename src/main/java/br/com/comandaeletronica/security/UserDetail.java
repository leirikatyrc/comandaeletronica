package br.com.comandaeletronica.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.comandaeletronica.permission.PermissionEntity;
import br.com.comandaeletronica.user.UserEntity;
import br.com.comandaeletronica.user.UserRepository;

@Component
public class UserDetail implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity user = this.userRepository.findByEmail(email);

		if (user == null) {
			throw new UsernameNotFoundException("Usuario com e-mail \"" + email + "\" não foi encontrado");
		}

		LoginDetailBean login = new LoginDetailBean(user.getName(), user.getEmail(), user.getPassword());

		for (PermissionEntity permission : user.getPermissions()) {
			login.addRole(permission.getRole());
		}

		return login;
	}

}
