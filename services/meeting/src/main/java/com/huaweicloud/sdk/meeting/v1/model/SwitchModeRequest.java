package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.RestSwitchModeReqBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SwitchModeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceID")
    
    private String conferenceID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Conference-Authorization")
    
    private String xConferenceAuthorization;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RestSwitchModeReqBody body = null;

    public SwitchModeRequest withConferenceID(String conferenceID) {
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

    public SwitchModeRequest withXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
        return this;
    }

    


    /**
     * Get xConferenceAuthorization
     * @return xConferenceAuthorization
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXConferenceAuthorization() {
        return xConferenceAuthorization;
    }

    public void setXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
    }

    public SwitchModeRequest withBody(RestSwitchModeReqBody body) {
        this.body = body;
        return this;
    }

    public SwitchModeRequest withBody(Consumer<RestSwitchModeReqBody> bodySetter) {
        if(this.body == null ){
            this.body = new RestSwitchModeReqBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RestSwitchModeReqBody getBody() {
        return body;
    }

    public void setBody(RestSwitchModeReqBody body) {
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
        SwitchModeRequest switchModeRequest = (SwitchModeRequest) o;
        return Objects.equals(this.conferenceID, switchModeRequest.conferenceID) &&
            Objects.equals(this.xConferenceAuthorization, switchModeRequest.xConferenceAuthorization) &&
            Objects.equals(this.body, switchModeRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, xConferenceAuthorization, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchModeRequest {\n");
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

