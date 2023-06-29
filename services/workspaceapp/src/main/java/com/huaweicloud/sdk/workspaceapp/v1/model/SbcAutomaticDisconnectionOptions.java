package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SbcAutomaticDisconnectionOptions
 */
public class SbcAutomaticDisconnectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnection_waiting_time")

    private Integer disconnectionWaitingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sbc_auto_logout")

    private Boolean sbcAutoLogout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_logout_options")

    private AutoLogoutOptions autoLogoutOptions;

    public SbcAutomaticDisconnectionOptions withDisconnectionWaitingTime(Integer disconnectionWaitingTime) {
        this.disconnectionWaitingTime = disconnectionWaitingTime;
        return this;
    }

    /**
     * 等待时间（分钟）
     * minimum: 3
     * maximum: 86400
     * @return disconnectionWaitingTime
     */
    public Integer getDisconnectionWaitingTime() {
        return disconnectionWaitingTime;
    }

    public void setDisconnectionWaitingTime(Integer disconnectionWaitingTime) {
        this.disconnectionWaitingTime = disconnectionWaitingTime;
    }

    public SbcAutomaticDisconnectionOptions withSbcAutoLogout(Boolean sbcAutoLogout) {
        this.sbcAutoLogout = sbcAutoLogout;
        return this;
    }

    /**
     * 是否自动注销。取值为：false：表示是。true：表示否。
     * @return sbcAutoLogout
     */
    public Boolean getSbcAutoLogout() {
        return sbcAutoLogout;
    }

    public void setSbcAutoLogout(Boolean sbcAutoLogout) {
        this.sbcAutoLogout = sbcAutoLogout;
    }

    public SbcAutomaticDisconnectionOptions withAutoLogoutOptions(AutoLogoutOptions autoLogoutOptions) {
        this.autoLogoutOptions = autoLogoutOptions;
        return this;
    }

    public SbcAutomaticDisconnectionOptions withAutoLogoutOptions(Consumer<AutoLogoutOptions> autoLogoutOptionsSetter) {
        if (this.autoLogoutOptions == null) {
            this.autoLogoutOptions = new AutoLogoutOptions();
            autoLogoutOptionsSetter.accept(this.autoLogoutOptions);
        }

        return this;
    }

    /**
     * Get autoLogoutOptions
     * @return autoLogoutOptions
     */
    public AutoLogoutOptions getAutoLogoutOptions() {
        return autoLogoutOptions;
    }

    public void setAutoLogoutOptions(AutoLogoutOptions autoLogoutOptions) {
        this.autoLogoutOptions = autoLogoutOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SbcAutomaticDisconnectionOptions that = (SbcAutomaticDisconnectionOptions) obj;
        return Objects.equals(this.disconnectionWaitingTime, that.disconnectionWaitingTime)
            && Objects.equals(this.sbcAutoLogout, that.sbcAutoLogout)
            && Objects.equals(this.autoLogoutOptions, that.autoLogoutOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disconnectionWaitingTime, sbcAutoLogout, autoLogoutOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SbcAutomaticDisconnectionOptions {\n");
        sb.append("    disconnectionWaitingTime: ").append(toIndentedString(disconnectionWaitingTime)).append("\n");
        sb.append("    sbcAutoLogout: ").append(toIndentedString(sbcAutoLogout)).append("\n");
        sb.append("    autoLogoutOptions: ").append(toIndentedString(autoLogoutOptions)).append("\n");
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
