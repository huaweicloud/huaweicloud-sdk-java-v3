package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowQueueDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private String queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queueName")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cuCount")

    private Integer cuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingMode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queueType")

    private String queueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_mode")

    private Integer resourceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_spec")

    private Long cuSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_scale_out_limit")

    private Long cuScaleOutLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_scale_in_limit")

    private Long cuScaleInLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    public ShowQueueDetailResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求执行是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowQueueDetailResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowQueueDetailResponse withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * 队列ID。
     * @return queueId
     */
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public ShowQueueDetailResponse withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ShowQueueDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 队列描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowQueueDetailResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 创建队列的用户。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowQueueDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建队列的时间。是单位为“毫秒”的时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowQueueDetailResponse withCuCount(Integer cuCount) {
        this.cuCount = cuCount;
        return this;
    }

    /**
     * 与队列绑定的最小计算单元个数。设置值当前只支持16，64，256。
     * @return cuCount
     */
    public Integer getCuCount() {
        return cuCount;
    }

    public void setCuCount(Integer cuCount) {
        this.cuCount = cuCount;
    }

    public ShowQueueDetailResponse withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 队列的收费模式。 “1”表示按照CU时收费。 “2”表示按照包年包月收费。
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ShowQueueDetailResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 队列的资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowQueueDetailResponse withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 队列的资源ID。
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public ShowQueueDetailResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 队列的资源ID。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ShowQueueDetailResponse withResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }

    /**
     * 队列类型。 0：共享队列 1：专属队列
     * @return resourceMode
     */
    public Integer getResourceMode() {
        return resourceMode;
    }

    public void setResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
    }

    public ShowQueueDetailResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。\"0”表示default，即默认的企业项目。 说明： 开通了企业管理服务的用户可设置该参数绑定指定的项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowQueueDetailResponse withCuSpec(Long cuSpec) {
        this.cuSpec = cuSpec;
        return this;
    }

    /**
     * 队列的规格大小。对于包周期队列，表示包周期部分的CU值；对于按需队列，表示用户购买队列时的初始值。
     * @return cuSpec
     */
    public Long getCuSpec() {
        return cuSpec;
    }

    public void setCuSpec(Long cuSpec) {
        this.cuSpec = cuSpec;
    }

    public ShowQueueDetailResponse withCuScaleOutLimit(Long cuScaleOutLimit) {
        this.cuScaleOutLimit = cuScaleOutLimit;
        return this;
    }

    /**
     * 当前队列弹性扩缩容的CU值上限。
     * @return cuScaleOutLimit
     */
    public Long getCuScaleOutLimit() {
        return cuScaleOutLimit;
    }

    public void setCuScaleOutLimit(Long cuScaleOutLimit) {
        this.cuScaleOutLimit = cuScaleOutLimit;
    }

    public ShowQueueDetailResponse withCuScaleInLimit(Long cuScaleInLimit) {
        this.cuScaleInLimit = cuScaleInLimit;
        return this;
    }

    /**
     * 当前队列弹性扩缩容的CU值下限。
     * @return cuScaleInLimit
     */
    public Long getCuScaleInLimit() {
        return cuScaleInLimit;
    }

    public void setCuScaleInLimit(Long cuScaleInLimit) {
        this.cuScaleInLimit = cuScaleInLimit;
    }

    public ShowQueueDetailResponse withElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
        return this;
    }

    /**
     * 弹性资源池名称。
     * @return elasticResourcePoolName
     */
    public String getElasticResourcePoolName() {
        return elasticResourcePoolName;
    }

    public void setElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQueueDetailResponse showQueueDetailResponse = (ShowQueueDetailResponse) o;
        return Objects.equals(this.isSuccess, showQueueDetailResponse.isSuccess)
            && Objects.equals(this.message, showQueueDetailResponse.message)
            && Objects.equals(this.queueId, showQueueDetailResponse.queueId)
            && Objects.equals(this.queueName, showQueueDetailResponse.queueName)
            && Objects.equals(this.description, showQueueDetailResponse.description)
            && Objects.equals(this.owner, showQueueDetailResponse.owner)
            && Objects.equals(this.createTime, showQueueDetailResponse.createTime)
            && Objects.equals(this.cuCount, showQueueDetailResponse.cuCount)
            && Objects.equals(this.chargingMode, showQueueDetailResponse.chargingMode)
            && Objects.equals(this.resourceId, showQueueDetailResponse.resourceId)
            && Objects.equals(this.queueType, showQueueDetailResponse.queueType)
            && Objects.equals(this.resourceType, showQueueDetailResponse.resourceType)
            && Objects.equals(this.resourceMode, showQueueDetailResponse.resourceMode)
            && Objects.equals(this.enterpriseProjectId, showQueueDetailResponse.enterpriseProjectId)
            && Objects.equals(this.cuSpec, showQueueDetailResponse.cuSpec)
            && Objects.equals(this.cuScaleOutLimit, showQueueDetailResponse.cuScaleOutLimit)
            && Objects.equals(this.cuScaleInLimit, showQueueDetailResponse.cuScaleInLimit)
            && Objects.equals(this.elasticResourcePoolName, showQueueDetailResponse.elasticResourcePoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess,
            message,
            queueId,
            queueName,
            description,
            owner,
            createTime,
            cuCount,
            chargingMode,
            resourceId,
            queueType,
            resourceType,
            resourceMode,
            enterpriseProjectId,
            cuSpec,
            cuScaleOutLimit,
            cuScaleInLimit,
            elasticResourcePoolName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQueueDetailResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    cuCount: ").append(toIndentedString(cuCount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceMode: ").append(toIndentedString(resourceMode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    cuSpec: ").append(toIndentedString(cuSpec)).append("\n");
        sb.append("    cuScaleOutLimit: ").append(toIndentedString(cuScaleOutLimit)).append("\n");
        sb.append("    cuScaleInLimit: ").append(toIndentedString(cuScaleInLimit)).append("\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
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
