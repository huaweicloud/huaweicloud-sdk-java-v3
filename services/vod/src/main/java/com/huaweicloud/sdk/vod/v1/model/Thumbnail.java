package com.huaweicloud.sdk.vod.v1.model;




import java.util.Collections;

import java.util.Collections;

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
 * 截图参数
 */
public class Thumbnail  {

    /**
     * 截图类型。 取值如下： - time：每次进行截图的间隔时间。 - dots: 按照指定的时间点截图。
     */
    public static final class TypeEnum {

        
        /**
         * Enum TIME for value: "time"
         */
        public static final TypeEnum TIME = new TypeEnum("time");
        
        /**
         * Enum PERCENT for value: "percent"
         */
        public static final TypeEnum PERCENT = new TypeEnum("percent");
        
        /**
         * Enum DOTS for value: "dots"
         */
        public static final TypeEnum DOTS = new TypeEnum("dots");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("time", TIME);
            map.put("percent", PERCENT);
            map.put("dots", DOTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
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
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private Integer time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dots")
    
    private List<Integer> dots = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cover_position")
    
    private Integer coverPosition;
    /**
     * 截图文件格式。 取值如下： - 1：jpg。 默认值：1 。
     */
    public static final class FormatEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final FormatEnum NUMBER_1 = new FormatEnum(1);
        

        private static final Map<Integer, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, FormatEnum> createStaticFields() {
            Map<Integer, FormatEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        FormatEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FormatEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FormatEnum(value);
            }
            return result;
        }

        public static FormatEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof FormatEnum) {
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
    @JsonProperty(value="format")
    
    private FormatEnum format;
    /**
     * 纵横比，图像缩放方式。 取值如下： - 0：自适应（保持原有宽高比）。 - 1：16:9。 默认值：0。
     */
    public static final class AspectRatioEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AspectRatioEnum NUMBER_0 = new AspectRatioEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AspectRatioEnum NUMBER_1 = new AspectRatioEnum(1);
        

        private static final Map<Integer, AspectRatioEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AspectRatioEnum> createStaticFields() {
            Map<Integer, AspectRatioEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AspectRatioEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AspectRatioEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            AspectRatioEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AspectRatioEnum(value);
            }
            return result;
        }

        public static AspectRatioEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            AspectRatioEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AspectRatioEnum) {
                return this.value.equals(((AspectRatioEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aspect_ratio")
    
    private AspectRatioEnum aspectRatio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_length")
    
    private Integer maxLength;

    public Thumbnail withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 截图类型。 取值如下： - time：每次进行截图的间隔时间。 - dots: 按照指定的时间点截图。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public Thumbnail withTime(Integer time) {
        this.time = time;
        return this;
    }

    


    /**
     * 根据时间间隔采样时的时间间隔值。 取值范围：[1,12]之间的整数。 单位：秒。
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    

    public Thumbnail withDots(List<Integer> dots) {
        this.dots = dots;
        return this;
    }

    
    public Thumbnail addDotsItem(Integer dotsItem) {
        if(this.dots == null) {
            this.dots = new ArrayList<>();
        }
        this.dots.add(dotsItem);
        return this;
    }

    public Thumbnail withDots(Consumer<List<Integer>> dotsSetter) {
        if(this.dots == null) {
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

    

    public Thumbnail withCoverPosition(Integer coverPosition) {
        this.coverPosition = coverPosition;
        return this;
    }

    


    /**
     * 该值表示指定第几张截图作为封面(默认值：1)。
     * @return coverPosition
     */
    public Integer getCoverPosition() {
        return coverPosition;
    }

    public void setCoverPosition(Integer coverPosition) {
        this.coverPosition = coverPosition;
    }

    

    public Thumbnail withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    


    /**
     * 截图文件格式。 取值如下： - 1：jpg。 默认值：1 。
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    

    public Thumbnail withAspectRatio(AspectRatioEnum aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    


    /**
     * 纵横比，图像缩放方式。 取值如下： - 0：自适应（保持原有宽高比）。 - 1：16:9。 默认值：0。
     * @return aspectRatio
     */
    public AspectRatioEnum getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(AspectRatioEnum aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    

    public Thumbnail withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    


    /**
     * 截图最长边的尺寸。 单位：像素。 宽边尺寸按照该尺寸与原始视频像素等比缩放计算。
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
        Thumbnail thumbnail = (Thumbnail) o;
        return Objects.equals(this.type, thumbnail.type) &&
            Objects.equals(this.time, thumbnail.time) &&
            Objects.equals(this.dots, thumbnail.dots) &&
            Objects.equals(this.coverPosition, thumbnail.coverPosition) &&
            Objects.equals(this.format, thumbnail.format) &&
            Objects.equals(this.aspectRatio, thumbnail.aspectRatio) &&
            Objects.equals(this.maxLength, thumbnail.maxLength);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, time, dots, coverPosition, format, aspectRatio, maxLength);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Thumbnail {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    dots: ").append(toIndentedString(dots)).append("\n");
        sb.append("    coverPosition: ").append(toIndentedString(coverPosition)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
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

