package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class RequirementsOverviewVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    private Integer totalNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requirement_overview_list")

    private List<RequirementOverviewVo> requirementOverviewList = null;

    public RequirementsOverviewVo withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * 质量报告需求测试情况总数
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public RequirementsOverviewVo withRequirementOverviewList(List<RequirementOverviewVo> requirementOverviewList) {
        this.requirementOverviewList = requirementOverviewList;
        return this;
    }

    public RequirementsOverviewVo addRequirementOverviewListItem(RequirementOverviewVo requirementOverviewListItem) {
        if (this.requirementOverviewList == null) {
            this.requirementOverviewList = new ArrayList<>();
        }
        this.requirementOverviewList.add(requirementOverviewListItem);
        return this;
    }

    public RequirementsOverviewVo withRequirementOverviewList(
        Consumer<List<RequirementOverviewVo>> requirementOverviewListSetter) {
        if (this.requirementOverviewList == null) {
            this.requirementOverviewList = new ArrayList<>();
        }
        requirementOverviewListSetter.accept(this.requirementOverviewList);
        return this;
    }

    /**
     * 质量报告需求测试情况列表
     * @return requirementOverviewList
     */
    public List<RequirementOverviewVo> getRequirementOverviewList() {
        return requirementOverviewList;
    }

    public void setRequirementOverviewList(List<RequirementOverviewVo> requirementOverviewList) {
        this.requirementOverviewList = requirementOverviewList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequirementsOverviewVo that = (RequirementsOverviewVo) obj;
        return Objects.equals(this.totalNumber, that.totalNumber)
            && Objects.equals(this.requirementOverviewList, that.requirementOverviewList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, requirementOverviewList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequirementsOverviewVo {\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    requirementOverviewList: ").append(toIndentedString(requirementOverviewList)).append("\n");
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
