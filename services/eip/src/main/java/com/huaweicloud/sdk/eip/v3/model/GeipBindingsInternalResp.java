package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GEIP绑定关系对象
 */
public class GeipBindingsInternalResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geip_id")

    private String geipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geip_ip_address")

    private String geipIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidth")

    private BackboneBandwidthResp gcbandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic")

    private InstanceVnicResp vnic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vn_list")

    private List<InstancevirtualListResp> vnList = null;

    public GeipBindingsInternalResp withGeipId(String geipId) {
        this.geipId = geipId;
        return this;
    }

    /**
     * GEIP的uuid
     * @return geipId
     */
    public String getGeipId() {
        return geipId;
    }

    public void setGeipId(String geipId) {
        this.geipId = geipId;
    }

    public GeipBindingsInternalResp withGeipIpAddress(String geipIpAddress) {
        this.geipIpAddress = geipIpAddress;
        return this;
    }

    /**
     * GEIP的ip地址
     * @return geipIpAddress
     */
    public String getGeipIpAddress() {
        return geipIpAddress;
    }

    public void setGeipIpAddress(String geipIpAddress) {
        this.geipIpAddress = geipIpAddress;
    }

    public GeipBindingsInternalResp withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 中心站点or边缘站点，默认展示
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public GeipBindingsInternalResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GeipBindingsInternalResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GeipBindingsInternalResp withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 绑定实例的类型
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public GeipBindingsInternalResp withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 绑定实例的id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public GeipBindingsInternalResp withGcbandwidth(BackboneBandwidthResp gcbandwidth) {
        this.gcbandwidth = gcbandwidth;
        return this;
    }

    public GeipBindingsInternalResp withGcbandwidth(Consumer<BackboneBandwidthResp> gcbandwidthSetter) {
        if (this.gcbandwidth == null) {
            this.gcbandwidth = new BackboneBandwidthResp();
            gcbandwidthSetter.accept(this.gcbandwidth);
        }

        return this;
    }

    /**
     * Get gcbandwidth
     * @return gcbandwidth
     */
    public BackboneBandwidthResp getGcbandwidth() {
        return gcbandwidth;
    }

    public void setGcbandwidth(BackboneBandwidthResp gcbandwidth) {
        this.gcbandwidth = gcbandwidth;
    }

    public GeipBindingsInternalResp withVnic(InstanceVnicResp vnic) {
        this.vnic = vnic;
        return this;
    }

    public GeipBindingsInternalResp withVnic(Consumer<InstanceVnicResp> vnicSetter) {
        if (this.vnic == null) {
            this.vnic = new InstanceVnicResp();
            vnicSetter.accept(this.vnic);
        }

        return this;
    }

    /**
     * Get vnic
     * @return vnic
     */
    public InstanceVnicResp getVnic() {
        return vnic;
    }

    public void setVnic(InstanceVnicResp vnic) {
        this.vnic = vnic;
    }

    public GeipBindingsInternalResp withVnList(List<InstancevirtualListResp> vnList) {
        this.vnList = vnList;
        return this;
    }

    public GeipBindingsInternalResp addVnListItem(InstancevirtualListResp vnListItem) {
        if (this.vnList == null) {
            this.vnList = new ArrayList<>();
        }
        this.vnList.add(vnListItem);
        return this;
    }

    public GeipBindingsInternalResp withVnList(Consumer<List<InstancevirtualListResp>> vnListSetter) {
        if (this.vnList == null) {
            this.vnList = new ArrayList<>();
        }
        vnListSetter.accept(this.vnList);
        return this;
    }

    /**
     * GEIP实例的vn信息
     * @return vnList
     */
    public List<InstancevirtualListResp> getVnList() {
        return vnList;
    }

    public void setVnList(List<InstancevirtualListResp> vnList) {
        this.vnList = vnList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeipBindingsInternalResp that = (GeipBindingsInternalResp) obj;
        return Objects.equals(this.geipId, that.geipId) && Objects.equals(this.geipIpAddress, that.geipIpAddress)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.gcbandwidth, that.gcbandwidth) && Objects.equals(this.vnic, that.vnic)
            && Objects.equals(this.vnList, that.vnList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geipId,
            geipIpAddress,
            publicBorderGroup,
            createdAt,
            updatedAt,
            instanceType,
            instanceId,
            gcbandwidth,
            vnic,
            vnList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeipBindingsInternalResp {\n");
        sb.append("    geipId: ").append(toIndentedString(geipId)).append("\n");
        sb.append("    geipIpAddress: ").append(toIndentedString(geipIpAddress)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    gcbandwidth: ").append(toIndentedString(gcbandwidth)).append("\n");
        sb.append("    vnic: ").append(toIndentedString(vnic)).append("\n");
        sb.append("    vnList: ").append(toIndentedString(vnList)).append("\n");
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
