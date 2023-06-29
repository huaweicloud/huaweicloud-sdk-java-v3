package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 内核版本信息。
 */
public class NodeTypeDatastores {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private NodeTypeDatastoresAttachments attachments;

    public NodeTypeDatastores withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 内核版本号。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTypeDatastores that = (NodeTypeDatastores) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.attachments, that.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, attachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTypeDatastores {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
