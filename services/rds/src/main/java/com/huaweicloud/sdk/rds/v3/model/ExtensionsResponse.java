package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtensionsResponse
 */
public class ExtensionsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_preload_libraries")

    private String sharedPreloadLibraries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private Boolean created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ExtensionsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 插件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtensionsResponse withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ExtensionsResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 插件版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ExtensionsResponse withSharedPreloadLibraries(String sharedPreloadLibraries) {
        this.sharedPreloadLibraries = sharedPreloadLibraries;
        return this;
    }

    /**
     * 依赖预加载库。
     * @return sharedPreloadLibraries
     */
    public String getSharedPreloadLibraries() {
        return sharedPreloadLibraries;
    }

    public void setSharedPreloadLibraries(String sharedPreloadLibraries) {
        this.sharedPreloadLibraries = sharedPreloadLibraries;
    }

    public ExtensionsResponse withCreated(Boolean created) {
        this.created = created;
        return this;
    }

    /**
     * 是否创建。
     * @return created
     */
    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }

    public ExtensionsResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 插件描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
        ExtensionsResponse that = (ExtensionsResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.version, that.version)
            && Objects.equals(this.sharedPreloadLibraries, that.sharedPreloadLibraries)
            && Objects.equals(this.created, that.created) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, databaseName, version, sharedPreloadLibraries, created, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionsResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    sharedPreloadLibraries: ").append(toIndentedString(sharedPreloadLibraries)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
