package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronListFirewallPoliciesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private List<String> name = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private List<String> description = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;

    public NeutronListFirewallPoliciesRequest withLimit(Integer limit) {
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

    

    public NeutronListFirewallPoliciesRequest withMarker(String marker) {
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

    

    public NeutronListFirewallPoliciesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public NeutronListFirewallPoliciesRequest addIdItem(String idItem) {
        if(this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public NeutronListFirewallPoliciesRequest withId(Consumer<List<String>> idSetter) {
        if(this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 使用网络ACL策略ID过滤网络ACL策略
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    

    public NeutronListFirewallPoliciesRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    
    public NeutronListFirewallPoliciesRequest addNameItem(String nameItem) {
        if(this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public NeutronListFirewallPoliciesRequest withName(Consumer<List<String>> nameSetter) {
        if(this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 使用name过滤网络ACL策略
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    

    public NeutronListFirewallPoliciesRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    
    public NeutronListFirewallPoliciesRequest addDescriptionItem(String descriptionItem) {
        if(this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public NeutronListFirewallPoliciesRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if(this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 使用网络ACL策略描述过滤查询网络ACL策略
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    

    public NeutronListFirewallPoliciesRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 使用tenant_id过滤查询网络ACL策略
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
        NeutronListFirewallPoliciesRequest neutronListFirewallPoliciesRequest = (NeutronListFirewallPoliciesRequest) o;
        return Objects.equals(this.limit, neutronListFirewallPoliciesRequest.limit) &&
            Objects.equals(this.marker, neutronListFirewallPoliciesRequest.marker) &&
            Objects.equals(this.id, neutronListFirewallPoliciesRequest.id) &&
            Objects.equals(this.name, neutronListFirewallPoliciesRequest.name) &&
            Objects.equals(this.description, neutronListFirewallPoliciesRequest.description) &&
            Objects.equals(this.tenantId, neutronListFirewallPoliciesRequest.tenantId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, name, description, tenantId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListFirewallPoliciesRequest {\n");
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

