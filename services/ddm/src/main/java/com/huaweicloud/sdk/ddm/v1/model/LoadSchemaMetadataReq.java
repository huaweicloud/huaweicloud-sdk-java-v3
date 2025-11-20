package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LoadSchemaMetadataReq
 */
public class LoadSchemaMetadataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compressed_databases_info")

    private String compressedDatabasesInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_instance")

    private List<DNInstance> dnInstance = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_account")

    private IamAccount iamAccount;

    public LoadSchemaMetadataReq withCompressedDatabasesInfo(String compressedDatabasesInfo) {
        this.compressedDatabasesInfo = compressedDatabasesInfo;
        return this;
    }

    /**
     * 逻辑库信息。
     * @return compressedDatabasesInfo
     */
    public String getCompressedDatabasesInfo() {
        return compressedDatabasesInfo;
    }

    public void setCompressedDatabasesInfo(String compressedDatabasesInfo) {
        this.compressedDatabasesInfo = compressedDatabasesInfo;
    }

    public LoadSchemaMetadataReq withDnInstance(List<DNInstance> dnInstance) {
        this.dnInstance = dnInstance;
        return this;
    }

    public LoadSchemaMetadataReq addDnInstanceItem(DNInstance dnInstanceItem) {
        if (this.dnInstance == null) {
            this.dnInstance = new ArrayList<>();
        }
        this.dnInstance.add(dnInstanceItem);
        return this;
    }

    public LoadSchemaMetadataReq withDnInstance(Consumer<List<DNInstance>> dnInstanceSetter) {
        if (this.dnInstance == null) {
            this.dnInstance = new ArrayList<>();
        }
        dnInstanceSetter.accept(this.dnInstance);
        return this;
    }

    /**
     * 关联的后端DN信息。
     * @return dnInstance
     */
    public List<DNInstance> getDnInstance() {
        return dnInstance;
    }

    public void setDnInstance(List<DNInstance> dnInstance) {
        this.dnInstance = dnInstance;
    }

    public LoadSchemaMetadataReq withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public LoadSchemaMetadataReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LoadSchemaMetadataReq withIamAccount(IamAccount iamAccount) {
        this.iamAccount = iamAccount;
        return this;
    }

    public LoadSchemaMetadataReq withIamAccount(Consumer<IamAccount> iamAccountSetter) {
        if (this.iamAccount == null) {
            this.iamAccount = new IamAccount();
            iamAccountSetter.accept(this.iamAccount);
        }

        return this;
    }

    /**
     * Get iamAccount
     * @return iamAccount
     */
    public IamAccount getIamAccount() {
        return iamAccount;
    }

    public void setIamAccount(IamAccount iamAccount) {
        this.iamAccount = iamAccount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadSchemaMetadataReq that = (LoadSchemaMetadataReq) obj;
        return Objects.equals(this.compressedDatabasesInfo, that.compressedDatabasesInfo)
            && Objects.equals(this.dnInstance, that.dnInstance) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.iamAccount, that.iamAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compressedDatabasesInfo, dnInstance, instanceId, projectId, iamAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadSchemaMetadataReq {\n");
        sb.append("    compressedDatabasesInfo: ").append(toIndentedString(compressedDatabasesInfo)).append("\n");
        sb.append("    dnInstance: ").append(toIndentedString(dnInstance)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    iamAccount: ").append(toIndentedString(iamAccount)).append("\n");
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
