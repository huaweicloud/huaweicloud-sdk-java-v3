package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowQueueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private Long queueId;

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
    @JsonProperty(value = "queueType")

    private String queueType;

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
    @JsonProperty(value = "resource_mode")

    private Integer resourceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_spec")

    private Integer cuSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_scale_out_limit")

    private Integer cuScaleOutLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_scale_in_limit")

    private Integer cuScaleInLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_spark_versions")

    private List<String> supportSparkVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_spark_version")

    private String defaultSparkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_hetu_engine_versions")

    private List<String> supportHetuEngineVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_hetu_engine_version")

    private String defaultHetuEngineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_flink_sql_versions")

    private List<String> supportFlinkSqlVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_flink_sql_version")

    private String defaultFlinkSqlVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_flink_jar_versions")

    private List<String> supportFlinkJarVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_flink_jar_version")

    private String defaultFlinkJarVersion;

    public ShowQueueResponse withIsSuccess(Boolean isSuccess) {
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

    public ShowQueueResponse withMessage(String message) {
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

    public ShowQueueResponse withQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * 队列ID。
     * @return queueId
     */
    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long queueId) {
        this.queueId = queueId;
    }

    public ShowQueueResponse withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称。说明：队列名称不区分大小写，系统会自动转换为小写。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ShowQueueResponse withDescription(String description) {
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

    public ShowQueueResponse withOwner(String owner) {
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

    public ShowQueueResponse withCreateTime(Long createTime) {
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

    public ShowQueueResponse withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 队列类型。sql/general/all, 如果不指定，默认为“sql”。
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public ShowQueueResponse withCuCount(Integer cuCount) {
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

    public ShowQueueResponse withChargingMode(Integer chargingMode) {
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

    public ShowQueueResponse withResourceId(String resourceId) {
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

    public ShowQueueResponse withResourceMode(Integer resourceMode) {
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

    public ShowQueueResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowQueueResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。 vm：ecf集群 container：容器化集群（k8s）
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ShowQueueResponse withCuSpec(Integer cuSpec) {
        this.cuSpec = cuSpec;
        return this;
    }

    /**
     * 队列的规格大小。对于包周期队列，表示包周期部分的CU值；对于按需队列，表示用户购买队列时的初始值。
     * @return cuSpec
     */
    public Integer getCuSpec() {
        return cuSpec;
    }

    public void setCuSpec(Integer cuSpec) {
        this.cuSpec = cuSpec;
    }

    public ShowQueueResponse withCuScaleOutLimit(Integer cuScaleOutLimit) {
        this.cuScaleOutLimit = cuScaleOutLimit;
        return this;
    }

    /**
     * 当前队列弹性扩缩容的CU值上限。
     * @return cuScaleOutLimit
     */
    public Integer getCuScaleOutLimit() {
        return cuScaleOutLimit;
    }

    public void setCuScaleOutLimit(Integer cuScaleOutLimit) {
        this.cuScaleOutLimit = cuScaleOutLimit;
    }

    public ShowQueueResponse withCuScaleInLimit(Integer cuScaleInLimit) {
        this.cuScaleInLimit = cuScaleInLimit;
        return this;
    }

    /**
     * 当前队列弹性扩缩容的CU值下限。
     * @return cuScaleInLimit
     */
    public Integer getCuScaleInLimit() {
        return cuScaleInLimit;
    }

    public void setCuScaleInLimit(Integer cuScaleInLimit) {
        this.cuScaleInLimit = cuScaleInLimit;
    }

    public ShowQueueResponse withElasticResourcePoolName(String elasticResourcePoolName) {
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

    public ShowQueueResponse withSupportSparkVersions(List<String> supportSparkVersions) {
        this.supportSparkVersions = supportSparkVersions;
        return this;
    }

    public ShowQueueResponse addSupportSparkVersionsItem(String supportSparkVersionsItem) {
        if (this.supportSparkVersions == null) {
            this.supportSparkVersions = new ArrayList<>();
        }
        this.supportSparkVersions.add(supportSparkVersionsItem);
        return this;
    }

    public ShowQueueResponse withSupportSparkVersions(Consumer<List<String>> supportSparkVersionsSetter) {
        if (this.supportSparkVersions == null) {
            this.supportSparkVersions = new ArrayList<>();
        }
        supportSparkVersionsSetter.accept(this.supportSparkVersions);
        return this;
    }

    /**
     * 队列支持的Spark版本。
     * @return supportSparkVersions
     */
    public List<String> getSupportSparkVersions() {
        return supportSparkVersions;
    }

    public void setSupportSparkVersions(List<String> supportSparkVersions) {
        this.supportSparkVersions = supportSparkVersions;
    }

    public ShowQueueResponse withDefaultSparkVersion(String defaultSparkVersion) {
        this.defaultSparkVersion = defaultSparkVersion;
        return this;
    }

    /**
     * 队列默认的Spark版本。
     * @return defaultSparkVersion
     */
    public String getDefaultSparkVersion() {
        return defaultSparkVersion;
    }

    public void setDefaultSparkVersion(String defaultSparkVersion) {
        this.defaultSparkVersion = defaultSparkVersion;
    }

    public ShowQueueResponse withSupportHetuEngineVersions(List<String> supportHetuEngineVersions) {
        this.supportHetuEngineVersions = supportHetuEngineVersions;
        return this;
    }

    public ShowQueueResponse addSupportHetuEngineVersionsItem(String supportHetuEngineVersionsItem) {
        if (this.supportHetuEngineVersions == null) {
            this.supportHetuEngineVersions = new ArrayList<>();
        }
        this.supportHetuEngineVersions.add(supportHetuEngineVersionsItem);
        return this;
    }

    public ShowQueueResponse withSupportHetuEngineVersions(Consumer<List<String>> supportHetuEngineVersionsSetter) {
        if (this.supportHetuEngineVersions == null) {
            this.supportHetuEngineVersions = new ArrayList<>();
        }
        supportHetuEngineVersionsSetter.accept(this.supportHetuEngineVersions);
        return this;
    }

    /**
     * 队列支持的HetuEngine版本。
     * @return supportHetuEngineVersions
     */
    public List<String> getSupportHetuEngineVersions() {
        return supportHetuEngineVersions;
    }

    public void setSupportHetuEngineVersions(List<String> supportHetuEngineVersions) {
        this.supportHetuEngineVersions = supportHetuEngineVersions;
    }

    public ShowQueueResponse withDefaultHetuEngineVersion(String defaultHetuEngineVersion) {
        this.defaultHetuEngineVersion = defaultHetuEngineVersion;
        return this;
    }

    /**
     * 队列默认的HetuEngine版本。
     * @return defaultHetuEngineVersion
     */
    public String getDefaultHetuEngineVersion() {
        return defaultHetuEngineVersion;
    }

    public void setDefaultHetuEngineVersion(String defaultHetuEngineVersion) {
        this.defaultHetuEngineVersion = defaultHetuEngineVersion;
    }

    public ShowQueueResponse withSupportFlinkSqlVersions(List<String> supportFlinkSqlVersions) {
        this.supportFlinkSqlVersions = supportFlinkSqlVersions;
        return this;
    }

    public ShowQueueResponse addSupportFlinkSqlVersionsItem(String supportFlinkSqlVersionsItem) {
        if (this.supportFlinkSqlVersions == null) {
            this.supportFlinkSqlVersions = new ArrayList<>();
        }
        this.supportFlinkSqlVersions.add(supportFlinkSqlVersionsItem);
        return this;
    }

    public ShowQueueResponse withSupportFlinkSqlVersions(Consumer<List<String>> supportFlinkSqlVersionsSetter) {
        if (this.supportFlinkSqlVersions == null) {
            this.supportFlinkSqlVersions = new ArrayList<>();
        }
        supportFlinkSqlVersionsSetter.accept(this.supportFlinkSqlVersions);
        return this;
    }

    /**
     * 队列支持的Flink SQL版本。
     * @return supportFlinkSqlVersions
     */
    public List<String> getSupportFlinkSqlVersions() {
        return supportFlinkSqlVersions;
    }

    public void setSupportFlinkSqlVersions(List<String> supportFlinkSqlVersions) {
        this.supportFlinkSqlVersions = supportFlinkSqlVersions;
    }

    public ShowQueueResponse withDefaultFlinkSqlVersion(String defaultFlinkSqlVersion) {
        this.defaultFlinkSqlVersion = defaultFlinkSqlVersion;
        return this;
    }

    /**
     * 队列默认的Flink SQL版本。
     * @return defaultFlinkSqlVersion
     */
    public String getDefaultFlinkSqlVersion() {
        return defaultFlinkSqlVersion;
    }

    public void setDefaultFlinkSqlVersion(String defaultFlinkSqlVersion) {
        this.defaultFlinkSqlVersion = defaultFlinkSqlVersion;
    }

    public ShowQueueResponse withSupportFlinkJarVersions(List<String> supportFlinkJarVersions) {
        this.supportFlinkJarVersions = supportFlinkJarVersions;
        return this;
    }

    public ShowQueueResponse addSupportFlinkJarVersionsItem(String supportFlinkJarVersionsItem) {
        if (this.supportFlinkJarVersions == null) {
            this.supportFlinkJarVersions = new ArrayList<>();
        }
        this.supportFlinkJarVersions.add(supportFlinkJarVersionsItem);
        return this;
    }

    public ShowQueueResponse withSupportFlinkJarVersions(Consumer<List<String>> supportFlinkJarVersionsSetter) {
        if (this.supportFlinkJarVersions == null) {
            this.supportFlinkJarVersions = new ArrayList<>();
        }
        supportFlinkJarVersionsSetter.accept(this.supportFlinkJarVersions);
        return this;
    }

    /**
     * 队列支持的Flink JAR版本。
     * @return supportFlinkJarVersions
     */
    public List<String> getSupportFlinkJarVersions() {
        return supportFlinkJarVersions;
    }

    public void setSupportFlinkJarVersions(List<String> supportFlinkJarVersions) {
        this.supportFlinkJarVersions = supportFlinkJarVersions;
    }

    public ShowQueueResponse withDefaultFlinkJarVersion(String defaultFlinkJarVersion) {
        this.defaultFlinkJarVersion = defaultFlinkJarVersion;
        return this;
    }

    /**
     * 队列默认的Flink JAR版本。
     * @return defaultFlinkJarVersion
     */
    public String getDefaultFlinkJarVersion() {
        return defaultFlinkJarVersion;
    }

    public void setDefaultFlinkJarVersion(String defaultFlinkJarVersion) {
        this.defaultFlinkJarVersion = defaultFlinkJarVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQueueResponse that = (ShowQueueResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.queueId, that.queueId) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.queueType, that.queueType)
            && Objects.equals(this.cuCount, that.cuCount) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceMode, that.resourceMode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.cuSpec, that.cuSpec)
            && Objects.equals(this.cuScaleOutLimit, that.cuScaleOutLimit)
            && Objects.equals(this.cuScaleInLimit, that.cuScaleInLimit)
            && Objects.equals(this.elasticResourcePoolName, that.elasticResourcePoolName)
            && Objects.equals(this.supportSparkVersions, that.supportSparkVersions)
            && Objects.equals(this.defaultSparkVersion, that.defaultSparkVersion)
            && Objects.equals(this.supportHetuEngineVersions, that.supportHetuEngineVersions)
            && Objects.equals(this.defaultHetuEngineVersion, that.defaultHetuEngineVersion)
            && Objects.equals(this.supportFlinkSqlVersions, that.supportFlinkSqlVersions)
            && Objects.equals(this.defaultFlinkSqlVersion, that.defaultFlinkSqlVersion)
            && Objects.equals(this.supportFlinkJarVersions, that.supportFlinkJarVersions)
            && Objects.equals(this.defaultFlinkJarVersion, that.defaultFlinkJarVersion);
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
            queueType,
            cuCount,
            chargingMode,
            resourceId,
            resourceMode,
            enterpriseProjectId,
            resourceType,
            cuSpec,
            cuScaleOutLimit,
            cuScaleInLimit,
            elasticResourcePoolName,
            supportSparkVersions,
            defaultSparkVersion,
            supportHetuEngineVersions,
            defaultHetuEngineVersion,
            supportFlinkSqlVersions,
            defaultFlinkSqlVersion,
            supportFlinkJarVersions,
            defaultFlinkJarVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQueueResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    cuCount: ").append(toIndentedString(cuCount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceMode: ").append(toIndentedString(resourceMode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    cuSpec: ").append(toIndentedString(cuSpec)).append("\n");
        sb.append("    cuScaleOutLimit: ").append(toIndentedString(cuScaleOutLimit)).append("\n");
        sb.append("    cuScaleInLimit: ").append(toIndentedString(cuScaleInLimit)).append("\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
        sb.append("    supportSparkVersions: ").append(toIndentedString(supportSparkVersions)).append("\n");
        sb.append("    defaultSparkVersion: ").append(toIndentedString(defaultSparkVersion)).append("\n");
        sb.append("    supportHetuEngineVersions: ").append(toIndentedString(supportHetuEngineVersions)).append("\n");
        sb.append("    defaultHetuEngineVersion: ").append(toIndentedString(defaultHetuEngineVersion)).append("\n");
        sb.append("    supportFlinkSqlVersions: ").append(toIndentedString(supportFlinkSqlVersions)).append("\n");
        sb.append("    defaultFlinkSqlVersion: ").append(toIndentedString(defaultFlinkSqlVersion)).append("\n");
        sb.append("    supportFlinkJarVersions: ").append(toIndentedString(supportFlinkJarVersions)).append("\n");
        sb.append("    defaultFlinkJarVersion: ").append(toIndentedString(defaultFlinkJarVersion)).append("\n");
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
