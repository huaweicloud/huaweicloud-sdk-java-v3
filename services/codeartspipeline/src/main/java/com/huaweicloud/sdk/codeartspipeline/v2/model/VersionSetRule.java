package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 依赖规则列表
 */
public class VersionSetRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecosystem")

    private String ecosystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_version")

    private String packageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "predicate")

    private String predicate;

    public VersionSetRule withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public VersionSetRule withEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
        return this;
    }

    /**
     * 依赖类型
     * @return ecosystem
     */
    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    public VersionSetRule withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 包名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public VersionSetRule withPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }

    /**
     * 包版本
     * @return packageVersion
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    public VersionSetRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则说明
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VersionSetRule withPredicate(String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     * 比较规则
     * @return predicate
     */
    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionSetRule that = (VersionSetRule) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.ecosystem, that.ecosystem)
            && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.packageVersion, that.packageVersion)
            && Objects.equals(this.description, that.description) && Objects.equals(this.predicate, that.predicate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, ecosystem, packageName, packageVersion, description, predicate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionSetRule {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    packageVersion: ").append(toIndentedString(packageVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
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
