package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConnectionCreateReq
 */
public class ConnectionCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private ConnectionType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_detail")

    private KafkaConnectionDetail kafkaDetail;

    public ConnectionCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 目标连接名称，租户下唯一，由字母、数字、点、下划线和中划线组成，必须以字母或数字开头，不能为default
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectionCreateReq withDescription(String description) {
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

    public ConnectionCreateReq withVpcId(String vpcId) {
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

    public ConnectionCreateReq withSubnetId(String subnetId) {
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

    public ConnectionCreateReq withType(ConnectionType type) {
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

    public ConnectionCreateReq withKafkaDetail(KafkaConnectionDetail kafkaDetail) {
        this.kafkaDetail = kafkaDetail;
        return this;
    }

    public ConnectionCreateReq withKafkaDetail(Consumer<KafkaConnectionDetail> kafkaDetailSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionCreateReq connectionCreateReq = (ConnectionCreateReq) o;
        return Objects.equals(this.name, connectionCreateReq.name)
            && Objects.equals(this.description, connectionCreateReq.description)
            && Objects.equals(this.vpcId, connectionCreateReq.vpcId)
            && Objects.equals(this.subnetId, connectionCreateReq.subnetId)
            && Objects.equals(this.type, connectionCreateReq.type)
            && Objects.equals(this.kafkaDetail, connectionCreateReq.kafkaDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, vpcId, subnetId, type, kafkaDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionCreateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    kafkaDetail: ").append(toIndentedString(kafkaDetail)).append("\n");
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
