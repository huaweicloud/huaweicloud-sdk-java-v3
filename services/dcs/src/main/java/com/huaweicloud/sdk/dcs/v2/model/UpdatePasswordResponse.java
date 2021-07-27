package com.huaweicloud.sdk.dcs.v2.model;




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
public class UpdatePasswordResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_time")
    
    private String lockTime;
    /**
     * 密码修改结果： - 成功：success； - 密码验证失败：passwordFailed； - 已锁定：locked； - 失败：failed。 
     */
    public static final class ResultEnum {

        
        /**
         * Enum SUCCESS for value: "success"
         */
        public static final ResultEnum SUCCESS = new ResultEnum("success");
        
        /**
         * Enum PASSWORDFAILED for value: "passwordFailed"
         */
        public static final ResultEnum PASSWORDFAILED = new ResultEnum("passwordFailed");
        
        /**
         * Enum LOCKED for value: "locked"
         */
        public static final ResultEnum LOCKED = new ResultEnum("locked");
        
        /**
         * Enum FAILED for value: "failed"
         */
        public static final ResultEnum FAILED = new ResultEnum("failed");
        

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("passwordFailed", PASSWORDFAILED);
            map.put("locked", LOCKED);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResultEnum(value);
            }
            return result;
        }

        public static ResultEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private ResultEnum result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_time_left")
    
    private String lockTimeLeft;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retry_times_left")
    
    private String retryTimesLeft;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;

    public UpdatePasswordResponse withLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    


    /**
     * 锁定时间。验证失败时和锁定时该参数返回不为null
     * @return lockTime
     */
    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    

    public UpdatePasswordResponse withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    


    /**
     * 密码修改结果： - 成功：success； - 密码验证失败：passwordFailed； - 已锁定：locked； - 失败：failed。 
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    

    public UpdatePasswordResponse withLockTimeLeft(String lockTimeLeft) {
        this.lockTimeLeft = lockTimeLeft;
        return this;
    }

    


    /**
     * 锁定剩余时间。锁定时该参数返回不为null
     * @return lockTimeLeft
     */
    public String getLockTimeLeft() {
        return lockTimeLeft;
    }

    public void setLockTimeLeft(String lockTimeLeft) {
        this.lockTimeLeft = lockTimeLeft;
    }

    

    public UpdatePasswordResponse withRetryTimesLeft(String retryTimesLeft) {
        this.retryTimesLeft = retryTimesLeft;
        return this;
    }

    


    /**
     * 密码验证剩余次数。验证失败时该参数返回不为null
     * @return retryTimesLeft
     */
    public String getRetryTimesLeft() {
        return retryTimesLeft;
    }

    public void setRetryTimesLeft(String retryTimesLeft) {
        this.retryTimesLeft = retryTimesLeft;
    }

    

    public UpdatePasswordResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 修改结果。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePasswordResponse updatePasswordResponse = (UpdatePasswordResponse) o;
        return Objects.equals(this.lockTime, updatePasswordResponse.lockTime) &&
            Objects.equals(this.result, updatePasswordResponse.result) &&
            Objects.equals(this.lockTimeLeft, updatePasswordResponse.lockTimeLeft) &&
            Objects.equals(this.retryTimesLeft, updatePasswordResponse.retryTimesLeft) &&
            Objects.equals(this.message, updatePasswordResponse.message);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lockTime, result, lockTimeLeft, retryTimesLeft, message);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePasswordResponse {\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    lockTimeLeft: ").append(toIndentedString(lockTimeLeft)).append("\n");
        sb.append("    retryTimesLeft: ").append(toIndentedString(retryTimesLeft)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

