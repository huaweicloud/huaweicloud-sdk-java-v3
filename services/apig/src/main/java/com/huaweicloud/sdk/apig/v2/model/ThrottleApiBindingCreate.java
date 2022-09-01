package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThrottleApiBindingCreate
 */
public class ThrottleApiBindingCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_id")

    @JacksonXmlProperty(localName = "strategy_id")

    private String strategyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_ids")

    @JacksonXmlProperty(localName = "publish_ids")

    private List<String> publishIds = null;

    public ThrottleApiBindingCreate withStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * 流控策略编号
     * @return strategyId
     */
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public ThrottleApiBindingCreate withPublishIds(List<String> publishIds) {
        this.publishIds = publishIds;
        return this;
    }

    public ThrottleApiBindingCreate addPublishIdsItem(String publishIdsItem) {
        if (this.publishIds == null) {
            this.publishIds = new ArrayList<>();
        }
        this.publishIds.add(publishIdsItem);
        return this;
    }

    public ThrottleApiBindingCreate withPublishIds(Consumer<List<String>> publishIdsSetter) {
        if (this.publishIds == null) {
            this.publishIds = new ArrayList<>();
        }
        publishIdsSetter.accept(this.publishIds);
        return this;
    }

    /**
     * API的发布记录编号
     * @return publishIds
     */
    public List<String> getPublishIds() {
        return publishIds;
    }

    public void setPublishIds(List<String> publishIds) {
        this.publishIds = publishIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleApiBindingCreate throttleApiBindingCreate = (ThrottleApiBindingCreate) o;
        return Objects.equals(this.strategyId, throttleApiBindingCreate.strategyId)
            && Objects.equals(this.publishIds, throttleApiBindingCreate.publishIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategyId, publishIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleApiBindingCreate {\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    publishIds: ").append(toIndentedString(publishIds)).append("\n");
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
