package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSubNetworkInterfaceTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_network_interface_id")

    private String subNetworkInterfaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private String tagKey;

    public DeleteSubNetworkInterfaceTagRequest withSubNetworkInterfaceId(String subNetworkInterfaceId) {
        this.subNetworkInterfaceId = subNetworkInterfaceId;
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡唯一标识。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return subNetworkInterfaceId
     */
    public String getSubNetworkInterfaceId() {
        return subNetworkInterfaceId;
    }

    public void setSubNetworkInterfaceId(String subNetworkInterfaceId) {
        this.subNetworkInterfaceId = subNetworkInterfaceId;
    }

    public DeleteSubNetworkInterfaceTagRequest withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * **参数解释**： 标签键。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
        DeleteSubNetworkInterfaceTagRequest that = (DeleteSubNetworkInterfaceTagRequest) obj;
        return Objects.equals(this.subNetworkInterfaceId, that.subNetworkInterfaceId)
            && Objects.equals(this.tagKey, that.tagKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subNetworkInterfaceId, tagKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSubNetworkInterfaceTagRequest {\n");
        sb.append("    subNetworkInterfaceId: ").append(toIndentedString(subNetworkInterfaceId)).append("\n");
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
