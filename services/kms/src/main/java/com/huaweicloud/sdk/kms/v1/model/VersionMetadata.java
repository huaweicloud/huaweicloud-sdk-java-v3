package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 凭据版本被标记的状态。
 */
public class VersionMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    @JacksonXmlProperty(localName = "kms_key_id")

    private String kmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_id")

    @JacksonXmlProperty(localName = "secret_id")

    private String secretId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_stages")

    @JacksonXmlProperty(localName = "version_stages")

    private List<String> versionStages = null;

    public VersionMetadata withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 凭据的版本号标识符，凭据对象下唯一。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VersionMetadata withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 凭据版本创建时间，时间戳，即从1970年1月1日至该时间的总秒数。 
     * minimum: 0
     * maximum: 13
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public VersionMetadata withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * 加密版本凭据值的KMS主密钥ID。 
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public VersionMetadata withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * 凭据的资源标识符。
     * @return secretId
     */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public VersionMetadata withVersionStages(List<String> versionStages) {
        this.versionStages = versionStages;
        return this;
    }

    public VersionMetadata addVersionStagesItem(String versionStagesItem) {
        if (this.versionStages == null) {
            this.versionStages = new ArrayList<>();
        }
        this.versionStages.add(versionStagesItem);
        return this;
    }

    public VersionMetadata withVersionStages(Consumer<List<String>> versionStagesSetter) {
        if (this.versionStages == null) {
            this.versionStages = new ArrayList<>();
        }
        versionStagesSetter.accept(this.versionStages);
        return this;
    }

    /**
     * 凭据版本被标记的状态列表。每个版本标签对于凭据对象下版本是唯一存在的，如果你创建版本时，指定的是同一凭据对象下的一个已经标记在其他版本上的状态，该标签将自动从其他版本上删除，并附加到此版本上。  如果未指定version_stage的值，则凭据管理服务会自动移动临时标签SYSCURRENT到此新版本。 
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
        VersionMetadata versionMetadata = (VersionMetadata) o;
        return Objects.equals(this.id, versionMetadata.id)
            && Objects.equals(this.createTime, versionMetadata.createTime)
            && Objects.equals(this.kmsKeyId, versionMetadata.kmsKeyId)
            && Objects.equals(this.secretId, versionMetadata.secretId)
            && Objects.equals(this.versionStages, versionMetadata.versionStages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, kmsKeyId, secretId, versionStages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionMetadata {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
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
