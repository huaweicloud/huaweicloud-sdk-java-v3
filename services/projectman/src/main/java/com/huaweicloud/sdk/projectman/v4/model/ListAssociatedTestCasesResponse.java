package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListAssociatedTestCasesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_cases")

    @JacksonXmlProperty(localName = "test_cases")

    private List<AssociatedTestCase> testCases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public ListAssociatedTestCasesResponse withTestCases(List<AssociatedTestCase> testCases) {
        this.testCases = testCases;
        return this;
    }

    public ListAssociatedTestCasesResponse addTestCasesItem(AssociatedTestCase testCasesItem) {
        if (this.testCases == null) {
            this.testCases = new ArrayList<>();
        }
        this.testCases.add(testCasesItem);
        return this;
    }

    public ListAssociatedTestCasesResponse withTestCases(Consumer<List<AssociatedTestCase>> testCasesSetter) {
        if (this.testCases == null) {
            this.testCases = new ArrayList<>();
        }
        testCasesSetter.accept(this.testCases);
        return this;
    }

    /**
     * 关联的测试用例列表
     * @return testCases
     */
    public List<AssociatedTestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<AssociatedTestCase> testCases) {
        this.testCases = testCases;
    }

    public ListAssociatedTestCasesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssociatedTestCasesResponse listAssociatedTestCasesResponse = (ListAssociatedTestCasesResponse) o;
        return Objects.equals(this.testCases, listAssociatedTestCasesResponse.testCases)
            && Objects.equals(this.total, listAssociatedTestCasesResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testCases, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssociatedTestCasesResponse {\n");
        sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
