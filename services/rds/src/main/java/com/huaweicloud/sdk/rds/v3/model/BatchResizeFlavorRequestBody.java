package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量规格变更请求体请求体
 */
public class BatchResizeFlavorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_pay")

    private Boolean autoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occupy_ip")

    private Boolean occupyIp;

    public BatchResizeFlavorRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public BatchResizeFlavorRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public BatchResizeFlavorRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * **参数解释**：   实例ID列表。   **约束限制**：  一次最多下发10个实例。   **取值范围**：  不涉及。  **默认取值**：   不涉及。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public BatchResizeFlavorRequestBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：  资源规格编码。  **约束限制**：   不涉及。   **取值范围**：  不涉及。   **默认取值**：   不涉及。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public BatchResizeFlavorRequestBody withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /**
     * **参数解释**：  是否进行定时规格变更。  **约束限制**：   不涉及。   **取值范围**：  不涉及。   **默认取值**：   false
     * @return delay
     */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public BatchResizeFlavorRequestBody withAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    /**
     * **参数解释**：  变更包周期实例的规格时可指定，表示是否自动从客户的账户中支付。  **约束限制**：   不涉及。   **取值范围**：  不涉及。   **默认取值**：   false
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return autoPay;
    }

    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    public BatchResizeFlavorRequestBody withOccupyIp(Boolean occupyIp) {
        this.occupyIp = occupyIp;
        return this;
    }

    /**
     * **参数解释**：  表示是否占用ip进行规格变更。  **约束限制**：   不涉及。   **取值范围**：  不涉及。   **默认取值**：   true
     * @return occupyIp
     */
    public Boolean getOccupyIp() {
        return occupyIp;
    }

    public void setOccupyIp(Boolean occupyIp) {
        this.occupyIp = occupyIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchResizeFlavorRequestBody that = (BatchResizeFlavorRequestBody) obj;
        return Objects.equals(this.instanceIds, that.instanceIds) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.delay, that.delay) && Objects.equals(this.autoPay, that.autoPay)
            && Objects.equals(this.occupyIp, that.occupyIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, specCode, delay, autoPay, occupyIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResizeFlavorRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    autoPay: ").append(toIndentedString(autoPay)).append("\n");
        sb.append("    occupyIp: ").append(toIndentedString(occupyIp)).append("\n");
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
