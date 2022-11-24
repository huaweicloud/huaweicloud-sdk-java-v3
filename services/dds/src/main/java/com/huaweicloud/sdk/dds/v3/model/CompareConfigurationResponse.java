package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CompareConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "differences")

    private List<DiffDetails> differences = null;

    public CompareConfigurationResponse withDifferences(List<DiffDetails> differences) {
        this.differences = differences;
        return this;
    }

    public CompareConfigurationResponse addDifferencesItem(DiffDetails differencesItem) {
        if (this.differences == null) {
            this.differences = new ArrayList<>();
        }
        this.differences.add(differencesItem);
        return this;
    }

    public CompareConfigurationResponse withDifferences(Consumer<List<DiffDetails>> differencesSetter) {
        if (this.differences == null) {
            this.differences = new ArrayList<>();
        }
        differencesSetter.accept(this.differences);
        return this;
    }

    /**
     * 参数模板之间的区别集合。
     * @return differences
     */
    public List<DiffDetails> getDifferences() {
        return differences;
    }

    public void setDifferences(List<DiffDetails> differences) {
        this.differences = differences;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareConfigurationResponse compareConfigurationResponse = (CompareConfigurationResponse) o;
        return Objects.equals(this.differences, compareConfigurationResponse.differences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(differences);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareConfigurationResponse {\n");
        sb.append("    differences: ").append(toIndentedString(differences)).append("\n");
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
