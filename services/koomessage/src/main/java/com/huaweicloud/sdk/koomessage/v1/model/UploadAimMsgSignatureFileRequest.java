package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadAimMsgSignatureFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_desc")

    private String fileDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadAimMsgSignatureFileRequestBody body;

    public UploadAimMsgSignatureFileRequest withFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
        return this;
    }

    /**
     * 文件描述。
     * @return fileDesc
     */
    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
    }

    public UploadAimMsgSignatureFileRequest withBody(UploadAimMsgSignatureFileRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadAimMsgSignatureFileRequest withBody(Consumer<UploadAimMsgSignatureFileRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadAimMsgSignatureFileRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadAimMsgSignatureFileRequestBody getBody() {
        return body;
    }

    public void setBody(UploadAimMsgSignatureFileRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadAimMsgSignatureFileRequest that = (UploadAimMsgSignatureFileRequest) obj;
        return Objects.equals(this.fileDesc, that.fileDesc) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileDesc, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAimMsgSignatureFileRequest {\n");
        sb.append("    fileDesc: ").append(toIndentedString(fileDesc)).append("\n");
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
