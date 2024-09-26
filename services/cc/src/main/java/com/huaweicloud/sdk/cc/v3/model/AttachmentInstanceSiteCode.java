package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 中心网络附件对端实例的站点编码。
 */
public class AttachmentInstanceSiteCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_site_code")

    private String attachmentInstanceSiteCode;

    public AttachmentInstanceSiteCode withAttachmentInstanceSiteCode(String attachmentInstanceSiteCode) {
        this.attachmentInstanceSiteCode = attachmentInstanceSiteCode;
        return this;
    }

    /**
     * 中心网络附件对端实例的站点编码。
     * @return attachmentInstanceSiteCode
     */
    public String getAttachmentInstanceSiteCode() {
        return attachmentInstanceSiteCode;
    }

    public void setAttachmentInstanceSiteCode(String attachmentInstanceSiteCode) {
        this.attachmentInstanceSiteCode = attachmentInstanceSiteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentInstanceSiteCode that = (AttachmentInstanceSiteCode) obj;
        return Objects.equals(this.attachmentInstanceSiteCode, that.attachmentInstanceSiteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentInstanceSiteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentInstanceSiteCode {\n");
        sb.append("    attachmentInstanceSiteCode: ").append(toIndentedString(attachmentInstanceSiteCode)).append("\n");
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
