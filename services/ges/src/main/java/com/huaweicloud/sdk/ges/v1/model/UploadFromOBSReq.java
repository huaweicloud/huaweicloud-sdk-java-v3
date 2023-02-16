package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.EncryptionReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UploadFromOBSReq
 */
public class UploadFromOBSReq  {



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
    @JsonProperty(value="encryption")
    
    
    private EncryptionReq encryption;

    public UploadFromOBSReq withMetadataPath(String metadataPath) {
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

    

    public UploadFromOBSReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 元数据的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UploadFromOBSReq withDescription(String description) {
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

    

    public UploadFromOBSReq withEncryption(EncryptionReq encryption) {
        this.encryption = encryption;
        return this;
    }

    public UploadFromOBSReq withEncryption(Consumer<EncryptionReq> encryptionSetter) {
        if(this.encryption == null ){
            this.encryption = new EncryptionReq();
            encryptionSetter.accept(this.encryption);
        }
        
        return this;
    }


    /**
     * Get encryption
     * @return encryption
     */
    public EncryptionReq getEncryption() {
        return encryption;
    }

    public void setEncryption(EncryptionReq encryption) {
        this.encryption = encryption;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadFromOBSReq uploadFromOBSReq = (UploadFromOBSReq) o;
        return Objects.equals(this.metadataPath, uploadFromOBSReq.metadataPath) &&
            Objects.equals(this.name, uploadFromOBSReq.name) &&
            Objects.equals(this.description, uploadFromOBSReq.description) &&
            Objects.equals(this.encryption, uploadFromOBSReq.encryption);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metadataPath, name, description, encryption);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFromOBSReq {\n");
        sb.append("    metadataPath: ").append(toIndentedString(metadataPath)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
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

