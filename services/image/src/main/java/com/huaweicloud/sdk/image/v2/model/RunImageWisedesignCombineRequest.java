package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RunImageWisedesignCombineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ImageWisedesignCombineReq body;

    public RunImageWisedesignCombineRequest withBody(ImageWisedesignCombineReq body) {
        this.body = body;
        return this;
    }

    public RunImageWisedesignCombineRequest withBody(Consumer<ImageWisedesignCombineReq> bodySetter) {
        if (this.body == null) {
            this.body = new ImageWisedesignCombineReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ImageWisedesignCombineReq getBody() {
        return body;
    }

    public void setBody(ImageWisedesignCombineReq body) {
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
        RunImageWisedesignCombineRequest runImageWisedesignCombineRequest = (RunImageWisedesignCombineRequest) o;
        return Objects.equals(this.body, runImageWisedesignCombineRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunImageWisedesignCombineRequest {\n");
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
