package com.huaweicloud.sdk.rms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rms.v1.model.PageInfo;
import com.huaweicloud.sdk.rms.v1.model.PolicyAssignment;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPolicyAssignmentsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private List<PolicyAssignment> value = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    private PageInfo pageInfo;

    public ListPolicyAssignmentsResponse withValue(List<PolicyAssignment> value) {
        this.value = value;
        return this;
    }

    
    public ListPolicyAssignmentsResponse addValueItem(PolicyAssignment valueItem) {
        this.value.add(valueItem);
        return this;
    }

    public ListPolicyAssignmentsResponse withValue(Consumer<List<PolicyAssignment>> valueSetter) {
        if(this.value == null ){
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 规则列表
     * @return value
     */
    public List<PolicyAssignment> getValue() {
        return value;
    }

    public void setValue(List<PolicyAssignment> value) {
        this.value = value;
    }

    

    public ListPolicyAssignmentsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPolicyAssignmentsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if(this.pageInfo == null ){
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }
        
        return this;
    }


    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPolicyAssignmentsResponse listPolicyAssignmentsResponse = (ListPolicyAssignmentsResponse) o;
        return Objects.equals(this.value, listPolicyAssignmentsResponse.value) &&
            Objects.equals(this.pageInfo, listPolicyAssignmentsResponse.pageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value, pageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyAssignmentsResponse {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

