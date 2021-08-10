package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class DetectLiveFaceByBase64Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private LiveDetectFaceBase64Req body;

    public DetectLiveFaceByBase64Request withBody(LiveDetectFaceBase64Req body) {
        this.body = body;
        return this;
    }

    public DetectLiveFaceByBase64Request withBody(Consumer<LiveDetectFaceBase64Req> bodySetter) {
        if (this.body == null) {
            this.body = new LiveDetectFaceBase64Req();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public LiveDetectFaceBase64Req getBody() {
        return body;
    }

    public void setBody(LiveDetectFaceBase64Req body) {
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
        DetectLiveFaceByBase64Request detectLiveFaceByBase64Request = (DetectLiveFaceByBase64Request) o;
        return Objects.equals(this.body, detectLiveFaceByBase64Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLiveFaceByBase64Request {\n");
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
