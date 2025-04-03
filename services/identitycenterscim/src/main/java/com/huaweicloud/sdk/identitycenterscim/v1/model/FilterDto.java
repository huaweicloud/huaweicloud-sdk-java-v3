package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FilterDto
 */
public class FilterDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported")

    private Boolean supported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxResults")

    private Integer maxResults;

    public FilterDto withSupported(Boolean supported) {
        this.supported = supported;
        return this;
    }

    /**
     * 一个布尔值，表示服务提供商是否支持这种操作
     * @return supported
     */
    public Boolean getSupported() {
        return supported;
    }

    public void setSupported(Boolean supported) {
        this.supported = supported;
    }

    public FilterDto withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * 最大结果数
     * @return maxResults
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FilterDto that = (FilterDto) obj;
        return Objects.equals(this.supported, that.supported) && Objects.equals(this.maxResults, that.maxResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supported, maxResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterDto {\n");
        sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
        sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
