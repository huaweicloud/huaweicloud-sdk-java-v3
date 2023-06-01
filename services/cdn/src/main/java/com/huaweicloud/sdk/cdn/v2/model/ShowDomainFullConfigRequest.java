package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDomainFullConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_special_configs")

    private String showSpecialConfigs;

    public ShowDomainFullConfigRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 加速域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainFullConfigRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID， all：所有项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowDomainFullConfigRequest withShowSpecialConfigs(String showSpecialConfigs) {
        this.showSpecialConfigs = showSpecialConfigs;
        return this;
    }

    /**
     * 取值为auth_key，用来查询鉴权KEY和鉴权备KEY的值。
     * @return showSpecialConfigs
     */
    public String getShowSpecialConfigs() {
        return showSpecialConfigs;
    }

    public void setShowSpecialConfigs(String showSpecialConfigs) {
        this.showSpecialConfigs = showSpecialConfigs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainFullConfigRequest showDomainFullConfigRequest = (ShowDomainFullConfigRequest) o;
        return Objects.equals(this.domainName, showDomainFullConfigRequest.domainName)
            && Objects.equals(this.enterpriseProjectId, showDomainFullConfigRequest.enterpriseProjectId)
            && Objects.equals(this.showSpecialConfigs, showDomainFullConfigRequest.showSpecialConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, enterpriseProjectId, showSpecialConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainFullConfigRequest {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    showSpecialConfigs: ").append(toIndentedString(showSpecialConfigs)).append("\n");
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
