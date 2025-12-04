package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateNatGatewayToPeriodRequestBody
 */
public class UpdateNatGatewayToPeriodRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_options")

    private PrepaidOptions prepaidOptions;

    public UpdateNatGatewayToPeriodRequestBody withPrepaidOptions(PrepaidOptions prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
        return this;
    }

    public UpdateNatGatewayToPeriodRequestBody withPrepaidOptions(Consumer<PrepaidOptions> prepaidOptionsSetter) {
        if (this.prepaidOptions == null) {
            this.prepaidOptions = new PrepaidOptions();
            prepaidOptionsSetter.accept(this.prepaidOptions);
        }

        return this;
    }

    /**
     * Get prepaidOptions
     * @return prepaidOptions
     */
    public PrepaidOptions getPrepaidOptions() {
        return prepaidOptions;
    }

    public void setPrepaidOptions(PrepaidOptions prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNatGatewayToPeriodRequestBody that = (UpdateNatGatewayToPeriodRequestBody) obj;
        return Objects.equals(this.prepaidOptions, that.prepaidOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prepaidOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayToPeriodRequestBody {\n");
        sb.append("    prepaidOptions: ").append(toIndentedString(prepaidOptions)).append("\n");
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
