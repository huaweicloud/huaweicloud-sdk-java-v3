package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建drs任务的请求体
 */
public class CreateDrsTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_user_name")

    private String targetUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_user_password")

    private String targetUserPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_user_name")

    private String sourceUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_user_password")

    private String sourceUserPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drs_node_type")

    private String drsNodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_list")

    private List<String> databaseList = null;

    public CreateDrsTaskReq withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /**
     * 目标实例id
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public CreateDrsTaskReq withTargetUserName(String targetUserName) {
        this.targetUserName = targetUserName;
        return this;
    }

    /**
     * 目标实例用户账号
     * @return targetUserName
     */
    public String getTargetUserName() {
        return targetUserName;
    }

    public void setTargetUserName(String targetUserName) {
        this.targetUserName = targetUserName;
    }

    public CreateDrsTaskReq withTargetUserPassword(String targetUserPassword) {
        this.targetUserPassword = targetUserPassword;
        return this;
    }

    /**
     * 目标实例用户密码
     * @return targetUserPassword
     */
    public String getTargetUserPassword() {
        return targetUserPassword;
    }

    public void setTargetUserPassword(String targetUserPassword) {
        this.targetUserPassword = targetUserPassword;
    }

    public CreateDrsTaskReq withSourceUserName(String sourceUserName) {
        this.sourceUserName = sourceUserName;
        return this;
    }

    /**
     * 源实例用户账号
     * @return sourceUserName
     */
    public String getSourceUserName() {
        return sourceUserName;
    }

    public void setSourceUserName(String sourceUserName) {
        this.sourceUserName = sourceUserName;
    }

    public CreateDrsTaskReq withSourceUserPassword(String sourceUserPassword) {
        this.sourceUserPassword = sourceUserPassword;
        return this;
    }

    /**
     * 源实例用户密码
     * @return sourceUserPassword
     */
    public String getSourceUserPassword() {
        return sourceUserPassword;
    }

    public void setSourceUserPassword(String sourceUserPassword) {
        this.sourceUserPassword = sourceUserPassword;
    }

    public CreateDrsTaskReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateDrsTaskReq withDrsNodeType(String drsNodeType) {
        this.drsNodeType = drsNodeType;
        return this;
    }

    /**
     * Drs实例规格
     * @return drsNodeType
     */
    public String getDrsNodeType() {
        return drsNodeType;
    }

    public void setDrsNodeType(String drsNodeType) {
        this.drsNodeType = drsNodeType;
    }

    public CreateDrsTaskReq withDatabaseList(List<String> databaseList) {
        this.databaseList = databaseList;
        return this;
    }

    public CreateDrsTaskReq addDatabaseListItem(String databaseListItem) {
        if (this.databaseList == null) {
            this.databaseList = new ArrayList<>();
        }
        this.databaseList.add(databaseListItem);
        return this;
    }

    public CreateDrsTaskReq withDatabaseList(Consumer<List<String>> databaseListSetter) {
        if (this.databaseList == null) {
            this.databaseList = new ArrayList<>();
        }
        databaseListSetter.accept(this.databaseList);
        return this;
    }

    /**
     * 数据库名称
     * @return databaseList
     */
    public List<String> getDatabaseList() {
        return databaseList;
    }

    public void setDatabaseList(List<String> databaseList) {
        this.databaseList = databaseList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDrsTaskReq that = (CreateDrsTaskReq) obj;
        return Objects.equals(this.targetInstanceId, that.targetInstanceId)
            && Objects.equals(this.targetUserName, that.targetUserName)
            && Objects.equals(this.targetUserPassword, that.targetUserPassword)
            && Objects.equals(this.sourceUserName, that.sourceUserName)
            && Objects.equals(this.sourceUserPassword, that.sourceUserPassword)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.drsNodeType, that.drsNodeType)
            && Objects.equals(this.databaseList, that.databaseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetInstanceId,
            targetUserName,
            targetUserPassword,
            sourceUserName,
            sourceUserPassword,
            enterpriseProjectId,
            drsNodeType,
            databaseList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDrsTaskReq {\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    targetUserName: ").append(toIndentedString(targetUserName)).append("\n");
        sb.append("    targetUserPassword: ").append(toIndentedString(targetUserPassword)).append("\n");
        sb.append("    sourceUserName: ").append(toIndentedString(sourceUserName)).append("\n");
        sb.append("    sourceUserPassword: ").append(toIndentedString(sourceUserPassword)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    drsNodeType: ").append(toIndentedString(drsNodeType)).append("\n");
        sb.append("    databaseList: ").append(toIndentedString(databaseList)).append("\n");
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
