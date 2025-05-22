package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 重启集群的请求体。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class RestartClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart")

    private Object restart;

    public RestartClusterRequestBody withRestart(Object restart) {
        this.restart = restart;
        return this;
    }

    /**
     * **参数解释**： 重启标识。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return restart
     */
    public Object getRestart() {
        return restart;
    }

    public void setRestart(Object restart) {
        this.restart = restart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartClusterRequestBody that = (RestartClusterRequestBody) obj;
        return Objects.equals(this.restart, that.restart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartClusterRequestBody {\n");
        sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
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
