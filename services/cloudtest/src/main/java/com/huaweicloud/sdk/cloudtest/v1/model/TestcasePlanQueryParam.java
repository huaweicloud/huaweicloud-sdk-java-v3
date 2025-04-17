package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TestcasePlanQueryParam
 */
public class TestcasePlanQueryParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_uri_list")

    private List<String> caseUriList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_number_list")

    private List<String> caseNumberList = null;

    public TestcasePlanQueryParam withCaseUriList(List<String> caseUriList) {
        this.caseUriList = caseUriList;
        return this;
    }

    public TestcasePlanQueryParam addCaseUriListItem(String caseUriListItem) {
        if (this.caseUriList == null) {
            this.caseUriList = new ArrayList<>();
        }
        this.caseUriList.add(caseUriListItem);
        return this;
    }

    public TestcasePlanQueryParam withCaseUriList(Consumer<List<String>> caseUriListSetter) {
        if (this.caseUriList == null) {
            this.caseUriList = new ArrayList<>();
        }
        caseUriListSetter.accept(this.caseUriList);
        return this;
    }

    /**
     * 测试用例URI列表（测试用例URI和编号填其中一个即可）
     * @return caseUriList
     */
    public List<String> getCaseUriList() {
        return caseUriList;
    }

    public void setCaseUriList(List<String> caseUriList) {
        this.caseUriList = caseUriList;
    }

    public TestcasePlanQueryParam withCaseNumberList(List<String> caseNumberList) {
        this.caseNumberList = caseNumberList;
        return this;
    }

    public TestcasePlanQueryParam addCaseNumberListItem(String caseNumberListItem) {
        if (this.caseNumberList == null) {
            this.caseNumberList = new ArrayList<>();
        }
        this.caseNumberList.add(caseNumberListItem);
        return this;
    }

    public TestcasePlanQueryParam withCaseNumberList(Consumer<List<String>> caseNumberListSetter) {
        if (this.caseNumberList == null) {
            this.caseNumberList = new ArrayList<>();
        }
        caseNumberListSetter.accept(this.caseNumberList);
        return this;
    }

    /**
     * 测试用例编号列表（测试用例URI和编号填其中一个即可
     * @return caseNumberList
     */
    public List<String> getCaseNumberList() {
        return caseNumberList;
    }

    public void setCaseNumberList(List<String> caseNumberList) {
        this.caseNumberList = caseNumberList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestcasePlanQueryParam that = (TestcasePlanQueryParam) obj;
        return Objects.equals(this.caseUriList, that.caseUriList)
            && Objects.equals(this.caseNumberList, that.caseNumberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseUriList, caseNumberList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestcasePlanQueryParam {\n");
        sb.append("    caseUriList: ").append(toIndentedString(caseUriList)).append("\n");
        sb.append("    caseNumberList: ").append(toIndentedString(caseNumberList)).append("\n");
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
