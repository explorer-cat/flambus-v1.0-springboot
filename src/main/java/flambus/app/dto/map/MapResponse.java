package flambus.app.dto.map;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Builder
@Data
@AllArgsConstructor
public class MapResponse {

    @Builder
    @Data
    @AllArgsConstructor
    public static class MapStoreMarker {
        private long storeIdx;
        private Location location;
        private long journalCount; //리뷰개수

    }
    @Builder
    @Data
    @AllArgsConstructor
    public static class Location {
        private float lat;
        private float lng;
    }
}
