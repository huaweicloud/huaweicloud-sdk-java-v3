package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateDependencyVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private String runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "etag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Long version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dep_id")

    private String depId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private Long lastModified;

    public CreateDependencyVersionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 依赖包版本ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateDependencyVersionResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 依赖包拥有者。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreateDependencyVersionResponse withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 依赖包在obs的存储地址。
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public CreateDependencyVersionResponse withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 运行时语言。
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public CreateDependencyVersionResponse withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * 依赖包唯一标志。
     * @return etag
     */
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public CreateDependencyVersionResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 依赖包大小。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public CreateDependencyVersionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 依赖包名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDependencyVersionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 依赖包描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDependencyVersionResponse withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 依赖包文件名。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CreateDependencyVersionResponse withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * 依赖包版本号
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public CreateDependencyVersionResponse withDepId(String depId) {
        this.depId = depId;
        return this;
    }

    /**
     * 依赖包ID
     * @return depId
     */
    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public CreateDependencyVersionResponse withLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 依赖包更新时间
     * @return lastModified
     */
    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDependencyVersionResponse createDependencyVersionResponse = (CreateDependencyVersionResponse) o;
        return Objects.equals(this.id, createDependencyVersionResponse.id)
            && Objects.equals(this.owner, createDependencyVersionResponse.owner)
            && Objects.equals(this.link, createDependencyVersionResponse.link)
            && Objects.equals(this.runtime, createDependencyVersionResponse.runtime)
            && Objects.equals(this.etag, createDependencyVersionResponse.etag)
            && Objects.equals(this.size, createDependencyVersionResponse.size)
            && Objects.equals(this.name, createDependencyVersionResponse.name)
            && Objects.equals(this.description, createDependencyVersionResponse.description)
            && Objects.equals(this.fileName, createDependencyVersionResponse.fileName)
            && Objects.equals(this.version, createDependencyVersionResponse.version)
            && Objects.equals(this.depId, createDependencyVersionResponse.depId)
            && Objects.equals(this.lastModified, createDependencyVersionResponse.lastModified);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, owner, link, runtime, etag, size, name, description, fileName, version, depId, lastModified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDependencyVersionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    depId: ").append(toIndentedString(depId)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
