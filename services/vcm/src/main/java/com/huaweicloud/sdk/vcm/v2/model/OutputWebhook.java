package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Webhook地址配置。
 */
public class OutputWebhook {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    @JacksonXmlProperty(localName = "headers")

    private String headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    @JacksonXmlProperty(localName = "data_category")

    private String dataCategory;

    public OutputWebhook withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * URL地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public OutputWebhook withHeaders(String headers) {
        this.headers = headers;
        return this;
    }

    /**
     * header参数设置（键值均为用户设置）。
     * @return headers
     */
    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public OutputWebhook withDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    /**
     * 作业输出数据类别的列表，默认值为[]。有这个列表时，表示希望这个输出结果中存放dataCategory列表内的数据。 取值范围为[FaceImage,OriginImage]。 - FaceImage：表示发送人脸图。 - OriginImage：表示发送原始图。
     * @return dataCategory
     */
    public String getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputWebhook outputWebhook = (OutputWebhook) o;
        return Objects.equals(this.url, outputWebhook.url) && Objects.equals(this.headers, outputWebhook.headers)
            && Objects.equals(this.dataCategory, outputWebhook.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, headers, dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputWebhook {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    dataCategory: ").append(toIndentedString(dataCategory)).append("\n");
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
