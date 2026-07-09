package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateFlavorByTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderId")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changeMode")

    private Integer changeMode;

    public UpdateFlavorByTypeResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * **参数解释**： 变更订单ID，仅包周期集群返回。 **取值范围**： 不涉及
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public UpdateFlavorByTypeResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID，仅包周期集群返回。 **取值范围**： 不涉及
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateFlavorByTypeResponse withChangeMode(Integer changeMode) {
        this.changeMode = changeMode;
        return this;
    }

    /**
     * **参数解释**： 变更模式，仅包周期集群返回。 **取值范围**： - 10：升配。 - 30：降配。
     * @return changeMode
     */
    public Integer getChangeMode() {
        return changeMode;
    }

    public void setChangeMode(Integer changeMode) {
        this.changeMode = changeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFlavorByTypeResponse that = (UpdateFlavorByTypeResponse) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.changeMode, that.changeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, clusterId, changeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlavorByTypeResponse {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    changeMode: ").append(toIndentedString(changeMode)).append("\n");
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
