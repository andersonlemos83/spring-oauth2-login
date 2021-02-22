package br.com.udemy.oauth2login.service;

import br.com.udemy.oauth2login.domain.AlcateiaUser;
import br.com.udemy.oauth2login.repository.AlcateiaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginService implements UserDetailsService {

    @Autowired
    private AlcateiaUserRepository alcateiaUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AlcateiaUser alcateiaUser = alcateiaUserRepository.findByLogin(username);

        if (alcateiaUser == null) {
            return null;
        }

        String[] rolesUser = {"USER"};
        List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(rolesUser);

        return new User(alcateiaUser.getLogin(), alcateiaUser.getPass(), authorities);
    }
}