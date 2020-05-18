package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 函数依赖包结构。
 */
public class Dependency  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="link")
    
    private String link;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="runtime")
    
    private String runtime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="etag")
    
    private String etag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Long size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_name")
    
    private String fileName;

    public Dependency withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 依赖包属主的domainId。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Dependency withLink(String link) {
        this.link = link;
        return this;
    }

    


    /**
     * 依赖包在OBS上的链接。
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Dependency withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    


    /**
     * 依赖包语言类型，仅作为分类条件。
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public Dependency withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    


    /**
     * 依赖包的md5值
     * @return etag
     */
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Dependency withSize(Long size) {
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

    public Dependency withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 依赖包名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dependency withDescription(String description) {
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

    public Dependency withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    


    /**
     * 依赖包文件名，如果创建方式为zip时。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dependency dependency = (Dependency) o;
        return Objects.equals(this.owner, dependency.owner) &&
            Objects.equals(this.link, dependency.link) &&
            Objects.equals(this.runtime, dependency.runtime) &&
            Objects.equals(this.etag, dependency.etag) &&
            Objects.equals(this.size, dependency.size) &&
            Objects.equals(this.name, dependency.name) &&
            Objects.equals(this.description, dependency.description) &&
            Objects.equals(this.fileName, dependency.fileName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(owner, link, runtime, etag, size, name, description, fileName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dependency {\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
            sb.append("    link: ").append(toIndentedString(link)).append("\n");
            sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
            sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

