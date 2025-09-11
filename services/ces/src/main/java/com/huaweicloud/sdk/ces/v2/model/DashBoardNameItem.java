package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DashBoardNameItem
 */
public class DashBoardNameItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_name")

    private String dashboardName;

    public DashBoardNameItem withDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }

    /**
     * **参数描述**： 自定义监控看板名称 **约束限制** 不涉及 **取值范围** 长度为[1,128]个字符，只允许中文、英文、数字0-9、_和- **默认取值** 不涉及 
     * @return dashboardName
     */
    public String getDashboardName() {
        return dashboardName;
    }

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DashBoardNameItem that = (DashBoardNameItem) obj;
        return Objects.equals(this.dashboardName, that.dashboardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DashBoardNameItem {\n");
        sb.append("    dashboardName: ").append(toIndentedString(dashboardName)).append("\n");
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
