package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateLargeFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_urls")

    private List<String> uploadUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateLargeFileResponse withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件ID。
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public CreateLargeFileResponse withUploadUrls(List<String> uploadUrls) {
        this.uploadUrls = uploadUrls;
        return this;
    }

    public CreateLargeFileResponse addUploadUrlsItem(String uploadUrlsItem) {
        if (this.uploadUrls == null) {
            this.uploadUrls = new ArrayList<>();
        }
        this.uploadUrls.add(uploadUrlsItem);
        return this;
    }

    public CreateLargeFileResponse withUploadUrls(Consumer<List<String>> uploadUrlsSetter) {
        if (this.uploadUrls == null) {
            this.uploadUrls = new ArrayList<>();
        }
        uploadUrlsSetter.accept(this.uploadUrls);
        return this;
    }

    /**
     * 文件分段上传URL。
     * @return uploadUrls
     */
    public List<String> getUploadUrls() {
        return uploadUrls;
    }

    public void setUploadUrls(List<String> uploadUrls) {
        this.uploadUrls = uploadUrls;
    }

    public CreateLargeFileResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLargeFileResponse that = (CreateLargeFileResponse) obj;
        return Objects.equals(this.fileId, that.fileId) && Objects.equals(this.uploadUrls, that.uploadUrls)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, uploadUrls, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLargeFileResponse {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    uploadUrls: ").append(toIndentedString(uploadUrls)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
