package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * sqlserverTDE开关信息
 */
public class UpdateTdeStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate_day")

    private Integer rotateDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_id")

    private String secretId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_version")

    private String secretVersion;

    public UpdateTdeStatusRequestBody withRotateDay(Integer rotateDay) {
        this.rotateDay = rotateDay;
        return this;
    }

    /**
     * 轮转天数
     * @return rotateDay
     */
    public Integer getRotateDay() {
        return rotateDay;
    }

    public void setRotateDay(Integer rotateDay) {
        this.rotateDay = rotateDay;
    }

    public UpdateTdeStatusRequestBody withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * 密钥ID
     * @return secretId
     */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public UpdateTdeStatusRequestBody withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 密钥名称
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public UpdateTdeStatusRequestBody withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * 密钥版本
     * @return secretVersion
     */
    public String getSecretVersion() {
        return secretVersion;
    }

    public void setSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTdeStatusRequestBody that = (UpdateTdeStatusRequestBody) obj;
        return Objects.equals(this.rotateDay, that.rotateDay) && Objects.equals(this.secretId, that.secretId)
            && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.secretVersion, that.secretVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rotateDay, secretId, secretName, secretVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTdeStatusRequestBody {\n");
        sb.append("    rotateDay: ").append(toIndentedString(rotateDay)).append("\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    secretVersion: ").append(toIndentedString(secretVersion)).append("\n");
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
