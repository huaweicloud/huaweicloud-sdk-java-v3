package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObjectImageSpriteTask
 */
public class ObjectImageSpriteTask {

    /**
     * 采样类型，取值： - PERCENT：按百分比 - TIME：按时间间隔 
     */
    public static final class SampleTypeEnum {

        /**
         * Enum PERCENT for value: "PERCENT"
         */
        public static final SampleTypeEnum PERCENT = new SampleTypeEnum("PERCENT");

        /**
         * Enum TIME for value: "TIME"
         */
        public static final SampleTypeEnum TIME = new SampleTypeEnum("TIME");

        private static final Map<String, SampleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SampleTypeEnum> createStaticFields() {
            Map<String, SampleTypeEnum> map = new HashMap<>();
            map.put("PERCENT", PERCENT);
            map.put("TIME", TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SampleTypeEnum(String value) {
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
        public static SampleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SampleTypeEnum(value));
        }

        public static SampleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SampleTypeEnum) {
                return this.value.equals(((SampleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_type")

    private SampleTypeEnum sampleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_interval")

    private Integer sampleInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_count")

    private Integer rowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_count")

    private Integer columnCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    /**
     * 分辨率自适应，可选值： - open：开启，此时，Width 代表视频的长边，Height 表示视频的短边； - close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。 
     */
    public static final class ResolutionAdaptiveEnum {

        /**
         * Enum OPEN for value: "open"
         */
        public static final ResolutionAdaptiveEnum OPEN = new ResolutionAdaptiveEnum("open");

        /**
         * Enum CLOSE for value: "close"
         */
        public static final ResolutionAdaptiveEnum CLOSE = new ResolutionAdaptiveEnum("close");

        private static final Map<String, ResolutionAdaptiveEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResolutionAdaptiveEnum> createStaticFields() {
            Map<String, ResolutionAdaptiveEnum> map = new HashMap<>();
            map.put("open", OPEN);
            map.put("close", CLOSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResolutionAdaptiveEnum(String value) {
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
        public static ResolutionAdaptiveEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResolutionAdaptiveEnum(value));
        }

        public static ResolutionAdaptiveEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResolutionAdaptiveEnum) {
                return this.value.equals(((ResolutionAdaptiveEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_adaptive")

    private ResolutionAdaptiveEnum resolutionAdaptive;

    /**
     * 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式： - stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“； - black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。 - white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。 
     */
    public static final class FillTypeEnum {

        /**
         * Enum STRETCH for value: "stretch"
         */
        public static final FillTypeEnum STRETCH = new FillTypeEnum("stretch");

        /**
         * Enum BLACK for value: "black"
         */
        public static final FillTypeEnum BLACK = new FillTypeEnum("black");

        /**
         * Enum WHITE for value: "white"
         */
        public static final FillTypeEnum WHITE = new FillTypeEnum("white");

        /**
         * Enum GAUSS for value: "gauss"
         */
        public static final FillTypeEnum GAUSS = new FillTypeEnum("gauss");

        private static final Map<String, FillTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FillTypeEnum> createStaticFields() {
            Map<String, FillTypeEnum> map = new HashMap<>();
            map.put("stretch", STRETCH);
            map.put("black", BLACK);
            map.put("white", WHITE);
            map.put("gauss", GAUSS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FillTypeEnum(String value) {
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
        public static FillTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FillTypeEnum(value));
        }

        public static FillTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FillTypeEnum) {
                return this.value.equals(((FillTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fill_type")

    private FillTypeEnum fillType;

    /**
     * 图片格式，取值为 jpg、png。默认为 jpg。
     */
    public static final class FormatEnum {

        /**
         * Enum JPG for value: "jpg"
         */
        public static final FormatEnum JPG = new FormatEnum("jpg");

        /**
         * Enum PNG for value: "png"
         */
        public static final FormatEnum PNG = new FormatEnum("png");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("jpg", JPG);
            map.put("png", PNG);
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
    @JsonProperty(value = "output_object_name")

    private String outputObjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webvtt_object_name")

    private String webvttObjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsInfo output;

    public ObjectImageSpriteTask withSampleType(SampleTypeEnum sampleType) {
        this.sampleType = sampleType;
        return this;
    }

    /**
     * 采样类型，取值： - PERCENT：按百分比 - TIME：按时间间隔 
     * @return sampleType
     */
    public SampleTypeEnum getSampleType() {
        return sampleType;
    }

    public void setSampleType(SampleTypeEnum sampleType) {
        this.sampleType = sampleType;
    }

    public ObjectImageSpriteTask withSampleInterval(Integer sampleInterval) {
        this.sampleInterval = sampleInterval;
        return this;
    }

    /**
     * 采样间隔。 -当 sample_type 为 PERCENT 时，指定采样间隔的百分比，(0<sample_interval<=100)。 -当 sample_type 为 TIME 时，指定采样间隔的时间，单位为秒(>0)。 
     * minimum: 1
     * maximum: 2147483647
     * @return sampleInterval
     */
    public Integer getSampleInterval() {
        return sampleInterval;
    }

    public void setSampleInterval(Integer sampleInterval) {
        this.sampleInterval = sampleInterval;
    }

    public ObjectImageSpriteTask withRowCount(Integer rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /**
     * 雪碧图中小图的行数，行数*列数不得超过 100。
     * minimum: 1
     * maximum: 100
     * @return rowCount
     */
    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public ObjectImageSpriteTask withColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
        return this;
    }

    /**
     * 雪碧图中小图的列数，行数*列数不得超过 100。
     * minimum: 0
     * maximum: 100
     * @return columnCount
     */
    public Integer getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public ObjectImageSpriteTask withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 雪碧图中小图的宽度（或长边）的最大值，取值范围：0 和 [96, 4096]，单位：px。 - 当 width、height 均为 0，则分辨率同源； - 当 width 为 0，Height 非 0，则 Width 按比例缩放； - 当 width 非 0，Height 为 0，则 Height 按比例缩放； - 当 width、Height 均非 0，则分辨率按用户指定 
     * minimum: 0
     * maximum: 4096
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public ObjectImageSpriteTask withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 雪碧图中小图的高度（或短边）的最大值，取值范围：0 和 [96, 4096]，单位：px。 - 当 width、height 均为 0，则分辨率同源； - 当 width 为 0，height 非 0，则 width 按比例缩放； - 当 width 非 0，height 为 0，则 height 按比例缩放； - 当 width、height 均非 0，则分辨率按用户指定。 
     * minimum: 0
     * maximum: 4096
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ObjectImageSpriteTask withResolutionAdaptive(ResolutionAdaptiveEnum resolutionAdaptive) {
        this.resolutionAdaptive = resolutionAdaptive;
        return this;
    }

    /**
     * 分辨率自适应，可选值： - open：开启，此时，Width 代表视频的长边，Height 表示视频的短边； - close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。 
     * @return resolutionAdaptive
     */
    public ResolutionAdaptiveEnum getResolutionAdaptive() {
        return resolutionAdaptive;
    }

    public void setResolutionAdaptive(ResolutionAdaptiveEnum resolutionAdaptive) {
        this.resolutionAdaptive = resolutionAdaptive;
    }

    public ObjectImageSpriteTask withFillType(FillTypeEnum fillType) {
        this.fillType = fillType;
        return this;
    }

    /**
     * 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式： - stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“； - black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。 - white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。 
     * @return fillType
     */
    public FillTypeEnum getFillType() {
        return fillType;
    }

    public void setFillType(FillTypeEnum fillType) {
        this.fillType = fillType;
    }

    public ObjectImageSpriteTask withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 图片格式，取值为 jpg、png。默认为 jpg。
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public ObjectImageSpriteTask withOutputObjectName(String outputObjectName) {
        this.outputObjectName = outputObjectName;
        return this;
    }

    /**
     * 截取雪碧图后，雪碧图图片文件的输出文件名，如果不填，则默认为：{inputName}_imageSprite_{雪碧图id}_{number}.{format}.{雪碧图id}和{number}从0开始递增 
     * @return outputObjectName
     */
    public String getOutputObjectName() {
        return outputObjectName;
    }

    public void setOutputObjectName(String outputObjectName) {
        this.outputObjectName = outputObjectName;
    }

    public ObjectImageSpriteTask withWebvttObjectName(String webvttObjectName) {
        this.webvttObjectName = webvttObjectName;
        return this;
    }

    /**
     * 截取雪碧图后，Web VTT 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：{inputName}_imageSprite_{雪碧图_id}.vtt 
     * @return webvttObjectName
     */
    public String getWebvttObjectName() {
        return webvttObjectName;
    }

    public void setWebvttObjectName(String webvttObjectName) {
        this.webvttObjectName = webvttObjectName;
    }

    public ObjectImageSpriteTask withOutput(ObsInfo output) {
        this.output = output;
        return this;
    }

    public ObjectImageSpriteTask withOutput(Consumer<ObsInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public ObsInfo getOutput() {
        return output;
    }

    public void setOutput(ObsInfo output) {
        this.output = output;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectImageSpriteTask that = (ObjectImageSpriteTask) obj;
        return Objects.equals(this.sampleType, that.sampleType)
            && Objects.equals(this.sampleInterval, that.sampleInterval) && Objects.equals(this.rowCount, that.rowCount)
            && Objects.equals(this.columnCount, that.columnCount) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height)
            && Objects.equals(this.resolutionAdaptive, that.resolutionAdaptive)
            && Objects.equals(this.fillType, that.fillType) && Objects.equals(this.format, that.format)
            && Objects.equals(this.outputObjectName, that.outputObjectName)
            && Objects.equals(this.webvttObjectName, that.webvttObjectName) && Objects.equals(this.output, that.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleType,
            sampleInterval,
            rowCount,
            columnCount,
            width,
            height,
            resolutionAdaptive,
            fillType,
            format,
            outputObjectName,
            webvttObjectName,
            output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectImageSpriteTask {\n");
        sb.append("    sampleType: ").append(toIndentedString(sampleType)).append("\n");
        sb.append("    sampleInterval: ").append(toIndentedString(sampleInterval)).append("\n");
        sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
        sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    resolutionAdaptive: ").append(toIndentedString(resolutionAdaptive)).append("\n");
        sb.append("    fillType: ").append(toIndentedString(fillType)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    outputObjectName: ").append(toIndentedString(outputObjectName)).append("\n");
        sb.append("    webvttObjectName: ").append(toIndentedString(webvttObjectName)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
