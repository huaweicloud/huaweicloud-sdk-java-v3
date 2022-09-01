package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteFacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    @JacksonXmlProperty(localName = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private DeleteFacesBatchReq body;

    public BatchDeleteFacesRequest withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /**
     * 人脸库名称。
     * @return faceSetName
     */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    public BatchDeleteFacesRequest withBody(DeleteFacesBatchReq body) {
        this.body = body;
        return this;
    }

    public BatchDeleteFacesRequest withBody(Consumer<DeleteFacesBatchReq> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteFacesBatchReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteFacesBatchReq getBody() {
        return body;
    }

    public void setBody(DeleteFacesBatchReq body) {
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
        BatchDeleteFacesRequest batchDeleteFacesRequest = (BatchDeleteFacesRequest) o;
        return Objects.equals(this.faceSetName, batchDeleteFacesRequest.faceSetName)
            && Objects.equals(this.body, batchDeleteFacesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteFacesRequest {\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
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
