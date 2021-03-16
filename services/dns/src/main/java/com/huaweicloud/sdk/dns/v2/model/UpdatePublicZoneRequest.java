package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdatePublicZoneRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zone_id")
    
    private String zoneId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdatePublicZoneInfo body;

    public UpdatePublicZoneRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    


    /**
     * Get zoneId
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    

    public UpdatePublicZoneRequest withBody(UpdatePublicZoneInfo body) {
        this.body = body;
        return this;
    }

    public UpdatePublicZoneRequest withBody(Consumer<UpdatePublicZoneInfo> bodySetter) {
        if(this.body == null ){
            this.body = new UpdatePublicZoneInfo();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdatePublicZoneInfo getBody() {
        return body;
    }

    public void setBody(UpdatePublicZoneInfo body) {
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
        UpdatePublicZoneRequest updatePublicZoneRequest = (UpdatePublicZoneRequest) o;
        return Objects.equals(this.zoneId, updatePublicZoneRequest.zoneId) &&
            Objects.equals(this.body, updatePublicZoneRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(zoneId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicZoneRequest {\n");
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

