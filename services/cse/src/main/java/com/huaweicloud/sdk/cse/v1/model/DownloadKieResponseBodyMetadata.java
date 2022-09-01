package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 导出文件的描述信息
 */
public class DownloadKieResponseBodyMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    @JacksonXmlProperty(localName = "annotations")

    private Object annotations;

    public DownloadKieResponseBodyMetadata withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DownloadKieResponseBodyMetadata withAnnotations(Object annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * 导出文件的其他信息
     * @return annotations
     */
    public Object getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Object annotations) {
        this.annotations = annotations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadKieResponseBodyMetadata downloadKieResponseBodyMetadata = (DownloadKieResponseBodyMetadata) o;
        return Objects.equals(this.version, downloadKieResponseBodyMetadata.version)
            && Objects.equals(this.annotations, downloadKieResponseBodyMetadata.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadKieResponseBodyMetadata {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
