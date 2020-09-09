package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ThumbnailPara
 */
public class ThumbnailPara  {

    /**
     * 采样类型。  取值如下： - \"PERCENT\"：根据视频时长的百分比间隔采样。 - \"TIME\"：根据时间间隔采样截图。 - \"DOTS\"：指定时间点截图。 默认值：\"TIME\" 
     */
    public static final class TypeEnum {

        
        /**
         * Enum PERCENT for value: "PERCENT"
         */
        public static final TypeEnum PERCENT = new TypeEnum("PERCENT");
        
        /**
         * Enum TIME for value: "TIME"
         */
        public static final TypeEnum TIME = new TypeEnum("TIME");
        
        /**
         * Enum DOTS for value: "DOTS"
         */
        public static final TypeEnum DOTS = new TypeEnum("DOTS");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("PERCENT", PERCENT);
            map.put("TIME", TIME);
            map.put("DOTS", DOTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
    private TypeEnum type = TypeEnum.TIME;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="percent")
    
    private Integer percent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private Integer time = 12;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Integer startTime = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private Integer duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dots")
    
    private List<Integer> dots = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_filename")
    
    private String outputFilename;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="format")
    
    private Integer format;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aspect_ratio")
    
    private Integer aspectRatio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="width")
    
    private Integer width;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="height")
    
    private Integer height;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_length")
    
    private Integer maxLength;

    public ThumbnailPara withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 采样类型。  取值如下： - \"PERCENT\"：根据视频时长的百分比间隔采样。 - \"TIME\"：根据时间间隔采样截图。 - \"DOTS\"：指定时间点截图。 默认值：\"TIME\" 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ThumbnailPara withPercent(Integer percent) {
        this.percent = percent;
        return this;
    }

    


    /**
     * 根据视频时长百分比间隔采样时的百分比值。 
     * @return percent
     */
    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
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
        if(this.dots == null ){
            this.dots = new ArrayList<>();
        }
        dotsSetter.accept(this.dots);
        return this;
    }

    /**
     * 指定时间截图时的时间点数组。 
     * @return dots
     */
    public List<Integer> getDots() {
        return dots;
    }

    public void setDots(List<Integer> dots) {
        this.dots = dots;
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
     * @return format
     */
    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public ThumbnailPara withAspectRatio(Integer aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    


    /**
     * 纵横比。 
     * @return aspectRatio
     */
    public Integer getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Integer aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public ThumbnailPara withWidth(Integer width) {
        this.width = width;
        return this;
    }

    


    /**
     * 图片宽度  取值范围：(96,3840]  单位：px 
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
     * 截图最长边的尺寸。宽边尺寸按照该尺寸与原始视频像素等比缩放计算。  取值范围：[240,3840]  单位：像素 > 该参数和width/height选择使用，以width/height优先，若width/height都不等于0，则图片尺寸按width/height得出；反之，则图片尺寸按 max_length 得出。 
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThumbnailPara thumbnailPara = (ThumbnailPara) o;
        return Objects.equals(this.type, thumbnailPara.type) &&
            Objects.equals(this.percent, thumbnailPara.percent) &&
            Objects.equals(this.time, thumbnailPara.time) &&
            Objects.equals(this.startTime, thumbnailPara.startTime) &&
            Objects.equals(this.duration, thumbnailPara.duration) &&
            Objects.equals(this.dots, thumbnailPara.dots) &&
            Objects.equals(this.outputFilename, thumbnailPara.outputFilename) &&
            Objects.equals(this.format, thumbnailPara.format) &&
            Objects.equals(this.aspectRatio, thumbnailPara.aspectRatio) &&
            Objects.equals(this.width, thumbnailPara.width) &&
            Objects.equals(this.height, thumbnailPara.height) &&
            Objects.equals(this.maxLength, thumbnailPara.maxLength);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, percent, time, startTime, duration, dots, outputFilename, format, aspectRatio, width, height, maxLength);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThumbnailPara {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    dots: ").append(toIndentedString(dots)).append("\n");
        sb.append("    outputFilename: ").append(toIndentedString(outputFilename)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
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

