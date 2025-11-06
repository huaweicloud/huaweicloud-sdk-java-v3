package com.huaweicloud.sdk.aom.v2.model;

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
 * PromInstanceEpsModel
 */
public class PromInstanceEpsModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_name")

    private String promName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_id")

    private String promId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_type")

    private String promType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_version")

    private String promVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_create_timestamp")

    private Long promCreateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_update_timestamp")

    private Long promUpdateTimestamp;

    /**
     * Prometheus实例状态。
     */
    public static final class PromStatusEnum {

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final PromStatusEnum DELETED = new PromStatusEnum("DELETED");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final PromStatusEnum NORMAL = new PromStatusEnum("NORMAL");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final PromStatusEnum ALL = new PromStatusEnum("ALL");

        private static final Map<String, PromStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PromStatusEnum> createStaticFields() {
            Map<String, PromStatusEnum> map = new HashMap<>();
            map.put("DELETED", DELETED);
            map.put("NORMAL", NORMAL);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PromStatusEnum(String value) {
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
        public static PromStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PromStatusEnum(value));
        }

        public static PromStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PromStatusEnum) {
                return this.value.equals(((PromStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_status")

    private PromStatusEnum promStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted_tag")

    private Long isDeletedTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_time")

    private Long deletedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_spec_config")

    private PromConfigModel promSpecConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_spec_config")

    private String cceSpecConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_limits")

    private PromLimits promLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits_update_time")

    private Long limitsUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private ApplicationModel application;

    public PromInstanceEpsModel withPromName(String promName) {
        this.promName = promName;
        return this;
    }

    /**
     * Prometheus实例名称 名称不能以下划线或中划线开头结尾，只含有中文、英文、数字、下划线、中划线、长度1-100。
     * @return promName
     */
    public String getPromName() {
        return promName;
    }

    public void setPromName(String promName) {
        this.promName = promName;
    }

    public PromInstanceEpsModel withPromId(String promId) {
        this.promId = promId;
        return this;
    }

    /**
     * Prometheus实例id。
     * @return promId
     */
    public String getPromId() {
        return promId;
    }

    public void setPromId(String promId) {
        this.promId = promId;
    }

    public PromInstanceEpsModel withPromType(String promType) {
        this.promType = promType;
        return this;
    }

    /**
     * Prometheus实例类型。  - default：默认普罗实例 - ECS：Prometheus for ECS - CCE：Prometheus for CCE - REMOTE_WRITE：Prometheus 通用实例 - CLOUD_SERVICE：Prometheus for 云服务 - ACROSS_ACCOUNT：Prometheus for 多账号聚合实例 （暂不支持ACROSS_ACCOUNT类型）
     * @return promType
     */
    public String getPromType() {
        return promType;
    }

    public void setPromType(String promType) {
        this.promType = promType;
    }

    public PromInstanceEpsModel withPromVersion(String promVersion) {
        this.promVersion = promVersion;
        return this;
    }

    /**
     * Prometheus实例版本号。
     * @return promVersion
     */
    public String getPromVersion() {
        return promVersion;
    }

    public void setPromVersion(String promVersion) {
        this.promVersion = promVersion;
    }

    public PromInstanceEpsModel withPromCreateTimestamp(Long promCreateTimestamp) {
        this.promCreateTimestamp = promCreateTimestamp;
        return this;
    }

    /**
     * Prometheus实例创建时间戳。
     * @return promCreateTimestamp
     */
    public Long getPromCreateTimestamp() {
        return promCreateTimestamp;
    }

    public void setPromCreateTimestamp(Long promCreateTimestamp) {
        this.promCreateTimestamp = promCreateTimestamp;
    }

    public PromInstanceEpsModel withPromUpdateTimestamp(Long promUpdateTimestamp) {
        this.promUpdateTimestamp = promUpdateTimestamp;
        return this;
    }

    /**
     * Prometheus实例更新时间戳。
     * @return promUpdateTimestamp
     */
    public Long getPromUpdateTimestamp() {
        return promUpdateTimestamp;
    }

    public void setPromUpdateTimestamp(Long promUpdateTimestamp) {
        this.promUpdateTimestamp = promUpdateTimestamp;
    }

    public PromInstanceEpsModel withPromStatus(PromStatusEnum promStatus) {
        this.promStatus = promStatus;
        return this;
    }

    /**
     * Prometheus实例状态。
     * @return promStatus
     */
    public PromStatusEnum getPromStatus() {
        return promStatus;
    }

    public void setPromStatus(PromStatusEnum promStatus) {
        this.promStatus = promStatus;
    }

    public PromInstanceEpsModel withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * Prometheus实例所属的企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PromInstanceEpsModel withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Prometheus实例所属projectId。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PromInstanceEpsModel withIsDeletedTag(Long isDeletedTag) {
        this.isDeletedTag = isDeletedTag;
        return this;
    }

    /**
     * 删除标记。
     * @return isDeletedTag
     */
    public Long getIsDeletedTag() {
        return isDeletedTag;
    }

    public void setIsDeletedTag(Long isDeletedTag) {
        this.isDeletedTag = isDeletedTag;
    }

    public PromInstanceEpsModel withDeletedTime(Long deletedTime) {
        this.deletedTime = deletedTime;
        return this;
    }

    /**
     * 删除时间。
     * @return deletedTime
     */
    public Long getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(Long deletedTime) {
        this.deletedTime = deletedTime;
    }

    public PromInstanceEpsModel withPromSpecConfig(PromConfigModel promSpecConfig) {
        this.promSpecConfig = promSpecConfig;
        return this;
    }

    public PromInstanceEpsModel withPromSpecConfig(Consumer<PromConfigModel> promSpecConfigSetter) {
        if (this.promSpecConfig == null) {
            this.promSpecConfig = new PromConfigModel();
            promSpecConfigSetter.accept(this.promSpecConfig);
        }

        return this;
    }

    /**
     * Get promSpecConfig
     * @return promSpecConfig
     */
    public PromConfigModel getPromSpecConfig() {
        return promSpecConfig;
    }

    public void setPromSpecConfig(PromConfigModel promSpecConfig) {
        this.promSpecConfig = promSpecConfig;
    }

    public PromInstanceEpsModel withCceSpecConfig(String cceSpecConfig) {
        this.cceSpecConfig = cceSpecConfig;
        return this;
    }

    /**
     * Prometheus实例所属CCE特殊配置。
     * @return cceSpecConfig
     */
    public String getCceSpecConfig() {
        return cceSpecConfig;
    }

    public void setCceSpecConfig(String cceSpecConfig) {
        this.cceSpecConfig = cceSpecConfig;
    }

    public PromInstanceEpsModel withPromLimits(PromLimits promLimits) {
        this.promLimits = promLimits;
        return this;
    }

    public PromInstanceEpsModel withPromLimits(Consumer<PromLimits> promLimitsSetter) {
        if (this.promLimits == null) {
            this.promLimits = new PromLimits();
            promLimitsSetter.accept(this.promLimits);
        }

        return this;
    }

    /**
     * Get promLimits
     * @return promLimits
     */
    public PromLimits getPromLimits() {
        return promLimits;
    }

    public void setPromLimits(PromLimits promLimits) {
        this.promLimits = promLimits;
    }

    public PromInstanceEpsModel withLimitsUpdateTime(Long limitsUpdateTime) {
        this.limitsUpdateTime = limitsUpdateTime;
        return this;
    }

    /**
     * 指标存储周期修改时间。
     * @return limitsUpdateTime
     */
    public Long getLimitsUpdateTime() {
        return limitsUpdateTime;
    }

    public void setLimitsUpdateTime(Long limitsUpdateTime) {
        this.limitsUpdateTime = limitsUpdateTime;
    }

    public PromInstanceEpsModel withApplication(ApplicationModel application) {
        this.application = application;
        return this;
    }

    public PromInstanceEpsModel withApplication(Consumer<ApplicationModel> applicationSetter) {
        if (this.application == null) {
            this.application = new ApplicationModel();
            applicationSetter.accept(this.application);
        }

        return this;
    }

    /**
     * Get application
     * @return application
     */
    public ApplicationModel getApplication() {
        return application;
    }

    public void setApplication(ApplicationModel application) {
        this.application = application;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PromInstanceEpsModel that = (PromInstanceEpsModel) obj;
        return Objects.equals(this.promName, that.promName) && Objects.equals(this.promId, that.promId)
            && Objects.equals(this.promType, that.promType) && Objects.equals(this.promVersion, that.promVersion)
            && Objects.equals(this.promCreateTimestamp, that.promCreateTimestamp)
            && Objects.equals(this.promUpdateTimestamp, that.promUpdateTimestamp)
            && Objects.equals(this.promStatus, that.promStatus)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.isDeletedTag, that.isDeletedTag)
            && Objects.equals(this.deletedTime, that.deletedTime)
            && Objects.equals(this.promSpecConfig, that.promSpecConfig)
            && Objects.equals(this.cceSpecConfig, that.cceSpecConfig)
            && Objects.equals(this.promLimits, that.promLimits)
            && Objects.equals(this.limitsUpdateTime, that.limitsUpdateTime)
            && Objects.equals(this.application, that.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promName,
            promId,
            promType,
            promVersion,
            promCreateTimestamp,
            promUpdateTimestamp,
            promStatus,
            enterpriseProjectId,
            projectId,
            isDeletedTag,
            deletedTime,
            promSpecConfig,
            cceSpecConfig,
            promLimits,
            limitsUpdateTime,
            application);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromInstanceEpsModel {\n");
        sb.append("    promName: ").append(toIndentedString(promName)).append("\n");
        sb.append("    promId: ").append(toIndentedString(promId)).append("\n");
        sb.append("    promType: ").append(toIndentedString(promType)).append("\n");
        sb.append("    promVersion: ").append(toIndentedString(promVersion)).append("\n");
        sb.append("    promCreateTimestamp: ").append(toIndentedString(promCreateTimestamp)).append("\n");
        sb.append("    promUpdateTimestamp: ").append(toIndentedString(promUpdateTimestamp)).append("\n");
        sb.append("    promStatus: ").append(toIndentedString(promStatus)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isDeletedTag: ").append(toIndentedString(isDeletedTag)).append("\n");
        sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
        sb.append("    promSpecConfig: ").append(toIndentedString(promSpecConfig)).append("\n");
        sb.append("    cceSpecConfig: ").append(toIndentedString(cceSpecConfig)).append("\n");
        sb.append("    promLimits: ").append(toIndentedString(promLimits)).append("\n");
        sb.append("    limitsUpdateTime: ").append(toIndentedString(limitsUpdateTime)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
