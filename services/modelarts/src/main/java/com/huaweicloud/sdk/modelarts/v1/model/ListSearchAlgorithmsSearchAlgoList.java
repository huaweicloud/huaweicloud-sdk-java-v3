package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSearchAlgorithmsSearchAlgoList
 */
public class ListSearchAlgorithmsSearchAlgoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<ListSearchAlgorithmsParams> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ListSearchAlgorithmsSearchAlgoList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 超参搜索算法的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSearchAlgorithmsSearchAlgoList withParams(List<ListSearchAlgorithmsParams> params) {
        this.params = params;
        return this;
    }

    public ListSearchAlgorithmsSearchAlgoList addParamsItem(ListSearchAlgorithmsParams paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ListSearchAlgorithmsSearchAlgoList withParams(Consumer<List<ListSearchAlgorithmsParams>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 超参搜索算法的参数列表。
     * @return params
     */
    public List<ListSearchAlgorithmsParams> getParams() {
        return params;
    }

    public void setParams(List<ListSearchAlgorithmsParams> params) {
        this.params = params;
    }

    public ListSearchAlgorithmsSearchAlgoList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 超参搜索算法的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSearchAlgorithmsSearchAlgoList that = (ListSearchAlgorithmsSearchAlgoList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.params, that.params)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, params, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSearchAlgorithmsSearchAlgoList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
