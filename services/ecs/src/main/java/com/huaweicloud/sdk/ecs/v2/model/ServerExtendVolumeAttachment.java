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
 * 挂载到弹性云服务器上的磁盘。
 */
public class ServerExtendVolumeAttachment  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_on_termination")
    
    private String deleteOnTermination;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bootIndex")
    
    private String bootIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device")
    
    private String device;

    public ServerExtendVolumeAttachment withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 磁盘ID，格式为UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerExtendVolumeAttachment withDeleteOnTermination(String deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    


    /**
     * 删弹性云服务器时是否一并删除该磁盘。  - true：是 - false：否
     * @return deleteOnTermination
     */
    public String getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(String deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public ServerExtendVolumeAttachment withBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    


    /**
     * 启动标识，“0”代表启动盘，“-1“代表非启动盘。
     * @return bootIndex
     */
    public String getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
    }

    public ServerExtendVolumeAttachment withDevice(String device) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerExtendVolumeAttachment serverExtendVolumeAttachment = (ServerExtendVolumeAttachment) o;
        return Objects.equals(this.id, serverExtendVolumeAttachment.id) &&
            Objects.equals(this.deleteOnTermination, serverExtendVolumeAttachment.deleteOnTermination) &&
            Objects.equals(this.bootIndex, serverExtendVolumeAttachment.bootIndex) &&
            Objects.equals(this.device, serverExtendVolumeAttachment.device);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, deleteOnTermination, bootIndex, device);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerExtendVolumeAttachment {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
            sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
            sb.append("    device: ").append(toIndentedString(device)).append("\n");
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

