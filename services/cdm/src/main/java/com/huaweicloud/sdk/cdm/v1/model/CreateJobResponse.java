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
public class CreateJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation-result")

    @JacksonXmlProperty(localName = "validation-result")

    private List<JobValidationResult> validationResult = null;

    public CreateJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateJobResponse withValidationResult(List<JobValidationResult> validationResult) {
        this.validationResult = validationResult;
        return this;
    }

    public CreateJobResponse addValidationResultItem(JobValidationResult validationResultItem) {
        if (this.validationResult == null) {
            this.validationResult = new ArrayList<>();
        }
        this.validationResult.add(validationResultItem);
        return this;
    }

    public CreateJobResponse withValidationResult(Consumer<List<JobValidationResult>> validationResultSetter) {
        if (this.validationResult == null) {
            this.validationResult = new ArrayList<>();
        }
        validationResultSetter.accept(this.validationResult);
        return this;
    }

    /**
     * 校验结果： - 如果修改失败，返回失败原因。 - 如果修改成功，返回空列表。
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
        CreateJobResponse createJobResponse = (CreateJobResponse) o;
        return Objects.equals(this.name, createJobResponse.name)
            && Objects.equals(this.validationResult, createJobResponse.validationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, validationResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateJobResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
