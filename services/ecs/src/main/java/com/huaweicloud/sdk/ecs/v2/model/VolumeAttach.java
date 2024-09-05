package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云服务器挂载磁盘信息。
 */
public class VolumeAttach {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private Boolean deleteOnTermination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootIndex")

    private String bootIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public VolumeAttach withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云磁盘ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumeAttach withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * 一个标志，指示在删除服务器时是否删除附加的卷。 默认情况下，这是False
     * @return deleteOnTermination
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public VolumeAttach withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * 挂载点
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public VolumeAttach withBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    /**
     * 盘在云服务器上的挂载顺序，0表示启动盘。
     * @return bootIndex
     */
    public String getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
    }

    public VolumeAttach withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 云盘大小（单位：GB）。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeAttach that = (VolumeAttach) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.deleteOnTermination, that.deleteOnTermination)
            && Objects.equals(this.device, that.device) && Objects.equals(this.bootIndex, that.bootIndex)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deleteOnTermination, device, bootIndex, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeAttach {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
