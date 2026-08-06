package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetkeyRotationStatusResponseBodyKeyMaterials
 */
public class GetkeyRotationStatusResponseBodyKeyMaterials {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "material_id")

    private String materialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_id")

    private String chargeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private String expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    public GetkeyRotationStatusResponseBodyKeyMaterials withMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }

    /**
     * **参数解释：** 密钥材料ID **取值范围：** uuid格式
     * @return materialId
     */
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public GetkeyRotationStatusResponseBodyKeyMaterials withChargeId(String chargeId) {
        this.chargeId = chargeId;
        return this;
    }

    /**
     * **参数解释：** 计费ID **取值范围：** 不涉及
     * @return chargeId
     */
    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public GetkeyRotationStatusResponseBodyKeyMaterials withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 密钥材料创建时间 **取值范围：** 不涉及
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public GetkeyRotationStatusResponseBodyKeyMaterials withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * **参数解释：** 密钥材料过期时间 **取值范围：** 不涉及
     * @return expirationTime
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public GetkeyRotationStatusResponseBodyKeyMaterials withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 密钥材料状态 **取值范围：** 0：等待轮转状态；2：启用状态
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetkeyRotationStatusResponseBodyKeyMaterials that = (GetkeyRotationStatusResponseBodyKeyMaterials) obj;
        return Objects.equals(this.materialId, that.materialId) && Objects.equals(this.chargeId, that.chargeId)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.expirationTime, that.expirationTime) && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materialId, chargeId, createTime, expirationTime, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetkeyRotationStatusResponseBodyKeyMaterials {\n");
        sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
        sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
