package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 输出为webhook类型时的配置信息
 */
public class TaskOutputWebhook {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private URI url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    @JacksonXmlProperty(localName = "headers")

    private Object headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    @JacksonXmlProperty(localName = "data_category")

    private List<String> dataCategory = null;

    public TaskOutputWebhook withUrl(URI url) {
        this.url = url;
        return this;
    }

    /**
     * 结果回调地址，选用webhook类型输出时必填。
     * @return url
     */
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public TaskOutputWebhook withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * 结果回调时需要携带的请求头，选用webhook类型输出时必填。整体呈json格式，以键值对的形式表示请求头和取值，至少1组，至多10组。
     * @return headers
     */
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public TaskOutputWebhook withDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    public TaskOutputWebhook addDataCategoryItem(String dataCategoryItem) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        this.dataCategory.add(dataCategoryItem);
        return this;
    }

    public TaskOutputWebhook withDataCategory(Consumer<List<String>> dataCategorySetter) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        dataCategorySetter.accept(this.dataCategory);
        return this;
    }

    /**
     * 作业输出数据类别的列表，选填，仅部分服务需要。当输出类型下有这个列表时，表示希望这个输出类型下存放dataCategory列表内的数据。
     * @return dataCategory
     */
    public List<String> getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(List<String> dataCategory) {
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
        TaskOutputWebhook taskOutputWebhook = (TaskOutputWebhook) o;
        return Objects.equals(this.url, taskOutputWebhook.url)
            && Objects.equals(this.headers, taskOutputWebhook.headers)
            && Objects.equals(this.dataCategory, taskOutputWebhook.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, headers, dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutputWebhook {\n");
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
