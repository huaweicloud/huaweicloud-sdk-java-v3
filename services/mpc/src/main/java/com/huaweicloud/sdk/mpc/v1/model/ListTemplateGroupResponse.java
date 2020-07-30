package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.TemplateGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTemplateGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_group_list")
    
    private List<TemplateGroup> templateGroupList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListTemplateGroupResponse withTemplateGroupList(List<TemplateGroup> templateGroupList) {
        this.templateGroupList = templateGroupList;
        return this;
    }

    
    public ListTemplateGroupResponse addTemplateGroupListItem(TemplateGroup templateGroupListItem) {
        if (this.templateGroupList == null) {
            this.templateGroupList = new ArrayList<>();
        }
        this.templateGroupList.add(templateGroupListItem);
        return this;
    }

    public ListTemplateGroupResponse withTemplateGroupList(Consumer<List<TemplateGroup>> templateGroupListSetter) {
        if(this.templateGroupList == null ){
            this.templateGroupList = new ArrayList<>();
        }
        templateGroupListSetter.accept(this.templateGroupList);
        return this;
    }

    /**
     * 模板组信息列表。 
     * @return templateGroupList
     */
    public List<TemplateGroup> getTemplateGroupList() {
        return templateGroupList;
    }

    public void setTemplateGroupList(List<TemplateGroup> templateGroupList) {
        this.templateGroupList = templateGroupList;
    }

    public ListTemplateGroupResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 转码模板组总数 
     * minimum: 0
     * maximum: 2147483647
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
        ListTemplateGroupResponse listTemplateGroupResponse = (ListTemplateGroupResponse) o;
        return Objects.equals(this.templateGroupList, listTemplateGroupResponse.templateGroupList) &&
            Objects.equals(this.total, listTemplateGroupResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateGroupList, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateGroupResponse {\n");
        sb.append("    templateGroupList: ").append(toIndentedString(templateGroupList)).append("\n");
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

