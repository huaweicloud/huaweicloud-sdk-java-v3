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
 * VideoInfo
 */
public class VideoInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="width")
    
    private Integer width;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="height")
    
    private Integer height;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bitrate")
    
    private Integer bitrate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bitrate_bps")
    
    private Long bitrateBps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="frame_rate")
    
    private Integer frameRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="codec")
    
    private String codec;
    /**
     * 片源动态范围类型。  取值如下： - SDR - HDR10 - CUVA_HDR 
     */
    public static final class DynamicRangeEnum {

        
        /**
         * Enum SDR for value: "SDR"
         */
        public static final DynamicRangeEnum SDR = new DynamicRangeEnum("SDR");
        
        /**
         * Enum HDR10 for value: "HDR10"
         */
        public static final DynamicRangeEnum HDR10 = new DynamicRangeEnum("HDR10");
        
        /**
         * Enum CUVA_HDR for value: "CUVA_HDR"
         */
        public static final DynamicRangeEnum CUVA_HDR = new DynamicRangeEnum("CUVA_HDR");
        

        private static final Map<String, DynamicRangeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DynamicRangeEnum> createStaticFields() {
            Map<String, DynamicRangeEnum> map = new HashMap<>();
            map.put("SDR", SDR);
            map.put("HDR10", HDR10);
            map.put("CUVA_HDR", CUVA_HDR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DynamicRangeEnum(String value) {
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
        public static DynamicRangeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DynamicRangeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DynamicRangeEnum(value);
            }
            return result;
        }

        public static DynamicRangeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DynamicRangeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DynamicRangeEnum) {
                return this.value.equals(((DynamicRangeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dynamic_range")
    
    private DynamicRangeEnum dynamicRange;

    public VideoInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    


    /**
     * 视频宽度
     * minimum: 0
     * maximum: 2147483647
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    

    public VideoInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    


    /**
     * 视频高度
     * minimum: 0
     * maximum: 2147483647
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    

    public VideoInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    


    /**
     * 视频码率，单位: kbit/s 
     * minimum: 0
     * maximum: 2147483647
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    

    public VideoInfo withBitrateBps(Long bitrateBps) {
        this.bitrateBps = bitrateBps;
        return this;
    }

    


    /**
     * 视频码率，单位: bit/s 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return bitrateBps
     */
    public Long getBitrateBps() {
        return bitrateBps;
    }

    public void setBitrateBps(Long bitrateBps) {
        this.bitrateBps = bitrateBps;
    }

    

    public VideoInfo withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    


    /**
     * 帧率。    取值范围：0或[5,60]，0表示自适应。    单位：帧每秒。    > 若设置的帧率不在取值范围内，则自动调整为0，若设置的帧率高于片源帧率，则自动调整为片源帧率。 
     * minimum: 0
     * maximum: 2147483647
     * @return frameRate
     */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    

    public VideoInfo withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    


    /**
     * 视频编码格式
     * @return codec
     */
    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    

    public VideoInfo withDynamicRange(DynamicRangeEnum dynamicRange) {
        this.dynamicRange = dynamicRange;
        return this;
    }

    


    /**
     * 片源动态范围类型。  取值如下： - SDR - HDR10 - CUVA_HDR 
     * @return dynamicRange
     */
    public DynamicRangeEnum getDynamicRange() {
        return dynamicRange;
    }

    public void setDynamicRange(DynamicRangeEnum dynamicRange) {
        this.dynamicRange = dynamicRange;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) o;
        return Objects.equals(this.width, videoInfo.width) &&
            Objects.equals(this.height, videoInfo.height) &&
            Objects.equals(this.bitrate, videoInfo.bitrate) &&
            Objects.equals(this.bitrateBps, videoInfo.bitrateBps) &&
            Objects.equals(this.frameRate, videoInfo.frameRate) &&
            Objects.equals(this.codec, videoInfo.codec) &&
            Objects.equals(this.dynamicRange, videoInfo.dynamicRange);
    }
    @Override
    public int hashCode() {
        return Objects.hash(width, height, bitrate, bitrateBps, frameRate, codec, dynamicRange);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoInfo {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    bitrateBps: ").append(toIndentedString(bitrateBps)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    dynamicRange: ").append(toIndentedString(dynamicRange)).append("\n");
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

