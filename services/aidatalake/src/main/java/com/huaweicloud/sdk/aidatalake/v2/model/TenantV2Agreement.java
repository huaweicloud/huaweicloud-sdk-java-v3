package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * **参数解释**：租户协议。
 */
public class TenantV2Agreement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_name")

    private String agreementName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public TenantV2Agreement withAgreementName(String agreementName) {
        this.agreementName = agreementName;
        return this;
    }

    /**
     * **参数解释**：协议名称。 **取值范围**：长度为1~128的英文字母、数字、下划线和中划线的组合。
     * @return agreementName
     */
    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public TenantV2Agreement withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：协议版本号。 **取值范围**：长度为1~128的英文字母、数字、下划线、中划线和小数点的组合。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public TenantV2Agreement withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantV2Agreement that = (TenantV2Agreement) obj;
        return Objects.equals(this.agreementName, that.agreementName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementName, version, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantV2Agreement {\n");
        sb.append("    agreementName: ").append(toIndentedString(agreementName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
