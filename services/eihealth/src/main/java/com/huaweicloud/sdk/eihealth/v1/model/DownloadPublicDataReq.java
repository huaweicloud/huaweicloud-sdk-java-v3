package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 下载文件请求体
 */
public class DownloadPublicDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private DownloadPublicDataTypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public DownloadPublicDataReq withType(DownloadPublicDataTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public DownloadPublicDataTypeEnum getType() {
        return type;
    }

    public void setType(DownloadPublicDataTypeEnum type) {
        this.type = type;
    }

    public DownloadPublicDataReq withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**：   资源地址，支持https、obs地址。   **约束限制**：   不涉及   **取值范围**：   长度为[1-2000]个字符。 **默认取值**：   不涉及 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadPublicDataReq that = (DownloadPublicDataReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadPublicDataReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
