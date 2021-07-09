package com.huaweicloud.sdk.vod.v1.model;




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
 * PreheatingResult
 */
public class PreheatingResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;
    /**
     * 预热任务状态。  取值如下： - processing：处理中 - succeed：预热完成 - failed：预热失败
     */
    public static final class StatusEnum {

        
        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StatusEnum PROCESSING = new StatusEnum("PROCESSING");
        
        /**
         * Enum SUCCEED for value: "SUCCEED"
         */
        public static final StatusEnum SUCCEED = new StatusEnum("SUCCEED");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEED", SUCCEED);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;

    public PreheatingResult withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 媒资URL。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public PreheatingResult withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 预热任务状态。  取值如下： - processing：处理中 - succeed：预热完成 - failed：预热失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreheatingResult preheatingResult = (PreheatingResult) o;
        return Objects.equals(this.url, preheatingResult.url) &&
            Objects.equals(this.status, preheatingResult.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreheatingResult {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

