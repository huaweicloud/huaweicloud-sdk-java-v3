package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PrivateKeyVerify
 */
public class PrivateKeyVerify  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_uuid")
    
    private String repositoryUuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_key")
    
    private String privateKey;

    public PrivateKeyVerify withRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
        return this;
    }

    


    /**
     * 仓库ID
     * @return repositoryUuid
     */
    public String getRepositoryUuid() {
        return repositoryUuid;
    }

    public void setRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
    }

    public PrivateKeyVerify withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    


    /**
     * 私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateKeyVerify privateKeyVerify = (PrivateKeyVerify) o;
        return Objects.equals(this.repositoryUuid, privateKeyVerify.repositoryUuid) &&
            Objects.equals(this.privateKey, privateKeyVerify.privateKey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(repositoryUuid, privateKey);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateKeyVerify {\n");
        sb.append("    repositoryUuid: ").append(toIndentedString(repositoryUuid)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

