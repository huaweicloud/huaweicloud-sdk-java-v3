package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomMetrics
 */
public class CustomMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec")

    private Exec exec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_get")

    private HttpGet httpGet;

    public CustomMetrics withExec(Exec exec) {
        this.exec = exec;
        return this;
    }

    public CustomMetrics withExec(Consumer<Exec> execSetter) {
        if (this.exec == null) {
            this.exec = new Exec();
            execSetter.accept(this.exec);
        }

        return this;
    }

    /**
     * Get exec
     * @return exec
     */
    public Exec getExec() {
        return exec;
    }

    public void setExec(Exec exec) {
        this.exec = exec;
    }

    public CustomMetrics withHttpGet(HttpGet httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public CustomMetrics withHttpGet(Consumer<HttpGet> httpGetSetter) {
        if (this.httpGet == null) {
            this.httpGet = new HttpGet();
            httpGetSetter.accept(this.httpGet);
        }

        return this;
    }

    /**
     * Get httpGet
     * @return httpGet
     */
    public HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomMetrics that = (CustomMetrics) obj;
        return Objects.equals(this.exec, that.exec) && Objects.equals(this.httpGet, that.httpGet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exec, httpGet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomMetrics {\n");
        sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
        sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
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
