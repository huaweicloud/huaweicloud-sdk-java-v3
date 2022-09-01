package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDependcyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    @JacksonXmlProperty(localName = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    @JacksonXmlProperty(localName = "runtime")

    private String runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "etag")

    @JacksonXmlProperty(localName = "etag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    @JacksonXmlProperty(localName = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private Long version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    @JacksonXmlProperty(localName = "last_modified")

    private Long lastModified;

    public ShowDependcyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 依赖包ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDependcyResponse withOwner(String owner) {
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

    public ShowDependcyResponse withLink(String link) {
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

    public ShowDependcyResponse withRuntime(String runtime) {
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

    public ShowDependcyResponse withEtag(String etag) {
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

    public ShowDependcyResponse withSize(Long size) {
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

    public ShowDependcyResponse withName(String name) {
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

    public ShowDependcyResponse withDescription(String description) {
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

    public ShowDependcyResponse withFileName(String fileName) {
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

    public ShowDependcyResponse withVersion(Long version) {
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

    public ShowDependcyResponse withLastModified(Long lastModified) {
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
        ShowDependcyResponse showDependcyResponse = (ShowDependcyResponse) o;
        return Objects.equals(this.id, showDependcyResponse.id)
            && Objects.equals(this.owner, showDependcyResponse.owner)
            && Objects.equals(this.link, showDependcyResponse.link)
            && Objects.equals(this.runtime, showDependcyResponse.runtime)
            && Objects.equals(this.etag, showDependcyResponse.etag)
            && Objects.equals(this.size, showDependcyResponse.size)
            && Objects.equals(this.name, showDependcyResponse.name)
            && Objects.equals(this.description, showDependcyResponse.description)
            && Objects.equals(this.fileName, showDependcyResponse.fileName)
            && Objects.equals(this.version, showDependcyResponse.version)
            && Objects.equals(this.lastModified, showDependcyResponse.lastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, owner, link, runtime, etag, size, name, description, fileName, version, lastModified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDependcyResponse {\n");
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
