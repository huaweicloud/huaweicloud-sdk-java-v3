package com.huaweicloud.sdk.eip.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.PostAndPutFloatingIpResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class NeutronUpdateFloatingIpResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatingip")
    
    private PostAndPutFloatingIpResp floatingip = null;

    public NeutronUpdateFloatingIpResponse withFloatingip(PostAndPutFloatingIpResp floatingip) {
        this.floatingip = floatingip;
        return this;
    }

    public NeutronUpdateFloatingIpResponse withFloatingip(Consumer<PostAndPutFloatingIpResp> floatingipSetter) {
        if(this.floatingip == null ){
            this.floatingip = new PostAndPutFloatingIpResp();
            floatingipSetter.accept(this.floatingip);
        }
        
        return this;
    }


    /**
     * Get floatingip
     * @return floatingip
     */
    public PostAndPutFloatingIpResp getFloatingip() {
        return floatingip;
    }

    public void setFloatingip(PostAndPutFloatingIpResp floatingip) {
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
        NeutronUpdateFloatingIpResponse neutronUpdateFloatingIpResponse = (NeutronUpdateFloatingIpResponse) o;
        return Objects.equals(this.floatingip, neutronUpdateFloatingIpResponse.floatingip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(floatingip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFloatingIpResponse {\n");
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

