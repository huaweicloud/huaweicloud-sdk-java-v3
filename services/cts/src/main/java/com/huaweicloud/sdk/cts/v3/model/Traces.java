package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Traces
 */
public class Traces {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_name")

    private String traceName;

    /**
     * 标识事件等级，目前有三种：正常（normal），警告（warning），事故（incident）。
     */
    public static final class TraceRatingEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final TraceRatingEnum NORMAL = new TraceRatingEnum("normal");

        /**
         * Enum WARNING for value: "warning"
         */
        public static final TraceRatingEnum WARNING = new TraceRatingEnum("warning");

        /**
         * Enum INCIDENT for value: "incident"
         */
        public static final TraceRatingEnum INCIDENT = new TraceRatingEnum("incident");

        private static final Map<String, TraceRatingEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TraceRatingEnum> createStaticFields() {
            Map<String, TraceRatingEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("warning", WARNING);
            map.put("incident", INCIDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TraceRatingEnum(String value) {
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
        public static TraceRatingEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TraceRatingEnum(value));
        }

        public static TraceRatingEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TraceRatingEnum) {
                return this.value.equals(((TraceRatingEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_rating")

    private TraceRatingEnum traceRating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_type")

    private String traceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request")

    private String request;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private String response;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private UserInfo user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_info")

    private String locationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_url")

    private String resourceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_account_id")

    private String resourceAccountId;

    public Traces withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 标识事件对应的云服务资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Traces withTraceName(String traceName) {
        this.traceName = traceName;
        return this;
    }

    /**
     * 标识查询事件列表对应的事件名称。由0-9,a-z,A-Z,'-','.','_',组成，长度为1～64个字符，且以首字符必须为字母。
     * @return traceName
     */
    public String getTraceName() {
        return traceName;
    }

    public void setTraceName(String traceName) {
        this.traceName = traceName;
    }

    public Traces withTraceRating(TraceRatingEnum traceRating) {
        this.traceRating = traceRating;
        return this;
    }

    /**
     * 标识事件等级，目前有三种：正常（normal），警告（warning），事故（incident）。
     * @return traceRating
     */
    public TraceRatingEnum getTraceRating() {
        return traceRating;
    }

    public void setTraceRating(TraceRatingEnum traceRating) {
        this.traceRating = traceRating;
    }

    public Traces withTraceType(String traceType) {
        this.traceType = traceType;
        return this;
    }

    /**
     * 标识事件发生源头类型，管理类事件主要包括API调用（ApiCall），Console页面调用（ConsoleAction）和系统间调用（SystemAction）。 数据类事件主要包括ObsSDK，ObsAPI。
     * @return traceType
     */
    public String getTraceType() {
        return traceType;
    }

    public void setTraceType(String traceType) {
        this.traceType = traceType;
    }

    public Traces withRequest(String request) {
        this.request = request;
        return this;
    }

    /**
     * 标识事件对应接口请求内容，即资源操作请求体。
     * @return request
     */
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Traces withResponse(String response) {
        this.response = response;
        return this;
    }

    /**
     * 记录用户请求的响应，标识事件对应接口响应内容，即资源操作结果返回体。
     * @return response
     */
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Traces withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 记录用户请求的响应，标识事件对应接口返回的HTTP状态码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Traces withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * 标识事件对应的云服务接口版本。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Traces withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 标识其他云服务为此条事件添加的备注信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Traces withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * 标识云审计服务记录本次事件的时间戳。
     * minimum: 946656000000
     * maximum: 4102416000000
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public Traces withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * 标识事件的ID，由系统生成的UUID。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Traces withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 标识事件产生的时间戳。
     * minimum: 946656000000
     * maximum: 4102416000000
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Traces withUser(UserInfo user) {
        this.user = user;
        return this;
    }

    public Traces withUser(Consumer<UserInfo> userSetter) {
        if (this.user == null) {
            this.user = new UserInfo();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public Traces withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 标识查询事件列表对应的云服务类型。必须为已对接CTS的云服务的英文缩写，且服务类型一般为大写字母。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Traces withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 查询事件列表对应的资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Traces withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * 标识触发事件的租户IP。
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public Traces withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 标识事件对应的资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Traces withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 记录本次请求的request id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Traces withLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * 记录本次请求出错后，问题定位所需要的辅助信息。
     * @return locationInfo
     */
    public String getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
    }

    public Traces withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 云资源的详情页面
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Traces withResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }

    /**
     * 云资源的详情页面的访问链接（不含endpoint）
     * @return resourceUrl
     */
    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public Traces withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 标识资源所在的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Traces withResourceAccountId(String resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }

    /**
     * 标识资源所在的账号ID。仅在跨租户操作资源时有值。
     * @return resourceAccountId
     */
    public String getResourceAccountId() {
        return resourceAccountId;
    }

    public void setResourceAccountId(String resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Traces that = (Traces) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.traceName, that.traceName)
            && Objects.equals(this.traceRating, that.traceRating) && Objects.equals(this.traceType, that.traceType)
            && Objects.equals(this.request, that.request) && Objects.equals(this.response, that.response)
            && Objects.equals(this.code, that.code) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.message, that.message) && Objects.equals(this.recordTime, that.recordTime)
            && Objects.equals(this.traceId, that.traceId) && Objects.equals(this.time, that.time)
            && Objects.equals(this.user, that.user) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.sourceIp, that.sourceIp)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.locationInfo, that.locationInfo) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.resourceUrl, that.resourceUrl)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.resourceAccountId, that.resourceAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            traceName,
            traceRating,
            traceType,
            request,
            response,
            code,
            apiVersion,
            message,
            recordTime,
            traceId,
            time,
            user,
            serviceType,
            resourceType,
            sourceIp,
            resourceName,
            requestId,
            locationInfo,
            endpoint,
            resourceUrl,
            enterpriseProjectId,
            resourceAccountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Traces {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    traceName: ").append(toIndentedString(traceName)).append("\n");
        sb.append("    traceRating: ").append(toIndentedString(traceRating)).append("\n");
        sb.append("    traceType: ").append(toIndentedString(traceType)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    resourceAccountId: ").append(toIndentedString(resourceAccountId)).append("\n");
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
