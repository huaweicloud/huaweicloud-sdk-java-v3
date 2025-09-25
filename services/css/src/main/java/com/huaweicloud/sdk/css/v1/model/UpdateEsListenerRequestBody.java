package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEsListenerRequestBody
 */
public class UpdateEsListenerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    private EsListenerRequest listener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public UpdateEsListenerRequestBody withListener(EsListenerRequest listener) {
        this.listener = listener;
        return this;
    }

    public UpdateEsListenerRequestBody withListener(Consumer<EsListenerRequest> listenerSetter) {
        if (this.listener == null) {
            this.listener = new EsListenerRequest();
            listenerSetter.accept(this.listener);
        }

        return this;
    }

    /**
     * Get listener
     * @return listener
     */
    public EsListenerRequest getListener() {
        return listener;
    }

    public void setListener(EsListenerRequest listener) {
        this.listener = listener;
    }

    public UpdateEsListenerRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型：searchTool 表示修改Elasticsearch/Opensearch负载均衡器，viewTool 表示修改Kibana/Opensearch Dashboard 负载均衡器，默认为searchTool 。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEsListenerRequestBody that = (UpdateEsListenerRequestBody) obj;
        return Objects.equals(this.listener, that.listener) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listener, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEsListenerRequestBody {\n");
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
