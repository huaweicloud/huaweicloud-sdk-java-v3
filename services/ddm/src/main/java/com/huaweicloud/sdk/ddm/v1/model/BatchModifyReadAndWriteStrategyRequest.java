package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchModifyReadAndWriteStrategyRequest
 */
public class BatchModifyReadAndWriteStrategyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_weight_list")

    private List<Map<String, Integer>> readWeightList = null;

    public BatchModifyReadAndWriteStrategyRequest withReadWeightList(List<Map<String, Integer>> readWeightList) {
        this.readWeightList = readWeightList;
        return this;
    }

    public BatchModifyReadAndWriteStrategyRequest addReadWeightListItem(Map<String, Integer> readWeightListItem) {
        if (this.readWeightList == null) {
            this.readWeightList = new ArrayList<>();
        }
        this.readWeightList.add(readWeightListItem);
        return this;
    }

    public BatchModifyReadAndWriteStrategyRequest withReadWeightList(
        Consumer<List<Map<String, Integer>>> readWeightListSetter) {
        if (this.readWeightList == null) {
            this.readWeightList = new ArrayList<>();
        }
        readWeightListSetter.accept(this.readWeightList);
        return this;
    }

    /**
     * **参数解释**：  读写策略。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return readWeightList
     */
    public List<Map<String, Integer>> getReadWeightList() {
        return readWeightList;
    }

    public void setReadWeightList(List<Map<String, Integer>> readWeightList) {
        this.readWeightList = readWeightList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchModifyReadAndWriteStrategyRequest that = (BatchModifyReadAndWriteStrategyRequest) obj;
        return Objects.equals(this.readWeightList, that.readWeightList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readWeightList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchModifyReadAndWriteStrategyRequest {\n");
        sb.append("    readWeightList: ").append(toIndentedString(readWeightList)).append("\n");
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
