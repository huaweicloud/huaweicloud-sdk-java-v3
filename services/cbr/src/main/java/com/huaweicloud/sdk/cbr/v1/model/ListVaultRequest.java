package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListVaultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * 云类型
     */
    public static final class CloudTypeEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final CloudTypeEnum PUBLIC = new CloudTypeEnum("public");

        /**
         * Enum HYBRID for value: "hybrid"
         */
        public static final CloudTypeEnum HYBRID = new CloudTypeEnum("hybrid");

        private static final Map<String, CloudTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloudTypeEnum> createStaticFields() {
            Map<String, CloudTypeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("hybrid", HYBRID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloudTypeEnum(String value) {
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
        public static CloudTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CloudTypeEnum(value));
        }

        public static CloudTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CloudTypeEnum) {
                return this.value.equals(((CloudTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private CloudTypeEnum cloudType;

    /**
     * 保护类型
     */
    public static final class ProtectTypeEnum {

        /**
         * Enum BACKUP for value: "backup"
         */
        public static final ProtectTypeEnum BACKUP = new ProtectTypeEnum("backup");

        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final ProtectTypeEnum REPLICATION = new ProtectTypeEnum("replication");

        private static final Map<String, ProtectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectTypeEnum> createStaticFields() {
            Map<String, ProtectTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("replication", REPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectTypeEnum(String value) {
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
        public static ProtectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectTypeEnum(value));
        }

        public static ProtectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectTypeEnum) {
                return this.value.equals(((ProtectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private ProtectTypeEnum protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private String resourceIds;

    public ListVaultRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示条目数，正整数
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVaultRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 存储库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListVaultRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移值,正整数
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVaultRequest withCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 云类型
     * @return cloudType
     */
    public CloudTypeEnum getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
    }

    public ListVaultRequest withProtectType(ProtectTypeEnum protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * 保护类型
     * @return protectType
     */
    public ProtectTypeEnum getProtectType() {
        return protectType;
    }

    public void setProtectType(ProtectTypeEnum protectType) {
        this.protectType = protectType;
    }

    public ListVaultRequest withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型：云服务器（server），云硬盘（disk），文件系统（turbo），云桌面（workspace），VMware（vmware），关系型数据库（rds），文件（file）。
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ListVaultRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id或all_granted_eps，all_granted_eps表示查询用户有权限的所有企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListVaultRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListVaultRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ListVaultRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListVaultRequest withResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    /**
     * 资源id
     * @return resourceIds
     */
    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVaultRequest that = (ListVaultRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.name, that.name)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.cloudType, that.cloudType)
            && Objects.equals(this.protectType, that.protectType) && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.resourceIds, that.resourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            name,
            offset,
            cloudType,
            protectType,
            objectType,
            enterpriseProjectId,
            id,
            policyId,
            status,
            resourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVaultRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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
