package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScheduleGroupInfo
 */
public class ScheduleGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_id")

    private String sceneId;

    public ScheduleGroupInfo withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色id
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public ScheduleGroupInfo withSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * 场景id
     * @return sceneId
     */
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleGroupInfo that = (ScheduleGroupInfo) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.sceneId, that.sceneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, sceneId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleGroupInfo {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    sceneId: ").append(toIndentedString(sceneId)).append("\n");
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
