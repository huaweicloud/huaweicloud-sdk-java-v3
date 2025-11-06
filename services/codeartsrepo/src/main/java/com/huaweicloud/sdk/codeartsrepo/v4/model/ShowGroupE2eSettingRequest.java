package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowGroupE2eSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    public ShowGroupE2eSettingRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id，代码组首页，Group ID后的数字Id
     * minimum: 1
     * maximum: 2147483647
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupE2eSettingRequest that = (ShowGroupE2eSettingRequest) obj;
        return Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupE2eSettingRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
