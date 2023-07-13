package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AttachServerVolumeOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeId")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:passthrough")

    private String hwPassthrough;

    public AttachServerVolumeOption withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * 磁盘挂载点。  > 说明：  - 新增加的磁盘挂载点不能和已有的磁盘挂载点相同。  - 对于采用XEN虚拟化类型的弹性云服务器，device为必选参数；系统盘挂载点请指定/dev/sda；数据盘挂载点请按英文字母顺序依次指定，如/dev/sdb，/dev/sdc，如果指定了以“/dev/vd”开头的挂载点，系统默认改为“/dev/sd”。  - 对于采用KVM虚拟化类型的弹性云服务器，系统盘挂载点请指定/dev/vda；数据盘挂载点可不用指定，也可按英文字母顺序依次指定，如/dev/vdb，/dev/vdc，如果指定了以“/dev/sd”开头的挂载点，系统默认改为“/dev/vd”。
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public AttachServerVolumeOption withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * 待挂载磁盘的磁盘ID，UUID格式。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public AttachServerVolumeOption withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 云硬盘类型。  该字段于dry_run为true并且volumeId不存在时有效且为必选字段。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public AttachServerVolumeOption withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 云硬盘的个数。  该字段于dry_run为true并且volumeId不存在时有效，如果该字段不存在，默认为1。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public AttachServerVolumeOption withHwPassthrough(String hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    /**
     * - true: 表示云硬盘的设备类型为SCSI类型，即允许ECS操作系统直接访问底层存储介质。支持SCSI锁命令 - false: 表示云硬盘的设备类型为VBD (虚拟块存储设备 , Virtual Block Device)类型，VBD只能支持简单的SCSI读写命令。 该字段于dry_run为true并且volumeId不存在时有效且为必选字段。
     * @return hwPassthrough
     */
    public String getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(String hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachServerVolumeOption that = (AttachServerVolumeOption) obj;
        return Objects.equals(this.device, that.device) && Objects.equals(this.volumeId, that.volumeId)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.count, that.count)
            && Objects.equals(this.hwPassthrough, that.hwPassthrough);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, volumeId, volumeType, count, hwPassthrough);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachServerVolumeOption {\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
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
