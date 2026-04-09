package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyDBPayTypeRequestBody
 */
public class ModifyDBPayTypeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_ids")

    private List<String> entityIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private PeriodChargeInfoOption chargeInfo;

    public ModifyDBPayTypeRequestBody withEntityIds(List<String> entityIds) {
        this.entityIds = entityIds;
        return this;
    }

    public ModifyDBPayTypeRequestBody addEntityIdsItem(String entityIdsItem) {
        if (this.entityIds == null) {
            this.entityIds = new ArrayList<>();
        }
        this.entityIds.add(entityIdsItem);
        return this;
    }

    public ModifyDBPayTypeRequestBody withEntityIds(Consumer<List<String>> entityIdsSetter) {
        if (this.entityIds == null) {
            this.entityIds = new ArrayList<>();
        }
        entityIdsSetter.accept(this.entityIds);
        return this;
    }

    /**
     * **参数解释**: 需要转成包周期计费模式的实例ID列表。 **约束限制**: 不涉及。
     * @return entityIds
     */
    public List<String> getEntityIds() {
        return entityIds;
    }

    public void setEntityIds(List<String> entityIds) {
        this.entityIds = entityIds;
    }

    public ModifyDBPayTypeRequestBody withChargeInfo(PeriodChargeInfoOption chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public ModifyDBPayTypeRequestBody withChargeInfo(Consumer<PeriodChargeInfoOption> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new PeriodChargeInfoOption();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public PeriodChargeInfoOption getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(PeriodChargeInfoOption chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyDBPayTypeRequestBody that = (ModifyDBPayTypeRequestBody) obj;
        return Objects.equals(this.entityIds, that.entityIds) && Objects.equals(this.chargeInfo, that.chargeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityIds, chargeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyDBPayTypeRequestBody {\n");
        sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
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
