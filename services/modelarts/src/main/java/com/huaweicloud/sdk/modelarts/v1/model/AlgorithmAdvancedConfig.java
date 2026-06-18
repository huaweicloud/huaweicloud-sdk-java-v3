package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算法高级策略：  - auto_search
 */
public class AlgorithmAdvancedConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_search")

    private AutoSearch autoSearch;

    public AlgorithmAdvancedConfig withAutoSearch(AutoSearch autoSearch) {
        this.autoSearch = autoSearch;
        return this;
    }

    public AlgorithmAdvancedConfig withAutoSearch(Consumer<AutoSearch> autoSearchSetter) {
        if (this.autoSearch == null) {
            this.autoSearch = new AutoSearch();
            autoSearchSetter.accept(this.autoSearch);
        }

        return this;
    }

    /**
     * Get autoSearch
     * @return autoSearch
     */
    public AutoSearch getAutoSearch() {
        return autoSearch;
    }

    public void setAutoSearch(AutoSearch autoSearch) {
        this.autoSearch = autoSearch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmAdvancedConfig that = (AlgorithmAdvancedConfig) obj;
        return Objects.equals(this.autoSearch, that.autoSearch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoSearch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmAdvancedConfig {\n");
        sb.append("    autoSearch: ").append(toIndentedString(autoSearch)).append("\n");
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
