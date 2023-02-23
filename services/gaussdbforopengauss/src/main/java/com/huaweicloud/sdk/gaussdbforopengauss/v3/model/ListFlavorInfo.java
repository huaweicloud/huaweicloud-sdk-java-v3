package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规格信息。
 */
public class ListFlavorInfo  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpu")
    

    private Integer vcpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mem")
    

    private Integer mem;

    public ListFlavorInfo withVcpu(Integer vcpu) {
        this.vcpu = vcpu;
        return this;
    }

    


    /**
     * cpu核数。
     * @return vcpu
     */
    public Integer getVcpu() {
        return vcpu;
    }

    public void setVcpu(Integer vcpu) {
        this.vcpu = vcpu;
    }

    

    public ListFlavorInfo withMem(Integer mem) {
        this.mem = mem;
        return this;
    }

    


    /**
     * 内存大小。
     * @return mem
     */
    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorInfo listFlavorInfo = (ListFlavorInfo) o;
        return Objects.equals(this.vcpu, listFlavorInfo.vcpu) &&
            Objects.equals(this.mem, listFlavorInfo.mem);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vcpu, mem);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorInfo {\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
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

