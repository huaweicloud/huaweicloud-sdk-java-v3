package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/** 版本别名结构 */
public class ListVersionAliasResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private OffsetDateTime lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_urn")

    private String aliasUrn;

    public ListVersionAliasResult withName(String name) {
        this.name = name;
        return this;
    }

    /** 要获取的别名名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListVersionAliasResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 别名对应的版本名称。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListVersionAliasResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 别名描述信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListVersionAliasResult withLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /** 别名最后修改时间。
     * 
     * @return lastModified */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public ListVersionAliasResult withAliasUrn(String aliasUrn) {
        this.aliasUrn = aliasUrn;
        return this;
    }

    /** 版本别名唯一标识。
     * 
     * @return aliasUrn */
    public String getAliasUrn() {
        return aliasUrn;
    }

    public void setAliasUrn(String aliasUrn) {
        this.aliasUrn = aliasUrn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVersionAliasResult listVersionAliasResult = (ListVersionAliasResult) o;
        return Objects.equals(this.name, listVersionAliasResult.name)
            && Objects.equals(this.version, listVersionAliasResult.version)
            && Objects.equals(this.description, listVersionAliasResult.description)
            && Objects.equals(this.lastModified, listVersionAliasResult.lastModified)
            && Objects.equals(this.aliasUrn, listVersionAliasResult.aliasUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, description, lastModified, aliasUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVersionAliasResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    aliasUrn: ").append(toIndentedString(aliasUrn)).append("\n");
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
