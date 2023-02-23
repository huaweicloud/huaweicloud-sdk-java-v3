package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 元数据
 */
public class Metadata  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadataPath")
    

    private String metadataPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="createTimestamp")
    

    private String createTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lastUpdateTimestamp")
    

    private String lastUpdateTimestamp;

    public Metadata withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 元数据 ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Metadata withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 元数据名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Metadata withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 元数据 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Metadata withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 元数据是否可用。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public Metadata withMetadataPath(String metadataPath) {
        this.metadataPath = metadataPath;
        return this;
    }

    


    /**
     * 元数据对应路径。
     * @return metadataPath
     */
    public String getMetadataPath() {
        return metadataPath;
    }

    public void setMetadataPath(String metadataPath) {
        this.metadataPath = metadataPath;
    }

    

    public Metadata withCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    


    /**
     * 元数据创建时间戳。
     * @return createTimestamp
     */
    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    

    public Metadata withLastUpdateTimestamp(String lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        return this;
    }

    


    /**
     * 元数据最后更新时间戳。
     * @return lastUpdateTimestamp
     */
    public String getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(String lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.id, metadata.id) &&
            Objects.equals(this.name, metadata.name) &&
            Objects.equals(this.description, metadata.description) &&
            Objects.equals(this.status, metadata.status) &&
            Objects.equals(this.metadataPath, metadata.metadataPath) &&
            Objects.equals(this.createTimestamp, metadata.createTimestamp) &&
            Objects.equals(this.lastUpdateTimestamp, metadata.lastUpdateTimestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, status, metadataPath, createTimestamp, lastUpdateTimestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    metadataPath: ").append(toIndentedString(metadataPath)).append("\n");
        sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
        sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
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

