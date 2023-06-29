package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * version取值为0.0.0的时候，代表当前组件的配置
 */
public class ComponentConfigCompare {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_version")

    private String baseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_version")

    private String compareVersion;

    public ComponentConfigCompare withBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
        return this;
    }

    /**
     * Get baseVersion
     * @return baseVersion
     */
    public String getBaseVersion() {
        return baseVersion;
    }

    public void setBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
    }

    public ComponentConfigCompare withCompareVersion(String compareVersion) {
        this.compareVersion = compareVersion;
        return this;
    }

    /**
     * Get compareVersion
     * @return compareVersion
     */
    public String getCompareVersion() {
        return compareVersion;
    }

    public void setCompareVersion(String compareVersion) {
        this.compareVersion = compareVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentConfigCompare that = (ComponentConfigCompare) obj;
        return Objects.equals(this.baseVersion, that.baseVersion)
            && Objects.equals(this.compareVersion, that.compareVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseVersion, compareVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentConfigCompare {\n");
        sb.append("    baseVersion: ").append(toIndentedString(baseVersion)).append("\n");
        sb.append("    compareVersion: ").append(toIndentedString(compareVersion)).append("\n");
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
