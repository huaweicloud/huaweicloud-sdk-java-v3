package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    private ExtendInfo extendInfo;

    public UpdateDashboardRequestBody withDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }

    /**
     * **参数解释** 自定义监控看板名称 **约束限制** 不涉及 **取值范围** 字符串包含中文字符，字母，数字，下划线（_），横线（-）长度为[1,128]个字符 **默认取值** 不涉及 
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
     * **参数解释** 监控看板是否标记收藏 **约束限制** 不涉及 **取值范围** - true 收藏 - false 未收藏 **默认取值** 不涉及 
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
     * **参数解释** 监控视图展示模式 **约束限制** 不涉及 **取值范围** - 0 自定义坐标 - 1 每行一个 - 2 每行两个 - 3 每行三个 - 4 每行四个 **默认取值** 不涉及 
     * minimum: 0
     * maximum: 4
     * @return rowWidgetNum
     */
    public Integer getRowWidgetNum() {
        return rowWidgetNum;
    }

    public void setRowWidgetNum(Integer rowWidgetNum) {
        this.rowWidgetNum = rowWidgetNum;
    }

    public UpdateDashboardRequestBody withExtendInfo(ExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    public UpdateDashboardRequestBody withExtendInfo(Consumer<ExtendInfo> extendInfoSetter) {
        if (this.extendInfo == null) {
            this.extendInfo = new ExtendInfo();
            extendInfoSetter.accept(this.extendInfo);
        }

        return this;
    }

    /**
     * Get extendInfo
     * @return extendInfo
     */
    public ExtendInfo getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(ExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
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
            && Objects.equals(this.isFavorite, that.isFavorite) && Objects.equals(this.rowWidgetNum, that.rowWidgetNum)
            && Objects.equals(this.extendInfo, that.extendInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardName, isFavorite, rowWidgetNum, extendInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDashboardRequestBody {\n");
        sb.append("    dashboardName: ").append(toIndentedString(dashboardName)).append("\n");
        sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
        sb.append("    rowWidgetNum: ").append(toIndentedString(rowWidgetNum)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
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
