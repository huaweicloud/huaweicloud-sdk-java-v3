package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateAnonymousAuthRandomRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceID")
    
    private String conferenceID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Password")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String xPassword;

    public CreateAnonymousAuthRandomRequest withConferenceID(String conferenceID) {
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

    public CreateAnonymousAuthRandomRequest withXPassword(String xPassword) {
        this.xPassword = xPassword;
        return this;
    }

    


    /**
     * Get xPassword
     * @return xPassword
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Password")
    public String getXPassword() {
        return xPassword;
    }

    public void setXPassword(String xPassword) {
        this.xPassword = xPassword;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAnonymousAuthRandomRequest createAnonymousAuthRandomRequest = (CreateAnonymousAuthRandomRequest) o;
        return Objects.equals(this.conferenceID, createAnonymousAuthRandomRequest.conferenceID) &&
            Objects.equals(this.xPassword, createAnonymousAuthRandomRequest.xPassword);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, xPassword);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAnonymousAuthRandomRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    xPassword: ").append(toIndentedString("******")).append("\n");
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

