package com.huaweicloud.sdk.rms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rms.v1.model.PageInfo;
import com.huaweicloud.sdk.rms.v1.model.PolicyDefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBuiltInPolicyDefinitionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private List<PolicyDefinition> value = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    private PageInfo pageInfo;

    public ListBuiltInPolicyDefinitionsResponse withValue(List<PolicyDefinition> value) {
        this.value = value;
        return this;
    }

    
    public ListBuiltInPolicyDefinitionsResponse addValueItem(PolicyDefinition valueItem) {
        this.value.add(valueItem);
        return this;
    }

    public ListBuiltInPolicyDefinitionsResponse withValue(Consumer<List<PolicyDefinition>> valueSetter) {
        if(this.value == null ){
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 策略定义列表
     * @return value
     */
    public List<PolicyDefinition> getValue() {
        return value;
    }

    public void setValue(List<PolicyDefinition> value) {
        this.value = value;
    }

    

    public ListBuiltInPolicyDefinitionsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListBuiltInPolicyDefinitionsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListBuiltInPolicyDefinitionsResponse listBuiltInPolicyDefinitionsResponse = (ListBuiltInPolicyDefinitionsResponse) o;
        return Objects.equals(this.value, listBuiltInPolicyDefinitionsResponse.value) &&
            Objects.equals(this.pageInfo, listBuiltInPolicyDefinitionsResponse.pageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value, pageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBuiltInPolicyDefinitionsResponse {\n");
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

