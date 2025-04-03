package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BulkDto
 */
public class BulkDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported")

    private Boolean supported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxOperations")

    private Integer maxOperations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPayloadSize")

    private Integer maxPayloadSize;

    public BulkDto withSupported(Boolean supported) {
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

    public BulkDto withMaxOperations(Integer maxOperations) {
        this.maxOperations = maxOperations;
        return this;
    }

    /**
     * 一次可操作的最大个数
     * @return maxOperations
     */
    public Integer getMaxOperations() {
        return maxOperations;
    }

    public void setMaxOperations(Integer maxOperations) {
        this.maxOperations = maxOperations;
    }

    public BulkDto withMaxPayloadSize(Integer maxPayloadSize) {
        this.maxPayloadSize = maxPayloadSize;
        return this;
    }

    /**
     * 最大有效载荷量
     * @return maxPayloadSize
     */
    public Integer getMaxPayloadSize() {
        return maxPayloadSize;
    }

    public void setMaxPayloadSize(Integer maxPayloadSize) {
        this.maxPayloadSize = maxPayloadSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BulkDto that = (BulkDto) obj;
        return Objects.equals(this.supported, that.supported) && Objects.equals(this.maxOperations, that.maxOperations)
            && Objects.equals(this.maxPayloadSize, that.maxPayloadSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supported, maxOperations, maxPayloadSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkDto {\n");
        sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
        sb.append("    maxOperations: ").append(toIndentedString(maxOperations)).append("\n");
        sb.append("    maxPayloadSize: ").append(toIndentedString(maxPayloadSize)).append("\n");
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
