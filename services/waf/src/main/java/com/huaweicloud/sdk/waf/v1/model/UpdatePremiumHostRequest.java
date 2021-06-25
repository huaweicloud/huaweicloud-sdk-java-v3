package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdatePremiumHostRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_id")
    
    private String hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdatePremiumHostRequestBody body;

    public UpdatePremiumHostRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 独享模式域名ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    

    public UpdatePremiumHostRequest withBody(UpdatePremiumHostRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePremiumHostRequest withBody(Consumer<UpdatePremiumHostRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdatePremiumHostRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdatePremiumHostRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePremiumHostRequestBody body) {
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
        UpdatePremiumHostRequest updatePremiumHostRequest = (UpdatePremiumHostRequest) o;
        return Objects.equals(this.hostId, updatePremiumHostRequest.hostId) &&
            Objects.equals(this.body, updatePremiumHostRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hostId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePremiumHostRequest {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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

