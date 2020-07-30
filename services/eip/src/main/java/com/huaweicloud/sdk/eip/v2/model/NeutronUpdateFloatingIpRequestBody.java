package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.UpdateFloatingIpOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新floatingip的请求体
 */
public class NeutronUpdateFloatingIpRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatingip")
    
    private UpdateFloatingIpOption floatingip = null;

    public NeutronUpdateFloatingIpRequestBody withFloatingip(UpdateFloatingIpOption floatingip) {
        this.floatingip = floatingip;
        return this;
    }

    public NeutronUpdateFloatingIpRequestBody withFloatingip(Consumer<UpdateFloatingIpOption> floatingipSetter) {
        if(this.floatingip == null ){
            this.floatingip = new UpdateFloatingIpOption();
            floatingipSetter.accept(this.floatingip);
        }
        
        return this;
    }


    /**
     * Get floatingip
     * @return floatingip
     */
    public UpdateFloatingIpOption getFloatingip() {
        return floatingip;
    }

    public void setFloatingip(UpdateFloatingIpOption floatingip) {
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
        NeutronUpdateFloatingIpRequestBody neutronUpdateFloatingIpRequestBody = (NeutronUpdateFloatingIpRequestBody) o;
        return Objects.equals(this.floatingip, neutronUpdateFloatingIpRequestBody.floatingip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(floatingip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFloatingIpRequestBody {\n");
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

