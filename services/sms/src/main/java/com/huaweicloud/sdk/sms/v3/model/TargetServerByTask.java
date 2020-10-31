package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.TargetDisks;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 目的端虚拟机信息
 */
public class TargetServerByTask  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="btrfs_list")
    
    private String btrfsList;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disks")
    
    private List<TargetDisks> disks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private String flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vm_id")
    
    private String vmId;

    public TargetServerByTask withBtrfsList(String btrfsList) {
        this.btrfsList = btrfsList;
        return this;
    }

    


    /**
     * btrfs信息
     * @return btrfsList
     */
    public String getBtrfsList() {
        return btrfsList;
    }

    public void setBtrfsList(String btrfsList) {
        this.btrfsList = btrfsList;
    }

    public TargetServerByTask withDisks(List<TargetDisks> disks) {
        this.disks = disks;
        return this;
    }

    
    public TargetServerByTask addDisksItem(TargetDisks disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public TargetServerByTask withDisks(Consumer<List<TargetDisks>> disksSetter) {
        if(this.disks == null ){
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 磁盘信息
     * @return disks
     */
    public List<TargetDisks> getDisks() {
        return disks;
    }

    public void setDisks(List<TargetDisks> disks) {
        this.disks = disks;
    }

    public TargetServerByTask withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    


    /**
     * 规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public TargetServerByTask withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TargetServerByTask withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    


    /**
     * 虚拟机id
     * @return vmId
     */
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TargetServerByTask targetServerByTask = (TargetServerByTask) o;
        return Objects.equals(this.btrfsList, targetServerByTask.btrfsList) &&
            Objects.equals(this.disks, targetServerByTask.disks) &&
            Objects.equals(this.flavor, targetServerByTask.flavor) &&
            Objects.equals(this.name, targetServerByTask.name) &&
            Objects.equals(this.vmId, targetServerByTask.vmId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(btrfsList, disks, flavor, name, vmId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetServerByTask {\n");
        sb.append("    btrfsList: ").append(toIndentedString(btrfsList)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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

