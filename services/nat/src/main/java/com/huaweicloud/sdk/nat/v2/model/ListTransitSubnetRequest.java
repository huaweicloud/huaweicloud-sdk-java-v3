package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTransitSubnetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_project_id")

    private List<String> virsubnetProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private List<String> vpcId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private List<String> virsubnetId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    public ListTransitSubnetRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListTransitSubnetRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListTransitSubnetRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 中转子网的ID
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListTransitSubnetRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListTransitSubnetRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListTransitSubnetRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 中转子网的名字
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListTransitSubnetRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListTransitSubnetRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListTransitSubnetRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 中转子网的描述
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListTransitSubnetRequest withVirsubnetProjectId(List<String> virsubnetProjectId) {
        this.virsubnetProjectId = virsubnetProjectId;
        return this;
    }

    public ListTransitSubnetRequest addVirsubnetProjectIdItem(String virsubnetProjectIdItem) {
        if (this.virsubnetProjectId == null) {
            this.virsubnetProjectId = new ArrayList<>();
        }
        this.virsubnetProjectId.add(virsubnetProjectIdItem);
        return this;
    }

    public ListTransitSubnetRequest withVirsubnetProjectId(Consumer<List<String>> virsubnetProjectIdSetter) {
        if (this.virsubnetProjectId == null) {
            this.virsubnetProjectId = new ArrayList<>();
        }
        virsubnetProjectIdSetter.accept(this.virsubnetProjectId);
        return this;
    }

    /**
     * 中转子网的子网所属项目的ID
     * @return virsubnetProjectId
     */
    public List<String> getVirsubnetProjectId() {
        return virsubnetProjectId;
    }

    public void setVirsubnetProjectId(List<String> virsubnetProjectId) {
        this.virsubnetProjectId = virsubnetProjectId;
    }

    public ListTransitSubnetRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ListTransitSubnetRequest addVpcIdItem(String vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ListTransitSubnetRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * 中转子网的子网所属的VPC的ID
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
    }

    public ListTransitSubnetRequest withVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    public ListTransitSubnetRequest addVirsubnetIdItem(String virsubnetIdItem) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        this.virsubnetId.add(virsubnetIdItem);
        return this;
    }

    public ListTransitSubnetRequest withVirsubnetId(Consumer<List<String>> virsubnetIdSetter) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        virsubnetIdSetter.accept(this.virsubnetId);
        return this;
    }

    /**
     * 中转子网的子网ID
     * @return virsubnetId
     */
    public List<String> getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public ListTransitSubnetRequest withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListTransitSubnetRequest addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListTransitSubnetRequest withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 中转子网状态。 取值范围： ACTIVE： 当前资源状态正常。 INACTIVE： 不可用。
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListTransitSubnetRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 功能说明：每页返回的个数。 取值范围：1~2000。 默认值：2000
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTransitSubnetRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 功能说明：分页查询起始的资源ID，为空时查询第一页。 值从上一次查询的PageInfo中的next_marker或者previous_marker中获取
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListTransitSubnetRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 是否查询前一页
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTransitSubnetRequest that = (ListTransitSubnetRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.virsubnetProjectId, that.virsubnetProjectId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, description, virsubnetProjectId, vpcId, virsubnetId, status, limit, marker, pageReverse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransitSubnetRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    virsubnetProjectId: ").append(toIndentedString(virsubnetProjectId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
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
