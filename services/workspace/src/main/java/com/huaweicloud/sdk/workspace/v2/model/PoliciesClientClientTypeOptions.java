package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 终端类型登录管控的选项。
 */
public class PoliciesClientClientTypeOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type_window")

    private Boolean scTypeWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type_mac")

    private Boolean scTypeMac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type_android")

    private Boolean scTypeAndroid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type_linux")

    private Boolean scTypeLinux;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type_h5")

    private Boolean scTypeH5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type_ios")

    private Boolean scTypeIos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type_harmony_os")

    private Boolean scTypeHarmonyOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tc_type_all")

    private Boolean tcTypeAll;

    public PoliciesClientClientTypeOptions withScTypeWindow(Boolean scTypeWindow) {
        this.scTypeWindow = scTypeWindow;
        return this;
    }

    /**
     * 是否勾选Windows客户端。取值为： false：表示未勾选。 true：表示勾选。
     * @return scTypeWindow
     */
    public Boolean getScTypeWindow() {
        return scTypeWindow;
    }

    public void setScTypeWindow(Boolean scTypeWindow) {
        this.scTypeWindow = scTypeWindow;
    }

    public PoliciesClientClientTypeOptions withScTypeMac(Boolean scTypeMac) {
        this.scTypeMac = scTypeMac;
        return this;
    }

    /**
     * 是否勾选macOS客户端。取值为： false：表示未勾选。 true：表示勾选。
     * @return scTypeMac
     */
    public Boolean getScTypeMac() {
        return scTypeMac;
    }

    public void setScTypeMac(Boolean scTypeMac) {
        this.scTypeMac = scTypeMac;
    }

    public PoliciesClientClientTypeOptions withScTypeAndroid(Boolean scTypeAndroid) {
        this.scTypeAndroid = scTypeAndroid;
        return this;
    }

    /**
     * 是否勾选Android客户端。取值为： false：表示未勾选。 true：表示勾选。
     * @return scTypeAndroid
     */
    public Boolean getScTypeAndroid() {
        return scTypeAndroid;
    }

    public void setScTypeAndroid(Boolean scTypeAndroid) {
        this.scTypeAndroid = scTypeAndroid;
    }

    public PoliciesClientClientTypeOptions withScTypeLinux(Boolean scTypeLinux) {
        this.scTypeLinux = scTypeLinux;
        return this;
    }

    /**
     * 是否勾选Linux客户端。取值为： false：表示未勾选。 true：表示勾选。
     * @return scTypeLinux
     */
    public Boolean getScTypeLinux() {
        return scTypeLinux;
    }

    public void setScTypeLinux(Boolean scTypeLinux) {
        this.scTypeLinux = scTypeLinux;
    }

    public PoliciesClientClientTypeOptions withScTypeH5(Boolean scTypeH5) {
        this.scTypeH5 = scTypeH5;
        return this;
    }

    /**
     * 是否勾选Web客户端。取值为： false：表示未勾选。 true：表示勾选。
     * @return scTypeH5
     */
    public Boolean getScTypeH5() {
        return scTypeH5;
    }

    public void setScTypeH5(Boolean scTypeH5) {
        this.scTypeH5 = scTypeH5;
    }

    public PoliciesClientClientTypeOptions withScTypeIos(Boolean scTypeIos) {
        this.scTypeIos = scTypeIos;
        return this;
    }

    /**
     * 是否勾选ios客户端。取值为： false：表示未勾选。 true：表示勾选。
     * @return scTypeIos
     */
    public Boolean getScTypeIos() {
        return scTypeIos;
    }

    public void setScTypeIos(Boolean scTypeIos) {
        this.scTypeIos = scTypeIos;
    }

    public PoliciesClientClientTypeOptions withScTypeHarmonyOs(Boolean scTypeHarmonyOs) {
        this.scTypeHarmonyOs = scTypeHarmonyOs;
        return this;
    }

    /**
     * 是否勾选鸿蒙客户端。取值为： false：表示未勾选。 true：表示勾选。
     * @return scTypeHarmonyOs
     */
    public Boolean getScTypeHarmonyOs() {
        return scTypeHarmonyOs;
    }

    public void setScTypeHarmonyOs(Boolean scTypeHarmonyOs) {
        this.scTypeHarmonyOs = scTypeHarmonyOs;
    }

    public PoliciesClientClientTypeOptions withTcTypeAll(Boolean tcTypeAll) {
        this.tcTypeAll = tcTypeAll;
        return this;
    }

    /**
     * 是否勾选全部硬件终端。取值为： false：表示未勾选。 true：表示勾选。
     * @return tcTypeAll
     */
    public Boolean getTcTypeAll() {
        return tcTypeAll;
    }

    public void setTcTypeAll(Boolean tcTypeAll) {
        this.tcTypeAll = tcTypeAll;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesClientClientTypeOptions that = (PoliciesClientClientTypeOptions) obj;
        return Objects.equals(this.scTypeWindow, that.scTypeWindow) && Objects.equals(this.scTypeMac, that.scTypeMac)
            && Objects.equals(this.scTypeAndroid, that.scTypeAndroid)
            && Objects.equals(this.scTypeLinux, that.scTypeLinux) && Objects.equals(this.scTypeH5, that.scTypeH5)
            && Objects.equals(this.scTypeIos, that.scTypeIos)
            && Objects.equals(this.scTypeHarmonyOs, that.scTypeHarmonyOs)
            && Objects.equals(this.tcTypeAll, that.tcTypeAll);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(scTypeWindow, scTypeMac, scTypeAndroid, scTypeLinux, scTypeH5, scTypeIos, scTypeHarmonyOs, tcTypeAll);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesClientClientTypeOptions {\n");
        sb.append("    scTypeWindow: ").append(toIndentedString(scTypeWindow)).append("\n");
        sb.append("    scTypeMac: ").append(toIndentedString(scTypeMac)).append("\n");
        sb.append("    scTypeAndroid: ").append(toIndentedString(scTypeAndroid)).append("\n");
        sb.append("    scTypeLinux: ").append(toIndentedString(scTypeLinux)).append("\n");
        sb.append("    scTypeH5: ").append(toIndentedString(scTypeH5)).append("\n");
        sb.append("    scTypeIos: ").append(toIndentedString(scTypeIos)).append("\n");
        sb.append("    scTypeHarmonyOs: ").append(toIndentedString(scTypeHarmonyOs)).append("\n");
        sb.append("    tcTypeAll: ").append(toIndentedString(tcTypeAll)).append("\n");
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
