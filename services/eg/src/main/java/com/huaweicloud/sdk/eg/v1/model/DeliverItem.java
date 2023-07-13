package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeliverItem
 */
public class DeliverItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptionId")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptionName")

    private String subscriptionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successCounts")

    private Integer successCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failCounts")

    private Integer failCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allDeliverTimes")

    private Integer allDeliverTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverTargetList")

    private List<DeliverTarget> deliverTargetList = null;

    public DeliverItem withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * 订阅ID，全局唯一
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public DeliverItem withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * 订阅名称
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public DeliverItem withSuccessCounts(Integer successCounts) {
        this.successCounts = successCounts;
        return this;
    }

    /**
     * 成功目标个数
     * @return successCounts
     */
    public Integer getSuccessCounts() {
        return successCounts;
    }

    public void setSuccessCounts(Integer successCounts) {
        this.successCounts = successCounts;
    }

    public DeliverItem withFailCounts(Integer failCounts) {
        this.failCounts = failCounts;
        return this;
    }

    /**
     * 失败目标个数
     * @return failCounts
     */
    public Integer getFailCounts() {
        return failCounts;
    }

    public void setFailCounts(Integer failCounts) {
        this.failCounts = failCounts;
    }

    public DeliverItem withAllDeliverTimes(Integer allDeliverTimes) {
        this.allDeliverTimes = allDeliverTimes;
        return this;
    }

    /**
     * 共投递次数
     * @return allDeliverTimes
     */
    public Integer getAllDeliverTimes() {
        return allDeliverTimes;
    }

    public void setAllDeliverTimes(Integer allDeliverTimes) {
        this.allDeliverTimes = allDeliverTimes;
    }

    public DeliverItem withDeliverTargetList(List<DeliverTarget> deliverTargetList) {
        this.deliverTargetList = deliverTargetList;
        return this;
    }

    public DeliverItem addDeliverTargetListItem(DeliverTarget deliverTargetListItem) {
        if (this.deliverTargetList == null) {
            this.deliverTargetList = new ArrayList<>();
        }
        this.deliverTargetList.add(deliverTargetListItem);
        return this;
    }

    public DeliverItem withDeliverTargetList(Consumer<List<DeliverTarget>> deliverTargetListSetter) {
        if (this.deliverTargetList == null) {
            this.deliverTargetList = new ArrayList<>();
        }
        deliverTargetListSetter.accept(this.deliverTargetList);
        return this;
    }

    /**
     * 投递详情
     * @return deliverTargetList
     */
    public List<DeliverTarget> getDeliverTargetList() {
        return deliverTargetList;
    }

    public void setDeliverTargetList(List<DeliverTarget> deliverTargetList) {
        this.deliverTargetList = deliverTargetList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeliverItem that = (DeliverItem) obj;
        return Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.subscriptionName, that.subscriptionName)
            && Objects.equals(this.successCounts, that.successCounts)
            && Objects.equals(this.failCounts, that.failCounts)
            && Objects.equals(this.allDeliverTimes, that.allDeliverTimes)
            && Objects.equals(this.deliverTargetList, that.deliverTargetList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(subscriptionId, subscriptionName, successCounts, failCounts, allDeliverTimes, deliverTargetList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliverItem {\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
        sb.append("    successCounts: ").append(toIndentedString(successCounts)).append("\n");
        sb.append("    failCounts: ").append(toIndentedString(failCounts)).append("\n");
        sb.append("    allDeliverTimes: ").append(toIndentedString(allDeliverTimes)).append("\n");
        sb.append("    deliverTargetList: ").append(toIndentedString(deliverTargetList)).append("\n");
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
