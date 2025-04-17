package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DashBoardInfo
 */
public class DashBoardInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_id")

    private String dashboardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_name")

    private String dashboardName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_widget_num")

    private Integer rowWidgetNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_favorite")

    private Boolean isFavorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "widgets_num")

    private Integer widgetsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_product")

    private String subProduct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_template_id")

    private String dashboardTemplateId;

    public DashBoardInfo withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * 监控看板id
     * @return dashboardId
     */
    public String getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public DashBoardInfo withDashboardName(String dashboardName) {
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

    public DashBoardInfo withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业项目Id
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public DashBoardInfo withRowWidgetNum(Integer rowWidgetNum) {
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

    public DashBoardInfo withIsFavorite(Boolean isFavorite) {
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

    public DashBoardInfo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 监控看板的创建用户名
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public DashBoardInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 监控看板创建时间
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public DashBoardInfo withWidgetsNum(Integer widgetsNum) {
        this.widgetsNum = widgetsNum;
        return this;
    }

    /**
     * 看板下的视图总数
     * minimum: 0
     * maximum: 50
     * @return widgetsNum
     */
    public Integer getWidgetsNum() {
        return widgetsNum;
    }

    public void setWidgetsNum(Integer widgetsNum) {
        this.widgetsNum = widgetsNum;
    }

    public DashBoardInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public DashBoardInfo withSubProduct(String subProduct) {
        this.subProduct = subProduct;
        return this;
    }

    /**
     * 子产品标识
     * @return subProduct
     */
    public String getSubProduct() {
        return subProduct;
    }

    public void setSubProduct(String subProduct) {
        this.subProduct = subProduct;
    }

    public DashBoardInfo withDashboardTemplateId(String dashboardTemplateId) {
        this.dashboardTemplateId = dashboardTemplateId;
        return this;
    }

    /**
     * 监控大盘模板id
     * @return dashboardTemplateId
     */
    public String getDashboardTemplateId() {
        return dashboardTemplateId;
    }

    public void setDashboardTemplateId(String dashboardTemplateId) {
        this.dashboardTemplateId = dashboardTemplateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DashBoardInfo that = (DashBoardInfo) obj;
        return Objects.equals(this.dashboardId, that.dashboardId)
            && Objects.equals(this.dashboardName, that.dashboardName)
            && Objects.equals(this.enterpriseId, that.enterpriseId)
            && Objects.equals(this.rowWidgetNum, that.rowWidgetNum) && Objects.equals(this.isFavorite, that.isFavorite)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.widgetsNum, that.widgetsNum) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.subProduct, that.subProduct)
            && Objects.equals(this.dashboardTemplateId, that.dashboardTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardId,
            dashboardName,
            enterpriseId,
            rowWidgetNum,
            isFavorite,
            creatorName,
            createTime,
            widgetsNum,
            namespace,
            subProduct,
            dashboardTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DashBoardInfo {\n");
        sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
        sb.append("    dashboardName: ").append(toIndentedString(dashboardName)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    rowWidgetNum: ").append(toIndentedString(rowWidgetNum)).append("\n");
        sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    widgetsNum: ").append(toIndentedString(widgetsNum)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    subProduct: ").append(toIndentedString(subProduct)).append("\n");
        sb.append("    dashboardTemplateId: ").append(toIndentedString(dashboardTemplateId)).append("\n");
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
