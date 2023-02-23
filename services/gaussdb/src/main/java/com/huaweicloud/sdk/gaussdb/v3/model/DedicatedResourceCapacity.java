package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DedicatedResourceCapacity
 */
public class DedicatedResourceCapacity  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    

    private Long volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    

    private Integer vcpus;

    public DedicatedResourceCapacity withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    


    /**
     * 内存大小，单位GB
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    

    public DedicatedResourceCapacity withVolume(Long volume) {
        this.volume = volume;
        return this;
    }

    


    /**
     * 磁盘容量，单位GB
     * @return volume
     */
    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    

    public DedicatedResourceCapacity withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    


    /**
     * cpu核数
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DedicatedResourceCapacity dedicatedResourceCapacity = (DedicatedResourceCapacity) o;
        return Objects.equals(this.ram, dedicatedResourceCapacity.ram) &&
            Objects.equals(this.volume, dedicatedResourceCapacity.volume) &&
            Objects.equals(this.vcpus, dedicatedResourceCapacity.vcpus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ram, volume, vcpus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DedicatedResourceCapacity {\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
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

