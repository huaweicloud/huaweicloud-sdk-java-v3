package com.huaweicloud.sdk.codeartsgovernance.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HmVulnInfoDataReport
 */
public class HmVulnInfoDataReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private HmVulnInfoDataDetail detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    public HmVulnInfoDataReport withDetail(HmVulnInfoDataDetail detail) {
        this.detail = detail;
        return this;
    }

    public HmVulnInfoDataReport withDetail(Consumer<HmVulnInfoDataDetail> detailSetter) {
        if (this.detail == null) {
            this.detail = new HmVulnInfoDataDetail();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public HmVulnInfoDataDetail getDetail() {
        return detail;
    }

    public void setDetail(HmVulnInfoDataDetail detail) {
        this.detail = detail;
    }

    public HmVulnInfoDataReport withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HmVulnInfoDataReport that = (HmVulnInfoDataReport) obj;
        return Objects.equals(this.detail, that.detail) && Objects.equals(this.fileName, that.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HmVulnInfoDataReport {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
