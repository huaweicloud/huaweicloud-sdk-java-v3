package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AnimatedGraphicsOutputParam
 */
public class AnimatedGraphicsOutputParam {

    /**
     * 动图格式，目前仅支持取值 gif 
     */
    public static final class FormatEnum {

        /**
         * Enum GIF for value: "gif"
         */
        public static final FormatEnum GIF = new FormatEnum("gif");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("gif", GIF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FormatEnum(value));
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Integer end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Integer frameRate;

    public AnimatedGraphicsOutputParam withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 动图格式，目前仅支持取值 gif 
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public AnimatedGraphicsOutputParam withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 输出动图的宽。  取值范围：0，-1或[32,3840]之间2的倍数。  >- 若设置为-1， 则宽根据高来自适应，此时“height”不能取-1或0。 >- 若设置为0，则取原始视频的宽，此时“height”只能取0。 
     * minimum: -1
     * maximum: 3840
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public AnimatedGraphicsOutputParam withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 输出动图的高。  取值范围：0，-1或[32,2160]之间2的倍数。  >- 若设置为-1， 则高根据宽来自适应，此时“width”不能取-1或0。 >- 若设置为0，则取原始视频的高，此时“width”只能取0。 
     * minimum: -1
     * maximum: 2160
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public AnimatedGraphicsOutputParam withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 起始时间，单位：毫秒 
     * minimum: 0
     * maximum: 2147483647
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public AnimatedGraphicsOutputParam withEnd(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * 结束时间。  单位：毫秒。  end、start差值最多60秒。 
     * minimum: 0
     * maximum: 2147483647
     * @return end
     */
    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public AnimatedGraphicsOutputParam withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 动图帧率。  取值范围：[1,75] 
     * minimum: 0
     * maximum: 76
     * @return frameRate
     */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnimatedGraphicsOutputParam that = (AnimatedGraphicsOutputParam) obj;
        return Objects.equals(this.format, that.format) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.start, that.start)
            && Objects.equals(this.end, that.end) && Objects.equals(this.frameRate, that.frameRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, width, height, start, end, frameRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimatedGraphicsOutputParam {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
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
