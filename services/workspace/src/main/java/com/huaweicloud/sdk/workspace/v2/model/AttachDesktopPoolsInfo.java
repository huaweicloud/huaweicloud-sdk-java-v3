package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联桌面池信息
 */
public class AttachDesktopPoolsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_name")

    private String desktopPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_attached")

    private Boolean isAttached;

    public AttachDesktopPoolsInfo withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池id
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public AttachDesktopPoolsInfo withDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
        return this;
    }

    /**
     * 桌面池名称
     * @return desktopPoolName
     */
    public String getDesktopPoolName() {
        return desktopPoolName;
    }

    public void setDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
    }

    public AttachDesktopPoolsInfo withIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
        return this;
    }

    /**
     * 是否分配了桌面
     * @return isAttached
     */
    public Boolean getIsAttached() {
        return isAttached;
    }

    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachDesktopPoolsInfo that = (AttachDesktopPoolsInfo) obj;
        return Objects.equals(this.desktopPoolId, that.desktopPoolId)
            && Objects.equals(this.desktopPoolName, that.desktopPoolName)
            && Objects.equals(this.isAttached, that.isAttached);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopPoolId, desktopPoolName, isAttached);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachDesktopPoolsInfo {\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    desktopPoolName: ").append(toIndentedString(desktopPoolName)).append("\n");
        sb.append("    isAttached: ").append(toIndentedString(isAttached)).append("\n");
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
