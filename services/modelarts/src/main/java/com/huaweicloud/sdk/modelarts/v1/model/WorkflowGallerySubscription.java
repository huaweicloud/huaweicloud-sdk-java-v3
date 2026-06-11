package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Gallery 订阅信息。
 */
public class WorkflowGallerySubscription {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_id")

    private String contentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_at")

    private String expiredAt;

    public WorkflowGallerySubscription withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * 资产ID。
     * @return contentId
     */
    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public WorkflowGallerySubscription withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 版本ID。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public WorkflowGallerySubscription withExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * 超期时间。
     * @return expiredAt
     */
    public String getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowGallerySubscription that = (WorkflowGallerySubscription) obj;
        return Objects.equals(this.contentId, that.contentId) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.expiredAt, that.expiredAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, versionId, expiredAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowGallerySubscription {\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
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
