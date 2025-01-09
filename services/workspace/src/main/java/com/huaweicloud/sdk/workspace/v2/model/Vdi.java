package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Vdi
 */
public class Vdi {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_lock_enable")

    private Boolean autoLockEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_lock_options")

    private AutoLockOptions autoLockOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnect_logout_enable")

    private Integer disconnectLogoutEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnect_logout_options")

    private DisconnectLogoutOptions disconnectLogoutOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnect_hibernate_enable")

    private Boolean disconnectHibernateEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnect_hibernate_options")

    private VdiDisconnectHibernateOptions disconnectHibernateOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_operation_hibernate_enable")

    private Boolean noOperationHibernateEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_operation_hibernate_options")

    private VdiNoOperationHibernateOptions noOperationHibernateOptions;

    public Vdi withAutoLockEnable(Boolean autoLockEnable) {
        this.autoLockEnable = autoLockEnable;
        return this;
    }

    /**
     * 是否开启自动锁屏。取值为：false：表示关闭。true：表示开启。
     * @return autoLockEnable
     */
    public Boolean getAutoLockEnable() {
        return autoLockEnable;
    }

    public void setAutoLockEnable(Boolean autoLockEnable) {
        this.autoLockEnable = autoLockEnable;
    }

    public Vdi withAutoLockOptions(AutoLockOptions autoLockOptions) {
        this.autoLockOptions = autoLockOptions;
        return this;
    }

    public Vdi withAutoLockOptions(Consumer<AutoLockOptions> autoLockOptionsSetter) {
        if (this.autoLockOptions == null) {
            this.autoLockOptions = new AutoLockOptions();
            autoLockOptionsSetter.accept(this.autoLockOptions);
        }

        return this;
    }

    /**
     * Get autoLockOptions
     * @return autoLockOptions
     */
    public AutoLockOptions getAutoLockOptions() {
        return autoLockOptions;
    }

    public void setAutoLockOptions(AutoLockOptions autoLockOptions) {
        this.autoLockOptions = autoLockOptions;
    }

    public Vdi withDisconnectLogoutEnable(Integer disconnectLogoutEnable) {
        this.disconnectLogoutEnable = disconnectLogoutEnable;
        return this;
    }

    /**
     * 是否开启断开后自动注销。取值为：0：表示关闭。1：表示开启。
     * minimum: 0
     * maximum: 55
     * @return disconnectLogoutEnable
     */
    public Integer getDisconnectLogoutEnable() {
        return disconnectLogoutEnable;
    }

    public void setDisconnectLogoutEnable(Integer disconnectLogoutEnable) {
        this.disconnectLogoutEnable = disconnectLogoutEnable;
    }

    public Vdi withDisconnectLogoutOptions(DisconnectLogoutOptions disconnectLogoutOptions) {
        this.disconnectLogoutOptions = disconnectLogoutOptions;
        return this;
    }

    public Vdi withDisconnectLogoutOptions(Consumer<DisconnectLogoutOptions> disconnectLogoutOptionsSetter) {
        if (this.disconnectLogoutOptions == null) {
            this.disconnectLogoutOptions = new DisconnectLogoutOptions();
            disconnectLogoutOptionsSetter.accept(this.disconnectLogoutOptions);
        }

        return this;
    }

    /**
     * Get disconnectLogoutOptions
     * @return disconnectLogoutOptions
     */
    public DisconnectLogoutOptions getDisconnectLogoutOptions() {
        return disconnectLogoutOptions;
    }

    public void setDisconnectLogoutOptions(DisconnectLogoutOptions disconnectLogoutOptions) {
        this.disconnectLogoutOptions = disconnectLogoutOptions;
    }

    public Vdi withDisconnectHibernateEnable(Boolean disconnectHibernateEnable) {
        this.disconnectHibernateEnable = disconnectHibernateEnable;
        return this;
    }

    /**
     * 是否开启断开后自动注销。取值为：0：表示关闭。1：表示开启。
     * @return disconnectHibernateEnable
     */
    public Boolean getDisconnectHibernateEnable() {
        return disconnectHibernateEnable;
    }

    public void setDisconnectHibernateEnable(Boolean disconnectHibernateEnable) {
        this.disconnectHibernateEnable = disconnectHibernateEnable;
    }

    public Vdi withDisconnectHibernateOptions(VdiDisconnectHibernateOptions disconnectHibernateOptions) {
        this.disconnectHibernateOptions = disconnectHibernateOptions;
        return this;
    }

    public Vdi withDisconnectHibernateOptions(
        Consumer<VdiDisconnectHibernateOptions> disconnectHibernateOptionsSetter) {
        if (this.disconnectHibernateOptions == null) {
            this.disconnectHibernateOptions = new VdiDisconnectHibernateOptions();
            disconnectHibernateOptionsSetter.accept(this.disconnectHibernateOptions);
        }

        return this;
    }

    /**
     * Get disconnectHibernateOptions
     * @return disconnectHibernateOptions
     */
    public VdiDisconnectHibernateOptions getDisconnectHibernateOptions() {
        return disconnectHibernateOptions;
    }

    public void setDisconnectHibernateOptions(VdiDisconnectHibernateOptions disconnectHibernateOptions) {
        this.disconnectHibernateOptions = disconnectHibernateOptions;
    }

    public Vdi withNoOperationHibernateEnable(Boolean noOperationHibernateEnable) {
        this.noOperationHibernateEnable = noOperationHibernateEnable;
        return this;
    }

    /**
     * 是否开启断开后自动注销。取值为：0：表示关闭。1：表示开启。
     * @return noOperationHibernateEnable
     */
    public Boolean getNoOperationHibernateEnable() {
        return noOperationHibernateEnable;
    }

    public void setNoOperationHibernateEnable(Boolean noOperationHibernateEnable) {
        this.noOperationHibernateEnable = noOperationHibernateEnable;
    }

    public Vdi withNoOperationHibernateOptions(VdiNoOperationHibernateOptions noOperationHibernateOptions) {
        this.noOperationHibernateOptions = noOperationHibernateOptions;
        return this;
    }

    public Vdi withNoOperationHibernateOptions(
        Consumer<VdiNoOperationHibernateOptions> noOperationHibernateOptionsSetter) {
        if (this.noOperationHibernateOptions == null) {
            this.noOperationHibernateOptions = new VdiNoOperationHibernateOptions();
            noOperationHibernateOptionsSetter.accept(this.noOperationHibernateOptions);
        }

        return this;
    }

    /**
     * Get noOperationHibernateOptions
     * @return noOperationHibernateOptions
     */
    public VdiNoOperationHibernateOptions getNoOperationHibernateOptions() {
        return noOperationHibernateOptions;
    }

    public void setNoOperationHibernateOptions(VdiNoOperationHibernateOptions noOperationHibernateOptions) {
        this.noOperationHibernateOptions = noOperationHibernateOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vdi that = (Vdi) obj;
        return Objects.equals(this.autoLockEnable, that.autoLockEnable)
            && Objects.equals(this.autoLockOptions, that.autoLockOptions)
            && Objects.equals(this.disconnectLogoutEnable, that.disconnectLogoutEnable)
            && Objects.equals(this.disconnectLogoutOptions, that.disconnectLogoutOptions)
            && Objects.equals(this.disconnectHibernateEnable, that.disconnectHibernateEnable)
            && Objects.equals(this.disconnectHibernateOptions, that.disconnectHibernateOptions)
            && Objects.equals(this.noOperationHibernateEnable, that.noOperationHibernateEnable)
            && Objects.equals(this.noOperationHibernateOptions, that.noOperationHibernateOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoLockEnable,
            autoLockOptions,
            disconnectLogoutEnable,
            disconnectLogoutOptions,
            disconnectHibernateEnable,
            disconnectHibernateOptions,
            noOperationHibernateEnable,
            noOperationHibernateOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vdi {\n");
        sb.append("    autoLockEnable: ").append(toIndentedString(autoLockEnable)).append("\n");
        sb.append("    autoLockOptions: ").append(toIndentedString(autoLockOptions)).append("\n");
        sb.append("    disconnectLogoutEnable: ").append(toIndentedString(disconnectLogoutEnable)).append("\n");
        sb.append("    disconnectLogoutOptions: ").append(toIndentedString(disconnectLogoutOptions)).append("\n");
        sb.append("    disconnectHibernateEnable: ").append(toIndentedString(disconnectHibernateEnable)).append("\n");
        sb.append("    disconnectHibernateOptions: ").append(toIndentedString(disconnectHibernateOptions)).append("\n");
        sb.append("    noOperationHibernateEnable: ").append(toIndentedString(noOperationHibernateEnable)).append("\n");
        sb.append("    noOperationHibernateOptions: ")
            .append(toIndentedString(noOperationHibernateOptions))
            .append("\n");
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
