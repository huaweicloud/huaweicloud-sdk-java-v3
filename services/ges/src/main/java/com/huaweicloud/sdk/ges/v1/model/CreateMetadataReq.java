package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateMetadataReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadataPath")
    
    
    private String metadataPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isOverwrite")
    
    
    private Boolean isOverwrite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gesMetadata")
    
    
    private Object gesMetadata;

    public CreateMetadataReq withMetadataPath(String metadataPath) {
        this.metadataPath = metadataPath;
        return this;
    }

    


    /**
     * 元数据存储地址。
     * @return metadataPath
     */
    public String getMetadataPath() {
        return metadataPath;
    }

    public void setMetadataPath(String metadataPath) {
        this.metadataPath = metadataPath;
    }

    

    public CreateMetadataReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 元数据的名字，限制为1-64个字符，且只能包含字母，数字或下划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateMetadataReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 对元数据的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateMetadataReq withIsOverwrite(Boolean isOverwrite) {
        this.isOverwrite = isOverwrite;
        return this;
    }

    


    /**
     * 是否覆盖文件。
     * @return isOverwrite
     */
    public Boolean getIsOverwrite() {
        return isOverwrite;
    }

    public void setIsOverwrite(Boolean isOverwrite) {
        this.isOverwrite = isOverwrite;
    }

    

    public CreateMetadataReq withGesMetadata(Object gesMetadata) {
        this.gesMetadata = gesMetadata;
        return this;
    }

    


    /**
     * 存储metadata的消息信息的对象。
     * @return gesMetadata
     */
    public Object getGesMetadata() {
        return gesMetadata;
    }

    public void setGesMetadata(Object gesMetadata) {
        this.gesMetadata = gesMetadata;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMetadataReq createMetadataReq = (CreateMetadataReq) o;
        return Objects.equals(this.metadataPath, createMetadataReq.metadataPath) &&
            Objects.equals(this.name, createMetadataReq.name) &&
            Objects.equals(this.description, createMetadataReq.description) &&
            Objects.equals(this.isOverwrite, createMetadataReq.isOverwrite) &&
            Objects.equals(this.gesMetadata, createMetadataReq.gesMetadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metadataPath, name, description, isOverwrite, gesMetadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMetadataReq {\n");
        sb.append("    metadataPath: ").append(toIndentedString(metadataPath)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isOverwrite: ").append(toIndentedString(isOverwrite)).append("\n");
        sb.append("    gesMetadata: ").append(toIndentedString(gesMetadata)).append("\n");
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

