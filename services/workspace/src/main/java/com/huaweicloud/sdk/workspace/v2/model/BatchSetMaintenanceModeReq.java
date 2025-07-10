package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量设置桌面管理员维护模式。
 */
public class BatchSetMaintenanceModeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_maintenance_mode")

    private Boolean inMaintenanceMode;

    public BatchSetMaintenanceModeReq withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public BatchSetMaintenanceModeReq addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public BatchSetMaintenanceModeReq withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 需要设置维护模式的desktopId列表。
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    public BatchSetMaintenanceModeReq withInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
        return this;
    }

    /**
     * 进入或退出管理员维护模式 false:  退出维护模式 true: 维护模式
     * @return inMaintenanceMode
     */
    public Boolean getInMaintenanceMode() {
        return inMaintenanceMode;
    }

    public void setInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSetMaintenanceModeReq that = (BatchSetMaintenanceModeReq) obj;
        return Objects.equals(this.desktopIds, that.desktopIds)
            && Objects.equals(this.inMaintenanceMode, that.inMaintenanceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopIds, inMaintenanceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetMaintenanceModeReq {\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
        sb.append("    inMaintenanceMode: ").append(toIndentedString(inMaintenanceMode)).append("\n");
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
