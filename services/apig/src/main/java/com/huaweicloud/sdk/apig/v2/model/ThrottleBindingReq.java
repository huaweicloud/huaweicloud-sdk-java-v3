package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ThrottleBindingReq
 */
public class ThrottleBindingReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="strategy_id")
    
    private String strategyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_ids")
    
    private List<String> publishIds = null;
    
    public ThrottleBindingReq withStrategyId(String strategyId) {
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

    

    public ThrottleBindingReq withPublishIds(List<String> publishIds) {
        this.publishIds = publishIds;
        return this;
    }

    
    public ThrottleBindingReq addPublishIdsItem(String publishIdsItem) {
        this.publishIds.add(publishIdsItem);
        return this;
    }

    public ThrottleBindingReq withPublishIds(Consumer<List<String>> publishIdsSetter) {
        if(this.publishIds == null ){
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
        ThrottleBindingReq throttleBindingReq = (ThrottleBindingReq) o;
        return Objects.equals(this.strategyId, throttleBindingReq.strategyId) &&
            Objects.equals(this.publishIds, throttleBindingReq.publishIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(strategyId, publishIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleBindingReq {\n");
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

