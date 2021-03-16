package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 弹性ip，同publicips
 */
public class EipInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip_id")
    
    private String eipId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip_address")
    
    private String eipAddress;

    public EipInfo withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    


    /**
     * eip_id
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    

    public EipInfo withEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }

    


    /**
     * eip_address
     * @return eipAddress
     */
    public String getEipAddress() {
        return eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EipInfo eipInfo = (EipInfo) o;
        return Objects.equals(this.eipId, eipInfo.eipId) &&
            Objects.equals(this.eipAddress, eipInfo.eipAddress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eipId, eipAddress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipInfo {\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
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

