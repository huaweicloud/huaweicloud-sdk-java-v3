package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListCertificatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

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
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private List<String> domain = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    public ListCertificatesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 上一页最后一条记录的ID。 使用说明： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListCertificatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页返回的个数。 minimum: 0 maximum: 2000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCertificatesRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /** 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。 使用说明： - 必须与limit一起使用。
     * 
     * @return pageReverse */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListCertificatesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListCertificatesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListCertificatesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /** 证书ID。 支持多值查询，查询条件格式：*id=xxx&id=xxx*。
     * 
     * @return id */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListCertificatesRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListCertificatesRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListCertificatesRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /** 证书的名称。 支持多值查询，查询条件格式：*name=xxx&name=xxx*。
     * 
     * @return name */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListCertificatesRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListCertificatesRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListCertificatesRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /** 证书的描述。 支持多值查询，查询条件格式：*description=xxx&description=xxx*。
     * 
     * @return description */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListCertificatesRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 证书的管理状态。 不支持该字段，请勿使用。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListCertificatesRequest withDomain(List<String> domain) {
        this.domain = domain;
        return this;
    }

    public ListCertificatesRequest addDomainItem(String domainItem) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        this.domain.add(domainItem);
        return this;
    }

    public ListCertificatesRequest withDomain(Consumer<List<String>> domainSetter) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        domainSetter.accept(this.domain);
        return this;
    }

    /** 服务器证书所签域名。该字段仅type为server时有效。 支持多值查询，查询条件格式：domain=xxx&domain=xxx。
     * 
     * @return domain */
    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    public ListCertificatesRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListCertificatesRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListCertificatesRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /** 证书的类型。分为服务器证书(server)和CA证书(client)。 支持多值查询，查询条件格式：type=xxx&type=xxx。
     * 
     * @return type */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificatesRequest listCertificatesRequest = (ListCertificatesRequest) o;
        return Objects.equals(this.marker, listCertificatesRequest.marker)
            && Objects.equals(this.limit, listCertificatesRequest.limit)
            && Objects.equals(this.pageReverse, listCertificatesRequest.pageReverse)
            && Objects.equals(this.id, listCertificatesRequest.id)
            && Objects.equals(this.name, listCertificatesRequest.name)
            && Objects.equals(this.description, listCertificatesRequest.description)
            && Objects.equals(this.adminStateUp, listCertificatesRequest.adminStateUp)
            && Objects.equals(this.domain, listCertificatesRequest.domain)
            && Objects.equals(this.type, listCertificatesRequest.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, limit, pageReverse, id, name, description, adminStateUp, domain, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
