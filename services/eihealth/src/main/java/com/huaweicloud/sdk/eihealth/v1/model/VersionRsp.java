package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VersionRsp
 */
public class VersionRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher")

    private String publisher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descritpion")

    private String descritpion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license")

    private String license;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public VersionRsp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 资产版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionRsp withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * 发布者
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public VersionRsp withDescritpion(String descritpion) {
        this.descritpion = descritpion;
        return this;
    }

    /**
     * 资产长描述
     * @return descritpion
     */
    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public VersionRsp withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 资产短描述
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public VersionRsp withLicense(String license) {
        this.license = license;
        return this;
    }

    /**
     * 许可证
     * @return license
     */
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public VersionRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资产状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VersionRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VersionRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionRsp versionRsp = (VersionRsp) o;
        return Objects.equals(this.version, versionRsp.version) && Objects.equals(this.publisher, versionRsp.publisher)
            && Objects.equals(this.descritpion, versionRsp.descritpion)
            && Objects.equals(this.summary, versionRsp.summary) && Objects.equals(this.license, versionRsp.license)
            && Objects.equals(this.status, versionRsp.status) && Objects.equals(this.createTime, versionRsp.createTime)
            && Objects.equals(this.updateTime, versionRsp.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, publisher, descritpion, summary, license, status, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionRsp {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
        sb.append("    descritpion: ").append(toIndentedString(descritpion)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
