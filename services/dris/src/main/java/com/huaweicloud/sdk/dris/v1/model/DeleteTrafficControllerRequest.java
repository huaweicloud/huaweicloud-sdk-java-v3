package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTrafficControllerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_controller_id")

    private String trafficControllerId;

    public DeleteTrafficControllerRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * \"**参数说明**：实例ID。dris物理实例的唯一标识。获取方法参见[获取Instance-Id](https://support.huaweicloud.com/api-v2x/v2x_04_0030.html)。  **取值范围**：仅支持数字，小写字母和横杠（-）的组合，长度36。\"
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteTrafficControllerRequest withTrafficControllerId(String trafficControllerId) {
        this.trafficControllerId = trafficControllerId;
        return this;
    }

    /**
     * traffic_controller_id
     * @return trafficControllerId
     */
    public String getTrafficControllerId() {
        return trafficControllerId;
    }

    public void setTrafficControllerId(String trafficControllerId) {
        this.trafficControllerId = trafficControllerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTrafficControllerRequest deleteTrafficControllerRequest = (DeleteTrafficControllerRequest) o;
        return Objects.equals(this.instanceId, deleteTrafficControllerRequest.instanceId)
            && Objects.equals(this.trafficControllerId, deleteTrafficControllerRequest.trafficControllerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, trafficControllerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTrafficControllerRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    trafficControllerId: ").append(toIndentedString(trafficControllerId)).append("\n");
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
