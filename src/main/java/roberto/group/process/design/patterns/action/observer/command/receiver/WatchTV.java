/**
 * FileName: WatchTV
 * Author:   HuangTaiHong
 * Date:     2018/11/25 14:48
 * Description: 电视机
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.design.patterns.action.observer.command.receiver;

import lombok.extern.slf4j.Slf4j;

/**
 * 〈一句话功能简述〉<br>
 * 〈电视机〉
 *
 * @author HuangTaiHong
 * @create 2018/11/25
 * @since 1.0.0
 */
@Slf4j
public class WatchTV {
    private final Font font = new Font();
    private final Background background =  new Background();

    public Font getFont() {
        return font;
    }

    public Background getBackground() {
        return background;
    }

    public void printStatus() {
        log.info("当前的字体:" + font + "\t当前的背景为:" + background);
    }

    public class Font {
        private String fontSize = "Normal";

        public String getFontSize() {
            return fontSize;
        }

        public void setFontSize(String fontSize) {
            this.fontSize = fontSize;
        }

        @Override
        public String toString() {
            return "Font{" + "fontSize='" + fontSize + '\'' + '}';
        }
    }

    public class Background {
        private String backgroundColor = "White";

        public String getBackgroundColor() {
            return backgroundColor;
        }

        public void setBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        @Override
        public String toString() {
            return "Background{" + "backgroundColor='" + backgroundColor + '\'' + '}';
        }
    }
}