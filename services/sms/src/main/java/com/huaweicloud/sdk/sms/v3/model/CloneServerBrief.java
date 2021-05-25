package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 克隆服务器基本信息
 */
public class CloneServerBrief  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vm_id")
    
    private String vmId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public CloneServerBrief withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    


    /**
     * 克隆服务器ID
     * @return vmId
     */
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    

    public CloneServerBrief withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 克隆虚拟机的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloneServerBrief cloneServerBrief = (CloneServerBrief) o;
        return Objects.equals(this.vmId, cloneServerBrief.vmId) &&
            Objects.equals(this.name, cloneServerBrief.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vmId, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneServerBrief {\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

