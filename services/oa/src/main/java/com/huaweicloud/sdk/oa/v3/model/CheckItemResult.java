package com.huaweicloud.sdk.oa.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckItemResult
 */
public class CheckItemResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_result_summary")

    private CheckItemResultSummary checkItemResultSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resource> resources = null;

    public CheckItemResult withCheckItemResultSummary(CheckItemResultSummary checkItemResultSummary) {
        this.checkItemResultSummary = checkItemResultSummary;
        return this;
    }

    public CheckItemResult withCheckItemResultSummary(Consumer<CheckItemResultSummary> checkItemResultSummarySetter) {
        if (this.checkItemResultSummary == null) {
            this.checkItemResultSummary = new CheckItemResultSummary();
            checkItemResultSummarySetter.accept(this.checkItemResultSummary);
        }

        return this;
    }

    /**
     * Get checkItemResultSummary
     * @return checkItemResultSummary
     */
    public CheckItemResultSummary getCheckItemResultSummary() {
        return checkItemResultSummary;
    }

    public void setCheckItemResultSummary(CheckItemResultSummary checkItemResultSummary) {
        this.checkItemResultSummary = checkItemResultSummary;
    }

    public CheckItemResult withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 检查详情
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public CheckItemResult withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public CheckItemResult addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CheckItemResult withResources(Consumer<List<Resource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 检查项结果风险资源列表
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckItemResult that = (CheckItemResult) obj;
        return Objects.equals(this.checkItemResultSummary, that.checkItemResultSummary)
            && Objects.equals(this.detail, that.detail) && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkItemResultSummary, detail, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckItemResult {\n");
        sb.append("    checkItemResultSummary: ").append(toIndentedString(checkItemResultSummary)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
