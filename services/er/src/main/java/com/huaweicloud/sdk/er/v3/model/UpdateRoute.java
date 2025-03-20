package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 路由
 */
public class UpdateRoute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_blackhole")

    private Boolean isBlackhole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateRoute withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 路由下一跳
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public UpdateRoute withIsBlackhole(Boolean isBlackhole) {
        this.isBlackhole = isBlackhole;
        return this;
    }

    /**
     * 是否为黑洞路由
     * @return isBlackhole
     */
    public Boolean getIsBlackhole() {
        return isBlackhole;
    }

    public void setIsBlackhole(Boolean isBlackhole) {
        this.isBlackhole = isBlackhole;
    }

    public UpdateRoute withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 路由描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRoute that = (UpdateRoute) obj;
        return Objects.equals(this.attachmentId, that.attachmentId)
            && Objects.equals(this.isBlackhole, that.isBlackhole) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentId, isBlackhole, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoute {\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    isBlackhole: ").append(toIndentedString(isBlackhole)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
