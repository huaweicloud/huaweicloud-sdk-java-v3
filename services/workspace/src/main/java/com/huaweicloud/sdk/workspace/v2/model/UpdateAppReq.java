package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新应用信息。
 */
public class UpdateAppReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_file_store")

    private FileStoreLink appFileStore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_icon_url")

    private String appIconUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_type")

    private InstallType installType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private AssignType authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_command")

    private String installCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uninstall_command")

    private String uninstallCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private OsTypeEnum supportOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_id")

    private String catalogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AppStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_info")

    private String installInfo;

    public UpdateAppReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称,名称需满足如下规则: 1. 名称允许可见字符或空格，不可为全空格。 2. 长度1~128个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAppReq withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateAppReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAppReq withAppFileStore(FileStoreLink appFileStore) {
        this.appFileStore = appFileStore;
        return this;
    }

    public UpdateAppReq withAppFileStore(Consumer<FileStoreLink> appFileStoreSetter) {
        if (this.appFileStore == null) {
            this.appFileStore = new FileStoreLink();
            appFileStoreSetter.accept(this.appFileStore);
        }

        return this;
    }

    /**
     * Get appFileStore
     * @return appFileStore
     */
    public FileStoreLink getAppFileStore() {
        return appFileStore;
    }

    public void setAppFileStore(FileStoreLink appFileStore) {
        this.appFileStore = appFileStore;
    }

    public UpdateAppReq withAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
        return this;
    }

    /**
     * 图片的路径,支持使用可访问的URL地址或DataURIscheme。 * `可访问的URL` - https://xxx.x.xx.x/xxx/xx.jpg。 * `DataURIscheme` -  data;image/png;base64,iVBORw0KGgoAAAANS; 注意使用dataURLStream时，最多支持约xxKB大小的图片，且必须是png格式。
     * @return appIconUrl
     */
    public String getAppIconUrl() {
        return appIconUrl;
    }

    public void setAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
    }

    public UpdateAppReq withInstallType(InstallType installType) {
        this.installType = installType;
        return this;
    }

    /**
     * Get installType
     * @return installType
     */
    public InstallType getInstallType() {
        return installType;
    }

    public void setInstallType(InstallType installType) {
        this.installType = installType;
    }

    public UpdateAppReq withAuthorizationType(AssignType authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * Get authorizationType
     * @return authorizationType
     */
    public AssignType getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(AssignType authorizationType) {
        this.authorizationType = authorizationType;
    }

    public UpdateAppReq withInstallCommand(String installCommand) {
        this.installCommand = installCommand;
        return this;
    }

    /**
     * 安装命令(静默安装命令)。 例: ${FILE_PATH} /S。 预定义变量将采用以下值: ${FILE_PATH}: 应用安装包在桌面本地的存储路径。
     * @return installCommand
     */
    public String getInstallCommand() {
        return installCommand;
    }

    public void setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
    }

    public UpdateAppReq withUninstallCommand(String uninstallCommand) {
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

    public UpdateAppReq withSupportOs(OsTypeEnum supportOs) {
        this.supportOs = supportOs;
        return this;
    }

    /**
     * Get supportOs
     * @return supportOs
     */
    public OsTypeEnum getSupportOs() {
        return supportOs;
    }

    public void setSupportOs(OsTypeEnum supportOs) {
        this.supportOs = supportOs;
    }

    public UpdateAppReq withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * 分类ID。
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public UpdateAppReq withStatus(AppStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AppStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AppStatusEnum status) {
        this.status = status;
    }

    public UpdateAppReq withInstallInfo(String installInfo) {
        this.installInfo = installInfo;
        return this;
    }

    /**
     * 安装信息。
     * @return installInfo
     */
    public String getInstallInfo() {
        return installInfo;
    }

    public void setInstallInfo(String installInfo) {
        this.installInfo = installInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAppReq that = (UpdateAppReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.appFileStore, that.appFileStore) && Objects.equals(this.appIconUrl, that.appIconUrl)
            && Objects.equals(this.installType, that.installType)
            && Objects.equals(this.authorizationType, that.authorizationType)
            && Objects.equals(this.installCommand, that.installCommand)
            && Objects.equals(this.uninstallCommand, that.uninstallCommand)
            && Objects.equals(this.supportOs, that.supportOs) && Objects.equals(this.catalogId, that.catalogId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.installInfo, that.installInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            version,
            description,
            appFileStore,
            appIconUrl,
            installType,
            authorizationType,
            installCommand,
            uninstallCommand,
            supportOs,
            catalogId,
            status,
            installInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    appFileStore: ").append(toIndentedString(appFileStore)).append("\n");
        sb.append("    appIconUrl: ").append(toIndentedString(appIconUrl)).append("\n");
        sb.append("    installType: ").append(toIndentedString(installType)).append("\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
        sb.append("    installCommand: ").append(toIndentedString(installCommand)).append("\n");
        sb.append("    uninstallCommand: ").append(toIndentedString(uninstallCommand)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    installInfo: ").append(toIndentedString(installInfo)).append("\n");
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
