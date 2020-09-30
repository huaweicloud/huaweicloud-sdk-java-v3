package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RemuxOutputParam
 */
public class RemuxOutputParam  {

    /**
     * 输出格式。 
     */
    public static final class FormatEnum {

        
        /**
         * Enum HLS for value: "HLS"
         */
        public static final FormatEnum HLS = new FormatEnum("HLS");
        
        /**
         * Enum MP4 for value: "MP4"
         */
        public static final FormatEnum MP4 = new FormatEnum("MP4");
        

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("HLS", HLS);
            map.put("MP4", MP4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FormatEnum(value);
            }
            return result;
        }

        public static FormatEnum valueOf(String value) {
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
    
    private FormatEnum format = FormatEnum.MP4;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="segment_duration")
    
    private Integer segmentDuration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remove_meta")
    
    private Boolean removeMeta = false;

    public RemuxOutputParam withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    


    /**
     * 输出格式。 
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public RemuxOutputParam withSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }

    


    /**
     * 分片时长，仅当“format”为“HLS”时有效。  取值范围：[2，10]。  默认值： 5。  单位：秒。 
     * @return segmentDuration
     */
    public Integer getSegmentDuration() {
        return segmentDuration;
    }

    public void setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
    }

    public RemuxOutputParam withRemoveMeta(Boolean removeMeta) {
        this.removeMeta = removeMeta;
        return this;
    }

    


    /**
     * 输出媒体是否去除片源的中metadata信息。 
     * @return removeMeta
     */
    public Boolean getRemoveMeta() {
        return removeMeta;
    }

    public void setRemoveMeta(Boolean removeMeta) {
        this.removeMeta = removeMeta;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemuxOutputParam remuxOutputParam = (RemuxOutputParam) o;
        return Objects.equals(this.format, remuxOutputParam.format) &&
            Objects.equals(this.segmentDuration, remuxOutputParam.segmentDuration) &&
            Objects.equals(this.removeMeta, remuxOutputParam.removeMeta);
    }
    @Override
    public int hashCode() {
        return Objects.hash(format, segmentDuration, removeMeta);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemuxOutputParam {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    segmentDuration: ").append(toIndentedString(segmentDuration)).append("\n");
        sb.append("    removeMeta: ").append(toIndentedString(removeMeta)).append("\n");
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

