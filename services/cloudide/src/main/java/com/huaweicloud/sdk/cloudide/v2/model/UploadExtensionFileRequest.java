package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadExtensionFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official")

    private String official;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadExtensionFileRequestBody body;

    public UploadExtensionFileRequest withOfficial(String official) {
        this.official = official;
        return this;
    }

    /**
     * 插件类型。目前只支持CodeArtsIDEOnline
     * @return official
     */
    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public UploadExtensionFileRequest withBody(UploadExtensionFileRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadExtensionFileRequest withBody(Consumer<UploadExtensionFileRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadExtensionFileRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadExtensionFileRequestBody getBody() {
        return body;
    }

    public void setBody(UploadExtensionFileRequestBody body) {
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
        UploadExtensionFileRequest uploadExtensionFileRequest = (UploadExtensionFileRequest) o;
        return Objects.equals(this.official, uploadExtensionFileRequest.official)
            && Objects.equals(this.body, uploadExtensionFileRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(official, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadExtensionFileRequest {\n");
        sb.append("    official: ").append(toIndentedString(official)).append("\n");
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
