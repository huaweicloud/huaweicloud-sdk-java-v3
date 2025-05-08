package com.huaweicloud.sdk.vod.v1.model;

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
 * ObjectThumbnailTask
 */
public class ObjectThumbnailTask {

    /**
     * 采样类型。 取值如下： PERCENT：根据视频时长百分比间隔采样时的百分比值。 DOTS：指定时间点截图。选择同步截图时，需指定此类型。 
     */
    public static final class TypeEnum {

        /**
         * Enum PERCENT for value: "PERCENT"
         */
        public static final TypeEnum PERCENT = new TypeEnum("PERCENT");

        /**
         * Enum DOTS for value: "DOTS"
         */
        public static final TypeEnum DOTS = new TypeEnum("DOTS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("PERCENT", PERCENT);
            map.put("DOTS", DOTS);
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
    @JsonProperty(value = "percent")

    private Integer percent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dots")

    private List<Integer> dots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_filename")

    private String outputFilename;

    /**
     * 截图文件格式 取值如下：jpg、png 
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsInfo output;

    public ObjectThumbnailTask withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 采样类型。 取值如下： PERCENT：根据视频时长百分比间隔采样时的百分比值。 DOTS：指定时间点截图。选择同步截图时，需指定此类型。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ObjectThumbnailTask withPercent(Integer percent) {
        this.percent = percent;
        return this;
    }

    /**
     * 根据视频时长百分比间隔采样时的百分比值。 
     * minimum: 0
     * maximum: 100
     * @return percent
     */
    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public ObjectThumbnailTask withDots(List<Integer> dots) {
        this.dots = dots;
        return this;
    }

    public ObjectThumbnailTask addDotsItem(Integer dotsItem) {
        if (this.dots == null) {
            this.dots = new ArrayList<>();
        }
        this.dots.add(dotsItem);
        return this;
    }

    public ObjectThumbnailTask withDots(Consumer<List<Integer>> dotsSetter) {
        if (this.dots == null) {
            this.dots = new ArrayList<>();
        }
        dotsSetter.accept(this.dots);
        return this;
    }

    /**
     * 指定时间截图的时间点数组 例如输入[1,3,5]，分别截取视频第1秒、第3秒、第5秒位置的图像帧 最多支持10个时间点 
     * @return dots
     */
    public List<Integer> getDots() {
        return dots;
    }

    public void setDots(List<Integer> dots) {
        this.dots = dots;
    }

    public ObjectThumbnailTask withOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
        return this;
    }

    /**
     * 截图输出文件名。 - 如果只抽一张图（即：按DOTS方式，指定1个时间点）则按该指定文件名输出图片。 - 如果抽多张图（即：按DOTS方式指定多个时间点或按TIME间隔截图）则输出图片名在该指定文件名基础上在增加时间点（示例：output_filename_10.jpg）。 - 如果按照PERCENT截图则按照output_filename_0.jpg,output_filename_1.jpg顺序命名 
     * @return outputFilename
     */
    public String getOutputFilename() {
        return outputFilename;
    }

    public void setOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
    }

    public ObjectThumbnailTask withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 截图文件格式 取值如下：jpg、png 
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public ObjectThumbnailTask withFillType(FillTypeEnum fillType) {
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

    public ObjectThumbnailTask withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 图片宽度 取值范围： - [96,3840] - 0：自适应，保持原有宽高 单位：px 
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

    public ObjectThumbnailTask withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 图片高度 取值范围： - [96,2160] - 0：自适应，保持原有宽高 单位：px 
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

    public ObjectThumbnailTask withOutput(ObsInfo output) {
        this.output = output;
        return this;
    }

    public ObjectThumbnailTask withOutput(Consumer<ObsInfo> outputSetter) {
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
        ObjectThumbnailTask that = (ObjectThumbnailTask) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.percent, that.percent)
            && Objects.equals(this.dots, that.dots) && Objects.equals(this.outputFilename, that.outputFilename)
            && Objects.equals(this.format, that.format) && Objects.equals(this.fillType, that.fillType)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.output, that.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, percent, dots, outputFilename, format, fillType, width, height, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectThumbnailTask {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
        sb.append("    dots: ").append(toIndentedString(dots)).append("\n");
        sb.append("    outputFilename: ").append(toIndentedString(outputFilename)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    fillType: ").append(toIndentedString(fillType)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
