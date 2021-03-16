package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 *  
 */
public class NovaKeypairDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_key")
    
    private String publicKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fingerprint")
    
    private String fingerprint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private OffsetDateTime createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deleted")
    
    private Boolean deleted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deleted_at")
    
    private OffsetDateTime deletedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private OffsetDateTime updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public NovaKeypairDetail withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    


    /**
     * 密钥对应publicKey信息。
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    

    public NovaKeypairDetail withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 密钥名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NovaKeypairDetail withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    


    /**
     * 密钥对应指纹信息。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    

    public NovaKeypairDetail withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 密钥创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    

    public NovaKeypairDetail withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    


    /**
     * 密钥删除标记。   - true，表示密钥已被删除。   - false，表示密钥未被删除。
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    

    public NovaKeypairDetail withDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    


    /**
     * 密钥删除时间。
     * @return deletedAt
     */
    public OffsetDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    

    public NovaKeypairDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 密钥ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public NovaKeypairDetail withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 密钥更新时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public NovaKeypairDetail withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 密钥所属用户信息。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public NovaKeypairDetail withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 密钥类型，默认“ssh”  微版本2.2以上支持
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaKeypairDetail novaKeypairDetail = (NovaKeypairDetail) o;
        return Objects.equals(this.publicKey, novaKeypairDetail.publicKey) &&
            Objects.equals(this.name, novaKeypairDetail.name) &&
            Objects.equals(this.fingerprint, novaKeypairDetail.fingerprint) &&
            Objects.equals(this.createdAt, novaKeypairDetail.createdAt) &&
            Objects.equals(this.deleted, novaKeypairDetail.deleted) &&
            Objects.equals(this.deletedAt, novaKeypairDetail.deletedAt) &&
            Objects.equals(this.id, novaKeypairDetail.id) &&
            Objects.equals(this.updatedAt, novaKeypairDetail.updatedAt) &&
            Objects.equals(this.userId, novaKeypairDetail.userId) &&
            Objects.equals(this.type, novaKeypairDetail.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicKey, name, fingerprint, createdAt, deleted, deletedAt, id, updatedAt, userId, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaKeypairDetail {\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

