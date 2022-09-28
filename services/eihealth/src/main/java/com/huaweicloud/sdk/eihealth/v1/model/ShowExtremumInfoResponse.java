package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowExtremumInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum")

    private ExtremumDto maximum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum")

    private ExtremumDto minimum;

    public ShowExtremumInfoResponse withMaximum(ExtremumDto maximum) {
        this.maximum = maximum;
        return this;
    }

    public ShowExtremumInfoResponse withMaximum(Consumer<ExtremumDto> maximumSetter) {
        if (this.maximum == null) {
            this.maximum = new ExtremumDto();
            maximumSetter.accept(this.maximum);
        }

        return this;
    }

    /**
     * Get maximum
     * @return maximum
     */
    public ExtremumDto getMaximum() {
        return maximum;
    }

    public void setMaximum(ExtremumDto maximum) {
        this.maximum = maximum;
    }

    public ShowExtremumInfoResponse withMinimum(ExtremumDto minimum) {
        this.minimum = minimum;
        return this;
    }

    public ShowExtremumInfoResponse withMinimum(Consumer<ExtremumDto> minimumSetter) {
        if (this.minimum == null) {
            this.minimum = new ExtremumDto();
            minimumSetter.accept(this.minimum);
        }

        return this;
    }

    /**
     * Get minimum
     * @return minimum
     */
    public ExtremumDto getMinimum() {
        return minimum;
    }

    public void setMinimum(ExtremumDto minimum) {
        this.minimum = minimum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowExtremumInfoResponse showExtremumInfoResponse = (ShowExtremumInfoResponse) o;
        return Objects.equals(this.maximum, showExtremumInfoResponse.maximum)
            && Objects.equals(this.minimum, showExtremumInfoResponse.minimum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximum, minimum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExtremumInfoResponse {\n");
        sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
        sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
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
