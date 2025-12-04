package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupCreateReq
 */
public class GroupCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_desc")

    private String groupDesc;

    public GroupCreateReq withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 消费组名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public GroupCreateReq withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * **参数解释**： 消费组描述。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及
     * @return groupDesc
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupCreateReq that = (GroupCreateReq) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupDesc, that.groupDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupCreateReq {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupDesc: ").append(toIndentedString(groupDesc)).append("\n");
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
