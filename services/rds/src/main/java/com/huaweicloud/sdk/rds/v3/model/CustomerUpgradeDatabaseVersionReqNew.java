package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerUpgradeDatabaseVersionReqNew
 */
public class CustomerUpgradeDatabaseVersionReqNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delayed")

    private Boolean isDelayed;

    public CustomerUpgradeDatabaseVersionReqNew withIsDelayed(Boolean isDelayed) {
        this.isDelayed = isDelayed;
        return this;
    }

    /**
     * 是否延迟至可维护时间段内升级。 取值范围： - true：延迟升级。表示实例将在设置的可维护时间段内升级。 - false：立即升级，默认该方式。
     * @return isDelayed
     */
    public Boolean getIsDelayed() {
        return isDelayed;
    }

    public void setIsDelayed(Boolean isDelayed) {
        this.isDelayed = isDelayed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomerUpgradeDatabaseVersionReqNew that = (CustomerUpgradeDatabaseVersionReqNew) obj;
        return Objects.equals(this.isDelayed, that.isDelayed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDelayed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerUpgradeDatabaseVersionReqNew {\n");
        sb.append("    isDelayed: ").append(toIndentedString(isDelayed)).append("\n");
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
