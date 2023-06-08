package com.huaweicloud.sdk.idme.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateXdmApplicationRequestBody
 */
public class CreateXdmApplicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name_cn")

    private String appNameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name_en")

    private String appNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_desc")

    private String appDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_desc_en")

    private String appDescEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_env")

    private String appEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_type")

    private String databaseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_user_list")

    private List<AppUserList> appUserList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certified_data_source_name")

    private String certifiedDataSourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certified_data_source_number")

    private String certifiedDataSourceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "integration_mode")

    private String integrationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_synchronization")

    private Boolean metadataSynchronization;

    public CreateXdmApplicationRequestBody withAppNameCn(String appNameCn) {
        this.appNameCn = appNameCn;
        return this;
    }

    /**
     * 应用的中文名称。
     * @return appNameCn
     */
    public String getAppNameCn() {
        return appNameCn;
    }

    public void setAppNameCn(String appNameCn) {
        this.appNameCn = appNameCn;
    }

    public CreateXdmApplicationRequestBody withAppNameEn(String appNameEn) {
        this.appNameEn = appNameEn;
        return this;
    }

    /**
     * 应用的英文名称。
     * @return appNameEn
     */
    public String getAppNameEn() {
        return appNameEn;
    }

    public void setAppNameEn(String appNameEn) {
        this.appNameEn = appNameEn;
    }

    public CreateXdmApplicationRequestBody withAppDesc(String appDesc) {
        this.appDesc = appDesc;
        return this;
    }

    /**
     * 应用的中文描述。
     * @return appDesc
     */
    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    public CreateXdmApplicationRequestBody withAppDescEn(String appDescEn) {
        this.appDescEn = appDescEn;
        return this;
    }

    /**
     * 应用的英文描述。
     * @return appDescEn
     */
    public String getAppDescEn() {
        return appDescEn;
    }

    public void setAppDescEn(String appDescEn) {
        this.appDescEn = appDescEn;
    }

    public CreateXdmApplicationRequestBody withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型。
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public CreateXdmApplicationRequestBody withAppEnv(String appEnv) {
        this.appEnv = appEnv;
        return this;
    }

    /**
     * 环境标识。 - dev：用于开发环境。 - sit：用于功能测试环境。 - uat：用于用户测试环境。 - train：用于培训环境。 - beta：用于灰度部署环境。 - production：用于生产环境。
     * @return appEnv
     */
    public String getAppEnv() {
        return appEnv;
    }

    public void setAppEnv(String appEnv) {
        this.appEnv = appEnv;
    }

    public CreateXdmApplicationRequestBody withDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * 数据库类型，支持MySQL和PostgreSQL。
     * @return databaseType
     */
    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public CreateXdmApplicationRequestBody withAppUserList(List<AppUserList> appUserList) {
        this.appUserList = appUserList;
        return this;
    }

    public CreateXdmApplicationRequestBody addAppUserListItem(AppUserList appUserListItem) {
        if (this.appUserList == null) {
            this.appUserList = new ArrayList<>();
        }
        this.appUserList.add(appUserListItem);
        return this;
    }

    public CreateXdmApplicationRequestBody withAppUserList(Consumer<List<AppUserList>> appUserListSetter) {
        if (this.appUserList == null) {
            this.appUserList = new ArrayList<>();
        }
        appUserListSetter.accept(this.appUserList);
        return this;
    }

    /**
     * 应用责任人。
     * @return appUserList
     */
    public List<AppUserList> getAppUserList() {
        return appUserList;
    }

    public void setAppUserList(List<AppUserList> appUserList) {
        this.appUserList = appUserList;
    }

    public CreateXdmApplicationRequestBody withCertifiedDataSourceName(String certifiedDataSourceName) {
        this.certifiedDataSourceName = certifiedDataSourceName;
        return this;
    }

    /**
     * 认证数据源中文名称。
     * @return certifiedDataSourceName
     */
    public String getCertifiedDataSourceName() {
        return certifiedDataSourceName;
    }

    public void setCertifiedDataSourceName(String certifiedDataSourceName) {
        this.certifiedDataSourceName = certifiedDataSourceName;
    }

    public CreateXdmApplicationRequestBody withCertifiedDataSourceNumber(String certifiedDataSourceNumber) {
        this.certifiedDataSourceNumber = certifiedDataSourceNumber;
        return this;
    }

    /**
     * 认证数据源编码。
     * @return certifiedDataSourceNumber
     */
    public String getCertifiedDataSourceNumber() {
        return certifiedDataSourceNumber;
    }

    public void setCertifiedDataSourceNumber(String certifiedDataSourceNumber) {
        this.certifiedDataSourceNumber = certifiedDataSourceNumber;
    }

    public CreateXdmApplicationRequestBody withIntegrationMode(String integrationMode) {
        this.integrationMode = integrationMode;
        return this;
    }

    /**
     * 集成模式。 - API - SDK
     * @return integrationMode
     */
    public String getIntegrationMode() {
        return integrationMode;
    }

    public void setIntegrationMode(String integrationMode) {
        this.integrationMode = integrationMode;
    }

    public CreateXdmApplicationRequestBody withMetadataSynchronization(Boolean metadataSynchronization) {
        this.metadataSynchronization = metadataSynchronization;
        return this;
    }

    /**
     * 元模型同步。
     * @return metadataSynchronization
     */
    public Boolean getMetadataSynchronization() {
        return metadataSynchronization;
    }

    public void setMetadataSynchronization(Boolean metadataSynchronization) {
        this.metadataSynchronization = metadataSynchronization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateXdmApplicationRequestBody createXdmApplicationRequestBody = (CreateXdmApplicationRequestBody) o;
        return Objects.equals(this.appNameCn, createXdmApplicationRequestBody.appNameCn)
            && Objects.equals(this.appNameEn, createXdmApplicationRequestBody.appNameEn)
            && Objects.equals(this.appDesc, createXdmApplicationRequestBody.appDesc)
            && Objects.equals(this.appDescEn, createXdmApplicationRequestBody.appDescEn)
            && Objects.equals(this.operateType, createXdmApplicationRequestBody.operateType)
            && Objects.equals(this.appEnv, createXdmApplicationRequestBody.appEnv)
            && Objects.equals(this.databaseType, createXdmApplicationRequestBody.databaseType)
            && Objects.equals(this.appUserList, createXdmApplicationRequestBody.appUserList)
            && Objects.equals(this.certifiedDataSourceName, createXdmApplicationRequestBody.certifiedDataSourceName)
            && Objects.equals(this.certifiedDataSourceNumber, createXdmApplicationRequestBody.certifiedDataSourceNumber)
            && Objects.equals(this.integrationMode, createXdmApplicationRequestBody.integrationMode)
            && Objects.equals(this.metadataSynchronization, createXdmApplicationRequestBody.metadataSynchronization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appNameCn,
            appNameEn,
            appDesc,
            appDescEn,
            operateType,
            appEnv,
            databaseType,
            appUserList,
            certifiedDataSourceName,
            certifiedDataSourceNumber,
            integrationMode,
            metadataSynchronization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateXdmApplicationRequestBody {\n");
        sb.append("    appNameCn: ").append(toIndentedString(appNameCn)).append("\n");
        sb.append("    appNameEn: ").append(toIndentedString(appNameEn)).append("\n");
        sb.append("    appDesc: ").append(toIndentedString(appDesc)).append("\n");
        sb.append("    appDescEn: ").append(toIndentedString(appDescEn)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    appEnv: ").append(toIndentedString(appEnv)).append("\n");
        sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
        sb.append("    appUserList: ").append(toIndentedString(appUserList)).append("\n");
        sb.append("    certifiedDataSourceName: ").append(toIndentedString(certifiedDataSourceName)).append("\n");
        sb.append("    certifiedDataSourceNumber: ").append(toIndentedString(certifiedDataSourceNumber)).append("\n");
        sb.append("    integrationMode: ").append(toIndentedString(integrationMode)).append("\n");
        sb.append("    metadataSynchronization: ").append(toIndentedString(metadataSynchronization)).append("\n");
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
