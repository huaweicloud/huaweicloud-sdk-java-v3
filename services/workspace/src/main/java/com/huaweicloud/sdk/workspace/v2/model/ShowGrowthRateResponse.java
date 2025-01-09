package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowGrowthRateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "growth_rate")

    private Double growthRate;

    public ShowGrowthRateResponse withGrowthRate(Double growthRate) {
        this.growthRate = growthRate;
        return this;
    }

    /**
     * 环比值
     * @return growthRate
     */
    public Double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(Double growthRate) {
        this.growthRate = growthRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGrowthRateResponse that = (ShowGrowthRateResponse) obj;
        return Objects.equals(this.growthRate, that.growthRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(growthRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGrowthRateResponse {\n");
        sb.append("    growthRate: ").append(toIndentedString(growthRate)).append("\n");
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
