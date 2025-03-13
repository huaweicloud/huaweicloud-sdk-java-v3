package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecretDetail
 */
public class SecretDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_update_available")

    private Boolean ifUpdateAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_status")

    private String secretStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private Integer modifiedTime;

    public SecretDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 凭据ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SecretDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 凭证名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecretDetail withIfUpdateAvailable(Boolean ifUpdateAvailable) {
        this.ifUpdateAvailable = ifUpdateAvailable;
        return this;
    }

    /**
     * 当前凭据是否有更新版本。
     * @return ifUpdateAvailable
     */
    public Boolean getIfUpdateAvailable() {
        return ifUpdateAvailable;
    }

    public void setIfUpdateAvailable(Boolean ifUpdateAvailable) {
        this.ifUpdateAvailable = ifUpdateAvailable;
    }

    public SecretDetail withSecretStatus(String secretStatus) {
        this.secretStatus = secretStatus;
        return this;
    }

    /**
     * 凭据在DEW的状态。
     * @return secretStatus
     */
    public String getSecretStatus() {
        return secretStatus;
    }

    public void setSecretStatus(String secretStatus) {
        this.secretStatus = secretStatus;
    }

    public SecretDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 凭据在CAE使用状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SecretDetail withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 当前使用的凭证版本号。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public SecretDetail withModifiedTime(Integer modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 当前版本凭证在dew的创建时间。
     * @return modifiedTime
     */
    public Integer getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Integer modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecretDetail that = (SecretDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ifUpdateAvailable, that.ifUpdateAvailable)
            && Objects.equals(this.secretStatus, that.secretStatus) && Objects.equals(this.status, that.status)
            && Objects.equals(this.versionId, that.versionId) && Objects.equals(this.modifiedTime, that.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ifUpdateAvailable, secretStatus, status, versionId, modifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ifUpdateAvailable: ").append(toIndentedString(ifUpdateAvailable)).append("\n");
        sb.append("    secretStatus: ").append(toIndentedString(secretStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
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
