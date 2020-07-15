package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.NeutronUpdateFloatingIpReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronUpdateFloatingIpRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatingip_id")
    
    private String floatingipId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private NeutronUpdateFloatingIpReq body = null;

    public NeutronUpdateFloatingIpRequest withFloatingipId(String floatingipId) {
        this.floatingipId = floatingipId;
        return this;
    }

    


    /**
     * Get floatingipId
     * @return floatingipId
     */
    public String getFloatingipId() {
        return floatingipId;
    }

    public void setFloatingipId(String floatingipId) {
        this.floatingipId = floatingipId;
    }

    public NeutronUpdateFloatingIpRequest withBody(NeutronUpdateFloatingIpReq body) {
        this.body = body;
        return this;
    }

    public NeutronUpdateFloatingIpRequest withBody(Consumer<NeutronUpdateFloatingIpReq> bodySetter) {
        if(this.body == null ){
            this.body = new NeutronUpdateFloatingIpReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public NeutronUpdateFloatingIpReq getBody() {
        return body;
    }

    public void setBody(NeutronUpdateFloatingIpReq body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronUpdateFloatingIpRequest neutronUpdateFloatingIpRequest = (NeutronUpdateFloatingIpRequest) o;
        return Objects.equals(this.floatingipId, neutronUpdateFloatingIpRequest.floatingipId) &&
            Objects.equals(this.body, neutronUpdateFloatingIpRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(floatingipId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFloatingIpRequest {\n");
        sb.append("    floatingipId: ").append(toIndentedString(floatingipId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

