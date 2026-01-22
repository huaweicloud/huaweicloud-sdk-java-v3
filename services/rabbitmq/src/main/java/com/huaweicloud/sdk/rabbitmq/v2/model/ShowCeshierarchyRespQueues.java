package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowCeshierarchyRespQueues
 */
public class ShowCeshierarchyRespQueues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    public ShowCeshierarchyRespQueues withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： Queue名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCeshierarchyRespQueues withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * **参数解释**： 对应的Vhost。 **取值范围**： 不涉及。
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
        ShowCeshierarchyRespQueues that = (ShowCeshierarchyRespQueues) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.vhost, that.vhost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vhost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCeshierarchyRespQueues {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
