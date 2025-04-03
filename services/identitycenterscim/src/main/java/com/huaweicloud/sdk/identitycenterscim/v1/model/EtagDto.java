package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EtagDto
 */
public class EtagDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported")

    private Boolean supported;

    public EtagDto withSupported(Boolean supported) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EtagDto that = (EtagDto) obj;
        return Objects.equals(this.supported, that.supported);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supported);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EtagDto {\n");
        sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
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
