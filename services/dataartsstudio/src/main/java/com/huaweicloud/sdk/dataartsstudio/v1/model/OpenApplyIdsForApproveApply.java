package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpenApplyIdsForApproveApply
 */
public class OpenApplyIdsForApproveApply {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_result")

    private Boolean applyResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_ids")

    private List<String> applyIds = null;

    public OpenApplyIdsForApproveApply withApplyResult(Boolean applyResult) {
        this.applyResult = applyResult;
        return this;
    }

    /**
     * 申请结果
     * @return applyResult
     */
    public Boolean getApplyResult() {
        return applyResult;
    }

    public void setApplyResult(Boolean applyResult) {
        this.applyResult = applyResult;
    }

    public OpenApplyIdsForApproveApply withApplyIds(List<String> applyIds) {
        this.applyIds = applyIds;
        return this;
    }

    public OpenApplyIdsForApproveApply addApplyIdsItem(String applyIdsItem) {
        if (this.applyIds == null) {
            this.applyIds = new ArrayList<>();
        }
        this.applyIds.add(applyIdsItem);
        return this;
    }

    public OpenApplyIdsForApproveApply withApplyIds(Consumer<List<String>> applyIdsSetter) {
        if (this.applyIds == null) {
            this.applyIds = new ArrayList<>();
        }
        applyIdsSetter.accept(this.applyIds);
        return this;
    }

    /**
     * 申请编号列表
     * @return applyIds
     */
    public List<String> getApplyIds() {
        return applyIds;
    }

    public void setApplyIds(List<String> applyIds) {
        this.applyIds = applyIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenApplyIdsForApproveApply openApplyIdsForApproveApply = (OpenApplyIdsForApproveApply) o;
        return Objects.equals(this.applyResult, openApplyIdsForApproveApply.applyResult)
            && Objects.equals(this.applyIds, openApplyIdsForApproveApply.applyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyResult, applyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenApplyIdsForApproveApply {\n");
        sb.append("    applyResult: ").append(toIndentedString(applyResult)).append("\n");
        sb.append("    applyIds: ").append(toIndentedString(applyIds)).append("\n");
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
