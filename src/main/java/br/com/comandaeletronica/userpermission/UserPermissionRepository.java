package br.com.comandaeletronica.userpermission;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPermissionRepository extends JpaRepository<UserPermissionEntity, UserPermissionKey> {

}
