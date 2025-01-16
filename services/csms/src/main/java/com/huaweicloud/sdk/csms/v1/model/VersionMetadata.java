package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_stages")

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

    public VersionMetadata withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 凭据版本过期时间，时间戳，即从1970年1月1日至该时间的总秒数。默认为空，凭据订阅“版本过期”事件类型时，有效期判断所依据的值。
     * minimum: 0
     * maximum: 13
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
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

    public VersionMetadata withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 凭据名称。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
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
     * 凭据版本被标记的状态列表。每个版本标签对于凭据对象下版本是唯一存在的，如果创建版本时，指定的是同一凭据对象下的一个已经标记在其他版本上的状态，该标签将自动从其他版本上删除，并附加到此版本上。  如果未指定version_stage的值，则凭据管理服务会自动移动临时标签SYSCURRENT到此新版本。
     * @return versionStages
     */
    public List<String> getVersionStages() {
        return versionStages;
    }

    public void setVersionStages(List<String> versionStages) {
        this.versionStages = versionStages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionMetadata that = (VersionMetadata) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.kmsKeyId, that.kmsKeyId)
            && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.versionStages, that.versionStages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, expireTime, kmsKeyId, secretName, versionStages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionMetadata {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
