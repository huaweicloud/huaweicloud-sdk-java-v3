package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowForwardingConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_configs")

    private List<ForwardingConfig> forwardingConfigs = null;

    public ShowForwardingConfigsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：满足查询条件的记录总数。
     * minimum: 0
     * maximum: 10000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowForwardingConfigsResponse withForwardingConfigs(List<ForwardingConfig> forwardingConfigs) {
        this.forwardingConfigs = forwardingConfigs;
        return this;
    }

    public ShowForwardingConfigsResponse addForwardingConfigsItem(ForwardingConfig forwardingConfigsItem) {
        if (this.forwardingConfigs == null) {
            this.forwardingConfigs = new ArrayList<>();
        }
        this.forwardingConfigs.add(forwardingConfigsItem);
        return this;
    }

    public ShowForwardingConfigsResponse withForwardingConfigs(
        Consumer<List<ForwardingConfig>> forwardingConfigsSetter) {
        if (this.forwardingConfigs == null) {
            this.forwardingConfigs = new ArrayList<>();
        }
        forwardingConfigsSetter.accept(this.forwardingConfigs);
        return this;
    }

    /**
     * **参数说明**：转发配置的列表。
     * @return forwardingConfigs
     */
    public List<ForwardingConfig> getForwardingConfigs() {
        return forwardingConfigs;
    }

    public void setForwardingConfigs(List<ForwardingConfig> forwardingConfigs) {
        this.forwardingConfigs = forwardingConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowForwardingConfigsResponse that = (ShowForwardingConfigsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.forwardingConfigs, that.forwardingConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, forwardingConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowForwardingConfigsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    forwardingConfigs: ").append(toIndentedString(forwardingConfigs)).append("\n");
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
