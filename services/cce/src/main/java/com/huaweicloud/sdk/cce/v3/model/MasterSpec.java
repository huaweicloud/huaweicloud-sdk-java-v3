package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * master的配置，支持指定可用区、规格和故障域。若指定故障域，则必须所有master节点都需要指定故障字段。
 */
public class MasterSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availabilityZone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private String flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="faultDomain")
    
    private String faultDomain;

    public MasterSpec withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    public MasterSpec withFlavor(String flavor) {
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

    

    public MasterSpec withFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
        return this;
    }

    


    /**
     * 故障域。 1. 指定该字段需要当前系统已开启故障域特性，否则校验失败。 2. 仅单az场景支持且必须显式指定az。
     * @return faultDomain
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    public void setFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasterSpec masterSpec = (MasterSpec) o;
        return Objects.equals(this.availabilityZone, masterSpec.availabilityZone) &&
            Objects.equals(this.flavor, masterSpec.flavor) &&
            Objects.equals(this.faultDomain, masterSpec.faultDomain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, flavor, faultDomain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MasterSpec {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    faultDomain: ").append(toIndentedString(faultDomain)).append("\n");
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

