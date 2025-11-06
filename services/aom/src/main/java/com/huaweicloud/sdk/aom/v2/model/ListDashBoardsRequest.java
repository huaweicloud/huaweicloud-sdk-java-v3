package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDashBoardsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_type")

    private String dashboardType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Enterprise-Project-Id")

    private String enterpriseProjectId;

    public ListDashBoardsRequest withDashboardType(String dashboardType) {
        this.dashboardType = dashboardType;
        return this;
    }

    /**
     * 仪表盘类型。
     * @return dashboardType
     */
    public String getDashboardType() {
        return dashboardType;
    }

    public void setDashboardType(String dashboardType) {
        this.dashboardType = dashboardType;
    }

    public ListDashBoardsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。获取方式请参见：[获取企业项目ID](aom_04_0024.xml)。 - 查询单个企业项目下实例，填写企业项目id。 - 查询所有企业项目下实例，填写“all_granted_eps”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDashBoardsRequest that = (ListDashBoardsRequest) obj;
        return Objects.equals(this.dashboardType, that.dashboardType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardType, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDashBoardsRequest {\n");
        sb.append("    dashboardType: ").append(toIndentedString(dashboardType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
