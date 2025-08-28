package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPageNoticesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_location")

    private String pageLocation;

    public ShowPageNoticesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowPageNoticesRequest withPageLocation(String pageLocation) {
        this.pageLocation = pageLocation;
        return this;
    }

    /**
     * **参数解释** 访问页面位置 **取值范围** - hostMgmt：主机管理-云服务器 - hostProtectQuota：主机管理-防护配额 - containerNodeList：容器管理-容器节点管理 - containerProtectQuota：容器管理-容器防护配额 - containerMirror：容器管理-容器镜像 - container：容器管理-容器 - clusterAgent：容器管理-集群Agent管理 - vulView：漏洞管理-漏洞视图 - vulHostView：漏洞管理-主机视图 - ransomwareProtection：勒索病毒防护 - policyMgmt：策略管理 - antiVirus：病毒查杀 - hostAlarm：安全告警事件-主机安全告警 - containerAlarm：安全告警事件-容器安全告警
     * @return pageLocation
     */
    public String getPageLocation() {
        return pageLocation;
    }

    public void setPageLocation(String pageLocation) {
        this.pageLocation = pageLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPageNoticesRequest that = (ShowPageNoticesRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.pageLocation, that.pageLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, pageLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPageNoticesRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    pageLocation: ").append(toIndentedString(pageLocation)).append("\n");
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
