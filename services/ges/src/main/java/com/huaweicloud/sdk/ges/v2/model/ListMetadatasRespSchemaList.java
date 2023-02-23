package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListMetadatasRespSchemaList
 */
public class ListMetadatasRespSchemaList  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_update_time")
    

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypted")
    

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="master_key_name")
    

    private String masterKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="master_key_id")
    

    private String masterKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata_path")
    

    private String metadataPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    public ListMetadatasRespSchemaList withId(String id) {
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

    

    public ListMetadatasRespSchemaList withName(String name) {
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

    

    public ListMetadatasRespSchemaList withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 元数据创建时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ListMetadatasRespSchemaList withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    


    /**
     * 元数据最后更新时间
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    

    public ListMetadatasRespSchemaList withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    


    /**
     * 元数据是否加密
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    

    public ListMetadatasRespSchemaList withMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
        return this;
    }

    


    /**
     * 秘钥名称
     * @return masterKeyName
     */
    public String getMasterKeyName() {
        return masterKeyName;
    }

    public void setMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
    }

    

    public ListMetadatasRespSchemaList withMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }

    


    /**
     * 秘钥id
     * @return masterKeyId
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    public void setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
    }

    

    public ListMetadatasRespSchemaList withDescription(String description) {
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

    

    public ListMetadatasRespSchemaList withMetadataPath(String metadataPath) {
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

    

    public ListMetadatasRespSchemaList withStatus(String status) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMetadatasRespSchemaList listMetadatasRespSchemaList = (ListMetadatasRespSchemaList) o;
        return Objects.equals(this.id, listMetadatasRespSchemaList.id) &&
            Objects.equals(this.name, listMetadatasRespSchemaList.name) &&
            Objects.equals(this.startTime, listMetadatasRespSchemaList.startTime) &&
            Objects.equals(this.lastUpdateTime, listMetadatasRespSchemaList.lastUpdateTime) &&
            Objects.equals(this.encrypted, listMetadatasRespSchemaList.encrypted) &&
            Objects.equals(this.masterKeyName, listMetadatasRespSchemaList.masterKeyName) &&
            Objects.equals(this.masterKeyId, listMetadatasRespSchemaList.masterKeyId) &&
            Objects.equals(this.description, listMetadatasRespSchemaList.description) &&
            Objects.equals(this.metadataPath, listMetadatasRespSchemaList.metadataPath) &&
            Objects.equals(this.status, listMetadatasRespSchemaList.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, startTime, lastUpdateTime, encrypted, masterKeyName, masterKeyId, description, metadataPath, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetadatasRespSchemaList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    masterKeyName: ").append(toIndentedString(masterKeyName)).append("\n");
        sb.append("    masterKeyId: ").append(toIndentedString(masterKeyId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    metadataPath: ").append(toIndentedString(metadataPath)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

