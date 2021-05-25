package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.DisassociaterouterReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DisassociateRouterRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zone_id")
    
    private String zoneId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private DisassociaterouterReq body;

    public DisassociateRouterRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    


    /**
     * 待解关联zone的ID。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    

    public DisassociateRouterRequest withBody(DisassociaterouterReq body) {
        this.body = body;
        return this;
    }

    public DisassociateRouterRequest withBody(Consumer<DisassociaterouterReq> bodySetter) {
        if(this.body == null ){
            this.body = new DisassociaterouterReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DisassociaterouterReq getBody() {
        return body;
    }

    public void setBody(DisassociaterouterReq body) {
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
        DisassociateRouterRequest disassociateRouterRequest = (DisassociateRouterRequest) o;
        return Objects.equals(this.zoneId, disassociateRouterRequest.zoneId) &&
            Objects.equals(this.body, disassociateRouterRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(zoneId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateRouterRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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

