package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateEndpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private EndpointType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private EndpointStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private User owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cap")

    private CapRef cap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_resource")

    private ReservedResource reservedResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_resource")

    private RayResourceInfo rayResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<Url> urls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_config")

    private LogConfigInfo logConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_engine_instance_ids")

    private List<String> businessEngineInstanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public UpdateEndpointResponse withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 可见性：  - PRIVATE：私有  - PUBLIC：公共  默认为PRIVATE
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public UpdateEndpointResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Endpoint Id，32~36位的英文、数字、短横组合。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateEndpointResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 一个Endpoint名称，只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateEndpointResponse withType(EndpointType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public EndpointType getType() {
        return type;
    }

    public void setType(EndpointType type) {
        this.type = type;
    }

    public UpdateEndpointResponse withStatus(EndpointStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public EndpointStatus getStatus() {
        return status;
    }

    public void setStatus(EndpointStatus status) {
        this.status = status;
    }

    public UpdateEndpointResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateEndpointResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public UpdateEndpointResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateEndpointResponse withOwner(User owner) {
        this.owner = owner;
        return this;
    }

    public UpdateEndpointResponse withOwner(Consumer<User> ownerSetter) {
        if (this.owner == null) {
            this.owner = new User();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public UpdateEndpointResponse withCap(CapRef cap) {
        this.cap = cap;
        return this;
    }

    public UpdateEndpointResponse withCap(Consumer<CapRef> capSetter) {
        if (this.cap == null) {
            this.cap = new CapRef();
            capSetter.accept(this.cap);
        }

        return this;
    }

    /**
     * Get cap
     * @return cap
     */
    public CapRef getCap() {
        return cap;
    }

    public void setCap(CapRef cap) {
        this.cap = cap;
    }

    public UpdateEndpointResponse withReservedResource(ReservedResource reservedResource) {
        this.reservedResource = reservedResource;
        return this;
    }

    public UpdateEndpointResponse withReservedResource(Consumer<ReservedResource> reservedResourceSetter) {
        if (this.reservedResource == null) {
            this.reservedResource = new ReservedResource();
            reservedResourceSetter.accept(this.reservedResource);
        }

        return this;
    }

    /**
     * Get reservedResource
     * @return reservedResource
     */
    public ReservedResource getReservedResource() {
        return reservedResource;
    }

    public void setReservedResource(ReservedResource reservedResource) {
        this.reservedResource = reservedResource;
    }

    public UpdateEndpointResponse withRayResource(RayResourceInfo rayResource) {
        this.rayResource = rayResource;
        return this;
    }

    public UpdateEndpointResponse withRayResource(Consumer<RayResourceInfo> rayResourceSetter) {
        if (this.rayResource == null) {
            this.rayResource = new RayResourceInfo();
            rayResourceSetter.accept(this.rayResource);
        }

        return this;
    }

    /**
     * Get rayResource
     * @return rayResource
     */
    public RayResourceInfo getRayResource() {
        return rayResource;
    }

    public void setRayResource(RayResourceInfo rayResource) {
        this.rayResource = rayResource;
    }

    public UpdateEndpointResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 失败状态时的错误编码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public UpdateEndpointResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 失败状态时的错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public UpdateEndpointResponse withUrls(List<Url> urls) {
        this.urls = urls;
        return this;
    }

    public UpdateEndpointResponse addUrlsItem(Url urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public UpdateEndpointResponse withUrls(Consumer<List<Url>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 调用地址
     * @return urls
     */
    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public UpdateEndpointResponse withLogConfig(LogConfigInfo logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    public UpdateEndpointResponse withLogConfig(Consumer<LogConfigInfo> logConfigSetter) {
        if (this.logConfig == null) {
            this.logConfig = new LogConfigInfo();
            logConfigSetter.accept(this.logConfig);
        }

        return this;
    }

    /**
     * Get logConfig
     * @return logConfig
     */
    public LogConfigInfo getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(LogConfigInfo logConfig) {
        this.logConfig = logConfig;
    }

    public UpdateEndpointResponse withBusinessEngineInstanceIds(List<String> businessEngineInstanceIds) {
        this.businessEngineInstanceIds = businessEngineInstanceIds;
        return this;
    }

    public UpdateEndpointResponse addBusinessEngineInstanceIdsItem(String businessEngineInstanceIdsItem) {
        if (this.businessEngineInstanceIds == null) {
            this.businessEngineInstanceIds = new ArrayList<>();
        }
        this.businessEngineInstanceIds.add(businessEngineInstanceIdsItem);
        return this;
    }

    public UpdateEndpointResponse withBusinessEngineInstanceIds(
        Consumer<List<String>> businessEngineInstanceIdsSetter) {
        if (this.businessEngineInstanceIds == null) {
            this.businessEngineInstanceIds = new ArrayList<>();
        }
        businessEngineInstanceIdsSetter.accept(this.businessEngineInstanceIds);
        return this;
    }

    /**
     * 引擎实例id列表
     * @return businessEngineInstanceIds
     */
    public List<String> getBusinessEngineInstanceIds() {
        return businessEngineInstanceIds;
    }

    public void setBusinessEngineInstanceIds(List<String> businessEngineInstanceIds) {
        this.businessEngineInstanceIds = businessEngineInstanceIds;
    }

    public UpdateEndpointResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEndpointResponse that = (UpdateEndpointResponse) obj;
        return Objects.equals(this.visibility, that.visibility) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.cap, that.cap)
            && Objects.equals(this.reservedResource, that.reservedResource)
            && Objects.equals(this.rayResource, that.rayResource) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.urls, that.urls)
            && Objects.equals(this.logConfig, that.logConfig)
            && Objects.equals(this.businessEngineInstanceIds, that.businessEngineInstanceIds)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibility,
            id,
            name,
            type,
            status,
            description,
            createTime,
            updateTime,
            owner,
            cap,
            reservedResource,
            rayResource,
            errorCode,
            errorMsg,
            urls,
            logConfig,
            businessEngineInstanceIds,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointResponse {\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
        sb.append("    reservedResource: ").append(toIndentedString(reservedResource)).append("\n");
        sb.append("    rayResource: ").append(toIndentedString(rayResource)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
        sb.append("    businessEngineInstanceIds: ").append(toIndentedString(businessEngineInstanceIds)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
