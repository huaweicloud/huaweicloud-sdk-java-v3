package com.huaweicloud.sdk.ief.v1.model;

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
public class ListRuleErrorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    @JacksonXmlProperty(localName = "errors")

    private List<Error> errors = null;

    public ListRuleErrorsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 满足条件的错误个数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListRuleErrorsResponse withErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    public ListRuleErrorsResponse addErrorsItem(Error errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public ListRuleErrorsResponse withErrors(Consumer<List<Error>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 错误列表
     * @return errors
     */
    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRuleErrorsResponse listRuleErrorsResponse = (ListRuleErrorsResponse) o;
        return Objects.equals(this.count, listRuleErrorsResponse.count)
            && Objects.equals(this.errors, listRuleErrorsResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRuleErrorsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
