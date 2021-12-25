package com.huaweicloud.sdk.mrs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

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
 * Response Object
 */
public class CancelSqlResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    
    private String message;
    /**
     * 取消SQL的执行结果。  说明： 默认返回SUCCEED，对于已经结束的任务也会返回SUCCEED，只有取消正在运行的SQL时没成功才会FAILED。  枚举值： - SUCCEED：成功 - FAILED：失败
     */
    public static final class StatusEnum {

        
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
            return value;
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
            if (obj instanceof StatusEnum) {
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

    public CancelSqlResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 错误信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

    public CancelSqlResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 取消SQL的执行结果。  说明： 默认返回SUCCEED，对于已经结束的任务也会返回SUCCEED，只有取消正在运行的SQL时没成功才会FAILED。  枚举值： - SUCCEED：成功 - FAILED：失败
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
        CancelSqlResponse cancelSqlResponse = (CancelSqlResponse) o;
        return Objects.equals(this.message, cancelSqlResponse.message) &&
            Objects.equals(this.status, cancelSqlResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(message, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelSqlResponse {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

