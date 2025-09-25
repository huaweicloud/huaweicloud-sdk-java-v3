package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 防护小结信息
 */
public class ProtectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_area_info")

    private ProtectInfoCoverAreaInfo coverAreaInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_info")

    private ProtectInfoConfigInfo configInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_info")

    private ProtectInfoQuotaInfo quotaInfo;

    public ProtectInfo withCoverAreaInfo(ProtectInfoCoverAreaInfo coverAreaInfo) {
        this.coverAreaInfo = coverAreaInfo;
        return this;
    }

    public ProtectInfo withCoverAreaInfo(Consumer<ProtectInfoCoverAreaInfo> coverAreaInfoSetter) {
        if (this.coverAreaInfo == null) {
            this.coverAreaInfo = new ProtectInfoCoverAreaInfo();
            coverAreaInfoSetter.accept(this.coverAreaInfo);
        }

        return this;
    }

    /**
     * Get coverAreaInfo
     * @return coverAreaInfo
     */
    public ProtectInfoCoverAreaInfo getCoverAreaInfo() {
        return coverAreaInfo;
    }

    public void setCoverAreaInfo(ProtectInfoCoverAreaInfo coverAreaInfo) {
        this.coverAreaInfo = coverAreaInfo;
    }

    public ProtectInfo withConfigInfo(ProtectInfoConfigInfo configInfo) {
        this.configInfo = configInfo;
        return this;
    }

    public ProtectInfo withConfigInfo(Consumer<ProtectInfoConfigInfo> configInfoSetter) {
        if (this.configInfo == null) {
            this.configInfo = new ProtectInfoConfigInfo();
            configInfoSetter.accept(this.configInfo);
        }

        return this;
    }

    /**
     * Get configInfo
     * @return configInfo
     */
    public ProtectInfoConfigInfo getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(ProtectInfoConfigInfo configInfo) {
        this.configInfo = configInfo;
    }

    public ProtectInfo withQuotaInfo(ProtectInfoQuotaInfo quotaInfo) {
        this.quotaInfo = quotaInfo;
        return this;
    }

    public ProtectInfo withQuotaInfo(Consumer<ProtectInfoQuotaInfo> quotaInfoSetter) {
        if (this.quotaInfo == null) {
            this.quotaInfo = new ProtectInfoQuotaInfo();
            quotaInfoSetter.accept(this.quotaInfo);
        }

        return this;
    }

    /**
     * Get quotaInfo
     * @return quotaInfo
     */
    public ProtectInfoQuotaInfo getQuotaInfo() {
        return quotaInfo;
    }

    public void setQuotaInfo(ProtectInfoQuotaInfo quotaInfo) {
        this.quotaInfo = quotaInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectInfo that = (ProtectInfo) obj;
        return Objects.equals(this.coverAreaInfo, that.coverAreaInfo)
            && Objects.equals(this.configInfo, that.configInfo) && Objects.equals(this.quotaInfo, that.quotaInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coverAreaInfo, configInfo, quotaInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectInfo {\n");
        sb.append("    coverAreaInfo: ").append(toIndentedString(coverAreaInfo)).append("\n");
        sb.append("    configInfo: ").append(toIndentedString(configInfo)).append("\n");
        sb.append("    quotaInfo: ").append(toIndentedString(quotaInfo)).append("\n");
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
