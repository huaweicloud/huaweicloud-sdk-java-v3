package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 查询云服务器指定磁盘挂载信息响应信息
 */
public class ServerBlockDevice  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bootIndex")
    
    private Integer bootIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pciAddress")
    
    private String pciAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeId")
    
    private String volumeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device")
    
    private String device;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serverId")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bus")
    
    private String bus;

    public ServerBlockDevice withBootIndex(Integer bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    


    /**
     * 云硬盘启动顺序。  - 0为系统盘。  - 非0为数据盘
     * @return bootIndex
     */
    public Integer getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(Integer bootIndex) {
        this.bootIndex = bootIndex;
    }

    public ServerBlockDevice withPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
        return this;
    }

    


    /**
     * pci地址。
     * @return pciAddress
     */
    public String getPciAddress() {
        return pciAddress;
    }

    public void setPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
    }

    public ServerBlockDevice withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * 云硬盘ID，UUID格式。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public ServerBlockDevice withDevice(String device) {
        this.device = device;
        return this;
    }

    


    /**
     * 云硬盘挂载盘符，即磁盘挂载点。
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public ServerBlockDevice withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * 弹性云服务器ID，UUID格式。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ServerBlockDevice withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 挂载ID，与云硬盘ID相同。UUID格式。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerBlockDevice withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 云硬盘大小，单位GB。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ServerBlockDevice withBus(String bus) {
        this.bus = bus;
        return this;
    }

    


    /**
     * 磁盘总线类型 。  取值范围：virtio、scsi
     * @return bus
     */
    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerBlockDevice serverBlockDevice = (ServerBlockDevice) o;
        return Objects.equals(this.bootIndex, serverBlockDevice.bootIndex) &&
            Objects.equals(this.pciAddress, serverBlockDevice.pciAddress) &&
            Objects.equals(this.volumeId, serverBlockDevice.volumeId) &&
            Objects.equals(this.device, serverBlockDevice.device) &&
            Objects.equals(this.serverId, serverBlockDevice.serverId) &&
            Objects.equals(this.id, serverBlockDevice.id) &&
            Objects.equals(this.size, serverBlockDevice.size) &&
            Objects.equals(this.bus, serverBlockDevice.bus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bootIndex, pciAddress, volumeId, device, serverId, id, size, bus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerBlockDevice {\n");
            sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
            sb.append("    pciAddress: ").append(toIndentedString(pciAddress)).append("\n");
            sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
            sb.append("    device: ").append(toIndentedString(device)).append("\n");
            sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
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

