package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * APIG触发器函数工作流后端详情（APIG触发器参数）。APIG触发器此参数必填。
 */
public class ApigTriggerFuncInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    /**
     * 调用函数执行方式。 - sync：同步执行 - async：异步执行
     */
    public static final class InvocationTypeEnum {

        /**
         * Enum SYNC for value: "sync"
         */
        public static final InvocationTypeEnum SYNC = new InvocationTypeEnum("sync");

        /**
         * Enum ASYNC for value: "async"
         */
        public static final InvocationTypeEnum ASYNC = new InvocationTypeEnum("async");

        private static final Map<String, InvocationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationTypeEnum> createStaticFields() {
            Map<String, InvocationTypeEnum> map = new HashMap<>();
            map.put("sync", SYNC);
            map.put("async", ASYNC);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvocationTypeEnum(value));
        }

        public static InvocationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "invocation_type")

    private InvocationTypeEnum invocationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ApigTriggerFuncInfo withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN，详细解释见FunctionGraph函数模型的描述。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ApigTriggerFuncInfo withInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * 调用函数执行方式。 - sync：同步执行 - async：异步执行
     * @return invocationType
     */
    public InvocationTypeEnum getInvocationType() {
        return invocationType;
    }

    public void setInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
    }

    public ApigTriggerFuncInfo withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * API网关请求函数服务的超时时间（毫秒）。APIG触发器此参数必填。
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

    public ApigTriggerFuncInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 函数版本信息。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApigTriggerFuncInfo that = (ApigTriggerFuncInfo) obj;
        return Objects.equals(this.functionUrn, that.functionUrn)
            && Objects.equals(this.invocationType, that.invocationType) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, invocationType, timeout, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigTriggerFuncInfo {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
