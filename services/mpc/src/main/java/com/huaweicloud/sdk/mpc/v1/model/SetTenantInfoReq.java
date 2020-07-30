package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SetTenantInfoReq
 */
public class SetTenantInfoReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_open")
    
    private Integer isOpen;

    public SetTenantInfoReq withIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    


    /**
     * 是否已开通服务，0标示否，1标示已开通 
     * minimum: 0
     * maximum: 2
     * @return isOpen
     */
    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetTenantInfoReq setTenantInfoReq = (SetTenantInfoReq) o;
        return Objects.equals(this.isOpen, setTenantInfoReq.isOpen);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isOpen);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetTenantInfoReq {\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
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

