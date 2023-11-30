package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessCodeModel
 */
public class AccessCodeModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code")

    private String accessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_code_id")

    private String accessCodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public AccessCodeModel withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    /**
     * access_code。
     * @return accessCode
     */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public AccessCodeModel withAccessCodeId(String accessCodeId) {
        this.accessCodeId = accessCodeId;
        return this;
    }

    /**
     * access_code_id。
     * @return accessCodeId
     */
    public String getAccessCodeId() {
        return accessCodeId;
    }

    public void setAccessCodeId(String accessCodeId) {
        this.accessCodeId = accessCodeId;
    }

    public AccessCodeModel withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public AccessCodeModel withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessCodeModel that = (AccessCodeModel) obj;
        return Objects.equals(this.accessCode, that.accessCode) && Objects.equals(this.accessCodeId, that.accessCodeId)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessCode, accessCodeId, createAt, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessCodeModel {\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    accessCodeId: ").append(toIndentedString(accessCodeId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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
