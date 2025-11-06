package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDashBoardRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_id")

    private String dashboardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Enterprise-Project-Id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ShowDashBoardRequest withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * 仪表盘id。
     * @return dashboardId
     */
    public String getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public ShowDashBoardRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。获取方式请参见：[获取企业项目ID](aom_04_0024.xml)。  -  查询单个企业项目下实例，填写企业项目id。  -  查询所有企业项目下实例，填写“all_granted_eps”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowDashBoardRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 仪表盘版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDashBoardRequest that = (ShowDashBoardRequest) obj;
        return Objects.equals(this.dashboardId, that.dashboardId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardId, enterpriseProjectId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDashBoardRequest {\n");
        sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
