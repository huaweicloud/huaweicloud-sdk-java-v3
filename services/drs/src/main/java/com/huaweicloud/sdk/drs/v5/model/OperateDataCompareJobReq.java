package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作对比任务请求体
 */
public class OperateDataCompareJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_job_ids")

    private List<String> compareJobIds = null;

    public OperateDataCompareJobReq withCompareJobIds(List<String> compareJobIds) {
        this.compareJobIds = compareJobIds;
        return this;
    }

    public OperateDataCompareJobReq addCompareJobIdsItem(String compareJobIdsItem) {
        if (this.compareJobIds == null) {
            this.compareJobIds = new ArrayList<>();
        }
        this.compareJobIds.add(compareJobIdsItem);
        return this;
    }

    public OperateDataCompareJobReq withCompareJobIds(Consumer<List<String>> compareJobIdsSetter) {
        if (this.compareJobIds == null) {
            this.compareJobIds = new ArrayList<>();
        }
        compareJobIdsSetter.accept(this.compareJobIds);
        return this;
    }

    /**
     * 操作的对比任务ID列表。
     * @return compareJobIds
     */
    public List<String> getCompareJobIds() {
        return compareJobIds;
    }

    public void setCompareJobIds(List<String> compareJobIds) {
        this.compareJobIds = compareJobIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateDataCompareJobReq that = (OperateDataCompareJobReq) obj;
        return Objects.equals(this.compareJobIds, that.compareJobIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareJobIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateDataCompareJobReq {\n");
        sb.append("    compareJobIds: ").append(toIndentedString(compareJobIds)).append("\n");
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
