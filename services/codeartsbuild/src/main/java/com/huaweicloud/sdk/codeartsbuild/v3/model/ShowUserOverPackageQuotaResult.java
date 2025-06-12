package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结果
 */
public class ShowUserOverPackageQuotaResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_over_quota")

    private Boolean isOverQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_quota")

    private String buildQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_quota")

    private String usedQuota;

    public ShowUserOverPackageQuotaResult withIsOverQuota(Boolean isOverQuota) {
        this.isOverQuota = isOverQuota;
        return this;
    }

    /**
     * 套餐超期
     * @return isOverQuota
     */
    public Boolean getIsOverQuota() {
        return isOverQuota;
    }

    public void setIsOverQuota(Boolean isOverQuota) {
        this.isOverQuota = isOverQuota;
    }

    public ShowUserOverPackageQuotaResult withBuildQuota(String buildQuota) {
        this.buildQuota = buildQuota;
        return this;
    }

    /**
     * 构建套餐
     * @return buildQuota
     */
    public String getBuildQuota() {
        return buildQuota;
    }

    public void setBuildQuota(String buildQuota) {
        this.buildQuota = buildQuota;
    }

    public ShowUserOverPackageQuotaResult withUsedQuota(String usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }

    /**
     * 已使用的套餐用量，套餐为unlimit时无此信息
     * @return usedQuota
     */
    public String getUsedQuota() {
        return usedQuota;
    }

    public void setUsedQuota(String usedQuota) {
        this.usedQuota = usedQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserOverPackageQuotaResult that = (ShowUserOverPackageQuotaResult) obj;
        return Objects.equals(this.isOverQuota, that.isOverQuota) && Objects.equals(this.buildQuota, that.buildQuota)
            && Objects.equals(this.usedQuota, that.usedQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOverQuota, buildQuota, usedQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserOverPackageQuotaResult {\n");
        sb.append("    isOverQuota: ").append(toIndentedString(isOverQuota)).append("\n");
        sb.append("    buildQuota: ").append(toIndentedString(buildQuota)).append("\n");
        sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
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
