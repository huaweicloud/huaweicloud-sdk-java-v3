package com.huaweicloud.sdk.functiongraph.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateDependencyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


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
    
    private String size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_name")
    
    private String fileName;

    public UpdateDependencyResponse withId(String id) {
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

    

    public UpdateDependencyResponse withOwner(String owner) {
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

    

    public UpdateDependencyResponse withLink(String link) {
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

    

    public UpdateDependencyResponse withRuntime(String runtime) {
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

    

    public UpdateDependencyResponse withEtag(String etag) {
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

    

    public UpdateDependencyResponse withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 依赖包大小。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

    public UpdateDependencyResponse withName(String name) {
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

    

    public UpdateDependencyResponse withDescription(String description) {
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

    

    public UpdateDependencyResponse withFileName(String fileName) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDependencyResponse updateDependencyResponse = (UpdateDependencyResponse) o;
        return Objects.equals(this.id, updateDependencyResponse.id) &&
            Objects.equals(this.owner, updateDependencyResponse.owner) &&
            Objects.equals(this.link, updateDependencyResponse.link) &&
            Objects.equals(this.runtime, updateDependencyResponse.runtime) &&
            Objects.equals(this.etag, updateDependencyResponse.etag) &&
            Objects.equals(this.size, updateDependencyResponse.size) &&
            Objects.equals(this.name, updateDependencyResponse.name) &&
            Objects.equals(this.description, updateDependencyResponse.description) &&
            Objects.equals(this.fileName, updateDependencyResponse.fileName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, owner, link, runtime, etag, size, name, description, fileName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDependencyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

