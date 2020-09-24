package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.CaseRealtionInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRelationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_realtion_list")
    
    private List<CaseRealtionInfo> caseRealtionList = null;
    
    public ListRelationResponse withCaseRealtionList(List<CaseRealtionInfo> caseRealtionList) {
        this.caseRealtionList = caseRealtionList;
        return this;
    }

    
    public ListRelationResponse addCaseRealtionListItem(CaseRealtionInfo caseRealtionListItem) {
        if (this.caseRealtionList == null) {
            this.caseRealtionList = new ArrayList<>();
        }
        this.caseRealtionList.add(caseRealtionListItem);
        return this;
    }

    public ListRelationResponse withCaseRealtionList(Consumer<List<CaseRealtionInfo>> caseRealtionListSetter) {
        if(this.caseRealtionList == null ){
            this.caseRealtionList = new ArrayList<>();
        }
        caseRealtionListSetter.accept(this.caseRealtionList);
        return this;
    }

    /**
     * 关联工单列表
     * @return caseRealtionList
     */
    public List<CaseRealtionInfo> getCaseRealtionList() {
        return caseRealtionList;
    }

    public void setCaseRealtionList(List<CaseRealtionInfo> caseRealtionList) {
        this.caseRealtionList = caseRealtionList;
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
        return Objects.equals(this.caseRealtionList, listRelationResponse.caseRealtionList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(caseRealtionList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationResponse {\n");
        sb.append("    caseRealtionList: ").append(toIndentedString(caseRealtionList)).append("\n");
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

