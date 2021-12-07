package ma.etb.demomss.dao.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {


}
