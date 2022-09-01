package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation-result")

    @JacksonXmlProperty(localName = "validation-result")

    private List<JobValidationResult> validationResult = null;

    public UpdateJobResponse withValidationResult(List<JobValidationResult> validationResult) {
        this.validationResult = validationResult;
        return this;
    }

    public UpdateJobResponse addValidationResultItem(JobValidationResult validationResultItem) {
        if (this.validationResult == null) {
            this.validationResult = new ArrayList<>();
        }
        this.validationResult.add(validationResultItem);
        return this;
    }

    public UpdateJobResponse withValidationResult(Consumer<List<JobValidationResult>> validationResultSetter) {
        if (this.validationResult == null) {
            this.validationResult = new ArrayList<>();
        }
        validationResultSetter.accept(this.validationResult);
        return this;
    }

    /**
     * 校验结果：如果修改失败，返回失败原因。如果修改成功，返回空列表
     * @return validationResult
     */
    public List<JobValidationResult> getValidationResult() {
        return validationResult;
    }

    public void setValidationResult(List<JobValidationResult> validationResult) {
        this.validationResult = validationResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateJobResponse updateJobResponse = (UpdateJobResponse) o;
        return Objects.equals(this.validationResult, updateJobResponse.validationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validationResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateJobResponse {\n");
        sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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
