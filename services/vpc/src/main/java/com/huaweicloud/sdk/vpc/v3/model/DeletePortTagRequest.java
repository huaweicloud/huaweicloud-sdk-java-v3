package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeletePortTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private String tagKey;

    public DeletePortTagRequest withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 功能说明：端口唯一标识 取值范围：合法UUID 约束：ID对应的端口必须存在
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public DeletePortTagRequest withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * 功能说明：标签键
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePortTagRequest that = (DeletePortTagRequest) obj;
        return Objects.equals(this.portId, that.portId) && Objects.equals(this.tagKey, that.tagKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId, tagKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePortTagRequest {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
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
