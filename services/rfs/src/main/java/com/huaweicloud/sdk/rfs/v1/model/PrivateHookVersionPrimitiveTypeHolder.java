package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateHookVersionPrimitiveTypeHolder
 */
public class PrivateHookVersionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_version")

    private String hookVersion;

    public PrivateHookVersionPrimitiveTypeHolder withHookVersion(String hookVersion) {
        this.hookVersion = hookVersion;
        return this;
    }

    /**
     * 私有hook的版本号。版本号必须遵循语义化版本号（Semantic Version），为用户自定义。
     * @return hookVersion
     */
    public String getHookVersion() {
        return hookVersion;
    }

    public void setHookVersion(String hookVersion) {
        this.hookVersion = hookVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateHookVersionPrimitiveTypeHolder that = (PrivateHookVersionPrimitiveTypeHolder) obj;
        return Objects.equals(this.hookVersion, that.hookVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateHookVersionPrimitiveTypeHolder {\n");
        sb.append("    hookVersion: ").append(toIndentedString(hookVersion)).append("\n");
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
