package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  升级预检查结果。  **取值范围**：  不涉及。
 */
public class UpgradeDatabasePrecheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item")

    private String checkItem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_description")

    private String checkDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_object")

    private String checkObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_status")

    private String checkStatus;

    public UpgradeDatabasePrecheckResult withCheckItem(String checkItem) {
        this.checkItem = checkItem;
        return this;
    }

    /**
     * **参数解释**：  升级预检查项目。  **取值范围**：  - Upgrade permission check：升级权限检查。 - Instance version check：实例源版本检查。 - Resource check：资源检查。 - Upgrade feature compatibility check：升级特性兼容性检查。
     * @return checkItem
     */
    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public UpgradeDatabasePrecheckResult withCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
        return this;
    }

    /**
     * **参数解释**：  升级预检查项说明。  **取值范围**：  不涉及。
     * @return checkDescription
     */
    public String getCheckDescription() {
        return checkDescription;
    }

    public void setCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
    }

    public UpgradeDatabasePrecheckResult withCheckObject(String checkObject) {
        this.checkObject = checkObject;
        return this;
    }

    /**
     * **参数解释**：  升级预检查对象。  **取值范围**：  不涉及。
     * @return checkObject
     */
    public String getCheckObject() {
        return checkObject;
    }

    public void setCheckObject(String checkObject) {
        this.checkObject = checkObject;
    }

    public UpgradeDatabasePrecheckResult withCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    /**
     * **参数解释**：  升级预检查项的检查状态。  **取值范围**：  - passed：检查通过。 - failed：检查失败。
     * @return checkStatus
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeDatabasePrecheckResult that = (UpgradeDatabasePrecheckResult) obj;
        return Objects.equals(this.checkItem, that.checkItem)
            && Objects.equals(this.checkDescription, that.checkDescription)
            && Objects.equals(this.checkObject, that.checkObject) && Objects.equals(this.checkStatus, that.checkStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkItem, checkDescription, checkObject, checkStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeDatabasePrecheckResult {\n");
        sb.append("    checkItem: ").append(toIndentedString(checkItem)).append("\n");
        sb.append("    checkDescription: ").append(toIndentedString(checkDescription)).append("\n");
        sb.append("    checkObject: ").append(toIndentedString(checkObject)).append("\n");
        sb.append("    checkStatus: ").append(toIndentedString(checkStatus)).append("\n");
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
