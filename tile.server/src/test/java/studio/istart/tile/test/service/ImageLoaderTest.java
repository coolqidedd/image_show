package studio.istart.tile.test.service;

import org.junit.Test;
import studio.istart.tile.component.ImageLoader;
import studio.istart.tile.model.ZoomLevel;

import java.io.File;
import java.io.IOException;

/**
 * @author DongYan
 * @version 1.0.0
 * @since 1.8
 */
public class ImageLoaderTest {

    @Test
    @Deprecated
    public void zoom() throws IOException {
        ImageLoader
                .builder(new File("/Users/dongyan/Downloads/original/4_6827_13793.jpg"))
                .setZLevel(new ZoomLevel(1))
                .zoom()
                .toFile(new File("/Users/dongyan/Downloads/dest/zoom.jpg"));
    }

    @Test
    @Deprecated
    public void fill() throws IOException {
        ImageLoader
                .builder(new File("/Users/dongyan/Downloads/original/4_6827_13793.jpg"))
                .setZLevel(new ZoomLevel(1))
                .zoom()
                .toFile(new File("/Users/dongyan/Downloads/dest/zoom.jpg"))
                .fill()
                .toFile(new File("/Users/dongyan/Downloads/dest/fill.jpg"));
    }

    @Test
    public void cut() throws Exception {
        ImageLoader
                .builder(new File("/Users/dongyan/Downloads/original/4_6827_13793.jpg"))
                .cut(new ZoomLevel(1), "/Users/dongyan/Downloads/tiles");
    }
}
