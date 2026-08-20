package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResidualResources
 */
public class ResidualResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_listener_id")

    private String elbListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_pool_id")

    private String elbPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_id")

    private String vpcepId;

    public ResidualResources withElbListenerId(String elbListenerId) {
        this.elbListenerId = elbListenerId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器监听器ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return elbListenerId
     */
    public String getElbListenerId() {
        return elbListenerId;
    }

    public void setElbListenerId(String elbListenerId) {
        this.elbListenerId = elbListenerId;
    }

    public ResidualResources withElbPoolId(String elbPoolId) {
        this.elbPoolId = elbPoolId;
        return this;
    }

    /**
     * **参数解释：** 后端服务器组ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return elbPoolId
     */
    public String getElbPoolId() {
        return elbPoolId;
    }

    public void setElbPoolId(String elbPoolId) {
        this.elbPoolId = elbPoolId;
    }

    public ResidualResources withVpcepId(String vpcepId) {
        this.vpcepId = vpcepId;
        return this;
    }

    /**
     * **参数解释：** 终端节点ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return vpcepId
     */
    public String getVpcepId() {
        return vpcepId;
    }

    public void setVpcepId(String vpcepId) {
        this.vpcepId = vpcepId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResidualResources that = (ResidualResources) obj;
        return Objects.equals(this.elbListenerId, that.elbListenerId) && Objects.equals(this.elbPoolId, that.elbPoolId)
            && Objects.equals(this.vpcepId, that.vpcepId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elbListenerId, elbPoolId, vpcepId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResidualResources {\n");
        sb.append("    elbListenerId: ").append(toIndentedString(elbListenerId)).append("\n");
        sb.append("    elbPoolId: ").append(toIndentedString(elbPoolId)).append("\n");
        sb.append("    vpcepId: ").append(toIndentedString(vpcepId)).append("\n");
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
