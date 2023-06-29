package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 保护实例挂载复制对请求体
 */
public class ProtectedInstanceAttachReplicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicationAttachment")

    private ProtectedInstanceAttachReplicationRequestParams replicationAttachment;

    public ProtectedInstanceAttachReplicationRequestBody withReplicationAttachment(
        ProtectedInstanceAttachReplicationRequestParams replicationAttachment) {
        this.replicationAttachment = replicationAttachment;
        return this;
    }

    public ProtectedInstanceAttachReplicationRequestBody withReplicationAttachment(
        Consumer<ProtectedInstanceAttachReplicationRequestParams> replicationAttachmentSetter) {
        if (this.replicationAttachment == null) {
            this.replicationAttachment = new ProtectedInstanceAttachReplicationRequestParams();
            replicationAttachmentSetter.accept(this.replicationAttachment);
        }

        return this;
    }

    /**
     * Get replicationAttachment
     * @return replicationAttachment
     */
    public ProtectedInstanceAttachReplicationRequestParams getReplicationAttachment() {
        return replicationAttachment;
    }

    public void setReplicationAttachment(ProtectedInstanceAttachReplicationRequestParams replicationAttachment) {
        this.replicationAttachment = replicationAttachment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectedInstanceAttachReplicationRequestBody that = (ProtectedInstanceAttachReplicationRequestBody) obj;
        return Objects.equals(this.replicationAttachment, that.replicationAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicationAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedInstanceAttachReplicationRequestBody {\n");
        sb.append("    replicationAttachment: ").append(toIndentedString(replicationAttachment)).append("\n");
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
