package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置检测检查项修复失败原因
 */
public class CheckRuleFixFailDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_fail_reason")

    private String fixFailReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    public CheckRuleFixFailDetailInfo withFixFailReason(String fixFailReason) {
        this.fixFailReason = fixFailReason;
        return this;
    }

    /**
     * **参数解释**: 修复失败原因 **取值范围**: 字符长度0-65534位 
     * @return fixFailReason
     */
    public String getFixFailReason() {
        return fixFailReason;
    }

    public void setFixFailReason(String fixFailReason) {
        this.fixFailReason = fixFailReason;
    }

    public CheckRuleFixFailDetailInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRuleFixFailDetailInfo that = (CheckRuleFixFailDetailInfo) obj;
        return Objects.equals(this.fixFailReason, that.fixFailReason) && Objects.equals(this.hostName, that.hostName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixFailReason, hostName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRuleFixFailDetailInfo {\n");
        sb.append("    fixFailReason: ").append(toIndentedString(fixFailReason)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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
