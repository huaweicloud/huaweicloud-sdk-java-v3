package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.FloatingIpUpdateDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新floatingip的请求体
 */
public class NeutronUpdateFloatingIpReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatingip")
    
    private FloatingIpUpdateDict floatingip = null;

    public NeutronUpdateFloatingIpReq withFloatingip(FloatingIpUpdateDict floatingip) {
        this.floatingip = floatingip;
        return this;
    }

    public NeutronUpdateFloatingIpReq withFloatingip(Consumer<FloatingIpUpdateDict> floatingipSetter) {
        if(this.floatingip == null ){
            this.floatingip = new FloatingIpUpdateDict();
            floatingipSetter.accept(this.floatingip);
        }
        
        return this;
    }


    /**
     * Get floatingip
     * @return floatingip
     */
    public FloatingIpUpdateDict getFloatingip() {
        return floatingip;
    }

    public void setFloatingip(FloatingIpUpdateDict floatingip) {
        this.floatingip = floatingip;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronUpdateFloatingIpReq neutronUpdateFloatingIpReq = (NeutronUpdateFloatingIpReq) o;
        return Objects.equals(this.floatingip, neutronUpdateFloatingIpReq.floatingip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(floatingip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFloatingIpReq {\n");
        sb.append("    floatingip: ").append(toIndentedString(floatingip)).append("\n");
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

