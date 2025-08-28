package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExportRisksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_type")

    private String riskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_size")

    private Integer exportSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExportRisksRequestBody body;

    public ExportRisksRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ExportRisksRequest withRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    /**
     * **参数解释**: 风险类型 **约束限制**: 不涉及 **取值范围**: - iac_risk: IaC风险。  **默认取值**: 不涉及 
     * @return riskType
     */
    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public ExportRisksRequest withExportSize(Integer exportSize) {
        this.exportSize = exportSize;
        return this;
    }

    /**
     * **参数解释**: 导出数据条数 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及 
     * minimum: 1
     * maximum: 200000
     * @return exportSize
     */
    public Integer getExportSize() {
        return exportSize;
    }

    public void setExportSize(Integer exportSize) {
        this.exportSize = exportSize;
    }

    public ExportRisksRequest withBody(ExportRisksRequestBody body) {
        this.body = body;
        return this;
    }

    public ExportRisksRequest withBody(Consumer<ExportRisksRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExportRisksRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExportRisksRequestBody getBody() {
        return body;
    }

    public void setBody(ExportRisksRequestBody body) {
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
        ExportRisksRequest that = (ExportRisksRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.riskType, that.riskType) && Objects.equals(this.exportSize, that.exportSize)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, riskType, exportSize, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportRisksRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
        sb.append("    exportSize: ").append(toIndentedString(exportSize)).append("\n");
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
