package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEnterpriseOrganizationsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recursive_query")
    
    private Integer recursiveQuery;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private String parentId;

    public ListEnterpriseOrganizationsRequest withRecursiveQuery(Integer recursiveQuery) {
        this.recursiveQuery = recursiveQuery;
        return this;
    }

    


    /**
     * Get recursiveQuery
     * minimum: 0
     * maximum: 1
     * @return recursiveQuery
     */
    public Integer getRecursiveQuery() {
        return recursiveQuery;
    }

    public void setRecursiveQuery(Integer recursiveQuery) {
        this.recursiveQuery = recursiveQuery;
    }

    

    public ListEnterpriseOrganizationsRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    


    /**
     * Get parentId
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnterpriseOrganizationsRequest listEnterpriseOrganizationsRequest = (ListEnterpriseOrganizationsRequest) o;
        return Objects.equals(this.recursiveQuery, listEnterpriseOrganizationsRequest.recursiveQuery) &&
            Objects.equals(this.parentId, listEnterpriseOrganizationsRequest.parentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recursiveQuery, parentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseOrganizationsRequest {\n");
        sb.append("    recursiveQuery: ").append(toIndentedString(recursiveQuery)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

