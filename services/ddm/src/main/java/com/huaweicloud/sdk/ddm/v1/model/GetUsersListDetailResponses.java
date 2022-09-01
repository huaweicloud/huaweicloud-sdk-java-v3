package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto query response Object
 */
public class GetUsersListDetailResponses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_authority")

    @JacksonXmlProperty(localName = "base_authority")

    private List<String> baseAuthority = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_authority")

    @JacksonXmlProperty(localName = "extend_authority")

    private List<String> extendAuthority = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    @JacksonXmlProperty(localName = "created")

    private Long created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    @JacksonXmlProperty(localName = "databases")

    private List<GetUsersListdatabase> databases = null;

    public GetUsersListDetailResponses withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * DDM实例帐号名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetUsersListDetailResponses withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * DDM实例帐号状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetUsersListDetailResponses withBaseAuthority(List<String> baseAuthority) {
        this.baseAuthority = baseAuthority;
        return this;
    }

    public GetUsersListDetailResponses addBaseAuthorityItem(String baseAuthorityItem) {
        if (this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        this.baseAuthority.add(baseAuthorityItem);
        return this;
    }

    public GetUsersListDetailResponses withBaseAuthority(Consumer<List<String>> baseAuthoritySetter) {
        if (this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        baseAuthoritySetter.accept(this.baseAuthority);
        return this;
    }

    /**
     * DDM实例帐号的基础权限。  取值为：CREATE、DROP、ALTER、INDEX、INSERT、DELETE、UPDATE、SELECT
     * @return baseAuthority
     */
    public List<String> getBaseAuthority() {
        return baseAuthority;
    }

    public void setBaseAuthority(List<String> baseAuthority) {
        this.baseAuthority = baseAuthority;
    }

    public GetUsersListDetailResponses withExtendAuthority(List<String> extendAuthority) {
        this.extendAuthority = extendAuthority;
        return this;
    }

    public GetUsersListDetailResponses addExtendAuthorityItem(String extendAuthorityItem) {
        if (this.extendAuthority == null) {
            this.extendAuthority = new ArrayList<>();
        }
        this.extendAuthority.add(extendAuthorityItem);
        return this;
    }

    public GetUsersListDetailResponses withExtendAuthority(Consumer<List<String>> extendAuthoritySetter) {
        if (this.extendAuthority == null) {
            this.extendAuthority = new ArrayList<>();
        }
        extendAuthoritySetter.accept(this.extendAuthority);
        return this;
    }

    /**
     * DDM实例帐号的扩展权限。2021年8月开始不支持该字段，9月会去掉该字段。  取值为：fulltableDelete、fulltableSelect、fulltableUpdate
     * @return extendAuthority
     */
    public List<String> getExtendAuthority() {
        return extendAuthority;
    }

    public void setExtendAuthority(List<String> extendAuthority) {
        this.extendAuthority = extendAuthority;
    }

    public GetUsersListDetailResponses withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * DDM实例帐号的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GetUsersListDetailResponses withCreated(Long created) {
        this.created = created;
        return this;
    }

    /**
     * DDM实例帐号的创建时间。
     * @return created
     */
    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public GetUsersListDetailResponses withDatabases(List<GetUsersListdatabase> databases) {
        this.databases = databases;
        return this;
    }

    public GetUsersListDetailResponses addDatabasesItem(GetUsersListdatabase databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public GetUsersListDetailResponses withDatabases(Consumer<List<GetUsersListdatabase>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 关联的逻辑库的集合。
     * @return databases
     */
    public List<GetUsersListdatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<GetUsersListdatabase> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetUsersListDetailResponses getUsersListDetailResponses = (GetUsersListDetailResponses) o;
        return Objects.equals(this.name, getUsersListDetailResponses.name)
            && Objects.equals(this.status, getUsersListDetailResponses.status)
            && Objects.equals(this.baseAuthority, getUsersListDetailResponses.baseAuthority)
            && Objects.equals(this.extendAuthority, getUsersListDetailResponses.extendAuthority)
            && Objects.equals(this.description, getUsersListDetailResponses.description)
            && Objects.equals(this.created, getUsersListDetailResponses.created)
            && Objects.equals(this.databases, getUsersListDetailResponses.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, baseAuthority, extendAuthority, description, created, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUsersListDetailResponses {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    baseAuthority: ").append(toIndentedString(baseAuthority)).append("\n");
        sb.append("    extendAuthority: ").append(toIndentedString(extendAuthority)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
