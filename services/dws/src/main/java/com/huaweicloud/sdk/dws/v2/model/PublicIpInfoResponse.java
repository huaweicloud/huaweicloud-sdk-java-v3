package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 公网IP信息详情。 **取值范围**： 不涉及。
 */
public class PublicIpInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private String bandwidthSize;

    public PublicIpInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 公网IP的ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicIpInfoResponse withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释**： 公网IP。 **取值范围**： 合法的公网IPV4地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PublicIpInfoResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 公网IP状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PublicIpInfoResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 绑定的DWS集群的节点ID。 **取值范围**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public PublicIpInfoResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**： 绑定的DWS集群的节点名称。 **取值范围**： 不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public PublicIpInfoResponse withBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * **参数解释**： 公网IP带宽信息。 **取值范围**： 不涉及。
     * @return bandwidthSize
     */
    public String getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicIpInfoResponse that = (PublicIpInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.address, that.address)
            && Objects.equals(this.status, that.status) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, status, instanceId, instanceName, bandwidthSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIpInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
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
