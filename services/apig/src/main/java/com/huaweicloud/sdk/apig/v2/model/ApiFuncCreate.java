package com.huaweicloud.sdk.apig.v2.model;




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
 * 函数后端详情
 */
public class ApiFuncCreate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_urn")
    
    private String functionUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;
    /**
     * 调用类型 - async： 异步 - sync：同步
     */
    public static final class InvocationTypeEnum {

        
        /**
         * Enum ASYNC for value: "async"
         */
        public static final InvocationTypeEnum ASYNC = new InvocationTypeEnum("async");
        
        /**
         * Enum SYNC for value: "sync"
         */
        public static final InvocationTypeEnum SYNC = new InvocationTypeEnum("sync");
        

        private static final Map<String, InvocationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationTypeEnum> createStaticFields() {
            Map<String, InvocationTypeEnum> map = new HashMap<>();
            map.put("async", ASYNC);
            map.put("sync", SYNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvocationTypeEnum(String value) {
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
        public static InvocationTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            InvocationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InvocationTypeEnum(value);
            }
            return result;
        }

        public static InvocationTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            InvocationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvocationTypeEnum) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorizer_id")
    
    private String authorizerId;

    public ApiFuncCreate withFunctionUrn(String functionUrn) {
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

    

    public ApiFuncCreate withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述信息。长度不超过255个字符 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public ApiFuncCreate withInvocationType(InvocationTypeEnum invocationType) {
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

    

    public ApiFuncCreate withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public ApiFuncCreate withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * API网关请求后端服务的超时时间。最大超时时间可通过实例特性backend_timeout配置修改，可修改的上限为600000。  单位：毫秒。
     * minimum: 1
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    

    public ApiFuncCreate withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    


    /**
     * 后端自定义认证ID
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiFuncCreate apiFuncCreate = (ApiFuncCreate) o;
        return Objects.equals(this.functionUrn, apiFuncCreate.functionUrn) &&
            Objects.equals(this.remark, apiFuncCreate.remark) &&
            Objects.equals(this.invocationType, apiFuncCreate.invocationType) &&
            Objects.equals(this.version, apiFuncCreate.version) &&
            Objects.equals(this.timeout, apiFuncCreate.timeout) &&
            Objects.equals(this.authorizerId, apiFuncCreate.authorizerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, remark, invocationType, version, timeout, authorizerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiFuncCreate {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
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

