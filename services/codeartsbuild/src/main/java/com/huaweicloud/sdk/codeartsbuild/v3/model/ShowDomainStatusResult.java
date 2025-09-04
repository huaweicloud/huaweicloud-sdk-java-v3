package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 租户状态信息
 */
public class ShowDomainStatusResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BigDecimal status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_quota")

    private Boolean freeQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_custom_env")

    private BigDecimal allowCustomEnv;

    public ShowDomainStatusResult withStatus(BigDecimal status) {
        this.status = status;
        return this;
    }

    /**
     * 租户状态0:未开通; 1:正常; 2:冻结; 3:关闭; 4、5:注销
     * @return status
     */
    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public ShowDomainStatusResult withFreeQuota(Boolean freeQuota) {
        this.freeQuota = freeQuota;
        return this;
    }

    /**
     * 是否包含免费额度
     * @return freeQuota
     */
    public Boolean getFreeQuota() {
        return freeQuota;
    }

    public void setFreeQuota(Boolean freeQuota) {
        this.freeQuota = freeQuota;
    }

    public ShowDomainStatusResult withAllowCustomEnv(BigDecimal allowCustomEnv) {
        this.allowCustomEnv = allowCustomEnv;
        return this;
    }

    /**
     * 是否启用自定义环境
     * @return allowCustomEnv
     */
    public BigDecimal getAllowCustomEnv() {
        return allowCustomEnv;
    }

    public void setAllowCustomEnv(BigDecimal allowCustomEnv) {
        this.allowCustomEnv = allowCustomEnv;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainStatusResult that = (ShowDomainStatusResult) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.freeQuota, that.freeQuota)
            && Objects.equals(this.allowCustomEnv, that.allowCustomEnv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, freeQuota, allowCustomEnv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainStatusResult {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    freeQuota: ").append(toIndentedString(freeQuota)).append("\n");
        sb.append("    allowCustomEnv: ").append(toIndentedString(allowCustomEnv)).append("\n");
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
