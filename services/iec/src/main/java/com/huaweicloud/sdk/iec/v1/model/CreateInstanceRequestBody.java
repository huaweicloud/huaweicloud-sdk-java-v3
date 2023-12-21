package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建边缘实例请求对象
 */
public class CreateInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private CreateInstanceOption server;

    public CreateInstanceRequestBody withServer(CreateInstanceOption server) {
        this.server = server;
        return this;
    }

    public CreateInstanceRequestBody withServer(Consumer<CreateInstanceOption> serverSetter) {
        if (this.server == null) {
            this.server = new CreateInstanceOption();
            serverSetter.accept(this.server);
        }

        return this;
    }

    /**
     * Get server
     * @return server
     */
    public CreateInstanceOption getServer() {
        return server;
    }

    public void setServer(CreateInstanceOption server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceRequestBody that = (CreateInstanceRequestBody) obj;
        return Objects.equals(this.server, that.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceRequestBody {\n");
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
