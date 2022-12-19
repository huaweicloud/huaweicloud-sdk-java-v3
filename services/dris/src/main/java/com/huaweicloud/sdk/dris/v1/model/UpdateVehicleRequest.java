package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVehicleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_id")

    private String vehicleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyVehicleRequestDTO body;

    public UpdateVehicleRequest withInstanceId(String instanceId) {
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

    public UpdateVehicleRequest withVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
        return this;
    }

    /**
     * **参数说明**：车辆唯一标识符。  **取值范围**：长度不超过128，只允许字母、数字、以及_-等字符的组合。 
     * @return vehicleId
     */
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public UpdateVehicleRequest withBody(ModifyVehicleRequestDTO body) {
        this.body = body;
        return this;
    }

    public UpdateVehicleRequest withBody(Consumer<ModifyVehicleRequestDTO> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyVehicleRequestDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyVehicleRequestDTO getBody() {
        return body;
    }

    public void setBody(ModifyVehicleRequestDTO body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVehicleRequest updateVehicleRequest = (UpdateVehicleRequest) o;
        return Objects.equals(this.instanceId, updateVehicleRequest.instanceId)
            && Objects.equals(this.vehicleId, updateVehicleRequest.vehicleId)
            && Objects.equals(this.body, updateVehicleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, vehicleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVehicleRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
