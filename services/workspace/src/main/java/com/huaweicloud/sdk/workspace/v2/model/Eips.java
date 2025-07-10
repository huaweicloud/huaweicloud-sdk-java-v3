package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面EIP。
 */
public class Eips {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_charge_mode")

    private String eipChargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_desktop_id")

    private String attachedDesktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_desktop_name")

    private String attachedDesktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public Eips withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * EIP的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Eips withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * EIP地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Eips withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽大小。
     * minimum: 1
     * maximum: 2000
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public Eips withEipChargeMode(String eipChargeMode) {
        this.eipChargeMode = eipChargeMode;
        return this;
    }

    /**
     * traffic（按流量计费），bandwidth（按带宽计费）。
     * @return eipChargeMode
     */
    public String getEipChargeMode() {
        return eipChargeMode;
    }

    public void setEipChargeMode(String eipChargeMode) {
        this.eipChargeMode = eipChargeMode;
    }

    public Eips withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式为：yyyy-MM-ddTHH:mm:ssZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Eips withAttachedDesktopId(String attachedDesktopId) {
        this.attachedDesktopId = attachedDesktopId;
        return this;
    }

    /**
     * 绑定的桌面id。
     * @return attachedDesktopId
     */
    public String getAttachedDesktopId() {
        return attachedDesktopId;
    }

    public void setAttachedDesktopId(String attachedDesktopId) {
        this.attachedDesktopId = attachedDesktopId;
    }

    public Eips withAttachedDesktopName(String attachedDesktopName) {
        this.attachedDesktopName = attachedDesktopName;
        return this;
    }

    /**
     * 绑定的桌面名称。
     * @return attachedDesktopName
     */
    public String getAttachedDesktopName() {
        return attachedDesktopName;
    }

    public void setAttachedDesktopName(String attachedDesktopName) {
        this.attachedDesktopName = attachedDesktopName;
    }

    public Eips withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Eips that = (Eips) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.address, that.address)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.eipChargeMode, that.eipChargeMode)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.attachedDesktopId, that.attachedDesktopId)
            && Objects.equals(this.attachedDesktopName, that.attachedDesktopName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            address,
            bandwidthSize,
            eipChargeMode,
            createTime,
            attachedDesktopId,
            attachedDesktopName,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Eips {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    eipChargeMode: ").append(toIndentedString(eipChargeMode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    attachedDesktopId: ").append(toIndentedString(attachedDesktopId)).append("\n");
        sb.append("    attachedDesktopName: ").append(toIndentedString(attachedDesktopName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
