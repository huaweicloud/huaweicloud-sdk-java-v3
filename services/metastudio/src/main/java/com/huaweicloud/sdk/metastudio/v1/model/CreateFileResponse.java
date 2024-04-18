package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_url")

    private String uploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateFileResponse withFileId(String fileId) {
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

    public CreateFileResponse withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * 文件上传地址，有效期为24小时。 > * [调用OBS的[“PUT上传”](https://support.huaweicloud.com/api-obs/obs_04_0080.html)接口上传文件。](tag:hc) > * [调用OBS的[“PUT上传”](https://support.huaweicloud.com/intl/zh-cn/api-obs/obs_04_0080.html)接口上传文件。](tag:hk) > * [调用OBS的“PUT上传”接口上传文件。](tag:cmcc) > * 调用上述接口时，Content-MD5头必须填写，填写的值跟file_md5中的值相同。
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public CreateFileResponse withXRequestId(String xRequestId) {
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
        CreateFileResponse that = (CreateFileResponse) obj;
        return Objects.equals(this.fileId, that.fileId) && Objects.equals(this.uploadUrl, that.uploadUrl)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, uploadUrl, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFileResponse {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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
