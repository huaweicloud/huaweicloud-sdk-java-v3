package com.huaweicloud.sdk.eip.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.UpdatePrePaidBandwidthRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdatePrePaidBandwidthRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_id")
    
    private String bandwidthId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdatePrePaidBandwidthRequestBody body;

    public UpdatePrePaidBandwidthRequest withBandwidthId(String bandwidthId) {
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

    

    public UpdatePrePaidBandwidthRequest withBody(UpdatePrePaidBandwidthRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePrePaidBandwidthRequest withBody(Consumer<UpdatePrePaidBandwidthRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdatePrePaidBandwidthRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdatePrePaidBandwidthRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePrePaidBandwidthRequestBody body) {
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
        UpdatePrePaidBandwidthRequest updatePrePaidBandwidthRequest = (UpdatePrePaidBandwidthRequest) o;
        return Objects.equals(this.bandwidthId, updatePrePaidBandwidthRequest.bandwidthId) &&
            Objects.equals(this.body, updatePrePaidBandwidthRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidthId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrePaidBandwidthRequest {\n");
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

