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
 * Multidrm
 */
public class Multidrm  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_id")
    
    private String contentId;
    /**
     * 定义数据流的类型，取值为DASH或HLS 
     */
    public static final class StreamingModeEnum {

        
        /**
         * Enum DASH for value: "DASH"
         */
        public static final StreamingModeEnum DASH = new StreamingModeEnum("DASH");
        
        /**
         * Enum HLS for value: "HLS"
         */
        public static final StreamingModeEnum HLS = new StreamingModeEnum("HLS");
        

        private static final Map<String, StreamingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StreamingModeEnum> createStaticFields() {
            Map<String, StreamingModeEnum> map = new HashMap<>();
            map.put("DASH", DASH);
            map.put("HLS", HLS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StreamingModeEnum(String value) {
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
        public static StreamingModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StreamingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StreamingModeEnum(value);
            }
            return result;
        }

        public static StreamingModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StreamingModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StreamingModeEnum) {
                return this.value.equals(((StreamingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="streaming_mode")
    
    private StreamingModeEnum streamingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypt_audio")
    
    private Integer encryptAudio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="emi")
    
    private Integer emi = 16420;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="drm_list")
    
    private List<String> drmList = new ArrayList<>();
    
    public Multidrm withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    


    /**
     * 唯一标识 
     * @return contentId
     */
    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public Multidrm withStreamingMode(StreamingModeEnum streamingMode) {
        this.streamingMode = streamingMode;
        return this;
    }

    


    /**
     * 定义数据流的类型，取值为DASH或HLS 
     * @return streamingMode
     */
    public StreamingModeEnum getStreamingMode() {
        return streamingMode;
    }

    public void setStreamingMode(StreamingModeEnum streamingMode) {
        this.streamingMode = streamingMode;
    }

    public Multidrm withEncryptAudio(Integer encryptAudio) {
        this.encryptAudio = encryptAudio;
        return this;
    }

    


    /**
     * 音频加密开关。  取值如下： - 0：标识音频不加密。 - 1：标识音频加密。  默认值：0。 该参数只对dash有效。 
     * minimum: 0
     * maximum: 2
     * @return encryptAudio
     */
    public Integer getEncryptAudio() {
        return encryptAudio;
    }

    public void setEncryptAudio(Integer encryptAudio) {
        this.encryptAudio = encryptAudio;
    }

    public Multidrm withEmi(Integer emi) {
        this.emi = emi;
        return this;
    }

    


    /**
     * 定义加密方式。  取值如下： - 16418(AES-128,CBC) - 16420(AES-128,CTR) - 16422(SM4CBC) 
     * minimum: 0
     * maximum: 2147483647
     * @return emi
     */
    public Integer getEmi() {
        return emi;
    }

    public void setEmi(Integer emi) {
        this.emi = emi;
    }

    public Multidrm withDrmList(List<String> drmList) {
        this.drmList = drmList;
        return this;
    }

    
    public Multidrm addDrmListItem(String drmListItem) {
        this.drmList.add(drmListItem);
        return this;
    }

    public Multidrm withDrmList(Consumer<List<String>> drmListSetter) {
        if(this.drmList == null ){
            this.drmList = new ArrayList<>();
        }
        drmListSetter.accept(this.drmList);
        return this;
    }

    /**
     * HLS视频加密控制参数。  取值如下： - PLAYREADY - CHINA_DRM - WIDEVINE 
     * @return drmList
     */
    public List<String> getDrmList() {
        return drmList;
    }

    public void setDrmList(List<String> drmList) {
        this.drmList = drmList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Multidrm multidrm = (Multidrm) o;
        return Objects.equals(this.contentId, multidrm.contentId) &&
            Objects.equals(this.streamingMode, multidrm.streamingMode) &&
            Objects.equals(this.encryptAudio, multidrm.encryptAudio) &&
            Objects.equals(this.emi, multidrm.emi) &&
            Objects.equals(this.drmList, multidrm.drmList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(contentId, streamingMode, encryptAudio, emi, drmList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Multidrm {\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    streamingMode: ").append(toIndentedString(streamingMode)).append("\n");
        sb.append("    encryptAudio: ").append(toIndentedString(encryptAudio)).append("\n");
        sb.append("    emi: ").append(toIndentedString(emi)).append("\n");
        sb.append("    drmList: ").append(toIndentedString(drmList)).append("\n");
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

