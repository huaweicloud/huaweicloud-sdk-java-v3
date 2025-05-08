package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRocketMqConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_offset")

    private Integer nextOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_offset")

    private Integer previousOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rocketmq_configs")

    private List<RocketMQConfigResp> rocketmqConfigs = null;

    public ShowRocketMqConfigsResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 总数。
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShowRocketMqConfigsResponse withNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }

    /**
     * 下个分页的offset。
     * @return nextOffset
     */
    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public ShowRocketMqConfigsResponse withPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
        return this;
    }

    /**
     * 上个分页的offset。
     * @return previousOffset
     */
    public Integer getPreviousOffset() {
        return previousOffset;
    }

    public void setPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
    }

    public ShowRocketMqConfigsResponse withRocketmqConfigs(List<RocketMQConfigResp> rocketmqConfigs) {
        this.rocketmqConfigs = rocketmqConfigs;
        return this;
    }

    public ShowRocketMqConfigsResponse addRocketmqConfigsItem(RocketMQConfigResp rocketmqConfigsItem) {
        if (this.rocketmqConfigs == null) {
            this.rocketmqConfigs = new ArrayList<>();
        }
        this.rocketmqConfigs.add(rocketmqConfigsItem);
        return this;
    }

    public ShowRocketMqConfigsResponse withRocketmqConfigs(Consumer<List<RocketMQConfigResp>> rocketmqConfigsSetter) {
        if (this.rocketmqConfigs == null) {
            this.rocketmqConfigs = new ArrayList<>();
        }
        rocketmqConfigsSetter.accept(this.rocketmqConfigs);
        return this;
    }

    /**
     * RocketMQ配置。
     * @return rocketmqConfigs
     */
    public List<RocketMQConfigResp> getRocketmqConfigs() {
        return rocketmqConfigs;
    }

    public void setRocketmqConfigs(List<RocketMQConfigResp> rocketmqConfigs) {
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
        ShowRocketMqConfigsResponse that = (ShowRocketMqConfigsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.nextOffset, that.nextOffset)
            && Objects.equals(this.previousOffset, that.previousOffset)
            && Objects.equals(this.rocketmqConfigs, that.rocketmqConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, nextOffset, previousOffset, rocketmqConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRocketMqConfigsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
        sb.append("    previousOffset: ").append(toIndentedString(previousOffset)).append("\n");
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
