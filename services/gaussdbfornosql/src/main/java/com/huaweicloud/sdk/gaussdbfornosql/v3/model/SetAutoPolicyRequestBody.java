package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetAutoPolicyRequestBody
 */
public class SetAutoPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private String switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private List<DiskAutoExpansionPolicy> policy = null;

    public SetAutoPolicyRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public SetAutoPolicyRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public SetAutoPolicyRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 设置磁盘自动扩容的实例组ID。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public SetAutoPolicyRequestBody withSwitchOption(String switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * 自动扩容开关。  “on”，表示开启磁盘自动扩容策略。  “off”，表示关闭磁盘自动扩容策略。 默认值为“on”。
     * @return switchOption
     */
    public String getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(String switchOption) {
        this.switchOption = switchOption;
    }

    public SetAutoPolicyRequestBody withPolicy(List<DiskAutoExpansionPolicy> policy) {
        this.policy = policy;
        return this;
    }

    public SetAutoPolicyRequestBody addPolicyItem(DiskAutoExpansionPolicy policyItem) {
        if (this.policy == null) {
            this.policy = new ArrayList<>();
        }
        this.policy.add(policyItem);
        return this;
    }

    public SetAutoPolicyRequestBody withPolicy(Consumer<List<DiskAutoExpansionPolicy>> policySetter) {
        if (this.policy == null) {
            this.policy = new ArrayList<>();
        }
        policySetter.accept(this.policy);
        return this;
    }

    /**
     * 磁盘自动扩容策略
     * @return policy
     */
    public List<DiskAutoExpansionPolicy> getPolicy() {
        return policy;
    }

    public void setPolicy(List<DiskAutoExpansionPolicy> policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAutoPolicyRequestBody that = (SetAutoPolicyRequestBody) obj;
        return Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.switchOption, that.switchOption) && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, switchOption, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAutoPolicyRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
