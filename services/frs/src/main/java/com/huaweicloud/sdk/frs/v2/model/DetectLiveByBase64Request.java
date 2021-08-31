package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class DetectLiveByBase64Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private LiveDetectBase64Req body;

    public DetectLiveByBase64Request withBody(LiveDetectBase64Req body) {
        this.body = body;
        return this;
    }

    public DetectLiveByBase64Request withBody(Consumer<LiveDetectBase64Req> bodySetter) {
        if (this.body == null) {
            this.body = new LiveDetectBase64Req();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public LiveDetectBase64Req getBody() {
        return body;
    }

    public void setBody(LiveDetectBase64Req body) {
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
        DetectLiveByBase64Request detectLiveByBase64Request = (DetectLiveByBase64Request) o;
        return Objects.equals(this.body, detectLiveByBase64Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLiveByBase64Request {\n");
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
