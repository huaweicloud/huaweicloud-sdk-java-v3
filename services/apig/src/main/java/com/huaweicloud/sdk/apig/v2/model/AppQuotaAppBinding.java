package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 凭据与凭据配额绑定信息
 */
public class AppQuotaAppBinding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_quota_id")

    private String appQuotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bound_time")

    private OffsetDateTime boundTime;

    public AppQuotaAppBinding withAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
        return this;
    }

    /**
     * 凭据配额编号
     * @return appQuotaId
     */
    public String getAppQuotaId() {
        return appQuotaId;
    }

    public void setAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
    }

    public AppQuotaAppBinding withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 凭据编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AppQuotaAppBinding withBoundTime(OffsetDateTime boundTime) {
        this.boundTime = boundTime;
        return this;
    }

    /**
     * 绑定时间
     * @return boundTime
     */
    public OffsetDateTime getBoundTime() {
        return boundTime;
    }

    public void setBoundTime(OffsetDateTime boundTime) {
        this.boundTime = boundTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppQuotaAppBinding that = (AppQuotaAppBinding) obj;
        return Objects.equals(this.appQuotaId, that.appQuotaId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.boundTime, that.boundTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appQuotaId, appId, boundTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppQuotaAppBinding {\n");
        sb.append("    appQuotaId: ").append(toIndentedString(appQuotaId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    boundTime: ").append(toIndentedString(boundTime)).append("\n");
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
