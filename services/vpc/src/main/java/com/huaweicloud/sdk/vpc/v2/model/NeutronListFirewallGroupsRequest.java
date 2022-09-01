package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class NeutronListFirewallGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    @JacksonXmlProperty(localName = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_firewall_policy_id")

    @JacksonXmlProperty(localName = "ingress_firewall_policy_id")

    private String ingressFirewallPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_firewall_policy_id")

    @JacksonXmlProperty(localName = "egress_firewall_policy_id")

    private String egressFirewallPolicyId;

    public NeutronListFirewallGroupsRequest withMarker(String marker) {
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

    public NeutronListFirewallGroupsRequest withLimit(Integer limit) {
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

    public NeutronListFirewallGroupsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public NeutronListFirewallGroupsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public NeutronListFirewallGroupsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 使用id过滤网络ACL组
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public NeutronListFirewallGroupsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public NeutronListFirewallGroupsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public NeutronListFirewallGroupsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 使用name过滤ACL组
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public NeutronListFirewallGroupsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public NeutronListFirewallGroupsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public NeutronListFirewallGroupsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 使用description过滤ACL组
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public NeutronListFirewallGroupsRequest withIngressFirewallPolicyId(String ingressFirewallPolicyId) {
        this.ingressFirewallPolicyId = ingressFirewallPolicyId;
        return this;
    }

    /**
     * 使用入方向的网络ACL策略ID过滤网络ACL组
     * @return ingressFirewallPolicyId
     */
    public String getIngressFirewallPolicyId() {
        return ingressFirewallPolicyId;
    }

    public void setIngressFirewallPolicyId(String ingressFirewallPolicyId) {
        this.ingressFirewallPolicyId = ingressFirewallPolicyId;
    }

    public NeutronListFirewallGroupsRequest withEgressFirewallPolicyId(String egressFirewallPolicyId) {
        this.egressFirewallPolicyId = egressFirewallPolicyId;
        return this;
    }

    /**
     * 使用出方向的网络ACL策略过滤查询网络ACL组
     * @return egressFirewallPolicyId
     */
    public String getEgressFirewallPolicyId() {
        return egressFirewallPolicyId;
    }

    public void setEgressFirewallPolicyId(String egressFirewallPolicyId) {
        this.egressFirewallPolicyId = egressFirewallPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListFirewallGroupsRequest neutronListFirewallGroupsRequest = (NeutronListFirewallGroupsRequest) o;
        return Objects.equals(this.marker, neutronListFirewallGroupsRequest.marker)
            && Objects.equals(this.limit, neutronListFirewallGroupsRequest.limit)
            && Objects.equals(this.id, neutronListFirewallGroupsRequest.id)
            && Objects.equals(this.name, neutronListFirewallGroupsRequest.name)
            && Objects.equals(this.description, neutronListFirewallGroupsRequest.description)
            && Objects.equals(this.ingressFirewallPolicyId, neutronListFirewallGroupsRequest.ingressFirewallPolicyId)
            && Objects.equals(this.egressFirewallPolicyId, neutronListFirewallGroupsRequest.egressFirewallPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, limit, id, name, description, ingressFirewallPolicyId, egressFirewallPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListFirewallGroupsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ingressFirewallPolicyId: ").append(toIndentedString(ingressFirewallPolicyId)).append("\n");
        sb.append("    egressFirewallPolicyId: ").append(toIndentedString(egressFirewallPolicyId)).append("\n");
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
