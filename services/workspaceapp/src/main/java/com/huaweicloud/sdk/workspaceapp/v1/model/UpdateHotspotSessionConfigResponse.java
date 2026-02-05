package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateHotspotSessionConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspot_session_migration_enable")

    private Boolean hotspotSessionMigrationEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspot_exit_session_num")

    private Integer hotspotExitSessionNum;

    public UpdateHotspotSessionConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateHotspotSessionConfigResponse withHotspotSessionMigrationEnable(Boolean hotspotSessionMigrationEnable) {
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

    public UpdateHotspotSessionConfigResponse withHotspotExitSessionNum(Integer hotspotExitSessionNum) {
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
        UpdateHotspotSessionConfigResponse that = (UpdateHotspotSessionConfigResponse) obj;
        return Objects.equals(this.id, that.id)
            && Objects.equals(this.hotspotSessionMigrationEnable, that.hotspotSessionMigrationEnable)
            && Objects.equals(this.hotspotExitSessionNum, that.hotspotExitSessionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hotspotSessionMigrationEnable, hotspotExitSessionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHotspotSessionConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
