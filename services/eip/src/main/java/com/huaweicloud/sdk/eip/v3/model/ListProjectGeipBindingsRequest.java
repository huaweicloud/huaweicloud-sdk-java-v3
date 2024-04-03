package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectGeipBindingsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private String fields;

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
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_vpc_id")

    private String instanceVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidth.id")

    private String gcbandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidth.admin_status")

    private String gcbandwidthAdminStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidth.size")

    private Integer gcbandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidth.sla_level")

    private String gcbandwidthSlaLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidth.dscp")

    private Integer gcbandwidthDscp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.private_ip_address")

    private String vnicPrivateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.vpc_id")

    private String vnicVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.port_id")

    private String vnicPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.device_id")

    private String vnicDeviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.device_owner")

    private String vnicDeviceOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.device_owner_prefixlike")

    private String vnicDeviceOwnerPrefixlike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.instance_type")

    private String vnicInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.instance_id")

    private String vnicInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListProjectGeipBindingsRequest withFields(String fields) {
        this.fields = fields;
        return this;
    }

    /**
     * 形式为\\\"fields=geip_id&fields=geip_ip_address&...\\\"，支持字段：geip_id/geip_ip_address/instance_type/instance_id/vnic/vn_list/public_border_group/gcbandwidth/version/created_at/updated_at/instance_vpc_id
     * @return fields
     */
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public ListProjectGeipBindingsRequest withGeipId(String geipId) {
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

    public ListProjectGeipBindingsRequest withGeipIpAddress(String geipIpAddress) {
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

    public ListProjectGeipBindingsRequest withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * GEIP所处的出口位置
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListProjectGeipBindingsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 绑定的实例类型
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public ListProjectGeipBindingsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 绑定的实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListProjectGeipBindingsRequest withInstanceVpcId(String instanceVpcId) {
        this.instanceVpcId = instanceVpcId;
        return this;
    }

    /**
     * 绑定的实例vpcid
     * @return instanceVpcId
     */
    public String getInstanceVpcId() {
        return instanceVpcId;
    }

    public void setInstanceVpcId(String instanceVpcId) {
        this.instanceVpcId = instanceVpcId;
    }

    public ListProjectGeipBindingsRequest withGcbandwidthId(String gcbandwidthId) {
        this.gcbandwidthId = gcbandwidthId;
        return this;
    }

    /**
     * 骨干带宽的uuid
     * @return gcbandwidthId
     */
    public String getGcbandwidthId() {
        return gcbandwidthId;
    }

    public void setGcbandwidthId(String gcbandwidthId) {
        this.gcbandwidthId = gcbandwidthId;
    }

    public ListProjectGeipBindingsRequest withGcbandwidthAdminStatus(String gcbandwidthAdminStatus) {
        this.gcbandwidthAdminStatus = gcbandwidthAdminStatus;
        return this;
    }

    /**
     * 骨干带宽的状态
     * @return gcbandwidthAdminStatus
     */
    public String getGcbandwidthAdminStatus() {
        return gcbandwidthAdminStatus;
    }

    public void setGcbandwidthAdminStatus(String gcbandwidthAdminStatus) {
        this.gcbandwidthAdminStatus = gcbandwidthAdminStatus;
    }

    public ListProjectGeipBindingsRequest withGcbandwidthSize(Integer gcbandwidthSize) {
        this.gcbandwidthSize = gcbandwidthSize;
        return this;
    }

    /**
     * 骨干带宽的大小
     * minimum: 0
     * maximum: 999999
     * @return gcbandwidthSize
     */
    public Integer getGcbandwidthSize() {
        return gcbandwidthSize;
    }

    public void setGcbandwidthSize(Integer gcbandwidthSize) {
        this.gcbandwidthSize = gcbandwidthSize;
    }

    public ListProjectGeipBindingsRequest withGcbandwidthSlaLevel(String gcbandwidthSlaLevel) {
        this.gcbandwidthSlaLevel = gcbandwidthSlaLevel;
        return this;
    }

    /**
     * 描述网络等级，从高到低分为铂金、金、银、铜
     * @return gcbandwidthSlaLevel
     */
    public String getGcbandwidthSlaLevel() {
        return gcbandwidthSlaLevel;
    }

    public void setGcbandwidthSlaLevel(String gcbandwidthSlaLevel) {
        this.gcbandwidthSlaLevel = gcbandwidthSlaLevel;
    }

    public ListProjectGeipBindingsRequest withGcbandwidthDscp(Integer gcbandwidthDscp) {
        this.gcbandwidthDscp = gcbandwidthDscp;
        return this;
    }

    /**
     * 线路质量金银铜对应的DSCP值
     * minimum: 0
     * maximum: 63
     * @return gcbandwidthDscp
     */
    public Integer getGcbandwidthDscp() {
        return gcbandwidthDscp;
    }

    public void setGcbandwidthDscp(Integer gcbandwidthDscp) {
        this.gcbandwidthDscp = gcbandwidthDscp;
    }

    public ListProjectGeipBindingsRequest withVnicPrivateIpAddress(String vnicPrivateIpAddress) {
        this.vnicPrivateIpAddress = vnicPrivateIpAddress;
        return this;
    }

    /**
     * 绑定实例的ip地址
     * @return vnicPrivateIpAddress
     */
    public String getVnicPrivateIpAddress() {
        return vnicPrivateIpAddress;
    }

    public void setVnicPrivateIpAddress(String vnicPrivateIpAddress) {
        this.vnicPrivateIpAddress = vnicPrivateIpAddress;
    }

    public ListProjectGeipBindingsRequest withVnicVpcId(String vnicVpcId) {
        this.vnicVpcId = vnicVpcId;
        return this;
    }

    /**
     * 绑定实例所在的vpcid
     * @return vnicVpcId
     */
    public String getVnicVpcId() {
        return vnicVpcId;
    }

    public void setVnicVpcId(String vnicVpcId) {
        this.vnicVpcId = vnicVpcId;
    }

    public ListProjectGeipBindingsRequest withVnicPortId(String vnicPortId) {
        this.vnicPortId = vnicPortId;
        return this;
    }

    /**
     * 绑定实例port的uuid
     * @return vnicPortId
     */
    public String getVnicPortId() {
        return vnicPortId;
    }

    public void setVnicPortId(String vnicPortId) {
        this.vnicPortId = vnicPortId;
    }

    public ListProjectGeipBindingsRequest withVnicDeviceId(String vnicDeviceId) {
        this.vnicDeviceId = vnicDeviceId;
        return this;
    }

    /**
     * 绑定实例port对应的实例id
     * @return vnicDeviceId
     */
    public String getVnicDeviceId() {
        return vnicDeviceId;
    }

    public void setVnicDeviceId(String vnicDeviceId) {
        this.vnicDeviceId = vnicDeviceId;
    }

    public ListProjectGeipBindingsRequest withVnicDeviceOwner(String vnicDeviceOwner) {
        this.vnicDeviceOwner = vnicDeviceOwner;
        return this;
    }

    /**
     * 绑定实例port对应的实例所有者
     * @return vnicDeviceOwner
     */
    public String getVnicDeviceOwner() {
        return vnicDeviceOwner;
    }

    public void setVnicDeviceOwner(String vnicDeviceOwner) {
        this.vnicDeviceOwner = vnicDeviceOwner;
    }

    public ListProjectGeipBindingsRequest withVnicDeviceOwnerPrefixlike(String vnicDeviceOwnerPrefixlike) {
        this.vnicDeviceOwnerPrefixlike = vnicDeviceOwnerPrefixlike;
        return this;
    }

    /**
     * 绑定实例port对应的实例所有者的前缀
     * @return vnicDeviceOwnerPrefixlike
     */
    public String getVnicDeviceOwnerPrefixlike() {
        return vnicDeviceOwnerPrefixlike;
    }

    public void setVnicDeviceOwnerPrefixlike(String vnicDeviceOwnerPrefixlike) {
        this.vnicDeviceOwnerPrefixlike = vnicDeviceOwnerPrefixlike;
    }

    public ListProjectGeipBindingsRequest withVnicInstanceType(String vnicInstanceType) {
        this.vnicInstanceType = vnicInstanceType;
        return this;
    }

    /**
     * 绑定实例port对应的实例类型
     * @return vnicInstanceType
     */
    public String getVnicInstanceType() {
        return vnicInstanceType;
    }

    public void setVnicInstanceType(String vnicInstanceType) {
        this.vnicInstanceType = vnicInstanceType;
    }

    public ListProjectGeipBindingsRequest withVnicInstanceId(String vnicInstanceId) {
        this.vnicInstanceId = vnicInstanceId;
        return this;
    }

    /**
     * 绑定实例port对应的实例id
     * @return vnicInstanceId
     */
    public String getVnicInstanceId() {
        return vnicInstanceId;
    }

    public void setVnicInstanceId(String vnicInstanceId) {
        this.vnicInstanceId = vnicInstanceId;
    }

    public ListProjectGeipBindingsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序，形式为\"sort_key=geip_id&sort_dir=asc\"  支持字段：geip_id/version/public_border_group/ geip_ip_address/created_at/updated_at
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListProjectGeipBindingsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方向  取值范围：asc、desc
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListProjectGeipBindingsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数取值范围：0~[2000]，其中2000为局点差异项，具体取值由局点决定
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectGeipBindingsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页起始点
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectGeipBindingsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页起始点
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectGeipBindingsRequest that = (ListProjectGeipBindingsRequest) obj;
        return Objects.equals(this.fields, that.fields) && Objects.equals(this.geipId, that.geipId)
            && Objects.equals(this.geipIpAddress, that.geipIpAddress)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceVpcId, that.instanceVpcId)
            && Objects.equals(this.gcbandwidthId, that.gcbandwidthId)
            && Objects.equals(this.gcbandwidthAdminStatus, that.gcbandwidthAdminStatus)
            && Objects.equals(this.gcbandwidthSize, that.gcbandwidthSize)
            && Objects.equals(this.gcbandwidthSlaLevel, that.gcbandwidthSlaLevel)
            && Objects.equals(this.gcbandwidthDscp, that.gcbandwidthDscp)
            && Objects.equals(this.vnicPrivateIpAddress, that.vnicPrivateIpAddress)
            && Objects.equals(this.vnicVpcId, that.vnicVpcId) && Objects.equals(this.vnicPortId, that.vnicPortId)
            && Objects.equals(this.vnicDeviceId, that.vnicDeviceId)
            && Objects.equals(this.vnicDeviceOwner, that.vnicDeviceOwner)
            && Objects.equals(this.vnicDeviceOwnerPrefixlike, that.vnicDeviceOwnerPrefixlike)
            && Objects.equals(this.vnicInstanceType, that.vnicInstanceType)
            && Objects.equals(this.vnicInstanceId, that.vnicInstanceId) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields,
            geipId,
            geipIpAddress,
            publicBorderGroup,
            instanceType,
            instanceId,
            instanceVpcId,
            gcbandwidthId,
            gcbandwidthAdminStatus,
            gcbandwidthSize,
            gcbandwidthSlaLevel,
            gcbandwidthDscp,
            vnicPrivateIpAddress,
            vnicVpcId,
            vnicPortId,
            vnicDeviceId,
            vnicDeviceOwner,
            vnicDeviceOwnerPrefixlike,
            vnicInstanceType,
            vnicInstanceId,
            sortKey,
            sortDir,
            limit,
            offset,
            marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectGeipBindingsRequest {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    geipId: ").append(toIndentedString(geipId)).append("\n");
        sb.append("    geipIpAddress: ").append(toIndentedString(geipIpAddress)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceVpcId: ").append(toIndentedString(instanceVpcId)).append("\n");
        sb.append("    gcbandwidthId: ").append(toIndentedString(gcbandwidthId)).append("\n");
        sb.append("    gcbandwidthAdminStatus: ").append(toIndentedString(gcbandwidthAdminStatus)).append("\n");
        sb.append("    gcbandwidthSize: ").append(toIndentedString(gcbandwidthSize)).append("\n");
        sb.append("    gcbandwidthSlaLevel: ").append(toIndentedString(gcbandwidthSlaLevel)).append("\n");
        sb.append("    gcbandwidthDscp: ").append(toIndentedString(gcbandwidthDscp)).append("\n");
        sb.append("    vnicPrivateIpAddress: ").append(toIndentedString(vnicPrivateIpAddress)).append("\n");
        sb.append("    vnicVpcId: ").append(toIndentedString(vnicVpcId)).append("\n");
        sb.append("    vnicPortId: ").append(toIndentedString(vnicPortId)).append("\n");
        sb.append("    vnicDeviceId: ").append(toIndentedString(vnicDeviceId)).append("\n");
        sb.append("    vnicDeviceOwner: ").append(toIndentedString(vnicDeviceOwner)).append("\n");
        sb.append("    vnicDeviceOwnerPrefixlike: ").append(toIndentedString(vnicDeviceOwnerPrefixlike)).append("\n");
        sb.append("    vnicInstanceType: ").append(toIndentedString(vnicInstanceType)).append("\n");
        sb.append("    vnicInstanceId: ").append(toIndentedString(vnicInstanceId)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
