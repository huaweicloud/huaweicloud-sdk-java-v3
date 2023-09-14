package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CorsConfig
 */
public class CorsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cors")

    private Boolean isCors;

    public CorsConfig withIsCors(Boolean isCors) {
        this.isCors = isCors;
        return this;
    }

    /**
     * 是否支持跨域
     * @return isCors
     */
    public Boolean getIsCors() {
        return isCors;
    }

    public void setIsCors(Boolean isCors) {
        this.isCors = isCors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CorsConfig that = (CorsConfig) obj;
        return Objects.equals(this.isCors, that.isCors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorsConfig {\n");
        sb.append("    isCors: ").append(toIndentedString(isCors)).append("\n");
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
