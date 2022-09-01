package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * span信息
 */
public class ClientSpanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_trace_id")

    @JacksonXmlProperty(localName = "global_trace_id")

    private String globalTraceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_path")

    @JacksonXmlProperty(localName = "global_path")

    private String globalPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    @JacksonXmlProperty(localName = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_id")

    @JacksonXmlProperty(localName = "span_id")

    private String spanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    @JacksonXmlProperty(localName = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private Long appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    @JacksonXmlProperty(localName = "biz_id")

    private Long bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private Integer domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    @JacksonXmlProperty(localName = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_source")

    @JacksonXmlProperty(localName = "real_source")

    private String realSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_used")

    @JacksonXmlProperty(localName = "time_used")

    private Long timeUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    @JacksonXmlProperty(localName = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "class_name")

    @JacksonXmlProperty(localName = "class_name")

    private String className;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_async")

    @JacksonXmlProperty(localName = "is_async")

    private Boolean isAsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_error")

    @JacksonXmlProperty(localName = "has_error")

    private Boolean hasError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reasons")

    @JacksonXmlProperty(localName = "error_reasons")

    private String errorReasons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_method")

    @JacksonXmlProperty(localName = "http_method")

    private String httpMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_code")

    @JacksonXmlProperty(localName = "biz_code")

    private String bizCode;

    public ClientSpanInfo withGlobalTraceId(String globalTraceId) {
        this.globalTraceId = globalTraceId;
        return this;
    }

    /**
     * vTraceId，虚拟traceI
     * @return globalTraceId
     */
    public String getGlobalTraceId() {
        return globalTraceId;
    }

    public void setGlobalTraceId(String globalTraceId) {
        this.globalTraceId = globalTraceId;
    }

    public ClientSpanInfo withGlobalPath(String globalPath) {
        this.globalPath = globalPath;
        return this;
    }

    /**
     * Get globalPath
     * @return globalPath
     */
    public String getGlobalPath() {
        return globalPath;
    }

    public void setGlobalPath(String globalPath) {
        this.globalPath = globalPath;
    }

    public ClientSpanInfo withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * Get traceId
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public ClientSpanInfo withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * Get spanId
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public ClientSpanInfo withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * Get envId
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public ClientSpanInfo withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get instanceId
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public ClientSpanInfo withAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get appId
     * @return appId
     */
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public ClientSpanInfo withBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * Get bizId
     * @return bizId
     */
    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public ClientSpanInfo withDomainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Get domainId
     * @return domainId
     */
    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public ClientSpanInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ClientSpanInfo withRealSource(String realSource) {
        this.realSource = realSource;
        return this;
    }

    /**
     * Get realSource
     * @return realSource
     */
    public String getRealSource() {
        return realSource;
    }

    public void setRealSource(String realSource) {
        this.realSource = realSource;
    }

    public ClientSpanInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ClientSpanInfo withTimeUsed(Long timeUsed) {
        this.timeUsed = timeUsed;
        return this;
    }

    /**
     * Get timeUsed
     * @return timeUsed
     */
    public Long getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Long timeUsed) {
        this.timeUsed = timeUsed;
    }

    public ClientSpanInfo withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ClientSpanInfo withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * Get className
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ClientSpanInfo withIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }

    /**
     * Get isAsync
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    public void setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public ClientSpanInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public ClientSpanInfo putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public ClientSpanInfo withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public ClientSpanInfo withHasError(Boolean hasError) {
        this.hasError = hasError;
        return this;
    }

    /**
     * Get hasError
     * @return hasError
     */
    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public ClientSpanInfo withErrorReasons(String errorReasons) {
        this.errorReasons = errorReasons;
        return this;
    }

    /**
     * Get errorReasons
     * @return errorReasons
     */
    public String getErrorReasons() {
        return errorReasons;
    }

    public void setErrorReasons(String errorReasons) {
        this.errorReasons = errorReasons;
    }

    public ClientSpanInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，mysql，kafka等
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClientSpanInfo withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * 这里的method实际上是tags里面的http_method，只有url监控项才有
     * @return httpMethod
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public ClientSpanInfo withBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }

    /**
     * 业务状态码的采集
     * @return bizCode
     */
    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientSpanInfo clientSpanInfo = (ClientSpanInfo) o;
        return Objects.equals(this.globalTraceId, clientSpanInfo.globalTraceId)
            && Objects.equals(this.globalPath, clientSpanInfo.globalPath)
            && Objects.equals(this.traceId, clientSpanInfo.traceId)
            && Objects.equals(this.spanId, clientSpanInfo.spanId) && Objects.equals(this.envId, clientSpanInfo.envId)
            && Objects.equals(this.instanceId, clientSpanInfo.instanceId)
            && Objects.equals(this.appId, clientSpanInfo.appId) && Objects.equals(this.bizId, clientSpanInfo.bizId)
            && Objects.equals(this.domainId, clientSpanInfo.domainId)
            && Objects.equals(this.source, clientSpanInfo.source)
            && Objects.equals(this.realSource, clientSpanInfo.realSource)
            && Objects.equals(this.startTime, clientSpanInfo.startTime)
            && Objects.equals(this.timeUsed, clientSpanInfo.timeUsed) && Objects.equals(this.code, clientSpanInfo.code)
            && Objects.equals(this.className, clientSpanInfo.className)
            && Objects.equals(this.isAsync, clientSpanInfo.isAsync) && Objects.equals(this.tags, clientSpanInfo.tags)
            && Objects.equals(this.hasError, clientSpanInfo.hasError)
            && Objects.equals(this.errorReasons, clientSpanInfo.errorReasons)
            && Objects.equals(this.type, clientSpanInfo.type)
            && Objects.equals(this.httpMethod, clientSpanInfo.httpMethod)
            && Objects.equals(this.bizCode, clientSpanInfo.bizCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalTraceId,
            globalPath,
            traceId,
            spanId,
            envId,
            instanceId,
            appId,
            bizId,
            domainId,
            source,
            realSource,
            startTime,
            timeUsed,
            code,
            className,
            isAsync,
            tags,
            hasError,
            errorReasons,
            type,
            httpMethod,
            bizCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientSpanInfo {\n");
        sb.append("    globalTraceId: ").append(toIndentedString(globalTraceId)).append("\n");
        sb.append("    globalPath: ").append(toIndentedString(globalPath)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    realSource: ").append(toIndentedString(realSource)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    timeUsed: ").append(toIndentedString(timeUsed)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    hasError: ").append(toIndentedString(hasError)).append("\n");
        sb.append("    errorReasons: ").append(toIndentedString(errorReasons)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
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
