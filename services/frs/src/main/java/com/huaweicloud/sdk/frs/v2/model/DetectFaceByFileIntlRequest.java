package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DetectFaceByFileIntlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private DetectFaceByFileIntlRequestBody body;

    public DetectFaceByFileIntlRequest withBody(DetectFaceByFileIntlRequestBody body) {
        this.body = body;
        return this;
    }

    public DetectFaceByFileIntlRequest withBody(Consumer<DetectFaceByFileIntlRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DetectFaceByFileIntlRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DetectFaceByFileIntlRequestBody getBody() {
        return body;
    }

    public void setBody(DetectFaceByFileIntlRequestBody body) {
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
        DetectFaceByFileIntlRequest detectFaceByFileIntlRequest = (DetectFaceByFileIntlRequest) o;
        return Objects.equals(this.body, detectFaceByFileIntlRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectFaceByFileIntlRequest {\n");
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
