package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HttpGet
 */
public class HttpGet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public HttpGet withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**： http获取指标的url路径，与下面的端口必须同时填或者不填。 **取值范围**： 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HttpGet withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： http获取指标的端口，与上面的url路径必须同时填或者不填。 **取值范围**： 不涉及。
     * minimum: 10001
     * maximum: 20000
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpGet that = (HttpGet) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpGet {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
