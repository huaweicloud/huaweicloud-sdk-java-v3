package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListAddressGroupRequest {

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
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    public ListAddressGroupRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 功能说明：每页返回的个数 取值范围：0~2000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAddressGroupRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 分页查询起始的资源ID，为空时查询第一页
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAddressGroupRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListAddressGroupRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListAddressGroupRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /** 地址组唯一标识，填写后接口按照id进行过滤，支持多ID同时过滤
     * 
     * @return id */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListAddressGroupRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListAddressGroupRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListAddressGroupRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /** 地址组名称，填写后按照名称进行过滤，支持多名称同时过滤
     * 
     * @return name */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListAddressGroupRequest withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /** IP地址组ip版本，当前只支持ipv4，填写后按照ip版本进行过滤
     * 
     * @return ipVersion */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListAddressGroupRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListAddressGroupRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListAddressGroupRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /** 地址组描述信息，填写后按照地址组描述信息过滤，支持多描述同时过滤
     * 
     * @return description */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAddressGroupRequest listAddressGroupRequest = (ListAddressGroupRequest) o;
        return Objects.equals(this.limit, listAddressGroupRequest.limit)
            && Objects.equals(this.marker, listAddressGroupRequest.marker)
            && Objects.equals(this.id, listAddressGroupRequest.id)
            && Objects.equals(this.name, listAddressGroupRequest.name)
            && Objects.equals(this.ipVersion, listAddressGroupRequest.ipVersion)
            && Objects.equals(this.description, listAddressGroupRequest.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, name, ipVersion, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddressGroupRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
