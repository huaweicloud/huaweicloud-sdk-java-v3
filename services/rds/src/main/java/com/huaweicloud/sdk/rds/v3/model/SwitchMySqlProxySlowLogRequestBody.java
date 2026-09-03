package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更改数据库代理慢日志上报开关请求体
 */
public class SwitchMySqlProxySlowLogRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_slow_log_enabled")

    private String ltsSlowLogEnabled;

    public SwitchMySqlProxySlowLogRequestBody withLtsSlowLogEnabled(String ltsSlowLogEnabled) {
        this.ltsSlowLogEnabled = ltsSlowLogEnabled;
        return this;
    }

    /**
     * **参数解释**：  慢日志上报开关。  **约束限制**：  不涉及。  **取值范围**：  - on：开启。 - off：关闭。  **默认取值**：  不涉及。
     * @return ltsSlowLogEnabled
     */
    public String getLtsSlowLogEnabled() {
        return ltsSlowLogEnabled;
    }

    public void setLtsSlowLogEnabled(String ltsSlowLogEnabled) {
        this.ltsSlowLogEnabled = ltsSlowLogEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchMySqlProxySlowLogRequestBody that = (SwitchMySqlProxySlowLogRequestBody) obj;
        return Objects.equals(this.ltsSlowLogEnabled, that.ltsSlowLogEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsSlowLogEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchMySqlProxySlowLogRequestBody {\n");
        sb.append("    ltsSlowLogEnabled: ").append(toIndentedString(ltsSlowLogEnabled)).append("\n");
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
