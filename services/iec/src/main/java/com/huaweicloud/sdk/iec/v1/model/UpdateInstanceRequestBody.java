package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新边缘实例请求体
 */
public class UpdateInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    @JacksonXmlProperty(localName = "server")

    private UpdateInstanceOption server;

    public UpdateInstanceRequestBody withServer(UpdateInstanceOption server) {
        this.server = server;
        return this;
    }

    public UpdateInstanceRequestBody withServer(Consumer<UpdateInstanceOption> serverSetter) {
        if (this.server == null) {
            this.server = new UpdateInstanceOption();
            serverSetter.accept(this.server);
        }

        return this;
    }

    /**
     * Get server
     * @return server
     */
    public UpdateInstanceOption getServer() {
        return server;
    }

    public void setServer(UpdateInstanceOption server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceRequestBody updateInstanceRequestBody = (UpdateInstanceRequestBody) o;
        return Objects.equals(this.server, updateInstanceRequestBody.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRequestBody {\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
