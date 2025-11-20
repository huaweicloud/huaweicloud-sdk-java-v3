package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckTaskSpec
 */
public class CheckTaskSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTargetVersion")

    private String addonTargetVersion;

    public CheckTaskSpec withAddonTargetVersion(String addonTargetVersion) {
        this.addonTargetVersion = addonTargetVersion;
        return this;
    }

    /**
     * **参数解释：** 插件升级目标版本 **取值范围：** 不涉及 
     * @return addonTargetVersion
     */
    public String getAddonTargetVersion() {
        return addonTargetVersion;
    }

    public void setAddonTargetVersion(String addonTargetVersion) {
        this.addonTargetVersion = addonTargetVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckTaskSpec that = (CheckTaskSpec) obj;
        return Objects.equals(this.addonTargetVersion, that.addonTargetVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addonTargetVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTaskSpec {\n");
        sb.append("    addonTargetVersion: ").append(toIndentedString(addonTargetVersion)).append("\n");
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
