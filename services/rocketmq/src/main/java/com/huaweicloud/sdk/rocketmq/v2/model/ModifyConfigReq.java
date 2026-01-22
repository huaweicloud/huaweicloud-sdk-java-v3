package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyConfigReq
 */
public class ModifyConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rocketmq_configs")

    private List<RocketMQConfigReq> rocketmqConfigs = null;

    public ModifyConfigReq withRocketmqConfigs(List<RocketMQConfigReq> rocketmqConfigs) {
        this.rocketmqConfigs = rocketmqConfigs;
        return this;
    }

    public ModifyConfigReq addRocketmqConfigsItem(RocketMQConfigReq rocketmqConfigsItem) {
        if (this.rocketmqConfigs == null) {
            this.rocketmqConfigs = new ArrayList<>();
        }
        this.rocketmqConfigs.add(rocketmqConfigsItem);
        return this;
    }

    public ModifyConfigReq withRocketmqConfigs(Consumer<List<RocketMQConfigReq>> rocketmqConfigsSetter) {
        if (this.rocketmqConfigs == null) {
            this.rocketmqConfigs = new ArrayList<>();
        }
        rocketmqConfigsSetter.accept(this.rocketmqConfigs);
        return this;
    }

    /**
     * **参数解释**： RocketMQ配置。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return rocketmqConfigs
     */
    public List<RocketMQConfigReq> getRocketmqConfigs() {
        return rocketmqConfigs;
    }

    public void setRocketmqConfigs(List<RocketMQConfigReq> rocketmqConfigs) {
        this.rocketmqConfigs = rocketmqConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyConfigReq that = (ModifyConfigReq) obj;
        return Objects.equals(this.rocketmqConfigs, that.rocketmqConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rocketmqConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyConfigReq {\n");
        sb.append("    rocketmqConfigs: ").append(toIndentedString(rocketmqConfigs)).append("\n");
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
