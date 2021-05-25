package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronListSecurityGroupsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;

    public NeutronListSecurityGroupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页返回的个数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public NeutronListSecurityGroupsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 分页查询起始的资源ID，为空时查询第一页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public NeutronListSecurityGroupsRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 按照安全组对应的ID过滤查询
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public NeutronListSecurityGroupsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 按照安全组的名称过滤查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NeutronListSecurityGroupsRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 按照安全组的描述过滤查询
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public NeutronListSecurityGroupsRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 按照安全组所属的项目ID过滤查询
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListSecurityGroupsRequest neutronListSecurityGroupsRequest = (NeutronListSecurityGroupsRequest) o;
        return Objects.equals(this.limit, neutronListSecurityGroupsRequest.limit) &&
            Objects.equals(this.marker, neutronListSecurityGroupsRequest.marker) &&
            Objects.equals(this.id, neutronListSecurityGroupsRequest.id) &&
            Objects.equals(this.name, neutronListSecurityGroupsRequest.name) &&
            Objects.equals(this.description, neutronListSecurityGroupsRequest.description) &&
            Objects.equals(this.tenantId, neutronListSecurityGroupsRequest.tenantId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, name, description, tenantId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListSecurityGroupsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

