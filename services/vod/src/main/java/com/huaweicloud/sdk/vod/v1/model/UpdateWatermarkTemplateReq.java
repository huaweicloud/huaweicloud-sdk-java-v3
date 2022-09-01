package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
public class UpdateWatermarkTemplateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    @JacksonXmlProperty(localName = "dx")

    private String dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    @JacksonXmlProperty(localName = "dy")

    private String dy;

    /**
     * 水印的位置<br/>
     */
    public static final class PositionEnum {

        /**
         * Enum TOPRIGHT for value: "TOPRIGHT"
         */
        public static final PositionEnum TOPRIGHT = new PositionEnum("TOPRIGHT");

        /**
         * Enum TOPLEFT for value: "TOPLEFT"
         */
        public static final PositionEnum TOPLEFT = new PositionEnum("TOPLEFT");

        /**
         * Enum BOTTOMRIGHT for value: "BOTTOMRIGHT"
         */
        public static final PositionEnum BOTTOMRIGHT = new PositionEnum("BOTTOMRIGHT");

        /**
         * Enum BOTTOMLEFT for value: "BOTTOMLEFT"
         */
        public static final PositionEnum BOTTOMLEFT = new PositionEnum("BOTTOMLEFT");

        private static final Map<String, PositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PositionEnum> createStaticFields() {
            Map<String, PositionEnum> map = new HashMap<>();
            map.put("TOPRIGHT", TOPRIGHT);
            map.put("TOPLEFT", TOPLEFT);
            map.put("BOTTOMRIGHT", BOTTOMRIGHT);
            map.put("BOTTOMLEFT", BOTTOMLEFT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PositionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PositionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PositionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PositionEnum(value);
            }
            return result;
        }

        public static PositionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PositionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PositionEnum) {
                return this.value.equals(((PositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    @JacksonXmlProperty(localName = "position")

    private PositionEnum position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    @JacksonXmlProperty(localName = "width")

    private String width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    @JacksonXmlProperty(localName = "height")

    private String height;

    /**
     * 水印类型，当前只支持Image（图片水印）<br/>
     */
    public static final class WatermarkTypeEnum {

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final WatermarkTypeEnum IMAGE = new WatermarkTypeEnum("IMAGE");

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final WatermarkTypeEnum TEXT = new WatermarkTypeEnum("TEXT");

        private static final Map<String, WatermarkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WatermarkTypeEnum> createStaticFields() {
            Map<String, WatermarkTypeEnum> map = new HashMap<>();
            map.put("IMAGE", IMAGE);
            map.put("TEXT", TEXT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WatermarkTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static WatermarkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            WatermarkTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new WatermarkTypeEnum(value);
            }
            return result;
        }

        public static WatermarkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            WatermarkTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WatermarkTypeEnum) {
                return this.value.equals(((WatermarkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_type")

    @JacksonXmlProperty(localName = "watermark_type")

    private WatermarkTypeEnum watermarkType;

    /**
     * type设置为Image时有效。  目前包括： - Original：只做简单缩放，不做其他处理 - Transparent：图片底色透明 - Grayed：彩色图片变灰
     */
    public static final class ImageProcessEnum {

        /**
         * Enum ORIGINAL for value: "ORIGINAL"
         */
        public static final ImageProcessEnum ORIGINAL = new ImageProcessEnum("ORIGINAL");

        /**
         * Enum TRANSPARENT for value: "TRANSPARENT"
         */
        public static final ImageProcessEnum TRANSPARENT = new ImageProcessEnum("TRANSPARENT");

        /**
         * Enum GRAYED for value: "GRAYED"
         */
        public static final ImageProcessEnum GRAYED = new ImageProcessEnum("GRAYED");

        private static final Map<String, ImageProcessEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageProcessEnum> createStaticFields() {
            Map<String, ImageProcessEnum> map = new HashMap<>();
            map.put("ORIGINAL", ORIGINAL);
            map.put("TRANSPARENT", TRANSPARENT);
            map.put("GRAYED", GRAYED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageProcessEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ImageProcessEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ImageProcessEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ImageProcessEnum(value);
            }
            return result;
        }

        public static ImageProcessEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ImageProcessEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageProcessEnum) {
                return this.value.equals(((ImageProcessEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_process")

    @JacksonXmlProperty(localName = "image_process")

    private ImageProcessEnum imageProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_start")

    @JacksonXmlProperty(localName = "timeline_start")

    private String timelineStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_duration")

    @JacksonXmlProperty(localName = "timeline_duration")

    private String timelineDuration;

    public UpdateWatermarkTemplateReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 水印模板配置id<br/>
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateWatermarkTemplateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 水印模板名称<br/>
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateWatermarkTemplateReq withDx(String dx) {
        this.dx = dx;
        return this;
    }

    /**
     * 水印图片相对输出视频的水平偏移量，默认值是0<br/>
     * @return dx
     */
    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public UpdateWatermarkTemplateReq withDy(String dy) {
        this.dy = dy;
        return this;
    }

    /**
     * 水印图片相对输出视频的垂直偏移量，默认值是0<br/>
     * @return dy
     */
    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public UpdateWatermarkTemplateReq withPosition(PositionEnum position) {
        this.position = position;
        return this;
    }

    /**
     * 水印的位置<br/>
     * @return position
     */
    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    public UpdateWatermarkTemplateReq withWidth(String width) {
        this.width = width;
        return this;
    }

    /**
     * 水印图片宽<br/>
     * @return width
     */
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public UpdateWatermarkTemplateReq withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 水印图片高<br/>
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public UpdateWatermarkTemplateReq withWatermarkType(WatermarkTypeEnum watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }

    /**
     * 水印类型，当前只支持Image（图片水印）<br/>
     * @return watermarkType
     */
    public WatermarkTypeEnum getWatermarkType() {
        return watermarkType;
    }

    public void setWatermarkType(WatermarkTypeEnum watermarkType) {
        this.watermarkType = watermarkType;
    }

    public UpdateWatermarkTemplateReq withImageProcess(ImageProcessEnum imageProcess) {
        this.imageProcess = imageProcess;
        return this;
    }

    /**
     * type设置为Image时有效。  目前包括： - Original：只做简单缩放，不做其他处理 - Transparent：图片底色透明 - Grayed：彩色图片变灰
     * @return imageProcess
     */
    public ImageProcessEnum getImageProcess() {
        return imageProcess;
    }

    public void setImageProcess(ImageProcessEnum imageProcess) {
        this.imageProcess = imageProcess;
    }

    public UpdateWatermarkTemplateReq withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    /**
     * 水印开始时间，与\"timeline_duration\"配合使用。 取值范围:[0, END)。\"END\"表示视频结束时间。 单位:秒。 
     * @return timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public UpdateWatermarkTemplateReq withTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
        return this;
    }

    /**
     * 水印持续时间，与\"timeline_start\"配合使用。 取值范围:(0,END-开始时间]。\"END\"表示视频结束时间。 单位:秒。 默认:END。 
     * @return timelineDuration
     */
    public String getTimelineDuration() {
        return timelineDuration;
    }

    public void setTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWatermarkTemplateReq updateWatermarkTemplateReq = (UpdateWatermarkTemplateReq) o;
        return Objects.equals(this.id, updateWatermarkTemplateReq.id)
            && Objects.equals(this.name, updateWatermarkTemplateReq.name)
            && Objects.equals(this.dx, updateWatermarkTemplateReq.dx)
            && Objects.equals(this.dy, updateWatermarkTemplateReq.dy)
            && Objects.equals(this.position, updateWatermarkTemplateReq.position)
            && Objects.equals(this.width, updateWatermarkTemplateReq.width)
            && Objects.equals(this.height, updateWatermarkTemplateReq.height)
            && Objects.equals(this.watermarkType, updateWatermarkTemplateReq.watermarkType)
            && Objects.equals(this.imageProcess, updateWatermarkTemplateReq.imageProcess)
            && Objects.equals(this.timelineStart, updateWatermarkTemplateReq.timelineStart)
            && Objects.equals(this.timelineDuration, updateWatermarkTemplateReq.timelineDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            dx,
            dy,
            position,
            width,
            height,
            watermarkType,
            imageProcess,
            timelineStart,
            timelineDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWatermarkTemplateReq {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    watermarkType: ").append(toIndentedString(watermarkType)).append("\n");
        sb.append("    imageProcess: ").append(toIndentedString(imageProcess)).append("\n");
        sb.append("    timelineStart: ").append(toIndentedString(timelineStart)).append("\n");
        sb.append("    timelineDuration: ").append(toIndentedString(timelineDuration)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
