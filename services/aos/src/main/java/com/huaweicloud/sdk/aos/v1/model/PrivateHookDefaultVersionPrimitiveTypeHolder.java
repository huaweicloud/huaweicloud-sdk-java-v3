package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateHookDefaultVersionPrimitiveTypeHolder
 */
public class PrivateHookDefaultVersionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_version")

    private String defaultVersion;

    public PrivateHookDefaultVersionPrimitiveTypeHolder withDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

    /**
     * 私有hook的默认版本号。版本号必须遵循语义化版本号（Semantic Version），为用户自定义。
     * @return defaultVersion
     */
    public String getDefaultVersion() {
        return defaultVersion;
    }

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateHookDefaultVersionPrimitiveTypeHolder that = (PrivateHookDefaultVersionPrimitiveTypeHolder) obj;
        return Objects.equals(this.defaultVersion, that.defaultVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateHookDefaultVersionPrimitiveTypeHolder {\n");
        sb.append("    defaultVersion: ").append(toIndentedString(defaultVersion)).append("\n");
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
