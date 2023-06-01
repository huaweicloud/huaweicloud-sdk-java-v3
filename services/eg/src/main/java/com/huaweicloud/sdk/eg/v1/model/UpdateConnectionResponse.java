package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 目标连接状态
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final StatusEnum CREATED = new StatusEnum("CREATED");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATED", CREATED);
            map.put("CREATE_FAILED", CREATE_FAILED);
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
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private ConnectionInfoFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private ConnectionType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_detail")

    private KafkaConnectionDetail kafkaDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateConnectionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件源ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateConnectionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 目标连接名称，租户下唯一，由小写字母、数字、点、下划线和中划线组成，必须以字母或数字开头，不能为default
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateConnectionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 目标连接描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateConnectionResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 目标连接状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateConnectionResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 待连接的VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UpdateConnectionResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 待连接的子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public UpdateConnectionResponse withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 私网目标连接使用的用户委托名称
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public UpdateConnectionResponse withFlavor(ConnectionInfoFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public UpdateConnectionResponse withFlavor(Consumer<ConnectionInfoFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new ConnectionInfoFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public ConnectionInfoFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(ConnectionInfoFlavor flavor) {
        this.flavor = flavor;
    }

    public UpdateConnectionResponse withType(ConnectionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public ConnectionType getType() {
        return type;
    }

    public void setType(ConnectionType type) {
        this.type = type;
    }

    public UpdateConnectionResponse withKafkaDetail(KafkaConnectionDetail kafkaDetail) {
        this.kafkaDetail = kafkaDetail;
        return this;
    }

    public UpdateConnectionResponse withKafkaDetail(Consumer<KafkaConnectionDetail> kafkaDetailSetter) {
        if (this.kafkaDetail == null) {
            this.kafkaDetail = new KafkaConnectionDetail();
            kafkaDetailSetter.accept(this.kafkaDetail);
        }

        return this;
    }

    /**
     * Get kafkaDetail
     * @return kafkaDetail
     */
    public KafkaConnectionDetail getKafkaDetail() {
        return kafkaDetail;
    }

    public void setKafkaDetail(KafkaConnectionDetail kafkaDetail) {
        this.kafkaDetail = kafkaDetail;
    }

    public UpdateConnectionResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建UTC时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public UpdateConnectionResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新UTC时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public UpdateConnectionResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateConnectionResponse updateConnectionResponse = (UpdateConnectionResponse) o;
        return Objects.equals(this.id, updateConnectionResponse.id)
            && Objects.equals(this.name, updateConnectionResponse.name)
            && Objects.equals(this.description, updateConnectionResponse.description)
            && Objects.equals(this.status, updateConnectionResponse.status)
            && Objects.equals(this.vpcId, updateConnectionResponse.vpcId)
            && Objects.equals(this.subnetId, updateConnectionResponse.subnetId)
            && Objects.equals(this.agency, updateConnectionResponse.agency)
            && Objects.equals(this.flavor, updateConnectionResponse.flavor)
            && Objects.equals(this.type, updateConnectionResponse.type)
            && Objects.equals(this.kafkaDetail, updateConnectionResponse.kafkaDetail)
            && Objects.equals(this.createdTime, updateConnectionResponse.createdTime)
            && Objects.equals(this.updatedTime, updateConnectionResponse.updatedTime)
            && Objects.equals(this.xRequestId, updateConnectionResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            status,
            vpcId,
            subnetId,
            agency,
            flavor,
            type,
            kafkaDetail,
            createdTime,
            updatedTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConnectionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    kafkaDetail: ").append(toIndentedString(kafkaDetail)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
