package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CdmClusterDatastore
 */
public class CdmClusterDatastore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bigclusterEnable")

    private Boolean bigclusterEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultVersion")

    private String defaultVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<CdmClusterVersion> versions = null;

    public CdmClusterDatastore withId(String id) {
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

    public CdmClusterDatastore withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CdmClusterDatastore withBigclusterEnable(Boolean bigclusterEnable) {
        this.bigclusterEnable = bigclusterEnable;
        return this;
    }

    /**
     * 是否支持大规格集群。
     * @return bigclusterEnable
     */
    public Boolean getBigclusterEnable() {
        return bigclusterEnable;
    }

    public void setBigclusterEnable(Boolean bigclusterEnable) {
        this.bigclusterEnable = bigclusterEnable;
    }

    public CdmClusterDatastore withDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

    /**
     * 默认版本。
     * @return defaultVersion
     */
    public String getDefaultVersion() {
        return defaultVersion;
    }

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public CdmClusterDatastore withVersions(List<CdmClusterVersion> versions) {
        this.versions = versions;
        return this;
    }

    public CdmClusterDatastore addVersionsItem(CdmClusterVersion versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public CdmClusterDatastore withVersions(Consumer<List<CdmClusterVersion>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 版本。
     * @return versions
     */
    public List<CdmClusterVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<CdmClusterVersion> versions) {
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
        CdmClusterDatastore that = (CdmClusterDatastore) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.bigclusterEnable, that.bigclusterEnable)
            && Objects.equals(this.defaultVersion, that.defaultVersion) && Objects.equals(this.versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, bigclusterEnable, defaultVersion, versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmClusterDatastore {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    bigclusterEnable: ").append(toIndentedString(bigclusterEnable)).append("\n");
        sb.append("    defaultVersion: ").append(toIndentedString(defaultVersion)).append("\n");
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
