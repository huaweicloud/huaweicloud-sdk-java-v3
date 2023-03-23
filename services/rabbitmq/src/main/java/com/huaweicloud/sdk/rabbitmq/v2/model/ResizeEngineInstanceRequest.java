package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResizeEngineInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResizeEngineInstanceReq body;

    public ResizeEngineInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ResizeEngineInstanceRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 消息引擎的类型。支持的类型为rabbitmq。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ResizeEngineInstanceRequest withBody(ResizeEngineInstanceReq body) {
        this.body = body;
        return this;
    }

    public ResizeEngineInstanceRequest withBody(Consumer<ResizeEngineInstanceReq> bodySetter) {
        if (this.body == null) {
            this.body = new ResizeEngineInstanceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResizeEngineInstanceReq getBody() {
        return body;
    }

    public void setBody(ResizeEngineInstanceReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeEngineInstanceRequest resizeEngineInstanceRequest = (ResizeEngineInstanceRequest) o;
        return Objects.equals(this.instanceId, resizeEngineInstanceRequest.instanceId)
            && Objects.equals(this.engine, resizeEngineInstanceRequest.engine)
            && Objects.equals(this.body, resizeEngineInstanceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, engine, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeEngineInstanceRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
