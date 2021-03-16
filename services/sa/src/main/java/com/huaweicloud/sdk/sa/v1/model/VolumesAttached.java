package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VolumesAttached
 */
public class VolumesAttached  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="boot_index")
    
    private String bootIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device")
    
    private String device;

    public VolumesAttached withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 磁盘ID。
     * @return id
     */
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

    


    /**
     * 云硬盘启动顺序。0为系统盘，非0为数据盘。
     * @return bootIndex
     */
    public String getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
    }

    

    public VolumesAttached withDevice(String device) {
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
        VolumesAttached volumesAttached = (VolumesAttached) o;
        return Objects.equals(this.id, volumesAttached.id) &&
            Objects.equals(this.bootIndex, volumesAttached.bootIndex) &&
            Objects.equals(this.device, volumesAttached.device);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, bootIndex, device);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumesAttached {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

