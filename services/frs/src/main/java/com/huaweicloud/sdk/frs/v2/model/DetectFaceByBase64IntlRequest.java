package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DetectFaceByBase64IntlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private FaceDetectBase64Req body;

    public DetectFaceByBase64IntlRequest withBody(FaceDetectBase64Req body) {
        this.body = body;
        return this;
    }

    public DetectFaceByBase64IntlRequest withBody(Consumer<FaceDetectBase64Req> bodySetter) {
        if (this.body == null) {
            this.body = new FaceDetectBase64Req();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public FaceDetectBase64Req getBody() {
        return body;
    }

    public void setBody(FaceDetectBase64Req body) {
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
        DetectFaceByBase64IntlRequest detectFaceByBase64IntlRequest = (DetectFaceByBase64IntlRequest) o;
        return Objects.equals(this.body, detectFaceByBase64IntlRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectFaceByBase64IntlRequest {\n");
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
