package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建路由请求体
 */
public class CreateRoute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_blackhole")

    private Boolean isBlackhole;

    public CreateRoute withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 路由目的地址
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public CreateRoute withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 路由下一跳指向的连接ID
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public CreateRoute withIsBlackhole(Boolean isBlackhole) {
        this.isBlackhole = isBlackhole;
        return this;
    }

    /**
     * 是否为黑洞路由，默认为false
     * @return isBlackhole
     */
    public Boolean getIsBlackhole() {
        return isBlackhole;
    }

    public void setIsBlackhole(Boolean isBlackhole) {
        this.isBlackhole = isBlackhole;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRoute that = (CreateRoute) obj;
        return Objects.equals(this.destination, that.destination)
            && Objects.equals(this.attachmentId, that.attachmentId)
            && Objects.equals(this.isBlackhole, that.isBlackhole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, attachmentId, isBlackhole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRoute {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    isBlackhole: ").append(toIndentedString(isBlackhole)).append("\n");
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
