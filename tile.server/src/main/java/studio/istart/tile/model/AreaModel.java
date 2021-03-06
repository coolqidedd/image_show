package studio.istart.tile.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DongYan
 * @version 1.0.0
 * @since 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaModel {
    /**
     * 前端定义的id
     */
    private String areaId;

    /**
     * 区域坐标
     */
    private Object[][][] coordinates;

    /**
     * 标记内容
     */
    private String content;

    /**
     * 边颜色
     */
    private String color;


}
