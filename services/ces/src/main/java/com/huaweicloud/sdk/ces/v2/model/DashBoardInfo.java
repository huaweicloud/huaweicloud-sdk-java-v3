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
     * **参数解释**： 监控看板id **取值范围** 以db开头，包含22个字母和数字，长度为24个字符 
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
     * **参数解释** 自定义监控看板名称 **取值范围** 长度为[1,128]个字符，只允许中文、英文、数字0-9、_和- 
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
     * **参数解释** 企业项目ID **取值范围** 只能包含小写字母、数字、“-”、“_”，可以自定义企业项目ID，长度为36个字符。也可以为0（代表默认企业项目ID）。 
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
     * **参数解释** 每行展示视图数量 **取值范围** - 0:表示自定义坐标 - 1:代表每行1个视图 - 2:代表每行2个视图 - 3:代表每行3个视图 
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
     * **参数解释** 监控看板是否标记收藏 **取值范围** - true: 收藏, - false: 未收藏 
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
     * **参数解释** 监控看板的创建用户名 **取值范围** 长度为[1,128]个字符，只允许中文、英文、数字0-9、_和- 
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
     * **参数解释** 监控看板创建时间 **取值范围** 最小值为1111111111111，最大值为9999999999999 
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
     * **参数解释** 看板下的视图总数 **取值范围** 最小值为0，最大值为50 
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
     * **参数解释** 查询服务的命名空间，各服务命名空间请参阅[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/en-us/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg) **取值范围** 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间。 
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
     * **参数解释** 子产品标识 **取值范围** 长度为[1,128]个字符 
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
     * **参数解释** 监控大盘模板id **取值范围** 以mb开头，包含22个字母和数字，长度为24个字符 
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
