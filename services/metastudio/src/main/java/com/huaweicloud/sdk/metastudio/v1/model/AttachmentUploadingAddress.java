package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 审核附件上传地址
 */
public class AttachmentUploadingAddress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uploading_url")

    private String uploadingUrl;

    public AttachmentUploadingAddress withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * 序号
     * minimum: 0
     * maximum: 99
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public AttachmentUploadingAddress withUploadingUrl(String uploadingUrl) {
        this.uploadingUrl = uploadingUrl;
        return this;
    }

    /**
     * 上传url
     * @return uploadingUrl
     */
    public String getUploadingUrl() {
        return uploadingUrl;
    }

    public void setUploadingUrl(String uploadingUrl) {
        this.uploadingUrl = uploadingUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentUploadingAddress that = (AttachmentUploadingAddress) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.uploadingUrl, that.uploadingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, uploadingUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentUploadingAddress {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    uploadingUrl: ").append(toIndentedString(uploadingUrl)).append("\n");
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
