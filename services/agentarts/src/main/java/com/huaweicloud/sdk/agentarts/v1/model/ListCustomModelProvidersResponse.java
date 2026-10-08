package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListCustomModelProvidersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_providers")

    private List<CreateCustomModelProviderResponseBody> modelProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListCustomModelProvidersResponse withModelProviders(
        List<CreateCustomModelProviderResponseBody> modelProviders) {
        this.modelProviders = modelProviders;
        return this;
    }

    public ListCustomModelProvidersResponse addModelProvidersItem(
        CreateCustomModelProviderResponseBody modelProvidersItem) {
        if (this.modelProviders == null) {
            this.modelProviders = new ArrayList<>();
        }
        this.modelProviders.add(modelProvidersItem);
        return this;
    }

    public ListCustomModelProvidersResponse withModelProviders(
        Consumer<List<CreateCustomModelProviderResponseBody>> modelProvidersSetter) {
        if (this.modelProviders == null) {
            this.modelProviders = new ArrayList<>();
        }
        modelProvidersSetter.accept(this.modelProviders);
        return this;
    }

    /**
     * **参数解释：** 模型提供商列表。 **取值范围：** 数组长度为 0-100。 
     * @return modelProviders
     */
    public List<CreateCustomModelProviderResponseBody> getModelProviders() {
        return modelProviders;
    }

    public void setModelProviders(List<CreateCustomModelProviderResponseBody> modelProviders) {
        this.modelProviders = modelProviders;
    }

    public ListCustomModelProvidersResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 当前页返回的模型配置数量。 **取值范围：** 取值 0-100。 
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListCustomModelProvidersResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 模型配置总数。 **取值范围：** 取值 0-1000000。 
     * minimum: 0
     * maximum: 1000000
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
        ListCustomModelProvidersResponse that = (ListCustomModelProvidersResponse) obj;
        return Objects.equals(this.modelProviders, that.modelProviders) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelProviders, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomModelProvidersResponse {\n");
        sb.append("    modelProviders: ").append(toIndentedString(modelProviders)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
