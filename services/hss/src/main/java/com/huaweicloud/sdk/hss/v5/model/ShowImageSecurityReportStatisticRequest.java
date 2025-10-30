package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowImageSecurityReportStatisticRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_report_type")

    private String securityReportType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchExportSWRBaselineInfoRequestInfo body;

    public ShowImageSecurityReportStatisticRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Region ID
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowImageSecurityReportStatisticRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 主机所属的企业项目ID。 开通企业项目功能后才需要配置企业项目。 企业项目ID默认取值为“0”，表示默认企业项目。如果需要查询所有企业项目下的主机，请传参“all_granted_eps”。如果您只有某个企业项目的权限，则需要传递该企业项目ID，查询该企业项目下的主机，否则会因权限不足而报错。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowImageSecurityReportStatisticRequest withSecurityReportType(String securityReportType) {
        this.securityReportType = securityReportType;
        return this;
    }

    /**
     * 安全报告类型，包含如下:   - vulnerability: 漏洞信息   - risk-config: 基线配置信息   - malwares: 恶意文件信息   - apps: 软件信息   - files: 文件信息   - sensitive-info: 敏感信息   - non-compliant-app: 软件合规信息   - build-command-risks: 镜像构建指令风险
     * @return securityReportType
     */
    public String getSecurityReportType() {
        return securityReportType;
    }

    public void setSecurityReportType(String securityReportType) {
        this.securityReportType = securityReportType;
    }

    public ShowImageSecurityReportStatisticRequest withBody(BatchExportSWRBaselineInfoRequestInfo body) {
        this.body = body;
        return this;
    }

    public ShowImageSecurityReportStatisticRequest withBody(
        Consumer<BatchExportSWRBaselineInfoRequestInfo> bodySetter) {
        if (this.body == null) {
            this.body = new BatchExportSWRBaselineInfoRequestInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchExportSWRBaselineInfoRequestInfo getBody() {
        return body;
    }

    public void setBody(BatchExportSWRBaselineInfoRequestInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageSecurityReportStatisticRequest that = (ShowImageSecurityReportStatisticRequest) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.securityReportType, that.securityReportType) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, enterpriseProjectId, securityReportType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageSecurityReportStatisticRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    securityReportType: ").append(toIndentedString(securityReportType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
