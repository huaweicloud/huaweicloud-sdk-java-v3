package com.huaweicloud.sdk.cc.v3.model;

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
 * 云连接实例。
 */
public class CloudConnection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    /**
     * 云连接实例的状态。ACTIVE：表示状态可用。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
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
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    /**
     * 云连接使用场景。 - VPC：虚拟私有云。
     */
    public static final class UsedSceneEnum {

        /**
         * Enum VPC for value: "vpc"
         */
        public static final UsedSceneEnum VPC = new UsedSceneEnum("vpc");

        private static final Map<String, UsedSceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UsedSceneEnum> createStaticFields() {
            Map<String, UsedSceneEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UsedSceneEnum(String value) {
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
        public static UsedSceneEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UsedSceneEnum(value));
        }

        public static UsedSceneEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UsedSceneEnum) {
                return this.value.equals(((UsedSceneEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_scene")

    private UsedSceneEnum usedScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_instance_number")

    private Integer networkInstanceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package_number")

    private Integer bandwidthPackageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_region_bandwidth_number")

    private Integer interRegionBandwidthNumber;

    public CloudConnection withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CloudConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloudConnection withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CloudConnection withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CloudConnection withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CloudConnection withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CloudConnection withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 实例更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CloudConnection withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CloudConnection addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CloudConnection withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 实例标签。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CloudConnection withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 云连接实例的状态。ACTIVE：表示状态可用。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CloudConnection withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 云连接实例的管理状态。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CloudConnection withUsedScene(UsedSceneEnum usedScene) {
        this.usedScene = usedScene;
        return this;
    }

    /**
     * 云连接使用场景。 - VPC：虚拟私有云。
     * @return usedScene
     */
    public UsedSceneEnum getUsedScene() {
        return usedScene;
    }

    public void setUsedScene(UsedSceneEnum usedScene) {
        this.usedScene = usedScene;
    }

    public CloudConnection withNetworkInstanceNumber(Integer networkInstanceNumber) {
        this.networkInstanceNumber = networkInstanceNumber;
        return this;
    }

    /**
     * 云连接实例关联网络实例的个数。
     * minimum: 0
     * maximum: 10000
     * @return networkInstanceNumber
     */
    public Integer getNetworkInstanceNumber() {
        return networkInstanceNumber;
    }

    public void setNetworkInstanceNumber(Integer networkInstanceNumber) {
        this.networkInstanceNumber = networkInstanceNumber;
    }

    public CloudConnection withBandwidthPackageNumber(Integer bandwidthPackageNumber) {
        this.bandwidthPackageNumber = bandwidthPackageNumber;
        return this;
    }

    /**
     * 云连接实例关联带宽包的个数。
     * minimum: 0
     * maximum: 10000
     * @return bandwidthPackageNumber
     */
    public Integer getBandwidthPackageNumber() {
        return bandwidthPackageNumber;
    }

    public void setBandwidthPackageNumber(Integer bandwidthPackageNumber) {
        this.bandwidthPackageNumber = bandwidthPackageNumber;
    }

    public CloudConnection withInterRegionBandwidthNumber(Integer interRegionBandwidthNumber) {
        this.interRegionBandwidthNumber = interRegionBandwidthNumber;
        return this;
    }

    /**
     * 云连接实例关联域间带宽的个数。
     * minimum: 0
     * maximum: 10000
     * @return interRegionBandwidthNumber
     */
    public Integer getInterRegionBandwidthNumber() {
        return interRegionBandwidthNumber;
    }

    public void setInterRegionBandwidthNumber(Integer interRegionBandwidthNumber) {
        this.interRegionBandwidthNumber = interRegionBandwidthNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudConnection that = (CloudConnection) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.status, that.status)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.usedScene, that.usedScene)
            && Objects.equals(this.networkInstanceNumber, that.networkInstanceNumber)
            && Objects.equals(this.bandwidthPackageNumber, that.bandwidthPackageNumber)
            && Objects.equals(this.interRegionBandwidthNumber, that.interRegionBandwidthNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            enterpriseProjectId,
            createdAt,
            updatedAt,
            tags,
            status,
            adminStateUp,
            usedScene,
            networkInstanceNumber,
            bandwidthPackageNumber,
            interRegionBandwidthNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudConnection {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    usedScene: ").append(toIndentedString(usedScene)).append("\n");
        sb.append("    networkInstanceNumber: ").append(toIndentedString(networkInstanceNumber)).append("\n");
        sb.append("    bandwidthPackageNumber: ").append(toIndentedString(bandwidthPackageNumber)).append("\n");
        sb.append("    interRegionBandwidthNumber: ").append(toIndentedString(interRegionBandwidthNumber)).append("\n");
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
