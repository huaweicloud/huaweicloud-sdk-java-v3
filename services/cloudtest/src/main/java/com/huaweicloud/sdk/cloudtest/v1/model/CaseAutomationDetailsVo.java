package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用例自动化率详情
 */
public class CaseAutomationDetailsVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_automation_rate")

    private String caseAutomationRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_number_list")

    private List<NameAndValueVo> serviceTypeNumberList = null;

    public CaseAutomationDetailsVo withCaseAutomationRate(String caseAutomationRate) {
        this.caseAutomationRate = caseAutomationRate;
        return this;
    }

    /**
     * 用例自动化率
     * @return caseAutomationRate
     */
    public String getCaseAutomationRate() {
        return caseAutomationRate;
    }

    public void setCaseAutomationRate(String caseAutomationRate) {
        this.caseAutomationRate = caseAutomationRate;
    }

    public CaseAutomationDetailsVo withServiceTypeNumberList(List<NameAndValueVo> serviceTypeNumberList) {
        this.serviceTypeNumberList = serviceTypeNumberList;
        return this;
    }

    public CaseAutomationDetailsVo addServiceTypeNumberListItem(NameAndValueVo serviceTypeNumberListItem) {
        if (this.serviceTypeNumberList == null) {
            this.serviceTypeNumberList = new ArrayList<>();
        }
        this.serviceTypeNumberList.add(serviceTypeNumberListItem);
        return this;
    }

    public CaseAutomationDetailsVo withServiceTypeNumberList(
        Consumer<List<NameAndValueVo>> serviceTypeNumberListSetter) {
        if (this.serviceTypeNumberList == null) {
            this.serviceTypeNumberList = new ArrayList<>();
        }
        serviceTypeNumberListSetter.accept(this.serviceTypeNumberList);
        return this;
    }

    /**
     * 服务类型对应的用例数目
     * @return serviceTypeNumberList
     */
    public List<NameAndValueVo> getServiceTypeNumberList() {
        return serviceTypeNumberList;
    }

    public void setServiceTypeNumberList(List<NameAndValueVo> serviceTypeNumberList) {
        this.serviceTypeNumberList = serviceTypeNumberList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseAutomationDetailsVo that = (CaseAutomationDetailsVo) obj;
        return Objects.equals(this.caseAutomationRate, that.caseAutomationRate)
            && Objects.equals(this.serviceTypeNumberList, that.serviceTypeNumberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseAutomationRate, serviceTypeNumberList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseAutomationDetailsVo {\n");
        sb.append("    caseAutomationRate: ").append(toIndentedString(caseAutomationRate)).append("\n");
        sb.append("    serviceTypeNumberList: ").append(toIndentedString(serviceTypeNumberList)).append("\n");
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
