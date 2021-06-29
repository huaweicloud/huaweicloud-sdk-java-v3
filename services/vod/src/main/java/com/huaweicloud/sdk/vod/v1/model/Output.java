package com.huaweicloud.sdk.vod.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.MetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转码输出数组。 - HLS或DASH格式：此数组的成员个数为n+1，n为转码输出路数。 - MP4格式：此数组的成员个数为n，n为转码输出路数。
 */
public class Output  {

    /**
     * 协议类型。 取值如下： - hls - dash - mp4
     */
    public static final class PlayTypeEnum {

        
        /**
         * Enum HLS for value: "HLS"
         */
        public static final PlayTypeEnum HLS = new PlayTypeEnum("HLS");
        
        /**
         * Enum DASH for value: "DASH"
         */
        public static final PlayTypeEnum DASH = new PlayTypeEnum("DASH");
        
        /**
         * Enum MP4 for value: "MP4"
         */
        public static final PlayTypeEnum MP4 = new PlayTypeEnum("MP4");
        
        /**
         * Enum MP3 for value: "MP3"
         */
        public static final PlayTypeEnum MP3 = new PlayTypeEnum("MP3");
        
        /**
         * Enum AAC for value: "AAC"
         */
        public static final PlayTypeEnum AAC = new PlayTypeEnum("AAC");
        

        private static final Map<String, PlayTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayTypeEnum> createStaticFields() {
            Map<String, PlayTypeEnum> map = new HashMap<>();
            map.put("HLS", HLS);
            map.put("DASH", DASH);
            map.put("MP4", MP4);
            map.put("MP3", MP3);
            map.put("AAC", AAC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayTypeEnum(String value) {
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
        public static PlayTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PlayTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PlayTypeEnum(value);
            }
            return result;
        }

        public static PlayTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PlayTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PlayTypeEnum) {
                return this.value.equals(((PlayTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="play_type")
    
    private PlayTypeEnum playType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;
    /**
     * 标记流是否已被加密。 取值如下： - 0：表示未加密。 - 1：表示已被加密。
     */
    public static final class EncryptedEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final EncryptedEnum NUMBER_0 = new EncryptedEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final EncryptedEnum NUMBER_1 = new EncryptedEnum(1);
        

        private static final Map<Integer, EncryptedEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, EncryptedEnum> createStaticFields() {
            Map<Integer, EncryptedEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        EncryptedEnum(Integer value) {
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
        public static EncryptedEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            EncryptedEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EncryptedEnum(value);
            }
            return result;
        }

        public static EncryptedEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            EncryptedEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EncryptedEnum) {
                return this.value.equals(((EncryptedEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypted")
    
    private EncryptedEnum encrypted;
    /**
     * 清晰度。 取值如下： - FLUENT：流畅 - SD：标清 - HD：高清 - FULL_HD：超清
     */
    public static final class QualityEnum {

        
        /**
         * Enum FLUENT for value: "FLUENT"
         */
        public static final QualityEnum FLUENT = new QualityEnum("FLUENT");
        
        /**
         * Enum SD for value: "SD"
         */
        public static final QualityEnum SD = new QualityEnum("SD");
        
        /**
         * Enum HD for value: "HD"
         */
        public static final QualityEnum HD = new QualityEnum("HD");
        
        /**
         * Enum FULL_HD for value: "FULL_HD"
         */
        public static final QualityEnum FULL_HD = new QualityEnum("FULL_HD");
        

        private static final Map<String, QualityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QualityEnum> createStaticFields() {
            Map<String, QualityEnum> map = new HashMap<>();
            map.put("FLUENT", FLUENT);
            map.put("SD", SD);
            map.put("HD", HD);
            map.put("FULL_HD", FULL_HD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QualityEnum(String value) {
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
        public static QualityEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            QualityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QualityEnum(value);
            }
            return result;
        }

        public static QualityEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            QualityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof QualityEnum) {
                return this.value.equals(((QualityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quality")
    
    private QualityEnum quality;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private MetaData metaData;

    public Output withPlayType(PlayTypeEnum playType) {
        this.playType = playType;
        return this;
    }

    


    /**
     * 协议类型。 取值如下： - hls - dash - mp4
     * @return playType
     */
    public PlayTypeEnum getPlayType() {
        return playType;
    }

    public void setPlayType(PlayTypeEnum playType) {
        this.playType = playType;
    }

    

    public Output withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 播放URL。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public Output withEncrypted(EncryptedEnum encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    


    /**
     * 标记流是否已被加密。 取值如下： - 0：表示未加密。 - 1：表示已被加密。
     * @return encrypted
     */
    public EncryptedEnum getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(EncryptedEnum encrypted) {
        this.encrypted = encrypted;
    }

    

    public Output withQuality(QualityEnum quality) {
        this.quality = quality;
        return this;
    }

    


    /**
     * 清晰度。 取值如下： - FLUENT：流畅 - SD：标清 - HD：高清 - FULL_HD：超清
     * @return quality
     */
    public QualityEnum getQuality() {
        return quality;
    }

    public void setQuality(QualityEnum quality) {
        this.quality = quality;
    }

    

    public Output withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public Output withMetaData(Consumer<MetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new MetaData();
            metaDataSetter.accept(this.metaData);
        }
        
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Output output = (Output) o;
        return Objects.equals(this.playType, output.playType) &&
            Objects.equals(this.url, output.url) &&
            Objects.equals(this.encrypted, output.encrypted) &&
            Objects.equals(this.quality, output.quality) &&
            Objects.equals(this.metaData, output.metaData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(playType, url, encrypted, quality, metaData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Output {\n");
        sb.append("    playType: ").append(toIndentedString(playType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

