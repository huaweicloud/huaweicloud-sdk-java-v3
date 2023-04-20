package com.huaweicloud.sdk.iotedge.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用镜像列表信息
 */
public class QueryAppImageResponseDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_namespace")
    

    private String imageNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="digest")
    

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    public QueryAppImageResponseDTO withImageNamespace(String imageNamespace) {
        this.imageNamespace = imageNamespace;
        return this;
    }

    


    /**
     * 镜像组织
     * @return imageNamespace
     */
    public String getImageNamespace() {
        return imageNamespace;
    }

    public void setImageNamespace(String imageNamespace) {
        this.imageNamespace = imageNamespace;
    }

    

    public QueryAppImageResponseDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像仓库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public QueryAppImageResponseDTO withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 镜像tag
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    

    public QueryAppImageResponseDTO withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    


    /**
     * 镜像摘要
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    

    public QueryAppImageResponseDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryAppImageResponseDTO queryAppImageResponseDTO = (QueryAppImageResponseDTO) o;
        return Objects.equals(this.imageNamespace, queryAppImageResponseDTO.imageNamespace) &&
            Objects.equals(this.name, queryAppImageResponseDTO.name) &&
            Objects.equals(this.tag, queryAppImageResponseDTO.tag) &&
            Objects.equals(this.digest, queryAppImageResponseDTO.digest) &&
            Objects.equals(this.createTime, queryAppImageResponseDTO.createTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageNamespace, name, tag, digest, createTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAppImageResponseDTO {\n");
        sb.append("    imageNamespace: ").append(toIndentedString(imageNamespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

