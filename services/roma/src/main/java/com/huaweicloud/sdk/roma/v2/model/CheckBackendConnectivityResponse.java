package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

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
 * Response Object
 */
public class CheckBackendConnectivityResponse extends SdkResponse {

    /**
     * 后端服务连通性检测结果  SUCCESS - 连通  FAILED - 不连通
     */
    public static final class CheckResultEnum {

        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final CheckResultEnum SUCCESS = new CheckResultEnum("SUCCESS");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final CheckResultEnum FAILED = new CheckResultEnum("FAILED");
        

        private static final Map<String, CheckResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CheckResultEnum> createStaticFields() {
            Map<String, CheckResultEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CheckResultEnum(String value) {
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
        public static CheckResultEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CheckResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CheckResultEnum(value);
            }
            return result;
        }

        public static CheckResultEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CheckResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CheckResultEnum) {
                return this.value.equals(((CheckResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="check_result")
    
    private CheckResultEnum checkResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failures")
    
    private List<String> failures = null;
    
    public CheckBackendConnectivityResponse withCheckResult(CheckResultEnum checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    


    /**
     * 后端服务连通性检测结果  SUCCESS - 连通  FAILED - 不连通
     * @return checkResult
     */
    public CheckResultEnum getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(CheckResultEnum checkResult) {
        this.checkResult = checkResult;
    }

    public CheckBackendConnectivityResponse withFailures(List<String> failures) {
        this.failures = failures;
        return this;
    }

    
    public CheckBackendConnectivityResponse addFailuresItem(String failuresItem) {
        if (this.failures == null) {
            this.failures = new ArrayList<>();
        }
        this.failures.add(failuresItem);
        return this;
    }

    public CheckBackendConnectivityResponse withFailures(Consumer<List<String>> failuresSetter) {
        if(this.failures == null ){
            this.failures = new ArrayList<>();
        }
        failuresSetter.accept(this.failures);
        return this;
    }

    /**
     * 后端服务连通检测失败的列表
     * @return failures
     */
    public List<String> getFailures() {
        return failures;
    }

    public void setFailures(List<String> failures) {
        this.failures = failures;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckBackendConnectivityResponse checkBackendConnectivityResponse = (CheckBackendConnectivityResponse) o;
        return Objects.equals(this.checkResult, checkBackendConnectivityResponse.checkResult) &&
            Objects.equals(this.failures, checkBackendConnectivityResponse.failures);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkResult, failures);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckBackendConnectivityResponse {\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
        sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
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

