package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class VolumesAttached {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootIndex")

    private String bootIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private String deleteOnTermination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    public VolumesAttached withId(String id) {
        this.id = id;
        return this;
    }

    /** 磁盘ID，格式为UUID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumesAttached withBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    /** 启动标识。 - “0”代表系统盘 - 非“0”为数据盘。
     * 
     * @return bootIndex */
    public String getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
    }

    public VolumesAttached withDeleteOnTermination(String deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /** 删边缘实例时是否一并删除该磁盘。 - true：是 - false：否
     * 
     * @return deleteOnTermination */
    public String getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(String deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public VolumesAttached withDevice(String device) {
        this.device = device;
        return this;
    }

    /** 硬盘挂载盘符，即磁盘挂载点。
     * 
     * @return device */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumesAttached volumesAttached = (VolumesAttached) o;
        return Objects.equals(this.id, volumesAttached.id) && Objects.equals(this.bootIndex, volumesAttached.bootIndex)
            && Objects.equals(this.deleteOnTermination, volumesAttached.deleteOnTermination)
            && Objects.equals(this.device, volumesAttached.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bootIndex, deleteOnTermination, device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumesAttached {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
