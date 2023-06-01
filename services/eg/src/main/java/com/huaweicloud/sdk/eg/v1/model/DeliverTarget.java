package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeliverTarget
 */
public class DeliverTarget {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverTargetId")

    private String deliverTargetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverTargetName")

    private String deliverTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverStatus")

    private String deliverStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverDetailList")

    private List<DeliverDetail> deliverDetailList = null;

    public DeliverTarget withDeliverTargetId(String deliverTargetId) {
        this.deliverTargetId = deliverTargetId;
        return this;
    }

    /**
     * 投递目标ID，即事件目标ID
     * @return deliverTargetId
     */
    public String getDeliverTargetId() {
        return deliverTargetId;
    }

    public void setDeliverTargetId(String deliverTargetId) {
        this.deliverTargetId = deliverTargetId;
    }

    public DeliverTarget withDeliverTargetName(String deliverTargetName) {
        this.deliverTargetName = deliverTargetName;
        return this;
    }

    /**
     * 投递目标名称，及事件目标名称
     * @return deliverTargetName
     */
    public String getDeliverTargetName() {
        return deliverTargetName;
    }

    public void setDeliverTargetName(String deliverTargetName) {
        this.deliverTargetName = deliverTargetName;
    }

    public DeliverTarget withDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus;
        return this;
    }

    /**
     * 投递状态         SUCCESS Or  FAILED
     * @return deliverStatus
     */
    public String getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public DeliverTarget withDeliverDetailList(List<DeliverDetail> deliverDetailList) {
        this.deliverDetailList = deliverDetailList;
        return this;
    }

    public DeliverTarget addDeliverDetailListItem(DeliverDetail deliverDetailListItem) {
        if (this.deliverDetailList == null) {
            this.deliverDetailList = new ArrayList<>();
        }
        this.deliverDetailList.add(deliverDetailListItem);
        return this;
    }

    public DeliverTarget withDeliverDetailList(Consumer<List<DeliverDetail>> deliverDetailListSetter) {
        if (this.deliverDetailList == null) {
            this.deliverDetailList = new ArrayList<>();
        }
        deliverDetailListSetter.accept(this.deliverDetailList);
        return this;
    }

    /**
     * 考虑展示的个数    例如限制只展示最新三条
     * @return deliverDetailList
     */
    public List<DeliverDetail> getDeliverDetailList() {
        return deliverDetailList;
    }

    public void setDeliverDetailList(List<DeliverDetail> deliverDetailList) {
        this.deliverDetailList = deliverDetailList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeliverTarget deliverTarget = (DeliverTarget) o;
        return Objects.equals(this.deliverTargetId, deliverTarget.deliverTargetId)
            && Objects.equals(this.deliverTargetName, deliverTarget.deliverTargetName)
            && Objects.equals(this.deliverStatus, deliverTarget.deliverStatus)
            && Objects.equals(this.deliverDetailList, deliverTarget.deliverDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliverTargetId, deliverTargetName, deliverStatus, deliverDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliverTarget {\n");
        sb.append("    deliverTargetId: ").append(toIndentedString(deliverTargetId)).append("\n");
        sb.append("    deliverTargetName: ").append(toIndentedString(deliverTargetName)).append("\n");
        sb.append("    deliverStatus: ").append(toIndentedString(deliverStatus)).append("\n");
        sb.append("    deliverDetailList: ").append(toIndentedString(deliverDetailList)).append("\n");
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
