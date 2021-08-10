package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListRelationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_relation_list")

    private List<CaseRealtionInfo> caseRelationList = null;

    public ListRelationResponse withCaseRelationList(List<CaseRealtionInfo> caseRelationList) {
        this.caseRelationList = caseRelationList;
        return this;
    }

    public ListRelationResponse addCaseRelationListItem(CaseRealtionInfo caseRelationListItem) {
        if (this.caseRelationList == null) {
            this.caseRelationList = new ArrayList<>();
        }
        this.caseRelationList.add(caseRelationListItem);
        return this;
    }

    public ListRelationResponse withCaseRelationList(Consumer<List<CaseRealtionInfo>> caseRelationListSetter) {
        if (this.caseRelationList == null) {
            this.caseRelationList = new ArrayList<>();
        }
        caseRelationListSetter.accept(this.caseRelationList);
        return this;
    }

    /** 关联工单列表
     * 
     * @return caseRelationList */
    public List<CaseRealtionInfo> getCaseRelationList() {
        return caseRelationList;
    }

    public void setCaseRelationList(List<CaseRealtionInfo> caseRelationList) {
        this.caseRelationList = caseRelationList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRelationResponse listRelationResponse = (ListRelationResponse) o;
        return Objects.equals(this.caseRelationList, listRelationResponse.caseRelationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseRelationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationResponse {\n");
        sb.append("    caseRelationList: ").append(toIndentedString(caseRelationList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
