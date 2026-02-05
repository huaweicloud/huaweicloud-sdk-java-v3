package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新热点会话迁移配置请求体。
 */
public class UpdateHotspotSessionConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspot_session_migration_enable")

    private Boolean hotspotSessionMigrationEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspot_exit_session_num")

    private Integer hotspotExitSessionNum;

    public UpdateHotspotSessionConfigReq withHotspotSessionMigrationEnable(Boolean hotspotSessionMigrationEnable) {
        this.hotspotSessionMigrationEnable = hotspotSessionMigrationEnable;
        return this;
    }

    /**
     * 是否开启热点会话迁移。取值为： false：表示关闭。 true：表示开启。
     * @return hotspotSessionMigrationEnable
     */
    public Boolean getHotspotSessionMigrationEnable() {
        return hotspotSessionMigrationEnable;
    }

    public void setHotspotSessionMigrationEnable(Boolean hotspotSessionMigrationEnable) {
        this.hotspotSessionMigrationEnable = hotspotSessionMigrationEnable;
    }

    public UpdateHotspotSessionConfigReq withHotspotExitSessionNum(Integer hotspotExitSessionNum) {
        this.hotspotExitSessionNum = hotspotExitSessionNum;
        return this;
    }

    /**
     * 热点时退出会话个数。
     * minimum: 0
     * maximum: 100
     * @return hotspotExitSessionNum
     */
    public Integer getHotspotExitSessionNum() {
        return hotspotExitSessionNum;
    }

    public void setHotspotExitSessionNum(Integer hotspotExitSessionNum) {
        this.hotspotExitSessionNum = hotspotExitSessionNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHotspotSessionConfigReq that = (UpdateHotspotSessionConfigReq) obj;
        return Objects.equals(this.hotspotSessionMigrationEnable, that.hotspotSessionMigrationEnable)
            && Objects.equals(this.hotspotExitSessionNum, that.hotspotExitSessionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotspotSessionMigrationEnable, hotspotExitSessionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHotspotSessionConfigReq {\n");
        sb.append("    hotspotSessionMigrationEnable: ")
            .append(toIndentedString(hotspotSessionMigrationEnable))
            .append("\n");
        sb.append("    hotspotExitSessionNum: ").append(toIndentedString(hotspotExitSessionNum)).append("\n");
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
