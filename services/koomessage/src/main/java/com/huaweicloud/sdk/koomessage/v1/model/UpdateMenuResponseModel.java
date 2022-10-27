package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateMenuResponseModel
 */
public class UpdateMenuResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu_id")

    private String menuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    public UpdateMenuResponseModel withMenuId(String menuId) {
        this.menuId = menuId;
        return this;
    }

    /**
     * 菜单ID。
     * @return menuId
     */
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public UpdateMenuResponseModel withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 操作记录ID。
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMenuResponseModel updateMenuResponseModel = (UpdateMenuResponseModel) o;
        return Objects.equals(this.menuId, updateMenuResponseModel.menuId)
            && Objects.equals(this.logId, updateMenuResponseModel.logId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, logId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMenuResponseModel {\n");
        sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
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
