package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * HostModel
 */
public class HostModel  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    
    private String flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mem")
    
    
    private String mem;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpu")
    
    
    private String cpu;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="root_volume_size")
    
    
    private String rootVolumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume_type")
    
    
    private String dataVolumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume_size")
    
    
    private Integer dataVolumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume_count")
    
    
    private Integer dataVolumeCount;

    public HostModel withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 虚拟机ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public HostModel withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 虚拟机名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public HostModel withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * 虚拟机IP地址
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    

    public HostModel withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 虚拟机当前状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public HostModel withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    


    /**
     * 虚拟机规格ID
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    

    public HostModel withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 虚拟机类型，当前支持MasterNode，CoreNode，TaskNode
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public HostModel withMem(String mem) {
        this.mem = mem;
        return this;
    }

    


    /**
     * 内存
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    

    public HostModel withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    


    /**
     * CPU核数
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    

    public HostModel withRootVolumeSize(String rootVolumeSize) {
        this.rootVolumeSize = rootVolumeSize;
        return this;
    }

    


    /**
     * 操作系统盘容量
     * @return rootVolumeSize
     */
    public String getRootVolumeSize() {
        return rootVolumeSize;
    }

    public void setRootVolumeSize(String rootVolumeSize) {
        this.rootVolumeSize = rootVolumeSize;
    }

    

    public HostModel withDataVolumeType(String dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
        return this;
    }

    


    /**
     * 数据盘类型
     * @return dataVolumeType
     */
    public String getDataVolumeType() {
        return dataVolumeType;
    }

    public void setDataVolumeType(String dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
    }

    

    public HostModel withDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
        return this;
    }

    


    /**
     * 数据盘容量
     * @return dataVolumeSize
     */
    public Integer getDataVolumeSize() {
        return dataVolumeSize;
    }

    public void setDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
    }

    

    public HostModel withDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
        return this;
    }

    


    /**
     * 数据盘个数
     * @return dataVolumeCount
     */
    public Integer getDataVolumeCount() {
        return dataVolumeCount;
    }

    public void setDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostModel hostModel = (HostModel) o;
        return Objects.equals(this.id, hostModel.id) &&
            Objects.equals(this.name, hostModel.name) &&
            Objects.equals(this.ip, hostModel.ip) &&
            Objects.equals(this.status, hostModel.status) &&
            Objects.equals(this.flavor, hostModel.flavor) &&
            Objects.equals(this.type, hostModel.type) &&
            Objects.equals(this.mem, hostModel.mem) &&
            Objects.equals(this.cpu, hostModel.cpu) &&
            Objects.equals(this.rootVolumeSize, hostModel.rootVolumeSize) &&
            Objects.equals(this.dataVolumeType, hostModel.dataVolumeType) &&
            Objects.equals(this.dataVolumeSize, hostModel.dataVolumeSize) &&
            Objects.equals(this.dataVolumeCount, hostModel.dataVolumeCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, ip, status, flavor, type, mem, cpu, rootVolumeSize, dataVolumeType, dataVolumeSize, dataVolumeCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    rootVolumeSize: ").append(toIndentedString(rootVolumeSize)).append("\n");
        sb.append("    dataVolumeType: ").append(toIndentedString(dataVolumeType)).append("\n");
        sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
        sb.append("    dataVolumeCount: ").append(toIndentedString(dataVolumeCount)).append("\n");
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

