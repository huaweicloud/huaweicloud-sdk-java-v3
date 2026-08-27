package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchCreateModelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_models")

    private List<ModelItemResp> createdModels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public BatchCreateModelResponse withCreatedModels(List<ModelItemResp> createdModels) {
        this.createdModels = createdModels;
        return this;
    }

    public BatchCreateModelResponse addCreatedModelsItem(ModelItemResp createdModelsItem) {
        if (this.createdModels == null) {
            this.createdModels = new ArrayList<>();
        }
        this.createdModels.add(createdModelsItem);
        return this;
    }

    public BatchCreateModelResponse withCreatedModels(Consumer<List<ModelItemResp>> createdModelsSetter) {
        if (this.createdModels == null) {
            this.createdModels = new ArrayList<>();
        }
        createdModelsSetter.accept(this.createdModels);
        return this;
    }

    /**
     * 已创建的模型列表。
     * @return createdModels
     */
    public List<ModelItemResp> getCreatedModels() {
        return createdModels;
    }

    public void setCreatedModels(List<ModelItemResp> createdModels) {
        this.createdModels = createdModels;
    }

    public BatchCreateModelResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 创建总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateModelResponse that = (BatchCreateModelResponse) obj;
        return Objects.equals(this.createdModels, that.createdModels) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdModels, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateModelResponse {\n");
        sb.append("    createdModels: ").append(toIndentedString(createdModels)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
