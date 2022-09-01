package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVolumeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    @JacksonXmlProperty(localName = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_ids")

    @JacksonXmlProperty(localName = "volume_ids")

    private List<String> volumeIds = null;

    public CreateVolumeResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID，云硬盘为按需计费时返回该参数。 > 说明： >  > 如果需要查询job的状态，请参考：\"[查询job的状态](https://support.huaweicloud.com/api-evs/evs_04_0054.html)\"。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateVolumeResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID，云硬盘为包周期计费时返回该参数。 > 说明： > 直接在包周期云服务器上新增云硬盘，系统会自动将云硬盘挂载到包周期云服务器上。该情形下也会返回该参数。  > - 如果您需要支付订单，请参考：\"[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\"。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateVolumeResponse withVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public CreateVolumeResponse addVolumeIdsItem(String volumeIdsItem) {
        if (this.volumeIds == null) {
            this.volumeIds = new ArrayList<>();
        }
        this.volumeIds.add(volumeIdsItem);
        return this;
    }

    public CreateVolumeResponse withVolumeIds(Consumer<List<String>> volumeIdsSetter) {
        if (this.volumeIds == null) {
            this.volumeIds = new ArrayList<>();
        }
        volumeIdsSetter.accept(this.volumeIds);
        return this;
    }

    /**
     * 待创建的云硬盘ID列表，在请求体的metadata字段中指定create_for_volume_id为true时才返回该参数。
     * @return volumeIds
     */
    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public void setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVolumeResponse createVolumeResponse = (CreateVolumeResponse) o;
        return Objects.equals(this.jobId, createVolumeResponse.jobId)
            && Objects.equals(this.orderId, createVolumeResponse.orderId)
            && Objects.equals(this.volumeIds, createVolumeResponse.volumeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, orderId, volumeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVolumeResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
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
