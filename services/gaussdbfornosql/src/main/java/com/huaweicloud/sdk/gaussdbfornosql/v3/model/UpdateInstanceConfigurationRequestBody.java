package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateInstanceConfigurationRequestBody
 */
public class UpdateInstanceConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private UpdateInstanceConfigurationValuesOption values;

    public UpdateInstanceConfigurationRequestBody withValues(UpdateInstanceConfigurationValuesOption values) {
        this.values = values;
        return this;
    }

    public UpdateInstanceConfigurationRequestBody withValues(
        Consumer<UpdateInstanceConfigurationValuesOption> valuesSetter) {
        if (this.values == null) {
            this.values = new UpdateInstanceConfigurationValuesOption();
            valuesSetter.accept(this.values);
        }

        return this;
    }

    /**
     * Get values
     * @return values
     */
    public UpdateInstanceConfigurationValuesOption getValues() {
        return values;
    }

    public void setValues(UpdateInstanceConfigurationValuesOption values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceConfigurationRequestBody updateInstanceConfigurationRequestBody =
            (UpdateInstanceConfigurationRequestBody) o;
        return Objects.equals(this.values, updateInstanceConfigurationRequestBody.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceConfigurationRequestBody {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
