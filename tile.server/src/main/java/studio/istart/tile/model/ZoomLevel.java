package studio.istart.tile.model;

import com.google.common.collect.Range;
import lombok.Data;
import lombok.NoArgsConstructor;
import studio.istart.tile.service.TileService;

import static studio.istart.tile.component.ZoomLevelComponent.MAX_LEVEL_NUM;
import static studio.istart.tile.component.ZoomLevelComponent.MIN_LEVEL_NUM;
import static studio.istart.tile.component.ZoomLevelComponent.ZOOM_LEVEL_RANGE;

/**
 * @author DongYan
 * @version 1.0.0
 * @since 1.8
 */
@Data
@NoArgsConstructor
public class ZoomLevel {
    private int level;
    /**
     * map width = map height = 256 * 2lg(level) pixels
     */
    private Range<Long> lengthRange;

    public ZoomLevel(int level) {
        this.level = level;
        int lower;
        if (ZOOM_LEVEL_RANGE.contains(level)) {
            lower = TileService.SIZE_PIXEL << (level - 1);
        } else {
            throw new IllegalArgumentException("the level " + level + " not in range");
        }
        this.lengthRange = Range.openClosed((long) lower,
                (long) TileService.SIZE_PIXEL << (long) level);
    }
}