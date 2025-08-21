package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowActualHeadPipelineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private PipelineDetailDto data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    public ShowActualHeadPipelineResponse withData(PipelineDetailDto data) {
        this.data = data;
        return this;
    }

    public ShowActualHeadPipelineResponse withData(Consumer<PipelineDetailDto> dataSetter) {
        if (this.data == null) {
            this.data = new PipelineDetailDto();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public PipelineDetailDto getData() {
        return data;
    }

    public void setData(PipelineDetailDto data) {
        this.data = data;
    }

    public ShowActualHeadPipelineResponse withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * 最新的commit是否有对应的流水线
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowActualHeadPipelineResponse that = (ShowActualHeadPipelineResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.isValid, that.isValid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, isValid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowActualHeadPipelineResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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
