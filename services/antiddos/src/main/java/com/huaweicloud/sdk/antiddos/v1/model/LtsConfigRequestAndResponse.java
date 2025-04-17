package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 日志配置请求
 */
public class LtsConfigRequestAndResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_id_info")

    private LtsConfigRequestAndResponseLtsIdInfo ltsIdInfo;

    public LtsConfigRequestAndResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启日志
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public LtsConfigRequestAndResponse withLtsIdInfo(LtsConfigRequestAndResponseLtsIdInfo ltsIdInfo) {
        this.ltsIdInfo = ltsIdInfo;
        return this;
    }

    public LtsConfigRequestAndResponse withLtsIdInfo(Consumer<LtsConfigRequestAndResponseLtsIdInfo> ltsIdInfoSetter) {
        if (this.ltsIdInfo == null) {
            this.ltsIdInfo = new LtsConfigRequestAndResponseLtsIdInfo();
            ltsIdInfoSetter.accept(this.ltsIdInfo);
        }

        return this;
    }

    /**
     * Get ltsIdInfo
     * @return ltsIdInfo
     */
    public LtsConfigRequestAndResponseLtsIdInfo getLtsIdInfo() {
        return ltsIdInfo;
    }

    public void setLtsIdInfo(LtsConfigRequestAndResponseLtsIdInfo ltsIdInfo) {
        this.ltsIdInfo = ltsIdInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsConfigRequestAndResponse that = (LtsConfigRequestAndResponse) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.ltsIdInfo, that.ltsIdInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, ltsIdInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsConfigRequestAndResponse {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    ltsIdInfo: ").append(toIndentedString(ltsIdInfo)).append("\n");
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
