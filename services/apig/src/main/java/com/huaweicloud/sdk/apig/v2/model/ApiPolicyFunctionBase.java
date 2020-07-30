package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApiPolicyFunctionBase
 */
public class ApiPolicyFunctionBase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_urn")
    
    private String functionUrn;
    /**
     * 调用类型 - async： 异步 - sync：同步
     */
    public static class InvocationTypeEnum {

        
        /**
         * Enum ASYNC for value: "async"
         */
        public static final InvocationTypeEnum ASYNC = new InvocationTypeEnum("async");
        
        /**
         * Enum SYNC for value: "sync"
         */
        public static final InvocationTypeEnum SYNC = new InvocationTypeEnum("sync");
        

        public static final Map<String, InvocationTypeEnum> staticFields = new HashMap<String, InvocationTypeEnum>() {
            { 
                put("async", ASYNC);
                put("sync", SYNC);
            }
        };

        private String value;

        InvocationTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InvocationTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            InvocationTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new InvocationTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static InvocationTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            InvocationTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof InvocationTypeEnum) {
                return this.value.equals(((InvocationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invocation_type")
    
    private InvocationTypeEnum invocationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;

    public ApiPolicyFunctionBase withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    


    /**
     * 函数URN
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ApiPolicyFunctionBase withInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    


    /**
     * 调用类型 - async： 异步 - sync：同步
     * @return invocationType
     */
    public InvocationTypeEnum getInvocationType() {
        return invocationType;
    }

    public void setInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
    }

    public ApiPolicyFunctionBase withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 版本。字符长度不超过64
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ApiPolicyFunctionBase withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * API网关请求后端服务的超时时间。  单位：毫秒。请求参数值不在合法范围内时将使用默认值
     * minimum: 1
     * maximum: 60000
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiPolicyFunctionBase apiPolicyFunctionBase = (ApiPolicyFunctionBase) o;
        return Objects.equals(this.functionUrn, apiPolicyFunctionBase.functionUrn) &&
            Objects.equals(this.invocationType, apiPolicyFunctionBase.invocationType) &&
            Objects.equals(this.version, apiPolicyFunctionBase.version) &&
            Objects.equals(this.timeout, apiPolicyFunctionBase.timeout);
    }
    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, invocationType, version, timeout);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiPolicyFunctionBase {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

