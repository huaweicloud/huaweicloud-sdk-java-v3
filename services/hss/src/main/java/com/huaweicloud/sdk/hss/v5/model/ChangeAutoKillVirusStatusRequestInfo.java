package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 程序自动隔离查杀开关状态请求体
 */
public class ChangeAutoKillVirusStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public ChangeAutoKillVirusStatusRequestInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**： 程序自动隔离查杀开关状态 **约束限制**: 不涉及 **取值范围**： - true：开启 - false：关闭  **默认取值**: false 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeAutoKillVirusStatusRequestInfo that = (ChangeAutoKillVirusStatusRequestInfo) obj;
        return Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAutoKillVirusStatusRequestInfo {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
