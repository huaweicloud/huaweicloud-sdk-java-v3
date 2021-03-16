package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.RestSetLiveReqBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class LiveRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceID")
    
    private String conferenceID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Conference-Authorization")
    
    private String xConferenceAuthorization;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RestSetLiveReqBody body;

    public LiveRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    


    /**
     * Get conferenceID
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    

    public LiveRequest withXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
        return this;
    }

    


    /**
     * Get xConferenceAuthorization
     * @return xConferenceAuthorization
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Conference-Authorization")
    public String getXConferenceAuthorization() {
        return xConferenceAuthorization;
    }

    public void setXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
    }

    

    public LiveRequest withBody(RestSetLiveReqBody body) {
        this.body = body;
        return this;
    }

    public LiveRequest withBody(Consumer<RestSetLiveReqBody> bodySetter) {
        if(this.body == null ){
            this.body = new RestSetLiveReqBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RestSetLiveReqBody getBody() {
        return body;
    }

    public void setBody(RestSetLiveReqBody body) {
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
        LiveRequest liveRequest = (LiveRequest) o;
        return Objects.equals(this.conferenceID, liveRequest.conferenceID) &&
            Objects.equals(this.xConferenceAuthorization, liveRequest.xConferenceAuthorization) &&
            Objects.equals(this.body, liveRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, xConferenceAuthorization, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    xConferenceAuthorization: ").append(toIndentedString(xConferenceAuthorization)).append("\n");
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

