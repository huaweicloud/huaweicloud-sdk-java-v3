package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMonthlyExpendituresRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    @JacksonXmlProperty(localName = "cycle")

    private String cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_code")

    @JacksonXmlProperty(localName = "cloud_service_type_code")

    private String cloudServiceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectId")

    @JacksonXmlProperty(localName = "enterpriseProjectId")

    private String enterpriseProjectId;

    public ListMonthlyExpendituresRequest withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 查询消费汇总账单所在的账期，格式为YYYY-MM。
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public ListMonthlyExpendituresRequest withCloudServiceTypeCode(String cloudServiceTypeCode) {
        this.cloudServiceTypeCode = cloudServiceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。当不传递此参数时，查询的账单是以云服务类型为维度的月度消费账单。当传递此参数时，查询的账单是该云服务类型下以资源类型为维度的月度消费账单。
     * @return cloudServiceTypeCode
     */
    public String getCloudServiceTypeCode() {
        return cloudServiceTypeCode;
    }

    public void setCloudServiceTypeCode(String cloudServiceTypeCode) {
        this.cloudServiceTypeCode = cloudServiceTypeCode;
    }

    public ListMonthlyExpendituresRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 0：华为云账户 1：伙伴设置预算账户，仅当客户关联合作伙伴且关联类型为转售模式时，才会存在伙伴拨款设置预算账户。不传此参数默认查询华为云账户下的消费汇总。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListMonthlyExpendituresRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMonthlyExpendituresRequest listMonthlyExpendituresRequest = (ListMonthlyExpendituresRequest) o;
        return Objects.equals(this.cycle, listMonthlyExpendituresRequest.cycle)
            && Objects.equals(this.cloudServiceTypeCode, listMonthlyExpendituresRequest.cloudServiceTypeCode)
            && Objects.equals(this.type, listMonthlyExpendituresRequest.type)
            && Objects.equals(this.enterpriseProjectId, listMonthlyExpendituresRequest.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycle, cloudServiceTypeCode, type, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMonthlyExpendituresRequest {\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    cloudServiceTypeCode: ").append(toIndentedString(cloudServiceTypeCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
