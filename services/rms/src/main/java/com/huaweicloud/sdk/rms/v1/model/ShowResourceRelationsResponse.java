package com.huaweicloud.sdk.rms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rms.v1.model.PageInfo;
import com.huaweicloud.sdk.rms.v1.model.ResourceRelation;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowResourceRelationsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relations")
    
    private List<ResourceRelation> relations = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    private PageInfo pageInfo;

    public ShowResourceRelationsResponse withRelations(List<ResourceRelation> relations) {
        this.relations = relations;
        return this;
    }

    
    public ShowResourceRelationsResponse addRelationsItem(ResourceRelation relationsItem) {
        this.relations.add(relationsItem);
        return this;
    }

    public ShowResourceRelationsResponse withRelations(Consumer<List<ResourceRelation>> relationsSetter) {
        if(this.relations == null ){
            this.relations = new ArrayList<>();
        }
        relationsSetter.accept(this.relations);
        return this;
    }

    /**
     * 资源关系列表
     * @return relations
     */
    public List<ResourceRelation> getRelations() {
        return relations;
    }

    public void setRelations(List<ResourceRelation> relations) {
        this.relations = relations;
    }

    

    public ShowResourceRelationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ShowResourceRelationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ShowResourceRelationsResponse showResourceRelationsResponse = (ShowResourceRelationsResponse) o;
        return Objects.equals(this.relations, showResourceRelationsResponse.relations) &&
            Objects.equals(this.pageInfo, showResourceRelationsResponse.pageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(relations, pageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceRelationsResponse {\n");
        sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
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

