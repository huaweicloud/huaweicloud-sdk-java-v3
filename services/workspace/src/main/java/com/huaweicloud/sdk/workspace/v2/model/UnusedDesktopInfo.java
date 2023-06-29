package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 未使用的桌面信息。
 */
public class UnusedDesktopInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_name")

    private String computeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnect_time")

    private String disconnectTime;

    public UnusedDesktopInfo withDesktopId(String desktopId) {
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

    public UnusedDesktopInfo withComputeName(String computeName) {
        this.computeName = computeName;
        return this;
    }

    /**
     * 桌面名称。
     * @return computeName
     */
    public String getComputeName() {
        return computeName;
    }

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    public UnusedDesktopInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 桌面创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UnusedDesktopInfo withDisconnectTime(String disconnectTime) {
        this.disconnectTime = disconnectTime;
        return this;
    }

    /**
     * 最近一次断连时间。
     * @return disconnectTime
     */
    public String getDisconnectTime() {
        return disconnectTime;
    }

    public void setDisconnectTime(String disconnectTime) {
        this.disconnectTime = disconnectTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnusedDesktopInfo that = (UnusedDesktopInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.computeName, that.computeName)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.disconnectTime, that.disconnectTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, computeName, createTime, disconnectTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnusedDesktopInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    computeName: ").append(toIndentedString(computeName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    disconnectTime: ").append(toIndentedString(disconnectTime)).append("\n");
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
