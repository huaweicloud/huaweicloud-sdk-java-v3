package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyElbVipOpenReq
 */
public class ModifyElbVipOpenReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_ip")

    private String newIp;

    public ModifyElbVipOpenReq withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组id。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ModifyElbVipOpenReq withNewIp(String newIp) {
        this.newIp = newIp;
        return this;
    }

    /**
     * 新ip。
     * @return newIp
     */
    public String getNewIp() {
        return newIp;
    }

    public void setNewIp(String newIp) {
        this.newIp = newIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyElbVipOpenReq that = (ModifyElbVipOpenReq) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.newIp, that.newIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, newIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyElbVipOpenReq {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    newIp: ").append(toIndentedString(newIp)).append("\n");
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
