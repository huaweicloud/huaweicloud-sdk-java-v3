package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更改数据库代理ALT开关的请求体
 */
public class SwitchGaussMySqlProxyAltRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alt_enabled")

    private String altEnabled;

    public SwitchGaussMySqlProxyAltRequestBody withAltEnabled(String altEnabled) {
        this.altEnabled = altEnabled;
        return this;
    }

    /**
     * **参数解释**：  ALT开关状态。  **取值范围**： - on：开启。 - off：关闭。  **默认取值**： 不涉及。
     * @return altEnabled
     */
    public String getAltEnabled() {
        return altEnabled;
    }

    public void setAltEnabled(String altEnabled) {
        this.altEnabled = altEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchGaussMySqlProxyAltRequestBody that = (SwitchGaussMySqlProxyAltRequestBody) obj;
        return Objects.equals(this.altEnabled, that.altEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(altEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchGaussMySqlProxyAltRequestBody {\n");
        sb.append("    altEnabled: ").append(toIndentedString(altEnabled)).append("\n");
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
