package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListDrugModelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<ModelDto> models = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListDrugModelResponse withModels(List<ModelDto> models) {
        this.models = models;
        return this;
    }

    public ListDrugModelResponse addModelsItem(ModelDto modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public ListDrugModelResponse withModels(Consumer<List<ModelDto>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 模型列表
     * @return models
     */
    public List<ModelDto> getModels() {
        return models;
    }

    public void setModels(List<ModelDto> models) {
        this.models = models;
    }

    public ListDrugModelResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 模型总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDrugModelResponse that = (ListDrugModelResponse) obj;
        return Objects.equals(this.models, that.models) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(models, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDrugModelResponse {\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
