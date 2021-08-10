package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class DetectLiveByFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DetectLiveByFileRequestBody body;

    public DetectLiveByFileRequest withBody(DetectLiveByFileRequestBody body) {
        this.body = body;
        return this;
    }

    public DetectLiveByFileRequest withBody(Consumer<DetectLiveByFileRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DetectLiveByFileRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public DetectLiveByFileRequestBody getBody() {
        return body;
    }

    public void setBody(DetectLiveByFileRequestBody body) {
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
        DetectLiveByFileRequest detectLiveByFileRequest = (DetectLiveByFileRequest) o;
        return Objects.equals(this.body, detectLiveByFileRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLiveByFileRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
