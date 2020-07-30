package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.AddPublicipsIntoSharedBandwidthRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AddPublicipsIntoSharedBandwidthRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_id")
    
    private String bandwidthId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AddPublicipsIntoSharedBandwidthRequestBody body = null;

    public AddPublicipsIntoSharedBandwidthRequest withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    


    /**
     * Get bandwidthId
     * @return bandwidthId
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    public AddPublicipsIntoSharedBandwidthRequest withBody(AddPublicipsIntoSharedBandwidthRequestBody body) {
        this.body = body;
        return this;
    }

    public AddPublicipsIntoSharedBandwidthRequest withBody(Consumer<AddPublicipsIntoSharedBandwidthRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new AddPublicipsIntoSharedBandwidthRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AddPublicipsIntoSharedBandwidthRequestBody getBody() {
        return body;
    }

    public void setBody(AddPublicipsIntoSharedBandwidthRequestBody body) {
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
        AddPublicipsIntoSharedBandwidthRequest addPublicipsIntoSharedBandwidthRequest = (AddPublicipsIntoSharedBandwidthRequest) o;
        return Objects.equals(this.bandwidthId, addPublicipsIntoSharedBandwidthRequest.bandwidthId) &&
            Objects.equals(this.body, addPublicipsIntoSharedBandwidthRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidthId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPublicipsIntoSharedBandwidthRequest {\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
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

