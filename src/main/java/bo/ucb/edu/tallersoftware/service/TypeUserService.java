package bo.ucb.edu.tallersoftware.service;

import java.util.List;

import bo.ucb.edu.tallersoftware.model.TypeUser;

public interface TypeUserService {
    List<TypeUser> findAll();
    TypeUser updateAdministratorType(TypeUser tipoAdministrador, Integer tipoAdministradorId);
}
