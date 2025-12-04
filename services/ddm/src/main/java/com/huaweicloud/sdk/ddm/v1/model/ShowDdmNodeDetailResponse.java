package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDdmNodeDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public ShowDdmNodeDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 节点id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDdmNodeDetailResponse withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 私有ip。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ShowDdmNodeDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDdmNodeDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDdmNodeDetailResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网id。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowDdmNodeDetailResponse withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public ShowDdmNodeDetailResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组id。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDdmNodeDetailResponse that = (ShowDdmNodeDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.status, that.status) && Objects.equals(this.name, that.name)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, privateIp, status, name, subnetId, azCode, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDdmNodeDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
