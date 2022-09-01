package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceConfigDTO
 */
public class ResourceConfigDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpu")
    
    @JacksonXmlProperty(localName = "cpu")
    
    private Float cpu;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memory")
    
    @JacksonXmlProperty(localName = "memory")
    
    private Float memory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gpu")
    
    @JacksonXmlProperty(localName = "gpu")
    
    private Float gpu;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="npu")
    
    @JacksonXmlProperty(localName = "npu")
    
    private Float npu;

    public ResourceConfigDTO withCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    


    /**
     * cpu个数
     * minimum: 0.01
     * maximum: 1E+3
     * @return cpu
     */
    public Float getCpu() {
        return cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
    }

    

    public ResourceConfigDTO withMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    


    /**
     * 内存大小
     * minimum: 0.01
     * maximum: 1.024E+6
     * @return memory
     */
    public Float getMemory() {
        return memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
    }

    

    public ResourceConfigDTO withGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    


    /**
     * cpu个数
     * minimum: 0.01
     * maximum: 1.024E+6
     * @return gpu
     */
    public Float getGpu() {
        return gpu;
    }

    public void setGpu(Float gpu) {
        this.gpu = gpu;
    }

    

    public ResourceConfigDTO withNpu(Float npu) {
        this.npu = npu;
        return this;
    }

    


    /**
     * cpu个数
     * minimum: 0.01
     * maximum: 1E+3
     * @return npu
     */
    public Float getNpu() {
        return npu;
    }

    public void setNpu(Float npu) {
        this.npu = npu;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceConfigDTO resourceConfigDTO = (ResourceConfigDTO) o;
        return Objects.equals(this.cpu, resourceConfigDTO.cpu) &&
            Objects.equals(this.memory, resourceConfigDTO.memory) &&
            Objects.equals(this.gpu, resourceConfigDTO.gpu) &&
            Objects.equals(this.npu, resourceConfigDTO.npu);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, gpu, npu);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceConfigDTO {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
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

