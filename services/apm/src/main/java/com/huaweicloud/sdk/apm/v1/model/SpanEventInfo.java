package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * event信息的简要信息
 */
public class SpanEventInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    @JacksonXmlProperty(localName = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    @JacksonXmlProperty(localName = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indent")

    @JacksonXmlProperty(localName = "indent")

    private Integer indent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    @JacksonXmlProperty(localName = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    @JacksonXmlProperty(localName = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    @JacksonXmlProperty(localName = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    @JacksonXmlProperty(localName = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_spanId")

    @JacksonXmlProperty(localName = "next_spanId")

    private String nextSpanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_event_id")

    @JacksonXmlProperty(localName = "source_event_id")

    private String sourceEventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    @JacksonXmlProperty(localName = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children_event_count")

    @JacksonXmlProperty(localName = "children_event_count")

    private Integer childrenEventCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discard")

    @JacksonXmlProperty(localName = "discard")

    private List<DiscardInfo> discard = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "argument")

    @JacksonXmlProperty(localName = "argument")

    private String argument;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    @JacksonXmlProperty(localName = "attachment")

    private Map<String, String> attachment = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    public SpanEventInfo withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 环境名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public SpanEventInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组件名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public SpanEventInfo withIndent(Integer indent) {
        this.indent = indent;
        return this;
    }

    /**
     * 缩进
     * @return indent
     */
    public Integer getIndent() {
        return indent;
    }

    public void setIndent(Integer indent) {
        this.indent = indent;
    }

    public SpanEventInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SpanEventInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public SpanEventInfo withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * ip地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public SpanEventInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public SpanEventInfo withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * event的ID，在一个具体的span下面event的编号，一般是1-1-2 这种格式
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public SpanEventInfo withNextSpanId(String nextSpanId) {
        this.nextSpanId = nextSpanId;
        return this;
    }

    /**
     * 产生下一个span的源的eventId
     * @return nextSpanId
     */
    public String getNextSpanId() {
        return nextSpanId;
    }

    public void setNextSpanId(String nextSpanId) {
        this.nextSpanId = nextSpanId;
    }

    public SpanEventInfo withSourceEventId(String sourceEventId) {
        this.sourceEventId = sourceEventId;
        return this;
    }

    /**
     * 调用方的eventid
     * @return sourceEventId
     */
    public String getSourceEventId() {
        return sourceEventId;
    }

    public void setSourceEventId(String sourceEventId) {
        this.sourceEventId = sourceEventId;
    }

    public SpanEventInfo withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 方法名
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public SpanEventInfo withChildrenEventCount(Integer childrenEventCount) {
        this.childrenEventCount = childrenEventCount;
        return this;
    }

    /**
     * 子event的个数
     * @return childrenEventCount
     */
    public Integer getChildrenEventCount() {
        return childrenEventCount;
    }

    public void setChildrenEventCount(Integer childrenEventCount) {
        this.childrenEventCount = childrenEventCount;
    }

    public SpanEventInfo withDiscard(List<DiscardInfo> discard) {
        this.discard = discard;
        return this;
    }

    public SpanEventInfo addDiscardItem(DiscardInfo discardItem) {
        if (this.discard == null) {
            this.discard = new ArrayList<>();
        }
        this.discard.add(discardItem);
        return this;
    }

    public SpanEventInfo withDiscard(Consumer<List<DiscardInfo>> discardSetter) {
        if (this.discard == null) {
            this.discard = new ArrayList<>();
        }
        discardSetter.accept(this.discard);
        return this;
    }

    /**
     * 丢弃的子event个数，key是类型
     * @return discard
     */
    public List<DiscardInfo> getDiscard() {
        return discard;
    }

    public void setDiscard(List<DiscardInfo> discard) {
        this.discard = discard;
    }

    public SpanEventInfo withArgument(String argument) {
        this.argument = argument;
        return this;
    }

    /**
     * 界面展示的参数，每个类型的event自己来实现
     * @return argument
     */
    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    public SpanEventInfo withAttachment(Map<String, String> attachment) {
        this.attachment = attachment;
        return this;
    }

    public SpanEventInfo putAttachmentItem(String key, String attachmentItem) {
        if (this.attachment == null) {
            this.attachment = new HashMap<>();
        }
        this.attachment.put(key, attachmentItem);
        return this;
    }

    public SpanEventInfo withAttachment(Consumer<Map<String, String>> attachmentSetter) {
        if (this.attachment == null) {
            this.attachment = new HashMap<>();
        }
        attachmentSetter.accept(this.attachment);
        return this;
    }

    /**
     * 注册信息里面的attachment
     * @return attachment
     */
    public Map<String, String> getAttachment() {
        return attachment;
    }

    public void setAttachment(Map<String, String> attachment) {
        this.attachment = attachment;
    }

    public SpanEventInfo withGlobalTraceId(String globalTraceId) {
        this.globalTraceId = globalTraceId;
        return this;
    }

    /**
     * vTraceId，虚拟traceId
     * @return globalTraceId
     */
    public String getGlobalTraceId() {
        return globalTraceId;
    }

    public void setGlobalTraceId(String globalTraceId) {
        this.globalTraceId = globalTraceId;
    }

    public SpanEventInfo withGlobalPath(String globalPath) {
        this.globalPath = globalPath;
        return this;
    }

    /**
     * 虚拟traceId经过的path路径
     * @return globalPath
     */
    public String getGlobalPath() {
        return globalPath;
    }

    public void setGlobalPath(String globalPath) {
        this.globalPath = globalPath;
    }

    public SpanEventInfo withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * traceId
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public SpanEventInfo withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * span id
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public SpanEventInfo withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境ID
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public SpanEventInfo withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public SpanEventInfo withAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 组件id
     * @return appId
     */
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public SpanEventInfo withBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 应用id
     * @return bizId
     */
    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public SpanEventInfo withDomainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public SpanEventInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 只有是根event也就是span的时候有值
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public SpanEventInfo withRealSource(String realSource) {
        this.realSource = realSource;
        return this;
    }

    /**
     * 根event 的时候存在，实际调用的url
     * @return realSource
     */
    public String getRealSource() {
        return realSource;
    }

    public void setRealSource(String realSource) {
        this.realSource = realSource;
    }

    public SpanEventInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public SpanEventInfo withTimeUsed(Long timeUsed) {
        this.timeUsed = timeUsed;
        return this;
    }

    /**
     * 耗时
     * @return timeUsed
     */
    public Long getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Long timeUsed) {
        this.timeUsed = timeUsed;
    }

    public SpanEventInfo withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * 状态码，针对http的调用有效
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SpanEventInfo withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * 类名
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public SpanEventInfo withIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }

    /**
     * 是否异步的event
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    public void setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public SpanEventInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public SpanEventInfo putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public SpanEventInfo withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含用户自定义参数，header或body体里的内容，httpMethod, bizCode，以及后续可能新增参数
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public SpanEventInfo withHasError(Boolean hasError) {
        this.hasError = hasError;
        return this;
    }

    /**
     * 是否有错误，主要用在span的场景
     * @return hasError
     */
    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public SpanEventInfo withErrorReasons(String errorReasons) {
        this.errorReasons = errorReasons;
        return this;
    }

    /**
     * 错误类型 主要有这么几种 ErrorType枚举的几种，可以逗号分隔多种类型
     * @return errorReasons
     */
    public String getErrorReasons() {
        return errorReasons;
    }

    public void setErrorReasons(String errorReasons) {
        this.errorReasons = errorReasons;
    }

    public SpanEventInfo withType(String type) {
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

    public SpanEventInfo withHttpMethod(String httpMethod) {
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

    public SpanEventInfo withBizCode(String bizCode) {
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

    public SpanEventInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * spanId
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpanEventInfo spanEventInfo = (SpanEventInfo) o;
        return Objects.equals(this.envName, spanEventInfo.envName)
            && Objects.equals(this.appName, spanEventInfo.appName) && Objects.equals(this.indent, spanEventInfo.indent)
            && Objects.equals(this.region, spanEventInfo.region)
            && Objects.equals(this.hostName, spanEventInfo.hostName)
            && Objects.equals(this.ipAddress, spanEventInfo.ipAddress)
            && Objects.equals(this.instanceName, spanEventInfo.instanceName)
            && Objects.equals(this.eventId, spanEventInfo.eventId)
            && Objects.equals(this.nextSpanId, spanEventInfo.nextSpanId)
            && Objects.equals(this.sourceEventId, spanEventInfo.sourceEventId)
            && Objects.equals(this.method, spanEventInfo.method)
            && Objects.equals(this.childrenEventCount, spanEventInfo.childrenEventCount)
            && Objects.equals(this.discard, spanEventInfo.discard)
            && Objects.equals(this.argument, spanEventInfo.argument)
            && Objects.equals(this.attachment, spanEventInfo.attachment)
            && Objects.equals(this.globalTraceId, spanEventInfo.globalTraceId)
            && Objects.equals(this.globalPath, spanEventInfo.globalPath)
            && Objects.equals(this.traceId, spanEventInfo.traceId) && Objects.equals(this.spanId, spanEventInfo.spanId)
            && Objects.equals(this.envId, spanEventInfo.envId)
            && Objects.equals(this.instanceId, spanEventInfo.instanceId)
            && Objects.equals(this.appId, spanEventInfo.appId) && Objects.equals(this.bizId, spanEventInfo.bizId)
            && Objects.equals(this.domainId, spanEventInfo.domainId)
            && Objects.equals(this.source, spanEventInfo.source)
            && Objects.equals(this.realSource, spanEventInfo.realSource)
            && Objects.equals(this.startTime, spanEventInfo.startTime)
            && Objects.equals(this.timeUsed, spanEventInfo.timeUsed) && Objects.equals(this.code, spanEventInfo.code)
            && Objects.equals(this.className, spanEventInfo.className)
            && Objects.equals(this.isAsync, spanEventInfo.isAsync) && Objects.equals(this.tags, spanEventInfo.tags)
            && Objects.equals(this.hasError, spanEventInfo.hasError)
            && Objects.equals(this.errorReasons, spanEventInfo.errorReasons)
            && Objects.equals(this.type, spanEventInfo.type)
            && Objects.equals(this.httpMethod, spanEventInfo.httpMethod)
            && Objects.equals(this.bizCode, spanEventInfo.bizCode) && Objects.equals(this.id, spanEventInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envName,
            appName,
            indent,
            region,
            hostName,
            ipAddress,
            instanceName,
            eventId,
            nextSpanId,
            sourceEventId,
            method,
            childrenEventCount,
            discard,
            argument,
            attachment,
            globalTraceId,
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
            bizCode,
            id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpanEventInfo {\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    indent: ").append(toIndentedString(indent)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    nextSpanId: ").append(toIndentedString(nextSpanId)).append("\n");
        sb.append("    sourceEventId: ").append(toIndentedString(sourceEventId)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    childrenEventCount: ").append(toIndentedString(childrenEventCount)).append("\n");
        sb.append("    discard: ").append(toIndentedString(discard)).append("\n");
        sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
