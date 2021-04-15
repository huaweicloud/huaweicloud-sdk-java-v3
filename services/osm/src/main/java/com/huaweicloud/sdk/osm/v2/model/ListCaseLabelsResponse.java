package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.CaseLabelInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCaseLabelsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_label_list")
    
    private List<CaseLabelInfo> caseLabelList = null;
    
    public ListCaseLabelsResponse withCaseLabelList(List<CaseLabelInfo> caseLabelList) {
        this.caseLabelList = caseLabelList;
        return this;
    }

    
    public ListCaseLabelsResponse addCaseLabelListItem(CaseLabelInfo caseLabelListItem) {
        if(this.caseLabelList == null) {
            this.caseLabelList = new ArrayList<>();
        }
        this.caseLabelList.add(caseLabelListItem);
        return this;
    }

    public ListCaseLabelsResponse withCaseLabelList(Consumer<List<CaseLabelInfo>> caseLabelListSetter) {
        if(this.caseLabelList == null) {
            this.caseLabelList = new ArrayList<>();
        }
        caseLabelListSetter.accept(this.caseLabelList);
        return this;
    }

    /**
     * 工单关联的标签列表
     * @return caseLabelList
     */
    public List<CaseLabelInfo> getCaseLabelList() {
        return caseLabelList;
    }

    public void setCaseLabelList(List<CaseLabelInfo> caseLabelList) {
        this.caseLabelList = caseLabelList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCaseLabelsResponse listCaseLabelsResponse = (ListCaseLabelsResponse) o;
        return Objects.equals(this.caseLabelList, listCaseLabelsResponse.caseLabelList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(caseLabelList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCaseLabelsResponse {\n");
        sb.append("    caseLabelList: ").append(toIndentedString(caseLabelList)).append("\n");
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

