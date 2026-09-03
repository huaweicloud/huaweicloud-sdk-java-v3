package com.huaweicloud.sdk.workspace.v2.model;

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
public class CreateUploadUrlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_urls")

    private List<UploadUrlItem> uploadUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateUploadUrlsResponse withUploadUrls(List<UploadUrlItem> uploadUrls) {
        this.uploadUrls = uploadUrls;
        return this;
    }

    public CreateUploadUrlsResponse addUploadUrlsItem(UploadUrlItem uploadUrlsItem) {
        if (this.uploadUrls == null) {
            this.uploadUrls = new ArrayList<>();
        }
        this.uploadUrls.add(uploadUrlsItem);
        return this;
    }

    public CreateUploadUrlsResponse withUploadUrls(Consumer<List<UploadUrlItem>> uploadUrlsSetter) {
        if (this.uploadUrls == null) {
            this.uploadUrls = new ArrayList<>();
        }
        uploadUrlsSetter.accept(this.uploadUrls);
        return this;
    }

    /**
     * 上传地址列表。
     * @return uploadUrls
     */
    public List<UploadUrlItem> getUploadUrls() {
        return uploadUrls;
    }

    public void setUploadUrls(List<UploadUrlItem> uploadUrls) {
        this.uploadUrls = uploadUrls;
    }

    public CreateUploadUrlsResponse withXRequestId(String xRequestId) {
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
        CreateUploadUrlsResponse that = (CreateUploadUrlsResponse) obj;
        return Objects.equals(this.uploadUrls, that.uploadUrls) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrls, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUploadUrlsResponse {\n");
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
