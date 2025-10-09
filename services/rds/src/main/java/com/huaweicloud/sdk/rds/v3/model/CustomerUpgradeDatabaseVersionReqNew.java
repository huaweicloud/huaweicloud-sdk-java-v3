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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_switch")

    private Boolean secondSwitch;

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

    public CustomerUpgradeDatabaseVersionReqNew withSecondSwitch(Boolean secondSwitch) {
        this.secondSwitch = secondSwitch;
        return this;
    }

    /**
     * 设置仅对RDS for MySQL数据库实例（主备）生效。主备实例升级过程中，备机升级成功后，会触发主备倒换继续升级主机，主机升级完成后，若主备可用区不同则触发第二次倒换，保证可用区不变。若主备可用区相同，该选项无效。 取值范围： - true：默认该方式。表示升级过程中会进行二次倒换保证主备实例可用区不变。 - false：升级过程中不进行第二次主备倒换，适合对主备所在可用区不敏感，对业务连续性敏感的客户。
     * @return secondSwitch
     */
    public Boolean getSecondSwitch() {
        return secondSwitch;
    }

    public void setSecondSwitch(Boolean secondSwitch) {
        this.secondSwitch = secondSwitch;
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
        return Objects.equals(this.isDelayed, that.isDelayed) && Objects.equals(this.secondSwitch, that.secondSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDelayed, secondSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerUpgradeDatabaseVersionReqNew {\n");
        sb.append("    isDelayed: ").append(toIndentedString(isDelayed)).append("\n");
        sb.append("    secondSwitch: ").append(toIndentedString(secondSwitch)).append("\n");
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
