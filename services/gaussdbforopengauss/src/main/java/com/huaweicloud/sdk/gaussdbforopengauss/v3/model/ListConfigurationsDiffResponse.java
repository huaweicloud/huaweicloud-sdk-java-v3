package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListConfigurationsDiffResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "differences")

    private List<ListDiffDetailsResult> differences = null;

    public ListConfigurationsDiffResponse withDifferences(List<ListDiffDetailsResult> differences) {
        this.differences = differences;
        return this;
    }

    public ListConfigurationsDiffResponse addDifferencesItem(ListDiffDetailsResult differencesItem) {
        if (this.differences == null) {
            this.differences = new ArrayList<>();
        }
        this.differences.add(differencesItem);
        return this;
    }

    public ListConfigurationsDiffResponse withDifferences(Consumer<List<ListDiffDetailsResult>> differencesSetter) {
        if (this.differences == null) {
            this.differences = new ArrayList<>();
        }
        differencesSetter.accept(this.differences);
        return this;
    }

    /**
     * 参数组之间的差异集合。
     * @return differences
     */
    public List<ListDiffDetailsResult> getDifferences() {
        return differences;
    }

    public void setDifferences(List<ListDiffDetailsResult> differences) {
        this.differences = differences;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConfigurationsDiffResponse that = (ListConfigurationsDiffResponse) obj;
        return Objects.equals(this.differences, that.differences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(differences);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigurationsDiffResponse {\n");
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
