package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.FunctionApiBaseInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 函数工作流后端详情
 */
public class ApiFunc  {



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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="register_time")
    
    private OffsetDateTime registerTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private OffsetDateTime updateTime;

    public ApiFunc withFunctionUrn(String functionUrn) {
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

    

    public ApiFunc withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述信息。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public ApiFunc withInvocationType(InvocationTypeEnum invocationType) {
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

    

    public ApiFunc withVersion(String version) {
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

    

    public ApiFunc withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * ROMA Connect APIC请求后端服务的超时时间。最大超时时间可通过实例特性backend_timeout配置修改，可修改的上限为600000  单位：毫秒。
     * minimum: 1
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    

    public ApiFunc withAuthorizerId(String authorizerId) {
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

    

    public ApiFunc withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ApiFunc withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    


    /**
     * 注册时间
     * @return registerTime
     */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    

    public ApiFunc withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 后端状态   - 1： 有效
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ApiFunc withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiFunc apiFunc = (ApiFunc) o;
        return Objects.equals(this.functionUrn, apiFunc.functionUrn) &&
            Objects.equals(this.remark, apiFunc.remark) &&
            Objects.equals(this.invocationType, apiFunc.invocationType) &&
            Objects.equals(this.version, apiFunc.version) &&
            Objects.equals(this.timeout, apiFunc.timeout) &&
            Objects.equals(this.authorizerId, apiFunc.authorizerId) &&
            Objects.equals(this.id, apiFunc.id) &&
            Objects.equals(this.registerTime, apiFunc.registerTime) &&
            Objects.equals(this.status, apiFunc.status) &&
            Objects.equals(this.updateTime, apiFunc.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, remark, invocationType, version, timeout, authorizerId, id, registerTime, status, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiFunc {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

