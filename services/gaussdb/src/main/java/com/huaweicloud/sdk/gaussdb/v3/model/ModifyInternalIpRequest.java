package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ModifyInternalIpRequest
 */
public class ModifyInternalIpRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="internal_ip")
    

    private String internalIp;

    public ModifyInternalIpRequest withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    


    /**
     * 内网IP。
     * @return internalIp
     */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyInternalIpRequest modifyInternalIpRequest = (ModifyInternalIpRequest) o;
        return Objects.equals(this.internalIp, modifyInternalIpRequest.internalIp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(internalIp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyInternalIpRequest {\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
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

