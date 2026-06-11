package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs
 */
public class JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<AutoSearchAlgoConfigParameter> params = null;

    public JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 搜索算法名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs withParams(List<AutoSearchAlgoConfigParameter> params) {
        this.params = params;
        return this;
    }

    public JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs addParamsItem(AutoSearchAlgoConfigParameter paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs withParams(
        Consumer<List<AutoSearchAlgoConfigParameter>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 搜索算法参数。
     * @return params
     */
    public List<AutoSearchAlgoConfigParameter> getParams() {
        return params;
    }

    public void setParams(List<AutoSearchAlgoConfigParameter> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs that =
            (JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
