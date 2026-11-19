package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowVulIndividualStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_types")

    private List<String> statisticsTypes = null;

    public ShowVulIndividualStatisticsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowVulIndividualStatisticsRequest withStatisticsTypes(List<String> statisticsTypes) {
        this.statisticsTypes = statisticsTypes;
        return this;
    }

    public ShowVulIndividualStatisticsRequest addStatisticsTypesItem(String statisticsTypesItem) {
        if (this.statisticsTypes == null) {
            this.statisticsTypes = new ArrayList<>();
        }
        this.statisticsTypes.add(statisticsTypesItem);
        return this;
    }

    public ShowVulIndividualStatisticsRequest withStatisticsTypes(Consumer<List<String>> statisticsTypesSetter) {
        if (this.statisticsTypes == null) {
            this.statisticsTypes = new ArrayList<>();
        }
        statisticsTypesSetter.accept(this.statisticsTypes);
        return this;
    }

    /**
     * **参数解释**: 需要查询的漏洞统计数据类型列表，多个类型以逗号分隔。 **约束限制**: 必填 **取值范围**: - need_urgent_repair_num：需要紧急修复的漏洞数量 - unhandled_num：未完成修复的漏洞数量 - existed_vul_host_num：存在漏洞的服务器数量 - today_handled_num：今日处理的漏洞数量 - all_handled_num：累计处理的漏洞数量 - vul_library_info：漏洞库统计数据 - linux_vul_unhandled_num：未处置的Linux漏洞数量 - windows_vul_unhandled_num：未处置的Windows漏洞数量 - web_cms_vul_unhandled_num：未处置的Web CMS漏洞数量 - app_vul_unhandled_num：未处置的应用漏洞数量 - urgent_vul_unhandled_num：未处置的应急漏洞数量 - max_vul_handle_num：单次最大可处置的漏洞数量  **默认取值**: 不涉及 
     * @return statisticsTypes
     */
    public List<String> getStatisticsTypes() {
        return statisticsTypes;
    }

    public void setStatisticsTypes(List<String> statisticsTypes) {
        this.statisticsTypes = statisticsTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulIndividualStatisticsRequest that = (ShowVulIndividualStatisticsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.statisticsTypes, that.statisticsTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, statisticsTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulIndividualStatisticsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    statisticsTypes: ").append(toIndentedString(statisticsTypes)).append("\n");
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
