package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 内核版本信息。 **取值范围**： 数字、小数点，格式一般如 9.1.0、9.1.1.100。
 */
public class NodeTypeDatastores {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private NodeTypeDatastoresAttachments attachments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    public NodeTypeDatastores withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 内核版本号。 **取值范围**： 数字、小数点，格式一般如 9.1.0、9.1.1.100。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public NodeTypeDatastores withAttachments(NodeTypeDatastoresAttachments attachments) {
        this.attachments = attachments;
        return this;
    }

    public NodeTypeDatastores withAttachments(Consumer<NodeTypeDatastoresAttachments> attachmentsSetter) {
        if (this.attachments == null) {
            this.attachments = new NodeTypeDatastoresAttachments();
            attachmentsSetter.accept(this.attachments);
        }

        return this;
    }

    /**
     * Get attachments
     * @return attachments
     */
    public NodeTypeDatastoresAttachments getAttachments() {
        return attachments;
    }

    public void setAttachments(NodeTypeDatastoresAttachments attachments) {
        this.attachments = attachments;
    }

    public NodeTypeDatastores withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释**： 版本类型。 **取值范围**： - STABLE：稳定版 - PREVIEW：预览版
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTypeDatastores that = (NodeTypeDatastores) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.attachments, that.attachments)
            && Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, attachments, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTypeDatastores {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
