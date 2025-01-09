package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桌面连接状态信息。
 */
public class ConnectDesktopsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_status")

    private String connectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_users")

    private List<AttachUsersInfo> attachUsers = null;

    public ConnectDesktopsInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面id。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public ConnectDesktopsInfo withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面名称。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public ConnectDesktopsInfo withConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus;
        return this;
    }

    /**
     * 桌面的连接状态。  - UNREGISTER：表示桌面未注册时的状态（桌面启动后，会自动注册）。关机后也会出现未注册的状态。 - REGISTERED：表示桌面注册以后，等待用户连接的状态。 - CONNECTED：表示用户已经成功连接，正在使用桌面。 - DISCONNECTED：表示桌面与客户端断开会话后显示的状态，可能为关闭客户端窗口，或客户端与桌面网络断开引起。
     * @return connectStatus
     */
    public String getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus;
    }

    public ConnectDesktopsInfo withAttachUsers(List<AttachUsersInfo> attachUsers) {
        this.attachUsers = attachUsers;
        return this;
    }

    public ConnectDesktopsInfo addAttachUsersItem(AttachUsersInfo attachUsersItem) {
        if (this.attachUsers == null) {
            this.attachUsers = new ArrayList<>();
        }
        this.attachUsers.add(attachUsersItem);
        return this;
    }

    public ConnectDesktopsInfo withAttachUsers(Consumer<List<AttachUsersInfo>> attachUsersSetter) {
        if (this.attachUsers == null) {
            this.attachUsers = new ArrayList<>();
        }
        attachUsersSetter.accept(this.attachUsers);
        return this;
    }

    /**
     * 桌面已分配的用户或用户组信息列表。
     * @return attachUsers
     */
    public List<AttachUsersInfo> getAttachUsers() {
        return attachUsers;
    }

    public void setAttachUsers(List<AttachUsersInfo> attachUsers) {
        this.attachUsers = attachUsers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectDesktopsInfo that = (ConnectDesktopsInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.connectStatus, that.connectStatus)
            && Objects.equals(this.attachUsers, that.attachUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, desktopName, connectStatus, attachUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectDesktopsInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    connectStatus: ").append(toIndentedString(connectStatus)).append("\n");
        sb.append("    attachUsers: ").append(toIndentedString(attachUsers)).append("\n");
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
