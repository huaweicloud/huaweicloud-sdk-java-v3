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

    /**
     * Prometheus实例类型（暂时不支持VPC、KUBERNETES）。
     */
    public static final class PromTypeEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final PromTypeEnum DEFAULT = new PromTypeEnum("DEFAULT");

        /**
         * Enum ECS for value: "ECS"
         */
        public static final PromTypeEnum ECS = new PromTypeEnum("ECS");

        /**
         * Enum VPC for value: "VPC"
         */
        public static final PromTypeEnum VPC = new PromTypeEnum("VPC");

        /**
         * Enum CCE for value: "CCE"
         */
        public static final PromTypeEnum CCE = new PromTypeEnum("CCE");

        /**
         * Enum REMOTE_WRITE for value: "REMOTE_WRITE"
         */
        public static final PromTypeEnum REMOTE_WRITE = new PromTypeEnum("REMOTE_WRITE");

        /**
         * Enum KUBERNETES for value: "KUBERNETES"
         */
        public static final PromTypeEnum KUBERNETES = new PromTypeEnum("KUBERNETES");

        /**
         * Enum CLOUD_SERVICE for value: "CLOUD_SERVICE"
         */
        public static final PromTypeEnum CLOUD_SERVICE = new PromTypeEnum("CLOUD_SERVICE");

        /**
         * Enum ACROSS_ACCOUNT for value: "ACROSS_ACCOUNT"
         */
        public static final PromTypeEnum ACROSS_ACCOUNT = new PromTypeEnum("ACROSS_ACCOUNT");

        private static final Map<String, PromTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PromTypeEnum> createStaticFields() {
            Map<String, PromTypeEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("ECS", ECS);
            map.put("VPC", VPC);
            map.put("CCE", CCE);
            map.put("REMOTE_WRITE", REMOTE_WRITE);
            map.put("KUBERNETES", KUBERNETES);
            map.put("CLOUD_SERVICE", CLOUD_SERVICE);
            map.put("ACROSS_ACCOUNT", ACROSS_ACCOUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PromTypeEnum(String value) {
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
        public static PromTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PromTypeEnum(value));
        }

        public static PromTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PromTypeEnum) {
                return this.value.equals(((PromTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_type")

    private PromTypeEnum promType;

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

    public PromInstanceEpsModel withPromType(PromTypeEnum promType) {
        this.promType = promType;
        return this;
    }

    /**
     * Prometheus实例类型（暂时不支持VPC、KUBERNETES）。
     * @return promType
     */
    public PromTypeEnum getPromType() {
        return promType;
    }

    public void setPromType(PromTypeEnum promType) {
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
            && Objects.equals(this.cceSpecConfig, that.cceSpecConfig);
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
            cceSpecConfig);
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
