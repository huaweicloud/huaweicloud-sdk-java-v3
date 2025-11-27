package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReleaseParams
 */
public class ReleaseParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace")

    private Boolean replace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recreate")

    private Boolean recreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_hooks")

    private Boolean noHooks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_values")

    private Boolean resetValues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_template")

    private String nameTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_version")

    private Integer releaseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_hooks")

    private Boolean includeHooks;

    public ReleaseParams withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 是否仅模拟安装过程
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public ReleaseParams withReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }

    /**
     * 是否允许重用已存在的名称
     * @return replace
     */
    public Boolean getReplace() {
        return replace;
    }

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    public ReleaseParams withRecreate(Boolean recreate) {
        this.recreate = recreate;
        return this;
    }

    /**
     * 是否强制重新创建资源
     * @return recreate
     */
    public Boolean getRecreate() {
        return recreate;
    }

    public void setRecreate(Boolean recreate) {
        this.recreate = recreate;
    }

    public ReleaseParams withNoHooks(Boolean noHooks) {
        this.noHooks = noHooks;
        return this;
    }

    /**
     * 是否禁止hook
     * @return noHooks
     */
    public Boolean getNoHooks() {
        return noHooks;
    }

    public void setNoHooks(Boolean noHooks) {
        this.noHooks = noHooks;
    }

    public ReleaseParams withResetValues(Boolean resetValues) {
        this.resetValues = resetValues;
        return this;
    }

    /**
     * 更新时重设values
     * @return resetValues
     */
    public Boolean getResetValues() {
        return resetValues;
    }

    public void setResetValues(Boolean resetValues) {
        this.resetValues = resetValues;
    }

    public ReleaseParams withNameTemplate(String nameTemplate) {
        this.nameTemplate = nameTemplate;
        return this;
    }

    /**
     * 发布资源的名称模板
     * @return nameTemplate
     */
    public String getNameTemplate() {
        return nameTemplate;
    }

    public void setNameTemplate(String nameTemplate) {
        this.nameTemplate = nameTemplate;
    }

    public ReleaseParams withReleaseVersion(Integer releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }

    /**
     * 指定回滚版本号
     * @return releaseVersion
     */
    public Integer getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(Integer releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public ReleaseParams withIncludeHooks(Boolean includeHooks) {
        this.includeHooks = includeHooks;
        return this;
    }

    /**
     * 更新或删除时是否允许hook
     * @return includeHooks
     */
    public Boolean getIncludeHooks() {
        return includeHooks;
    }

    public void setIncludeHooks(Boolean includeHooks) {
        this.includeHooks = includeHooks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReleaseParams that = (ReleaseParams) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.replace, that.replace)
            && Objects.equals(this.recreate, that.recreate) && Objects.equals(this.noHooks, that.noHooks)
            && Objects.equals(this.resetValues, that.resetValues)
            && Objects.equals(this.nameTemplate, that.nameTemplate)
            && Objects.equals(this.releaseVersion, that.releaseVersion)
            && Objects.equals(this.includeHooks, that.includeHooks);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dryRun, replace, recreate, noHooks, resetValues, nameTemplate, releaseVersion, includeHooks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReleaseParams {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
        sb.append("    recreate: ").append(toIndentedString(recreate)).append("\n");
        sb.append("    noHooks: ").append(toIndentedString(noHooks)).append("\n");
        sb.append("    resetValues: ").append(toIndentedString(resetValues)).append("\n");
        sb.append("    nameTemplate: ").append(toIndentedString(nameTemplate)).append("\n");
        sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
        sb.append("    includeHooks: ").append(toIndentedString(includeHooks)).append("\n");
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
