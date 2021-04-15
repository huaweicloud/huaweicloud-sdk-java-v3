package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建凭据版本请求体。
 */
public class CreateSecretVersionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret_binary")
    
    private String secretBinary;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret_string")
    
    private String secretString;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_stages")
    
    private List<String> versionStages = null;
    
    public CreateSecretVersionRequestBody withSecretBinary(String secretBinary) {
        this.secretBinary = secretBinary;
        return this;
    }

    


    /**
     * 新创建凭据的凭据值，将其加密后，存入初始版本中。  类型：base64编码的二进制数据对象。  约束：secret_binary和secret_string必须且只能设置一个，最大32K。 
     * @return secretBinary
     */
    public String getSecretBinary() {
        return secretBinary;
    }

    public void setSecretBinary(String secretBinary) {
        this.secretBinary = secretBinary;
    }

    

    public CreateSecretVersionRequestBody withSecretString(String secretString) {
        this.secretString = secretString;
        return this;
    }

    


    /**
     * 新创建凭据的凭据值，将其加密后，存入初始版本中。  约束：secret_binary和 secret_string必须且只能设置一个，最大32K。 
     * @return secretString
     */
    public String getSecretString() {
        return secretString;
    }

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    

    public CreateSecretVersionRequestBody withVersionStages(List<String> versionStages) {
        this.versionStages = versionStages;
        return this;
    }

    
    public CreateSecretVersionRequestBody addVersionStagesItem(String versionStagesItem) {
        if(this.versionStages == null) {
            this.versionStages = new ArrayList<>();
        }
        this.versionStages.add(versionStagesItem);
        return this;
    }

    public CreateSecretVersionRequestBody withVersionStages(Consumer<List<String>> versionStagesSetter) {
        if(this.versionStages == null) {
            this.versionStages = new ArrayList<>();
        }
        versionStagesSetter.accept(this.versionStages);
        return this;
    }

    /**
     * 凭据版本在存入时需要被同时标记的版本状态。如果您不指定此参数，凭据管家默认为新版本标记SYSCURRENT  约束：数组大小：最小1，最大12。stage长度：最小1字节，最大64字节。 
     * @return versionStages
     */
    public List<String> getVersionStages() {
        return versionStages;
    }

    public void setVersionStages(List<String> versionStages) {
        this.versionStages = versionStages;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecretVersionRequestBody createSecretVersionRequestBody = (CreateSecretVersionRequestBody) o;
        return Objects.equals(this.secretBinary, createSecretVersionRequestBody.secretBinary) &&
            Objects.equals(this.secretString, createSecretVersionRequestBody.secretString) &&
            Objects.equals(this.versionStages, createSecretVersionRequestBody.versionStages);
    }
    @Override
    public int hashCode() {
        return Objects.hash(secretBinary, secretString, versionStages);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretVersionRequestBody {\n");
        sb.append("    secretBinary: ").append(toIndentedString(secretBinary)).append("\n");
        sb.append("    secretString: ").append(toIndentedString(secretString)).append("\n");
        sb.append("    versionStages: ").append(toIndentedString(versionStages)).append("\n");
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

