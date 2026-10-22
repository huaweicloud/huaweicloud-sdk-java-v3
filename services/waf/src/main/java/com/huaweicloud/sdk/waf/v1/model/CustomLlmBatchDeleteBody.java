package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomLlmBatchDeleteBody
 */
public class CustomLlmBatchDeleteBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_ids")

    private List<String> llmIds = null;

    public CustomLlmBatchDeleteBody withLlmIds(List<String> llmIds) {
        this.llmIds = llmIds;
        return this;
    }

    public CustomLlmBatchDeleteBody addLlmIdsItem(String llmIdsItem) {
        if (this.llmIds == null) {
            this.llmIds = new ArrayList<>();
        }
        this.llmIds.add(llmIdsItem);
        return this;
    }

    public CustomLlmBatchDeleteBody withLlmIds(Consumer<List<String>> llmIdsSetter) {
        if (this.llmIds == null) {
            this.llmIds = new ArrayList<>();
        }
        llmIdsSetter.accept(this.llmIds);
        return this;
    }

    /**
     * 自定义大模型ID列表
     * @return llmIds
     */
    public List<String> getLlmIds() {
        return llmIds;
    }

    public void setLlmIds(List<String> llmIds) {
        this.llmIds = llmIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomLlmBatchDeleteBody that = (CustomLlmBatchDeleteBody) obj;
        return Objects.equals(this.llmIds, that.llmIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(llmIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLlmBatchDeleteBody {\n");
        sb.append("    llmIds: ").append(toIndentedString(llmIds)).append("\n");
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
