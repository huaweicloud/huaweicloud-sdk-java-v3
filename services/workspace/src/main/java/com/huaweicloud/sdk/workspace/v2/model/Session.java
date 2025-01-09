package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Session
 */
public class Session {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vdi")

    private Vdi vdi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_help_console")

    private Boolean selfHelpConsole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnect_on_lock_flag")

    private Boolean disconnectOnLockFlag;

    public Session withVdi(Vdi vdi) {
        this.vdi = vdi;
        return this;
    }

    public Session withVdi(Consumer<Vdi> vdiSetter) {
        if (this.vdi == null) {
            this.vdi = new Vdi();
            vdiSetter.accept(this.vdi);
        }

        return this;
    }

    /**
     * Get vdi
     * @return vdi
     */
    public Vdi getVdi() {
        return vdi;
    }

    public void setVdi(Vdi vdi) {
        this.vdi = vdi;
    }

    public Session withSelfHelpConsole(Boolean selfHelpConsole) {
        this.selfHelpConsole = selfHelpConsole;
        return this;
    }

    /**
     * 是否开启自助维护台抢占登陆。取值为：false：表示关闭。true：表示开启。
     * @return selfHelpConsole
     */
    public Boolean getSelfHelpConsole() {
        return selfHelpConsole;
    }

    public void setSelfHelpConsole(Boolean selfHelpConsole) {
        this.selfHelpConsole = selfHelpConsole;
    }

    public Session withDisconnectOnLockFlag(Boolean disconnectOnLockFlag) {
        this.disconnectOnLockFlag = disconnectOnLockFlag;
        return this;
    }

    /**
     * 是否锁屏后断开
     * @return disconnectOnLockFlag
     */
    public Boolean getDisconnectOnLockFlag() {
        return disconnectOnLockFlag;
    }

    public void setDisconnectOnLockFlag(Boolean disconnectOnLockFlag) {
        this.disconnectOnLockFlag = disconnectOnLockFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Session that = (Session) obj;
        return Objects.equals(this.vdi, that.vdi) && Objects.equals(this.selfHelpConsole, that.selfHelpConsole)
            && Objects.equals(this.disconnectOnLockFlag, that.disconnectOnLockFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vdi, selfHelpConsole, disconnectOnLockFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Session {\n");
        sb.append("    vdi: ").append(toIndentedString(vdi)).append("\n");
        sb.append("    selfHelpConsole: ").append(toIndentedString(selfHelpConsole)).append("\n");
        sb.append("    disconnectOnLockFlag: ").append(toIndentedString(disconnectOnLockFlag)).append("\n");
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
