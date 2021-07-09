package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.CreatedUser;
import com.huaweicloud.sdk.roma.v2.model.LastUpdatedUser;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permissions")
    
    private List<String> permissions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_id")
    
    private Integer ruleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_parsing_status")
    
    private Integer dataParsingStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_field")
    
    private String sqlField;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_where")
    
    private String sqlWhere;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_express")
    
    private String ruleExpress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user")
    
    private CreatedUser createdUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_user")
    
    private LastUpdatedUser lastUpdatedUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_datetime")
    
    private Long createdDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_datetime")
    
    private Long lastUpdatedDatetime;

    public UpdateRuleResponse withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    
    public UpdateRuleResponse addPermissionsItem(String permissionsItem) {
        if(this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public UpdateRuleResponse withPermissions(Consumer<List<String>> permissionsSetter) {
        if(this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 权限
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    

    public UpdateRuleResponse withRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    


    /**
     * 规则ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return ruleId
     */
    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    

    public UpdateRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 规则名称，支持英文大小写，数字，下划线和中划线,长度1-64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateRuleResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public UpdateRuleResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public UpdateRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 规则状态 0-启用 1-停用
     * minimum: 0
     * maximum: 10
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public UpdateRuleResponse withDataParsingStatus(Integer dataParsingStatus) {
        this.dataParsingStatus = dataParsingStatus;
        return this;
    }

    


    /**
     * 数据解析状态，ENABLE时data_parsing必填 0-启用 1-停用
     * minimum: 0
     * maximum: 10
     * @return dataParsingStatus
     */
    public Integer getDataParsingStatus() {
        return dataParsingStatus;
    }

    public void setDataParsingStatus(Integer dataParsingStatus) {
        this.dataParsingStatus = dataParsingStatus;
    }

    

    public UpdateRuleResponse withSqlField(String sqlField) {
        this.sqlField = sqlField;
        return this;
    }

    


    /**
     * SQL查询字段
     * @return sqlField
     */
    public String getSqlField() {
        return sqlField;
    }

    public void setSqlField(String sqlField) {
        this.sqlField = sqlField;
    }

    

    public UpdateRuleResponse withSqlWhere(String sqlWhere) {
        this.sqlWhere = sqlWhere;
        return this;
    }

    


    /**
     * SQL查询条件
     * @return sqlWhere
     */
    public String getSqlWhere() {
        return sqlWhere;
    }

    public void setSqlWhere(String sqlWhere) {
        this.sqlWhere = sqlWhere;
    }

    

    public UpdateRuleResponse withRuleExpress(String ruleExpress) {
        this.ruleExpress = ruleExpress;
        return this;
    }

    


    /**
     * 完整的规则表达式
     * @return ruleExpress
     */
    public String getRuleExpress() {
        return ruleExpress;
    }

    public void setRuleExpress(String ruleExpress) {
        this.ruleExpress = ruleExpress;
    }

    

    public UpdateRuleResponse withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public UpdateRuleResponse withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
        if(this.createdUser == null ){
            this.createdUser = new CreatedUser();
            createdUserSetter.accept(this.createdUser);
        }
        
        return this;
    }


    /**
     * Get createdUser
     * @return createdUser
     */
    public CreatedUser getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
    }

    

    public UpdateRuleResponse withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public UpdateRuleResponse withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
        if(this.lastUpdatedUser == null ){
            this.lastUpdatedUser = new LastUpdatedUser();
            lastUpdatedUserSetter.accept(this.lastUpdatedUser);
        }
        
        return this;
    }


    /**
     * Get lastUpdatedUser
     * @return lastUpdatedUser
     */
    public LastUpdatedUser getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    

    public UpdateRuleResponse withCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    


    /**
     * 创建时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDatetime
     */
    public Long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    

    public UpdateRuleResponse withLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
        return this;
    }

    


    /**
     * 最后修改时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastUpdatedDatetime
     */
    public Long getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRuleResponse updateRuleResponse = (UpdateRuleResponse) o;
        return Objects.equals(this.permissions, updateRuleResponse.permissions) &&
            Objects.equals(this.ruleId, updateRuleResponse.ruleId) &&
            Objects.equals(this.name, updateRuleResponse.name) &&
            Objects.equals(this.appId, updateRuleResponse.appId) &&
            Objects.equals(this.appName, updateRuleResponse.appName) &&
            Objects.equals(this.description, updateRuleResponse.description) &&
            Objects.equals(this.status, updateRuleResponse.status) &&
            Objects.equals(this.dataParsingStatus, updateRuleResponse.dataParsingStatus) &&
            Objects.equals(this.sqlField, updateRuleResponse.sqlField) &&
            Objects.equals(this.sqlWhere, updateRuleResponse.sqlWhere) &&
            Objects.equals(this.ruleExpress, updateRuleResponse.ruleExpress) &&
            Objects.equals(this.createdUser, updateRuleResponse.createdUser) &&
            Objects.equals(this.lastUpdatedUser, updateRuleResponse.lastUpdatedUser) &&
            Objects.equals(this.createdDatetime, updateRuleResponse.createdDatetime) &&
            Objects.equals(this.lastUpdatedDatetime, updateRuleResponse.lastUpdatedDatetime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(permissions, ruleId, name, appId, appName, description, status, dataParsingStatus, sqlField, sqlWhere, ruleExpress, createdUser, lastUpdatedUser, createdDatetime, lastUpdatedDatetime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleResponse {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dataParsingStatus: ").append(toIndentedString(dataParsingStatus)).append("\n");
        sb.append("    sqlField: ").append(toIndentedString(sqlField)).append("\n");
        sb.append("    sqlWhere: ").append(toIndentedString(sqlWhere)).append("\n");
        sb.append("    ruleExpress: ").append(toIndentedString(ruleExpress)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
        sb.append("    lastUpdatedDatetime: ").append(toIndentedString(lastUpdatedDatetime)).append("\n");
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

