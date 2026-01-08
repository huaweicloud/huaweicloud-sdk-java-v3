package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 私网NAT网关实例的响应体。
 */
public class PrivateNat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 私网NAT网关实例的规格。 取值为： - Small：小型 - Medium：中型 - Large：大型 - Extra-large：超大型 - Extra-xlarge：企业型
     */
    public static final class SpecEnum {

        /**
         * Enum SMALL for value: "Small"
         */
        public static final SpecEnum SMALL = new SpecEnum("Small");

        /**
         * Enum MEDIUM for value: "Medium"
         */
        public static final SpecEnum MEDIUM = new SpecEnum("Medium");

        /**
         * Enum LARGE for value: "Large"
         */
        public static final SpecEnum LARGE = new SpecEnum("Large");

        /**
         * Enum EXTRA_LARGE for value: "Extra-large"
         */
        public static final SpecEnum EXTRA_LARGE = new SpecEnum("Extra-large");

        /**
         * Enum EXTRA_XLARGE for value: "Extra-xlarge"
         */
        public static final SpecEnum EXTRA_XLARGE = new SpecEnum("Extra-xlarge");

        private static final Map<String, SpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecEnum> createStaticFields() {
            Map<String, SpecEnum> map = new HashMap<>();
            map.put("Small", SMALL);
            map.put("Medium", MEDIUM);
            map.put("Large", LARGE);
            map.put("Extra-large", EXTRA_LARGE);
            map.put("Extra-xlarge", EXTRA_XLARGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecEnum(String value) {
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
        public static SpecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecEnum(value));
        }

        public static SpecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecEnum) {
                return this.value.equals(((SpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecEnum spec;

    /**
     * 私网NAT网关实例的状态。 取值为： - ACTIVE：正常运行 - FROZEN：冻结 - INACTIVE：不可用
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StatusEnum FROZEN = new StatusEnum("FROZEN");

        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("INACTIVE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("FROZEN", FROZEN);
            map.put("INACTIVE", INACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downlink_vpcs")

    private List<DownlinkVpc> downlinkVpcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_max")

    private Integer ruleMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_pool_size_max")

    private Integer transitIpPoolSizeMax;

    public PrivateNat withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 私网NAT网关实例的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrivateNat withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目的ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PrivateNat withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 私网NAT网关实例的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrivateNat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 私网NAT网关实例的描述。长度范围小于等于255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PrivateNat withSpec(SpecEnum spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 私网NAT网关实例的规格。 取值为： - Small：小型 - Medium：中型 - Large：大型 - Extra-large：超大型 - Extra-xlarge：企业型
     * @return spec
     */
    public SpecEnum getSpec() {
        return spec;
    }

    public void setSpec(SpecEnum spec) {
        this.spec = spec;
    }

    public PrivateNat withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 私网NAT网关实例的状态。 取值为： - ACTIVE：正常运行 - FROZEN：冻结 - INACTIVE：不可用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PrivateNat withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 私网NAT网关实例的创建时间，遵循UTC时间，格式是yyyy-mm-ddThh:mm:ssZ。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PrivateNat withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 私网NAT网关实例的更新时间，遵循UTC时间，格式是yyyy-mm-ddThh:mm:ssZ。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PrivateNat withDownlinkVpcs(List<DownlinkVpc> downlinkVpcs) {
        this.downlinkVpcs = downlinkVpcs;
        return this;
    }

    public PrivateNat addDownlinkVpcsItem(DownlinkVpc downlinkVpcsItem) {
        if (this.downlinkVpcs == null) {
            this.downlinkVpcs = new ArrayList<>();
        }
        this.downlinkVpcs.add(downlinkVpcsItem);
        return this;
    }

    public PrivateNat withDownlinkVpcs(Consumer<List<DownlinkVpc>> downlinkVpcsSetter) {
        if (this.downlinkVpcs == null) {
            this.downlinkVpcs = new ArrayList<>();
        }
        downlinkVpcsSetter.accept(this.downlinkVpcs);
        return this;
    }

    /**
     * 私网NAT网关实例所属的VPC实例。
     * @return downlinkVpcs
     */
    public List<DownlinkVpc> getDownlinkVpcs() {
        return downlinkVpcs;
    }

    public void setDownlinkVpcs(List<DownlinkVpc> downlinkVpcs) {
        this.downlinkVpcs = downlinkVpcs;
    }

    public PrivateNat withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public PrivateNat addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PrivateNat withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public PrivateNat withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 创建私网NAT网关实例时，关联的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PrivateNat withRuleMax(Integer ruleMax) {
        this.ruleMax = ruleMax;
        return this;
    }

    /**
     * 最大规则数。
     * minimum: 0
     * maximum: 65535
     * @return ruleMax
     */
    public Integer getRuleMax() {
        return ruleMax;
    }

    public void setRuleMax(Integer ruleMax) {
        this.ruleMax = ruleMax;
    }

    public PrivateNat withTransitIpPoolSizeMax(Integer transitIpPoolSizeMax) {
        this.transitIpPoolSizeMax = transitIpPoolSizeMax;
        return this;
    }

    /**
     * 中转ip池大小
     * minimum: 1
     * maximum: 100
     * @return transitIpPoolSizeMax
     */
    public Integer getTransitIpPoolSizeMax() {
        return transitIpPoolSizeMax;
    }

    public void setTransitIpPoolSizeMax(Integer transitIpPoolSizeMax) {
        this.transitIpPoolSizeMax = transitIpPoolSizeMax;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateNat that = (PrivateNat) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.downlinkVpcs, that.downlinkVpcs) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.ruleMax, that.ruleMax)
            && Objects.equals(this.transitIpPoolSizeMax, that.transitIpPoolSizeMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            name,
            description,
            spec,
            status,
            createdAt,
            updatedAt,
            downlinkVpcs,
            tags,
            enterpriseProjectId,
            ruleMax,
            transitIpPoolSizeMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateNat {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    downlinkVpcs: ").append(toIndentedString(downlinkVpcs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ruleMax: ").append(toIndentedString(ruleMax)).append("\n");
        sb.append("    transitIpPoolSizeMax: ").append(toIndentedString(transitIpPoolSizeMax)).append("\n");
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
