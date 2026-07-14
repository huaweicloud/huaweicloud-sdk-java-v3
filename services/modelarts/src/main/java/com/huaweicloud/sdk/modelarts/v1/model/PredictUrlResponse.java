package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 在线服务访问地址。
 */
public class PredictUrlResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    public PredictUrlResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 访问方式。 **取值范围：** - CONSOLE：通过控制台界面访问。 - PUBLIC：通过公网访问。 - INTERNAL：通过内网访问。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PredictUrlResponse withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public PredictUrlResponse addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public PredictUrlResponse withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * **参数解释：** 推理请求的访问地址，仅当type为REAL_TIME时，且服务部署完成后才会确保该字段有值。
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PredictUrlResponse that = (PredictUrlResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.urls, that.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, urls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PredictUrlResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
