package com.huaweicloud.sdk.cts.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cts.v1.model.UpdateTrackerRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class UpdateTrackerRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_name")
    
    private String trackerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateTrackerRequestBody body = null;

    public UpdateTrackerRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    


    /**
     * Get trackerName
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public UpdateTrackerRequest withBody(UpdateTrackerRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTrackerRequest withBody(Consumer<UpdateTrackerRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateTrackerRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateTrackerRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTrackerRequestBody body) {
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
        UpdateTrackerRequest updateTrackerRequest = (UpdateTrackerRequest) o;
        return Objects.equals(this.trackerName, updateTrackerRequest.trackerName) &&
            Objects.equals(this.body, updateTrackerRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(trackerName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrackerRequest {\n");
            sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
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

