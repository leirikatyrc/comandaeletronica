package br.com.comandaeletronica.permission;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.comandaeletronica.util.GenericService;
import br.com.comandaeletronica.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PERMISSION_PATH)
public class PermissionService extends GenericService<PermissionEntity, Long> {

	@Override
	public List<PermissionEntity> findAll() {
		return super.findAll();
	}

}
