package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateExchangeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "durable")

    private Boolean durable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal")

    private Boolean internal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arguments")

    private Object arguments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_delete")

    private Boolean autoDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    public CreateExchangeResponse withDurable(Boolean durable) {
        this.durable = durable;
        return this;
    }

    /**
     * 是否持久化
     * @return durable
     */
    public Boolean getDurable() {
        return durable;
    }

    public void setDurable(Boolean durable) {
        this.durable = durable;
    }

    public CreateExchangeResponse withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否是默认Exchange
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public CreateExchangeResponse withInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }

    /**
     * 是否是内部Exchange
     * @return internal
     */
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public CreateExchangeResponse withArguments(Object arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * 参数列表
     * @return arguments
     */
    public Object getArguments() {
        return arguments;
    }

    public void setArguments(Object arguments) {
        this.arguments = arguments;
    }

    public CreateExchangeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Exchange名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateExchangeResponse withAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * 是否自动删除
     * @return autoDelete
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public CreateExchangeResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Exchange类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateExchangeResponse withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * 所属Vhost
     * @return vhost
     */
    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateExchangeResponse that = (CreateExchangeResponse) obj;
        return Objects.equals(this.durable, that.durable) && Objects.equals(this._default, that._default)
            && Objects.equals(this.internal, that.internal) && Objects.equals(this.arguments, that.arguments)
            && Objects.equals(this.name, that.name) && Objects.equals(this.autoDelete, that.autoDelete)
            && Objects.equals(this.type, that.type) && Objects.equals(this.vhost, that.vhost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(durable, _default, internal, arguments, name, autoDelete, type, vhost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExchangeResponse {\n");
        sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
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
