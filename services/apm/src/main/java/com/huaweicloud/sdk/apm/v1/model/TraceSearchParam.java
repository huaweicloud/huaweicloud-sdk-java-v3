package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询span数据请求参数模型
 */
public class TraceSearchParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_param")

    private OrderParam orderParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_source_full_match")

    private Boolean realSourceFullMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_full_match")

    private Boolean sourceFullMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_content")

    private String tagsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time_string")

    private String startTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time_string")

    private String endTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_used_min")

    private Long timeUsedMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_used_max")

    private String timeUsedMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contain_tags_content")

    private Boolean containTagsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private String parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codes")

    private List<Integer> codes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_trace_id")

    private String globalTraceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_path")

    private String globalPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_id")

    private String spanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private Long appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private Long bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private Integer domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_source")

    private String realSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_used")

    private Long timeUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "class_name")

    private String className;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_async")

    private Boolean isAsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_error")

    private Boolean hasError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reasons")

    private String errorReasons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_method")

    private String httpMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_code")

    private String bizCode;

    public TraceSearchParam withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TraceSearchParam withOrderParam(OrderParam orderParam) {
        this.orderParam = orderParam;
        return this;
    }

    public TraceSearchParam withOrderParam(Consumer<OrderParam> orderParamSetter) {
        if (this.orderParam == null) {
            this.orderParam = new OrderParam();
            orderParamSetter.accept(this.orderParam);
        }

        return this;
    }

    /**
     * Get orderParam
     * @return orderParam
     */
    public OrderParam getOrderParam() {
        return orderParam;
    }

    public void setOrderParam(OrderParam orderParam) {
        this.orderParam = orderParam;
    }

    public TraceSearchParam withRealSourceFullMatch(Boolean realSourceFullMatch) {
        this.realSourceFullMatch = realSourceFullMatch;
        return this;
    }

    /**
     * 是否为精确搜索
     * @return realSourceFullMatch
     */
    public Boolean getRealSourceFullMatch() {
        return realSourceFullMatch;
    }

    public void setRealSourceFullMatch(Boolean realSourceFullMatch) {
        this.realSourceFullMatch = realSourceFullMatch;
    }

    public TraceSearchParam withSourceFullMatch(Boolean sourceFullMatch) {
        this.sourceFullMatch = sourceFullMatch;
        return this;
    }

    /**
     * 全匹配搜索
     * @return sourceFullMatch
     */
    public Boolean getSourceFullMatch() {
        return sourceFullMatch;
    }

    public void setSourceFullMatch(Boolean sourceFullMatch) {
        this.sourceFullMatch = sourceFullMatch;
    }

    public TraceSearchParam withTagsContent(String tagsContent) {
        this.tagsContent = tagsContent;
        return this;
    }

    /**
     * header或body体，或自定义参数，或其他tags里字段的关键词搜索
     * @return tagsContent
     */
    public String getTagsContent() {
        return tagsContent;
    }

    public void setTagsContent(String tagsContent) {
        this.tagsContent = tagsContent;
    }

    public TraceSearchParam withStartTimeString(String startTimeString) {
        this.startTimeString = startTimeString;
        return this;
    }

    /**
     * 开始时间
     * @return startTimeString
     */
    public String getStartTimeString() {
        return startTimeString;
    }

    public void setStartTimeString(String startTimeString) {
        this.startTimeString = startTimeString;
    }

    public TraceSearchParam withEndTimeString(String endTimeString) {
        this.endTimeString = endTimeString;
        return this;
    }

    /**
     * 结束时间
     * @return endTimeString
     */
    public String getEndTimeString() {
        return endTimeString;
    }

    public void setEndTimeString(String endTimeString) {
        this.endTimeString = endTimeString;
    }

    public TraceSearchParam withTimeUsedMin(Long timeUsedMin) {
        this.timeUsedMin = timeUsedMin;
        return this;
    }

    /**
     * 最小耗时
     * @return timeUsedMin
     */
    public Long getTimeUsedMin() {
        return timeUsedMin;
    }

    public void setTimeUsedMin(Long timeUsedMin) {
        this.timeUsedMin = timeUsedMin;
    }

    public TraceSearchParam withTimeUsedMax(String timeUsedMax) {
        this.timeUsedMax = timeUsedMax;
        return this;
    }

    /**
     * 最大耗时
     * @return timeUsedMax
     */
    public String getTimeUsedMax() {
        return timeUsedMax;
    }

    public void setTimeUsedMax(String timeUsedMax) {
        this.timeUsedMax = timeUsedMax;
    }

    public TraceSearchParam withContainTagsContent(Boolean containTagsContent) {
        this.containTagsContent = containTagsContent;
        return this;
    }

    /**
     * 搜索结果是否包含tags内容详情
     * @return containTagsContent
     */
    public Boolean getContainTagsContent() {
        return containTagsContent;
    }

    public void setContainTagsContent(Boolean containTagsContent) {
        this.containTagsContent = containTagsContent;
    }

    public TraceSearchParam withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每一页返回的行数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public TraceSearchParam withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 查询第几页的数据,默认查询第一页
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public TraceSearchParam withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 参数
     * @return parameters
     */
    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public TraceSearchParam withCodes(List<Integer> codes) {
        this.codes = codes;
        return this;
    }

    public TraceSearchParam addCodesItem(Integer codesItem) {
        if (this.codes == null) {
            this.codes = new ArrayList<>();
        }
        this.codes.add(codesItem);
        return this;
    }

    public TraceSearchParam withCodes(Consumer<List<Integer>> codesSetter) {
        if (this.codes == null) {
            this.codes = new ArrayList<>();
        }
        codesSetter.accept(this.codes);
        return this;
    }

    /**
     * 字符串格式的的状态码，用于支持多个状态码查询
     * @return codes
     */
    public List<Integer> getCodes() {
        return codes;
    }

    public void setCodes(List<Integer> codes) {
        this.codes = codes;
    }

    public TraceSearchParam withGlobalTraceId(String globalTraceId) {
        this.globalTraceId = globalTraceId;
        return this;
    }

    /**
     * vTraceId，虚拟traceId，一个vTraceId对应多个实际的traceId， vTraceId会从开始一直往下应用传输
     * @return globalTraceId
     */
    public String getGlobalTraceId() {
        return globalTraceId;
    }

    public void setGlobalTraceId(String globalTraceId) {
        this.globalTraceId = globalTraceId;
    }

    public TraceSearchParam withGlobalPath(String globalPath) {
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

    public TraceSearchParam withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * 在root的span调用产生的全局id，以此往后透传
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public TraceSearchParam withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * 代表一次rpc的调用的id，对于root的调用，值为字符串1，对于当前span调用的下一个spanId编号为1-1,1-2等格式，以此往后类推
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public TraceSearchParam withEnvId(Long envId) {
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

    public TraceSearchParam withInstanceId(Long instanceId) {
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

    public TraceSearchParam withAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 组件ID
     * @return appId
     */
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public TraceSearchParam withBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 应用ID
     * @return bizId
     */
    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public TraceSearchParam withDomainId(Integer domainId) {
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

    public TraceSearchParam withSource(String source) {
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

    public TraceSearchParam withRealSource(String realSource) {
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

    public TraceSearchParam withStartTime(Long startTime) {
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

    public TraceSearchParam withTimeUsed(Long timeUsed) {
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

    public TraceSearchParam withCode(Integer code) {
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

    public TraceSearchParam withClassName(String className) {
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

    public TraceSearchParam withIsAsync(Boolean isAsync) {
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

    public TraceSearchParam withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public TraceSearchParam putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public TraceSearchParam withTags(Consumer<Map<String, String>> tagsSetter) {
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

    public TraceSearchParam withHasError(Boolean hasError) {
        this.hasError = hasError;
        return this;
    }

    /**
     * 是否有错误
     * @return hasError
     */
    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public TraceSearchParam withErrorReasons(String errorReasons) {
        this.errorReasons = errorReasons;
        return this;
    }

    /**
     * 错误类型
     * @return errorReasons
     */
    public String getErrorReasons() {
        return errorReasons;
    }

    public void setErrorReasons(String errorReasons) {
        this.errorReasons = errorReasons;
    }

    public TraceSearchParam withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TraceSearchParam withHttpMethod(String httpMethod) {
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

    public TraceSearchParam withBizCode(String bizCode) {
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
        TraceSearchParam traceSearchParam = (TraceSearchParam) o;
        return Objects.equals(this.region, traceSearchParam.region)
            && Objects.equals(this.orderParam, traceSearchParam.orderParam)
            && Objects.equals(this.realSourceFullMatch, traceSearchParam.realSourceFullMatch)
            && Objects.equals(this.sourceFullMatch, traceSearchParam.sourceFullMatch)
            && Objects.equals(this.tagsContent, traceSearchParam.tagsContent)
            && Objects.equals(this.startTimeString, traceSearchParam.startTimeString)
            && Objects.equals(this.endTimeString, traceSearchParam.endTimeString)
            && Objects.equals(this.timeUsedMin, traceSearchParam.timeUsedMin)
            && Objects.equals(this.timeUsedMax, traceSearchParam.timeUsedMax)
            && Objects.equals(this.containTagsContent, traceSearchParam.containTagsContent)
            && Objects.equals(this.pageSize, traceSearchParam.pageSize)
            && Objects.equals(this.page, traceSearchParam.page)
            && Objects.equals(this.parameters, traceSearchParam.parameters)
            && Objects.equals(this.codes, traceSearchParam.codes)
            && Objects.equals(this.globalTraceId, traceSearchParam.globalTraceId)
            && Objects.equals(this.globalPath, traceSearchParam.globalPath)
            && Objects.equals(this.traceId, traceSearchParam.traceId)
            && Objects.equals(this.spanId, traceSearchParam.spanId)
            && Objects.equals(this.envId, traceSearchParam.envId)
            && Objects.equals(this.instanceId, traceSearchParam.instanceId)
            && Objects.equals(this.appId, traceSearchParam.appId) && Objects.equals(this.bizId, traceSearchParam.bizId)
            && Objects.equals(this.domainId, traceSearchParam.domainId)
            && Objects.equals(this.source, traceSearchParam.source)
            && Objects.equals(this.realSource, traceSearchParam.realSource)
            && Objects.equals(this.startTime, traceSearchParam.startTime)
            && Objects.equals(this.timeUsed, traceSearchParam.timeUsed)
            && Objects.equals(this.code, traceSearchParam.code)
            && Objects.equals(this.className, traceSearchParam.className)
            && Objects.equals(this.isAsync, traceSearchParam.isAsync)
            && Objects.equals(this.tags, traceSearchParam.tags)
            && Objects.equals(this.hasError, traceSearchParam.hasError)
            && Objects.equals(this.errorReasons, traceSearchParam.errorReasons)
            && Objects.equals(this.type, traceSearchParam.type)
            && Objects.equals(this.httpMethod, traceSearchParam.httpMethod)
            && Objects.equals(this.bizCode, traceSearchParam.bizCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            orderParam,
            realSourceFullMatch,
            sourceFullMatch,
            tagsContent,
            startTimeString,
            endTimeString,
            timeUsedMin,
            timeUsedMax,
            containTagsContent,
            pageSize,
            page,
            parameters,
            codes,
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
            bizCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TraceSearchParam {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    orderParam: ").append(toIndentedString(orderParam)).append("\n");
        sb.append("    realSourceFullMatch: ").append(toIndentedString(realSourceFullMatch)).append("\n");
        sb.append("    sourceFullMatch: ").append(toIndentedString(sourceFullMatch)).append("\n");
        sb.append("    tagsContent: ").append(toIndentedString(tagsContent)).append("\n");
        sb.append("    startTimeString: ").append(toIndentedString(startTimeString)).append("\n");
        sb.append("    endTimeString: ").append(toIndentedString(endTimeString)).append("\n");
        sb.append("    timeUsedMin: ").append(toIndentedString(timeUsedMin)).append("\n");
        sb.append("    timeUsedMax: ").append(toIndentedString(timeUsedMax)).append("\n");
        sb.append("    containTagsContent: ").append(toIndentedString(containTagsContent)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
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
