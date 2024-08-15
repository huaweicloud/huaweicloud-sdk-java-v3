package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbname")

    private String dbname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<CdmClusterDatastoreVersion> versions = null;

    public ShowFlavorsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 服务ID，用于区分不同服务。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowFlavorsResponse withDbname(String dbname) {
        this.dbname = dbname;
        return this;
    }

    /**
     * db名称，一般为cdm。
     * @return dbname
     */
    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public ShowFlavorsResponse withVersions(List<CdmClusterDatastoreVersion> versions) {
        this.versions = versions;
        return this;
    }

    public ShowFlavorsResponse addVersionsItem(CdmClusterDatastoreVersion versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ShowFlavorsResponse withVersions(Consumer<List<CdmClusterDatastoreVersion>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 版本信息列表。
     * @return versions
     */
    public List<CdmClusterDatastoreVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<CdmClusterDatastoreVersion> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlavorsResponse that = (ShowFlavorsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.dbname, that.dbname)
            && Objects.equals(this.versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dbname, versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlavorsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dbname: ").append(toIndentedString(dbname)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
