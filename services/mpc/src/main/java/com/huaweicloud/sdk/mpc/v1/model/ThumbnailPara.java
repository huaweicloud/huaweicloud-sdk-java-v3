package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThumbnailPara
 */
public class ThumbnailPara {

    /**
     * 采样类型。  取值如下： - \"TIME\"：根据时间间隔采样截图。 - \"DOTS\"：指定时间点截图。选择同步截图时，需指定此类型。 - \"DOTS_MS\"：同步截图指定时间点毫秒值。  默认值：\"TIME\" 
     */
    public static final class TypeEnum {

        /**
         * Enum TIME for value: "TIME"
         */
        public static final TypeEnum TIME = new TypeEnum("TIME");

        /**
         * Enum DOTS for value: "DOTS"
         */
        public static final TypeEnum DOTS = new TypeEnum("DOTS");

        /**
         * Enum DOTS_MS for value: "DOTS_MS"
         */
        public static final TypeEnum DOTS_MS = new TypeEnum("DOTS_MS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("TIME", TIME);
            map.put("DOTS", DOTS);
            map.put("DOTS_MS", DOTS_MS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Integer amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Integer time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dots")

    private List<Integer> dots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dots_ms")

    private List<Integer> dotsMs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_filename")

    private String outputFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private Integer format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    public ThumbnailPara withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 采样类型。  取值如下： - \"TIME\"：根据时间间隔采样截图。 - \"DOTS\"：指定时间点截图。选择同步截图时，需指定此类型。 - \"DOTS_MS\"：同步截图指定时间点毫秒值。  默认值：\"TIME\" 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ThumbnailPara withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 黑点比例大于等于此值认为是黑帧。 
     * minimum: 1
     * maximum: 100
     * @return amount
     */
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ThumbnailPara withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 像素值小于此值认为是黑点。 
     * minimum: 0
     * maximum: 255
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public ThumbnailPara withTime(Integer time) {
        this.time = time;
        return this;
    }

    /**
     * 采样截图的时间间隔值。  默认值：12。  单位：秒 
     * minimum: 1
     * maximum: 100
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public ThumbnailPara withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 采样类型为“TIME”模式的开始时间，和“time”配合使用。  默认值：0。  单位：秒。 
     * minimum: 0
     * maximum: 2147483647
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public ThumbnailPara withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 采样类型为“TIME”模式的持续时间，和“time”、“start_time”配合使用，表示从视频文件的第“start_time”开始，持续时间为“duration”，每间隔“time”生成一张截图。 取值范围：[数字，ToEND]。“ToEND”表示持续到视频结束。  默认值： ToEND。  单位：秒。 > “duration”必须大于等0，若设置为0，则截图持续时间从“start_time”到视频结束。 
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ThumbnailPara withDots(List<Integer> dots) {
        this.dots = dots;
        return this;
    }

    public ThumbnailPara addDotsItem(Integer dotsItem) {
        if (this.dots == null) {
            this.dots = new ArrayList<>();
        }
        this.dots.add(dotsItem);
        return this;
    }

    public ThumbnailPara withDots(Consumer<List<Integer>> dotsSetter) {
        if (this.dots == null) {
            this.dots = new ArrayList<>();
        }
        dotsSetter.accept(this.dots);
        return this;
    }

    /**
     * 指定时间截图时的时间点数组，最多支持10个。 
     * @return dots
     */
    public List<Integer> getDots() {
        return dots;
    }

    public void setDots(List<Integer> dots) {
        this.dots = dots;
    }

    public ThumbnailPara withDotsMs(List<Integer> dotsMs) {
        this.dotsMs = dotsMs;
        return this;
    }

    public ThumbnailPara addDotsMsItem(Integer dotsMsItem) {
        if (this.dotsMs == null) {
            this.dotsMs = new ArrayList<>();
        }
        this.dotsMs.add(dotsMsItem);
        return this;
    }

    public ThumbnailPara withDotsMs(Consumer<List<Integer>> dotsMsSetter) {
        if (this.dotsMs == null) {
            this.dotsMs = new ArrayList<>();
        }
        dotsMsSetter.accept(this.dotsMs);
        return this;
    }

    /**
     * 同步截图下，指定时间截图的时间点数组，单位毫秒  例如输入[1000]，截取视频第1000毫秒位置的图像帧，仅支持一个时间点 
     * @return dotsMs
     */
    public List<Integer> getDotsMs() {
        return dotsMs;
    }

    public void setDotsMs(List<Integer> dotsMs) {
        this.dotsMs = dotsMs;
    }

    public ThumbnailPara withOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
        return this;
    }

    /**
     * 截图输出文件名。  - 如果只抽一张图（即：按DOTS方式，指定1个时间点）则按该指定文件名输出图片。  - 如果抽多张图（即：按DOTS方式指定多个时间点或按TIME间隔截图）则输出图片名在该指定文件名基础上在增加时间点（示例：output_filename_10.jpg）。  - 如果指定了压缩抽帧图片生成tar包，则tar包按该指定文件名输出。 
     * @return outputFilename
     */
    public String getOutputFilename() {
        return outputFilename;
    }

    public void setOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
    }

    public ThumbnailPara withFormat(Integer format) {
        this.format = format;
        return this;
    }

    /**
     * 截图文件格式。  取值如下：  1：表示jpg格式 
     * minimum: 0
     * maximum: 100
     * @return format
     */
    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public ThumbnailPara withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 图片宽度  取值范围：(96,3840]  单位：px 
     * minimum: 0
     * maximum: 3840
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public ThumbnailPara withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 图片高度  取值范围：(96,2160]  单位：px 
     * minimum: 0
     * maximum: 2160
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ThumbnailPara withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * 截图最长边的尺寸。宽边尺寸按照该尺寸与原始视频像素等比缩放计算。   取值范围：[240,3840]  默认值：480  单位：像素  > 该参数和width/height选择使用，以width/height优先，若width/height都不等于0，则图片尺寸按width/height得出；反之，则图片尺寸按 max_length 得出。  > 若该参数和width/height都未选择，则按源片源宽高输出截图 
     * minimum: 0
     * maximum: 3840
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThumbnailPara that = (ThumbnailPara) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.threshold, that.threshold) && Objects.equals(this.time, that.time)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.dots, that.dots) && Objects.equals(this.dotsMs, that.dotsMs)
            && Objects.equals(this.outputFilename, that.outputFilename) && Objects.equals(this.format, that.format)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.maxLength, that.maxLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            amount,
            threshold,
            time,
            startTime,
            duration,
            dots,
            dotsMs,
            outputFilename,
            format,
            width,
            height,
            maxLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThumbnailPara {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    dots: ").append(toIndentedString(dots)).append("\n");
        sb.append("    dotsMs: ").append(toIndentedString(dotsMs)).append("\n");
        sb.append("    outputFilename: ").append(toIndentedString(outputFilename)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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
