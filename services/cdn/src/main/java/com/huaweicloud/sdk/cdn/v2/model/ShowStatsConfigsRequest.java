package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowStatsConfigsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_type")

    private Integer configType;

    public ShowStatsConfigsRequest withConfigType(Integer configType) {
        this.configType = configType;
        return this;
    }

    /**
     * - 配置类型 - 目前支持0：热点统计，1：ces上报
     * @return configType
     */
    public Integer getConfigType() {
        return configType;
    }

    public void setConfigType(Integer configType) {
        this.configType = configType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatsConfigsRequest that = (ShowStatsConfigsRequest) obj;
        return Objects.equals(this.configType, that.configType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatsConfigsRequest {\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
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
