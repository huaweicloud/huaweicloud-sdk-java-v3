package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Asset
 */
public class Asset {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_sn")

    private String assetSn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_type_cn_name")

    private String maxTypeCnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_type_en_name")

    private String maxTypeEnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_status")

    private String assetStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_name")

    private String dcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_code")

    private String dcCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_name")

    private String roomName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_code")

    private String roomCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack_id")

    private String rackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_inbound_time")

    private String firstInboundTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outbound_time")

    private String outboundTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_time")

    private String inboundTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_sn")

    private String mountSn;

    public Asset withAssetSn(String assetSn) {
        this.assetSn = assetSn;
        return this;
    }

    /**
     * 资产sn
     * @return assetSn
     */
    public String getAssetSn() {
        return assetSn;
    }

    public void setAssetSn(String assetSn) {
        this.assetSn = assetSn;
    }

    public Asset withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Asset withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 资产类型
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Asset withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产大类
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public Asset withMaxTypeCnName(String maxTypeCnName) {
        this.maxTypeCnName = maxTypeCnName;
        return this;
    }

    /**
     * 资产大类-中文
     * @return maxTypeCnName
     */
    public String getMaxTypeCnName() {
        return maxTypeCnName;
    }

    public void setMaxTypeCnName(String maxTypeCnName) {
        this.maxTypeCnName = maxTypeCnName;
    }

    public Asset withMaxTypeEnName(String maxTypeEnName) {
        this.maxTypeEnName = maxTypeEnName;
        return this;
    }

    /**
     * 资产大类-英文
     * @return maxTypeEnName
     */
    public String getMaxTypeEnName() {
        return maxTypeEnName;
    }

    public void setMaxTypeEnName(String maxTypeEnName) {
        this.maxTypeEnName = maxTypeEnName;
    }

    public Asset withAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
        return this;
    }

    /**
     * 资产状态
     * @return assetStatus
     */
    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    public Asset withDcName(String dcName) {
        this.dcName = dcName;
        return this;
    }

    /**
     * dc名称
     * @return dcName
     */
    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public Asset withDcCode(String dcCode) {
        this.dcCode = dcCode;
        return this;
    }

    /**
     * dc编码
     * @return dcCode
     */
    public String getDcCode() {
        return dcCode;
    }

    public void setDcCode(String dcCode) {
        this.dcCode = dcCode;
    }

    public Asset withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * 房间名称
     * @return roomName
     */
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Asset withRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * 机房编码
     * @return roomCode
     */
    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public Asset withRackId(String rackId) {
        this.rackId = rackId;
        return this;
    }

    /**
     * 机柜编码
     * @return rackId
     */
    public String getRackId() {
        return rackId;
    }

    public void setRackId(String rackId) {
        this.rackId = rackId;
    }

    public Asset withFirstInboundTime(String firstInboundTime) {
        this.firstInboundTime = firstInboundTime;
        return this;
    }

    /**
     * 首次入库时间
     * @return firstInboundTime
     */
    public String getFirstInboundTime() {
        return firstInboundTime;
    }

    public void setFirstInboundTime(String firstInboundTime) {
        this.firstInboundTime = firstInboundTime;
    }

    public Asset withOutboundTime(String outboundTime) {
        this.outboundTime = outboundTime;
        return this;
    }

    /**
     * 出库时间
     * @return outboundTime
     */
    public String getOutboundTime() {
        return outboundTime;
    }

    public void setOutboundTime(String outboundTime) {
        this.outboundTime = outboundTime;
    }

    public Asset withInboundTime(String inboundTime) {
        this.inboundTime = inboundTime;
        return this;
    }

    /**
     * 入库时间
     * @return inboundTime
     */
    public String getInboundTime() {
        return inboundTime;
    }

    public void setInboundTime(String inboundTime) {
        this.inboundTime = inboundTime;
    }

    public Asset withMountSn(String mountSn) {
        this.mountSn = mountSn;
        return this;
    }

    /**
     * 支架sn
     * @return mountSn
     */
    public String getMountSn() {
        return mountSn;
    }

    public void setMountSn(String mountSn) {
        this.mountSn = mountSn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Asset that = (Asset) obj;
        return Objects.equals(this.assetSn, that.assetSn) && Objects.equals(this.name, that.name)
            && Objects.equals(this.model, that.model) && Objects.equals(this.assetType, that.assetType)
            && Objects.equals(this.maxTypeCnName, that.maxTypeCnName)
            && Objects.equals(this.maxTypeEnName, that.maxTypeEnName)
            && Objects.equals(this.assetStatus, that.assetStatus) && Objects.equals(this.dcName, that.dcName)
            && Objects.equals(this.dcCode, that.dcCode) && Objects.equals(this.roomName, that.roomName)
            && Objects.equals(this.roomCode, that.roomCode) && Objects.equals(this.rackId, that.rackId)
            && Objects.equals(this.firstInboundTime, that.firstInboundTime)
            && Objects.equals(this.outboundTime, that.outboundTime)
            && Objects.equals(this.inboundTime, that.inboundTime) && Objects.equals(this.mountSn, that.mountSn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetSn,
            name,
            model,
            assetType,
            maxTypeCnName,
            maxTypeEnName,
            assetStatus,
            dcName,
            dcCode,
            roomName,
            roomCode,
            rackId,
            firstInboundTime,
            outboundTime,
            inboundTime,
            mountSn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Asset {\n");
        sb.append("    assetSn: ").append(toIndentedString(assetSn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    maxTypeCnName: ").append(toIndentedString(maxTypeCnName)).append("\n");
        sb.append("    maxTypeEnName: ").append(toIndentedString(maxTypeEnName)).append("\n");
        sb.append("    assetStatus: ").append(toIndentedString(assetStatus)).append("\n");
        sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
        sb.append("    dcCode: ").append(toIndentedString(dcCode)).append("\n");
        sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
        sb.append("    roomCode: ").append(toIndentedString(roomCode)).append("\n");
        sb.append("    rackId: ").append(toIndentedString(rackId)).append("\n");
        sb.append("    firstInboundTime: ").append(toIndentedString(firstInboundTime)).append("\n");
        sb.append("    outboundTime: ").append(toIndentedString(outboundTime)).append("\n");
        sb.append("    inboundTime: ").append(toIndentedString(inboundTime)).append("\n");
        sb.append("    mountSn: ").append(toIndentedString(mountSn)).append("\n");
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
