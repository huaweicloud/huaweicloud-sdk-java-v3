package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 默认的附件sop
 */
public class DefaultSop {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_cn_name")

    private String fileCnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_cn_id")

    private String fileCnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_en_name")

    private String fileEnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_en_id")

    private String fileEnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownership")

    private String ownership;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_options")

    private Boolean defaultOptions;

    public DefaultSop withFileCnName(String fileCnName) {
        this.fileCnName = fileCnName;
        return this;
    }

    /**
     * 中文版本文件名称
     * @return fileCnName
     */
    public String getFileCnName() {
        return fileCnName;
    }

    public void setFileCnName(String fileCnName) {
        this.fileCnName = fileCnName;
    }

    public DefaultSop withFileCnId(String fileCnId) {
        this.fileCnId = fileCnId;
        return this;
    }

    /**
     * 中文版本文件id
     * @return fileCnId
     */
    public String getFileCnId() {
        return fileCnId;
    }

    public void setFileCnId(String fileCnId) {
        this.fileCnId = fileCnId;
    }

    public DefaultSop withFileEnName(String fileEnName) {
        this.fileEnName = fileEnName;
        return this;
    }

    /**
     * 英文版本文件名称
     * @return fileEnName
     */
    public String getFileEnName() {
        return fileEnName;
    }

    public void setFileEnName(String fileEnName) {
        this.fileEnName = fileEnName;
    }

    public DefaultSop withFileEnId(String fileEnId) {
        this.fileEnId = fileEnId;
        return this;
    }

    /**
     * 英文版本文件id
     * @return fileEnId
     */
    public String getFileEnId() {
        return fileEnId;
    }

    public void setFileEnId(String fileEnId) {
        this.fileEnId = fileEnId;
    }

    public DefaultSop withOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }

    /**
     * 归属组织
     * @return ownership
     */
    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public DefaultSop withDefaultOptions(Boolean defaultOptions) {
        this.defaultOptions = defaultOptions;
        return this;
    }

    /**
     * 是否默认
     * @return defaultOptions
     */
    public Boolean getDefaultOptions() {
        return defaultOptions;
    }

    public void setDefaultOptions(Boolean defaultOptions) {
        this.defaultOptions = defaultOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultSop that = (DefaultSop) obj;
        return Objects.equals(this.fileCnName, that.fileCnName) && Objects.equals(this.fileCnId, that.fileCnId)
            && Objects.equals(this.fileEnName, that.fileEnName) && Objects.equals(this.fileEnId, that.fileEnId)
            && Objects.equals(this.ownership, that.ownership)
            && Objects.equals(this.defaultOptions, that.defaultOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileCnName, fileCnId, fileEnName, fileEnId, ownership, defaultOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefaultSop {\n");
        sb.append("    fileCnName: ").append(toIndentedString(fileCnName)).append("\n");
        sb.append("    fileCnId: ").append(toIndentedString(fileCnId)).append("\n");
        sb.append("    fileEnName: ").append(toIndentedString(fileEnName)).append("\n");
        sb.append("    fileEnId: ").append(toIndentedString(fileEnId)).append("\n");
        sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
        sb.append("    defaultOptions: ").append(toIndentedString(defaultOptions)).append("\n");
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
