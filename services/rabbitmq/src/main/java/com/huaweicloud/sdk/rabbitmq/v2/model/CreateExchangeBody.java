package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateExchangeBody
 */
public class CreateExchangeBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "durable")

    private Boolean durable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_delete")

    private Boolean autoDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal")

    private Boolean internal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arguments")

    private Object arguments;

    public CreateExchangeBody withName(String name) {
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

    public CreateExchangeBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： Exchange类型。 **约束限制**： 不涉及。 **取值范围**： - direct：该类型Exchange会将消息路由到Routing Key完全匹配的Queue中。 - fanout：该类型Exchange会将消息路由到所有与其绑定的Queue中。 - topic：该类型Exchange将Routing Key进行通配符匹配，然后将消息路由到匹配成功的Queue中。 - headers：该类型Exchange与Routing Key无关，而与消息中的Headers属性信息相关。Exchange根据消息中的Headers属性键值对和绑定的属性键值对进行匹配，根据匹配情况路由消息。 **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateExchangeBody withDurable(Boolean durable) {
        this.durable = durable;
        return this;
    }

    /**
     * 是否持久化[（AMQP版本默认持久化，不涉及此参数）](tag:hws,hws_hk,hws_eu)。
     * @return durable
     */
    public Boolean getDurable() {
        return durable;
    }

    public void setDurable(Boolean durable) {
        this.durable = durable;
    }

    public CreateExchangeBody withAutoDelete(Boolean autoDelete) {
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

    public CreateExchangeBody withInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }

    /**
     * 内部Exchange[（AMQP版本不支持内部Exchange，不涉及此参数）](tag:hws,hws_hk,hws_eu)。
     * @return internal
     */
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public CreateExchangeBody withArguments(Object arguments) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateExchangeBody that = (CreateExchangeBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.durable, that.durable) && Objects.equals(this.autoDelete, that.autoDelete)
            && Objects.equals(this.internal, that.internal) && Objects.equals(this.arguments, that.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, durable, autoDelete, internal, arguments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExchangeBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
        sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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
