package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeContextEntity
 */
public class NodeContextEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_name")

    private String brokerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_id")

    private Integer brokerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_address")

    private String publicAddress;

    public NodeContextEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeContextEntity withBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /**
     * **参数解释**： broker名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return brokerName
     */
    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public NodeContextEntity withBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
        return this;
    }

    /**
     * **参数解释**： broker的ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return brokerId
     */
    public Integer getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
    }

    public NodeContextEntity withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释**： 地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public NodeContextEntity withPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
        return this;
    }

    /**
     * **参数解释**： 公网地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicAddress
     */
    public String getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeContextEntity that = (NodeContextEntity) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.brokerName, that.brokerName)
            && Objects.equals(this.brokerId, that.brokerId) && Objects.equals(this.address, that.address)
            && Objects.equals(this.publicAddress, that.publicAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brokerName, brokerId, address, publicAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeContextEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
        sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    publicAddress: ").append(toIndentedString(publicAddress)).append("\n");
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
