package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConnectorOrderRequestBody
 */
public class ConnectorOrderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public ConnectorOrderRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 需要关闭connector的实例id，和请求路径上的一致。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ConnectorOrderRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 提交关闭connector订单后前端跳转的页面
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectorOrderRequestBody connectorOrderRequestBody = (ConnectorOrderRequestBody) o;
        return Objects.equals(this.instanceId, connectorOrderRequestBody.instanceId)
            && Objects.equals(this.url, connectorOrderRequestBody.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectorOrderRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
