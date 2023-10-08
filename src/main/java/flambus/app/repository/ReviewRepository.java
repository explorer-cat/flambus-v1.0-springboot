package flambus.app.repository;//package flambus.flambus_v10.repository;

import flambus.app.entity.Member;
import flambus.app.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    Long countByStoreIdx(long storeIdx);

}