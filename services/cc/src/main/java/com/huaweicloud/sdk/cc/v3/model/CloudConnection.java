package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    /**
     * 云连接使用场景。 - VPC：虚拟私有云。 - ER：企业路由器。
     */
    public static final class UsedSceneEnum {

        /**
         * Enum ER for value: "er"
         */
        public static final UsedSceneEnum ER = new UsedSceneEnum("er");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final UsedSceneEnum VPC = new UsedSceneEnum("vpc");

        private static final Map<String, UsedSceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UsedSceneEnum> createStaticFields() {
            Map<String, UsedSceneEnum> map = new HashMap<>();
            map.put("er", ER);
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
            UsedSceneEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new UsedSceneEnum(value);
            }
            return result;
        }

        public static UsedSceneEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            UsedSceneEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 云连接实例的ID。
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
     * 云连接实例的名字。
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
     * 云连接实例的描述。
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
     * 帐号ID。
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
     * 云连接实例的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
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

    public CloudConnection withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 云连接实例的创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss
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
     * 云连接实例的更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CloudConnection withUsedScene(UsedSceneEnum usedScene) {
        this.usedScene = usedScene;
        return this;
    }

    /**
     * 云连接使用场景。 - VPC：虚拟私有云。 - ER：企业路由器。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudConnection cloudConnection = (CloudConnection) o;
        return Objects.equals(this.id, cloudConnection.id) && Objects.equals(this.name, cloudConnection.name)
            && Objects.equals(this.description, cloudConnection.description)
            && Objects.equals(this.domainId, cloudConnection.domainId)
            && Objects.equals(this.enterpriseProjectId, cloudConnection.enterpriseProjectId)
            && Objects.equals(this.status, cloudConnection.status)
            && Objects.equals(this.adminStateUp, cloudConnection.adminStateUp)
            && Objects.equals(this.createdAt, cloudConnection.createdAt)
            && Objects.equals(this.updatedAt, cloudConnection.updatedAt)
            && Objects.equals(this.usedScene, cloudConnection.usedScene)
            && Objects.equals(this.networkInstanceNumber, cloudConnection.networkInstanceNumber)
            && Objects.equals(this.bandwidthPackageNumber, cloudConnection.bandwidthPackageNumber)
            && Objects.equals(this.interRegionBandwidthNumber, cloudConnection.interRegionBandwidthNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            enterpriseProjectId,
            status,
            adminStateUp,
            createdAt,
            updatedAt,
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
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
