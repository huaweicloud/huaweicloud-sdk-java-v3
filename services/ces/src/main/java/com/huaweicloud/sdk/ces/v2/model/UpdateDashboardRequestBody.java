package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateDashboardRequestBody
 */
public class UpdateDashboardRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_name")

    private String dashboardName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_favorite")

    private Boolean isFavorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_widget_num")

    private Integer rowWidgetNum;

    public UpdateDashboardRequestBody withDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }

    /**
     * 自定义监控看板名称
     * @return dashboardName
     */
    public String getDashboardName() {
        return dashboardName;
    }

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    public UpdateDashboardRequestBody withIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    /**
     * 监控看板是否标记收藏, true: 收藏, false: 未收藏
     * @return isFavorite
     */
    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public UpdateDashboardRequestBody withRowWidgetNum(Integer rowWidgetNum) {
        this.rowWidgetNum = rowWidgetNum;
        return this;
    }

    /**
     * 监控视图展示模式，0表示自定义坐标，1代表每行一个
     * minimum: 0
     * maximum: 3
     * @return rowWidgetNum
     */
    public Integer getRowWidgetNum() {
        return rowWidgetNum;
    }

    public void setRowWidgetNum(Integer rowWidgetNum) {
        this.rowWidgetNum = rowWidgetNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDashboardRequestBody that = (UpdateDashboardRequestBody) obj;
        return Objects.equals(this.dashboardName, that.dashboardName)
            && Objects.equals(this.isFavorite, that.isFavorite) && Objects.equals(this.rowWidgetNum, that.rowWidgetNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardName, isFavorite, rowWidgetNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDashboardRequestBody {\n");
        sb.append("    dashboardName: ").append(toIndentedString(dashboardName)).append("\n");
        sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
        sb.append("    rowWidgetNum: ").append(toIndentedString(rowWidgetNum)).append("\n");
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
