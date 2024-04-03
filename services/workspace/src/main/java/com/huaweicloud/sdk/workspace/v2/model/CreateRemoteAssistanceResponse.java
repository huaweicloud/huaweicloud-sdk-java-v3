package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateRemoteAssistanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_id")

    private String shareSpaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initiator_type")

    private String initiatorType;

    public CreateRemoteAssistanceResponse withShareSpaceId(String shareSpaceId) {
        this.shareSpaceId = shareSpaceId;
        return this;
    }

    /**
     * 协同空间ID
     * @return shareSpaceId
     */
    public String getShareSpaceId() {
        return shareSpaceId;
    }

    public void setShareSpaceId(String shareSpaceId) {
        this.shareSpaceId = shareSpaceId;
    }

    public CreateRemoteAssistanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 协同空间状态 - OPEN 协同空间已创建 - CLOSE 协同空间已关闭 - WAIT_USER_CONFIRM 等待用户确认进入远程协助 - WAIT_USER_ACCESS 等待用户进入远程协助
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateRemoteAssistanceResponse withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面的desktopId
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public CreateRemoteAssistanceResponse withInitiatorType(String initiatorType) {
        this.initiatorType = initiatorType;
        return this;
    }

    /**
     * 发起方类型 - ADMIN_INITIATE 管理员发起 - ENDUSER_INITIATE 终端用户发起
     * @return initiatorType
     */
    public String getInitiatorType() {
        return initiatorType;
    }

    public void setInitiatorType(String initiatorType) {
        this.initiatorType = initiatorType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRemoteAssistanceResponse that = (CreateRemoteAssistanceResponse) obj;
        return Objects.equals(this.shareSpaceId, that.shareSpaceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.initiatorType, that.initiatorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareSpaceId, status, desktopId, initiatorType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRemoteAssistanceResponse {\n");
        sb.append("    shareSpaceId: ").append(toIndentedString(shareSpaceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    initiatorType: ").append(toIndentedString(initiatorType)).append("\n");
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
