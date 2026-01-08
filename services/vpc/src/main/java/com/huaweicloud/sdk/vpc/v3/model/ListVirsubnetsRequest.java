package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListVirsubnetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private List<String> vpcId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private List<String> scope = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private List<String> zoneId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    public ListVirsubnetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 每页返回的资源个数。 **取值范围**： 0~2000。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVirsubnetsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释**： 分页查询起始的资源ID，为空时查询第一页。 **取值范围**： 子网的资源ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListVirsubnetsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListVirsubnetsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListVirsubnetsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * **参数解释**： 子网的资源ID，填写后按照ID进行过滤，支持传入多个ID过滤。 **取值范围**： 不涉及。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListVirsubnetsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListVirsubnetsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListVirsubnetsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * **参数解释**： 子网的名称，填写后按照名称进行过滤，支持传入多个名称过滤。 **取值范围**： 不涉及。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListVirsubnetsRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ListVirsubnetsRequest addVpcIdItem(String vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ListVirsubnetsRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * **参数解释**： 子网所在VPC的资源ID，填写后按照VPC资源ID进行过滤，支持传入多个ID过滤。 **取值范围**： 不涉及。
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
    }

    public ListVirsubnetsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 子网的状态，填写后按照状态进行过滤，只支持传入单个状态过滤。 **取值范围**： - ACTIVE：表示子网已挂载到VPC上。 - UNKNOWN：表示子网还未挂载到VPC上。 - ERROR：表示子网状态故障。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListVirsubnetsRequest withScope(List<String> scope) {
        this.scope = scope;
        return this;
    }

    public ListVirsubnetsRequest addScopeItem(String scopeItem) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        this.scope.add(scopeItem);
        return this;
    }

    public ListVirsubnetsRequest withScope(Consumer<List<String>> scopeSetter) {
        if (this.scope == null) {
            this.scope = new ArrayList<>();
        }
        scopeSetter.accept(this.scope);
        return this;
    }

    /**
     * **参数解释**： 子网的作用域，填写后按照作用域进行过滤，支持传入多个作用域过滤。 **取值范围**： - center：表示作用域为中心。 - {publicBorderGroup}：表示作用域为具体的公网边界组。公网边界组限制子网的可用区范围，可关联多个边缘可用区。
     * @return scope
     */
    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public ListVirsubnetsRequest withZoneId(List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    public ListVirsubnetsRequest addZoneIdItem(String zoneIdItem) {
        if (this.zoneId == null) {
            this.zoneId = new ArrayList<>();
        }
        this.zoneId.add(zoneIdItem);
        return this;
    }

    public ListVirsubnetsRequest withZoneId(Consumer<List<String>> zoneIdSetter) {
        if (this.zoneId == null) {
            this.zoneId = new ArrayList<>();
        }
        zoneIdSetter.accept(this.zoneId);
        return this;
    }

    /**
     * **参数解释**： 子网的可用区ID，填写后按照可用区ID进行过滤，支持传入多个可用区ID过滤。 **取值范围**： 不涉及
     * @return zoneId
     */
    public List<String> getZoneId() {
        return zoneId;
    }

    public void setZoneId(List<String> zoneId) {
        this.zoneId = zoneId;
    }

    public ListVirsubnetsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListVirsubnetsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListVirsubnetsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * **参数解释**： 子网的描述信息，填写后按照描述信息进行过滤，支持传入多个描述信息过滤。 **取值范围**： 不涉及。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVirsubnetsRequest that = (ListVirsubnetsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.scope, that.scope) && Objects.equals(this.zoneId, that.zoneId)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, name, vpcId, status, scope, zoneId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVirsubnetsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
