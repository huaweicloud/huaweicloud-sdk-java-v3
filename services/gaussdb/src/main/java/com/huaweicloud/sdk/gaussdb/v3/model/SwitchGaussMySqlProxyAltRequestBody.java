package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ALT开关对象。
 */
public class SwitchGaussMySqlProxyAltRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alt_enabled")

    private String altEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alt_for_readonly")

    private String altForReadonly;

    public SwitchGaussMySqlProxyAltRequestBody withAltEnabled(String altEnabled) {
        this.altEnabled = altEnabled;
        return this;
    }

    /**
     * **参数解释**：  ALT开关。  **约束限制**：  不涉及。  **取值范围**：  - on：开启。  - off：关闭。  **默认取值**：  不涉及。 
     * @return altEnabled
     */
    public String getAltEnabled() {
        return altEnabled;
    }

    public void setAltEnabled(String altEnabled) {
        this.altEnabled = altEnabled;
    }

    public SwitchGaussMySqlProxyAltRequestBody withAltForReadonly(String altForReadonly) {
        this.altForReadonly = altForReadonly;
        return this;
    }

    /**
     * **参数解释**：  只读ALT开关。  **约束限制**：  不涉及。  **取值范围**：  - on：开启。  - off：关闭。  **默认取值**：  off。
     * @return altForReadonly
     */
    public String getAltForReadonly() {
        return altForReadonly;
    }

    public void setAltForReadonly(String altForReadonly) {
        this.altForReadonly = altForReadonly;
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
        return Objects.equals(this.altEnabled, that.altEnabled)
            && Objects.equals(this.altForReadonly, that.altForReadonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(altEnabled, altForReadonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchGaussMySqlProxyAltRequestBody {\n");
        sb.append("    altEnabled: ").append(toIndentedString(altEnabled)).append("\n");
        sb.append("    altForReadonly: ").append(toIndentedString(altForReadonly)).append("\n");
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
