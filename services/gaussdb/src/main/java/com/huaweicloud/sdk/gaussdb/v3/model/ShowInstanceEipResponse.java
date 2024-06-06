package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceEipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_enable_public_access")

    private Boolean canEnablePublicAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private String publicIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_id")

    private String bandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_name")

    private String bandwidthName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private String bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_share_type")

    private String bandwidthShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile")

    private Object profile;

    public ShowInstanceEipResponse withCanEnablePublicAccess(Boolean canEnablePublicAccess) {
        this.canEnablePublicAccess = canEnablePublicAccess;
        return this;
    }

    /**
     * 是否能访问公网
     * @return canEnablePublicAccess
     */
    public Boolean getCanEnablePublicAccess() {
        return canEnablePublicAccess;
    }

    public void setCanEnablePublicAccess(Boolean canEnablePublicAccess) {
        this.canEnablePublicAccess = canEnablePublicAccess;
    }

    public ShowInstanceEipResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性公网ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowInstanceEipResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 弹性公网IP的网络类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowInstanceEipResponse withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 端口ID。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public ShowInstanceEipResponse withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * 弹性公网IP地址。
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public ShowInstanceEipResponse withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * 私网IP地址。
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public ShowInstanceEipResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 弹性公网IP地址。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceEipResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ShowInstanceEipResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowInstanceEipResponse withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    /**
     * 带宽ID。
     * @return bandwidthId
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    public ShowInstanceEipResponse withBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }

    /**
     * 带宽名称。
     * @return bandwidthName
     */
    public String getBandwidthName() {
        return bandwidthName;
    }

    public void setBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
    }

    public ShowInstanceEipResponse withBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽大小。
     * @return bandwidthSize
     */
    public String getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public ShowInstanceEipResponse withBandwidthShareType(String bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
        return this;
    }

    /**
     * 带宽类型。枚举值：PER 和WHOLE。
     * @return bandwidthShareType
     */
    public String getBandwidthShareType() {
        return bandwidthShareType;
    }

    public void setBandwidthShareType(String bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
    }

    public ShowInstanceEipResponse withProfile(Object profile) {
        this.profile = profile;
        return this;
    }

    /**
     * 额外参数，包括订单id、产品id等信息。如果profile不为空，说明是包周期的弹性公网IP。
     * @return profile
     */
    public Object getProfile() {
        return profile;
    }

    public void setProfile(Object profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceEipResponse that = (ShowInstanceEipResponse) obj;
        return Objects.equals(this.canEnablePublicAccess, that.canEnablePublicAccess)
            && Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.portId, that.portId) && Objects.equals(this.publicIpAddress, that.publicIpAddress)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.bandwidthId, that.bandwidthId)
            && Objects.equals(this.bandwidthName, that.bandwidthName)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.bandwidthShareType, that.bandwidthShareType)
            && Objects.equals(this.profile, that.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canEnablePublicAccess,
            id,
            type,
            portId,
            publicIpAddress,
            privateIpAddress,
            status,
            tenantId,
            createTime,
            bandwidthId,
            bandwidthName,
            bandwidthSize,
            bandwidthShareType,
            profile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceEipResponse {\n");
        sb.append("    canEnablePublicAccess: ").append(toIndentedString(canEnablePublicAccess)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
        sb.append("    bandwidthName: ").append(toIndentedString(bandwidthName)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    bandwidthShareType: ").append(toIndentedString(bandwidthShareType)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
