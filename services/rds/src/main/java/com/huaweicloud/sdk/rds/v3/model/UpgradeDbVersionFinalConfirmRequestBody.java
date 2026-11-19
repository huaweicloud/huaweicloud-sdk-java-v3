package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**  小版本升级成功后，确认是否完成升级请求体。  **约束限制**  不涉及。
 */
public class UpgradeDbVersionFinalConfirmRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_rollback")

    private Boolean forceRollback;

    public UpgradeDbVersionFinalConfirmRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**  要进行的操作。confirm表示确认完成升级，rollback表示要回滚至原始版本  **取值范围**  confirm,rollback  **约束限制**  不涉及  **默认取值**  不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UpgradeDbVersionFinalConfirmRequestBody withForceRollback(Boolean forceRollback) {
        this.forceRollback = forceRollback;
        return this;
    }

    /**
     * **参数解释**  回滚时是否强制回滚  **取值范围**  true,false  **约束限制**  不涉及  **默认取值**  false
     * @return forceRollback
     */
    public Boolean getForceRollback() {
        return forceRollback;
    }

    public void setForceRollback(Boolean forceRollback) {
        this.forceRollback = forceRollback;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeDbVersionFinalConfirmRequestBody that = (UpgradeDbVersionFinalConfirmRequestBody) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.forceRollback, that.forceRollback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, forceRollback);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeDbVersionFinalConfirmRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    forceRollback: ").append(toIndentedString(forceRollback)).append("\n");
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
