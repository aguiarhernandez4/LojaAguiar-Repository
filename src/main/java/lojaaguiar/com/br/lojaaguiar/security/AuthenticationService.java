package lojaaguiar.com.br.lojaaguiar.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    JwtService jwtService;
}
