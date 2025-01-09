package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自动安装应用。
 */
public class AutoInstallAppReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_command")

    private String installCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uninstall_command")

    private String uninstallCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<AccountInfo> users = null;

    public AutoInstallAppReq withInstallCommand(String installCommand) {
        this.installCommand = installCommand;
        return this;
    }

    /**
     * 安装命令(静默安装命令)。 例: ${FILE_PATH} /S 预定义变量将采用以下值: ${FILE_PATH}: 应用安装包在桌面本地的存储路径。
     * @return installCommand
     */
    public String getInstallCommand() {
        return installCommand;
    }

    public void setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
    }

    public AutoInstallAppReq withUninstallCommand(String uninstallCommand) {
        this.uninstallCommand = uninstallCommand;
        return this;
    }

    /**
     * 卸载命令(静默卸载命令)。 例: msiexec /uninstall ${FILE_PATH} /quiet。 预定义变量将采用以下值: ${FILE_PATH}: 应用安装包在桌面本地的存储路径。
     * @return uninstallCommand
     */
    public String getUninstallCommand() {
        return uninstallCommand;
    }

    public void setUninstallCommand(String uninstallCommand) {
        this.uninstallCommand = uninstallCommand;
    }

    public AutoInstallAppReq withUsers(List<AccountInfo> users) {
        this.users = users;
        return this;
    }

    public AutoInstallAppReq addUsersItem(AccountInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public AutoInstallAppReq withUsers(Consumer<List<AccountInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 指定安装用户。
     * @return users
     */
    public List<AccountInfo> getUsers() {
        return users;
    }

    public void setUsers(List<AccountInfo> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoInstallAppReq that = (AutoInstallAppReq) obj;
        return Objects.equals(this.installCommand, that.installCommand)
            && Objects.equals(this.uninstallCommand, that.uninstallCommand) && Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(installCommand, uninstallCommand, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoInstallAppReq {\n");
        sb.append("    installCommand: ").append(toIndentedString(installCommand)).append("\n");
        sb.append("    uninstallCommand: ").append(toIndentedString(uninstallCommand)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
