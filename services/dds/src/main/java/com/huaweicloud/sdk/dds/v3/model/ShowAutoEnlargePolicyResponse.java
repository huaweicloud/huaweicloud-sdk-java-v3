package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAutoEnlargePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private String switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private DiskAutoExpansionPolicy policy;

    public ShowAutoEnlargePolicyResponse withSwitchOption(String switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * **参数解释：** 自动扩容开关。 **取值范围：** - on:开启磁盘自动扩容策略。 - off: 关闭磁盘自动扩容策略。
     * @return switchOption
     */
    public String getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(String switchOption) {
        this.switchOption = switchOption;
    }

    public ShowAutoEnlargePolicyResponse withPolicy(DiskAutoExpansionPolicy policy) {
        this.policy = policy;
        return this;
    }

    public ShowAutoEnlargePolicyResponse withPolicy(Consumer<DiskAutoExpansionPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new DiskAutoExpansionPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public DiskAutoExpansionPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(DiskAutoExpansionPolicy policy) {
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
        ShowAutoEnlargePolicyResponse that = (ShowAutoEnlargePolicyResponse) obj;
        return Objects.equals(this.switchOption, that.switchOption) && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoEnlargePolicyResponse {\n");
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
