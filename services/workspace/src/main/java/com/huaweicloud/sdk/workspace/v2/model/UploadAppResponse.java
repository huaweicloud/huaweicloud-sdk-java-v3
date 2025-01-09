package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UploadAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

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
    @JsonProperty(value = "authorization_type")

    private AssignType authorizationType;

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
    @JsonProperty(value = "install_command")

    private String installCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uninstall_command")

    private String uninstallCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private OsTypeEnum supportOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AppStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_source")

    private AppSourceType applicationSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_id")

    private String catalogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    private String catalog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_info")

    private String installInfo;

    public UploadAppResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UploadAppResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UploadAppResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UploadAppResponse withVersion(String version) {
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

    public UploadAppResponse withDescription(String description) {
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

    public UploadAppResponse withAuthorizationType(AssignType authorizationType) {
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

    public UploadAppResponse withAppFileStore(FileStoreLink appFileStore) {
        this.appFileStore = appFileStore;
        return this;
    }

    public UploadAppResponse withAppFileStore(Consumer<FileStoreLink> appFileStoreSetter) {
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

    public UploadAppResponse withAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
        return this;
    }

    /**
     * 应用图标路径。
     * @return appIconUrl
     */
    public String getAppIconUrl() {
        return appIconUrl;
    }

    public void setAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
    }

    public UploadAppResponse withInstallType(InstallType installType) {
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

    public UploadAppResponse withInstallCommand(String installCommand) {
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

    public UploadAppResponse withUninstallCommand(String uninstallCommand) {
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

    public UploadAppResponse withSupportOs(OsTypeEnum supportOs) {
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

    public UploadAppResponse withStatus(AppStatusEnum status) {
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

    public UploadAppResponse withApplicationSource(AppSourceType applicationSource) {
        this.applicationSource = applicationSource;
        return this;
    }

    /**
     * Get applicationSource
     * @return applicationSource
     */
    public AppSourceType getApplicationSource() {
        return applicationSource;
    }

    public void setApplicationSource(AppSourceType applicationSource) {
        this.applicationSource = applicationSource;
    }

    public UploadAppResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 应用创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public UploadAppResponse withCatalogId(String catalogId) {
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

    public UploadAppResponse withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * 分类名称。
     * @return catalog
     */
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public UploadAppResponse withInstallInfo(String installInfo) {
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
        UploadAppResponse that = (UploadAppResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.authorizationType, that.authorizationType)
            && Objects.equals(this.appFileStore, that.appFileStore) && Objects.equals(this.appIconUrl, that.appIconUrl)
            && Objects.equals(this.installType, that.installType)
            && Objects.equals(this.installCommand, that.installCommand)
            && Objects.equals(this.uninstallCommand, that.uninstallCommand)
            && Objects.equals(this.supportOs, that.supportOs) && Objects.equals(this.status, that.status)
            && Objects.equals(this.applicationSource, that.applicationSource)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.catalogId, that.catalogId)
            && Objects.equals(this.catalog, that.catalog) && Objects.equals(this.installInfo, that.installInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            version,
            description,
            authorizationType,
            appFileStore,
            appIconUrl,
            installType,
            installCommand,
            uninstallCommand,
            supportOs,
            status,
            applicationSource,
            createTime,
            catalogId,
            catalog,
            installInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAppResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
        sb.append("    appFileStore: ").append(toIndentedString(appFileStore)).append("\n");
        sb.append("    appIconUrl: ").append(toIndentedString(appIconUrl)).append("\n");
        sb.append("    installType: ").append(toIndentedString(installType)).append("\n");
        sb.append("    installCommand: ").append(toIndentedString(installCommand)).append("\n");
        sb.append("    uninstallCommand: ").append(toIndentedString(uninstallCommand)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    applicationSource: ").append(toIndentedString(applicationSource)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
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
