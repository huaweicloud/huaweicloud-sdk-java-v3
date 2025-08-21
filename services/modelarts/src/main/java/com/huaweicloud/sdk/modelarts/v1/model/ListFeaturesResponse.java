package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListFeaturesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private List<Feature> configs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListFeaturesResponse withConfigs(List<Feature> configs) {
        this.configs = configs;
        return this;
    }

    public ListFeaturesResponse addConfigsItem(Feature configsItem) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    public ListFeaturesResponse withConfigs(Consumer<List<Feature>> configsSetter) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * **参数解释**：配置列表。 
     * @return configs
     */
    public List<Feature> getConfigs() {
        return configs;
    }

    public void setConfigs(List<Feature> configs) {
        this.configs = configs;
    }

    public ListFeaturesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：配置项总数。 **取值范围**：[0,2147483647]。 
     * minimum: 0
     * maximum: 2147483647
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
        ListFeaturesResponse that = (ListFeaturesResponse) obj;
        return Objects.equals(this.configs, that.configs) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFeaturesResponse {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
