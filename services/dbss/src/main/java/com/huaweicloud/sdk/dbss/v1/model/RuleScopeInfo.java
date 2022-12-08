package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RuleScopeInfo
 */
public class RuleScopeInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exception_ips")
    
    
    private String exceptionIps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_ips")
    
    
    private String sourceIps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_ports")
    
    
    private String sourcePorts;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_ids")
    
    
    private String dbIds;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_names")
    
    
    private String dbNames;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_users")
    
    
    private String dbUsers;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="all_audit")
    
    
    private Boolean allAudit;

    public RuleScopeInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 审计范围规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public RuleScopeInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 审计范围名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public RuleScopeInfo withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 审计范围动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public RuleScopeInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 审计范围规则状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public RuleScopeInfo withExceptionIps(String exceptionIps) {
        this.exceptionIps = exceptionIps;
        return this;
    }

    


    /**
     * 审计范围例外IP
     * @return exceptionIps
     */
    public String getExceptionIps() {
        return exceptionIps;
    }

    public void setExceptionIps(String exceptionIps) {
        this.exceptionIps = exceptionIps;
    }

    

    public RuleScopeInfo withSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }

    


    /**
     * 审计范围规则源IP
     * @return sourceIps
     */
    public String getSourceIps() {
        return sourceIps;
    }

    public void setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
    }

    

    public RuleScopeInfo withSourcePorts(String sourcePorts) {
        this.sourcePorts = sourcePorts;
        return this;
    }

    


    /**
     * 审计范围源端口
     * @return sourcePorts
     */
    public String getSourcePorts() {
        return sourcePorts;
    }

    public void setSourcePorts(String sourcePorts) {
        this.sourcePorts = sourcePorts;
    }

    

    public RuleScopeInfo withDbIds(String dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    


    /**
     * 数据库ID
     * @return dbIds
     */
    public String getDbIds() {
        return dbIds;
    }

    public void setDbIds(String dbIds) {
        this.dbIds = dbIds;
    }

    

    public RuleScopeInfo withDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    


    /**
     * 数据库名称
     * @return dbNames
     */
    public String getDbNames() {
        return dbNames;
    }

    public void setDbNames(String dbNames) {
        this.dbNames = dbNames;
    }

    

    public RuleScopeInfo withDbUsers(String dbUsers) {
        this.dbUsers = dbUsers;
        return this;
    }

    


    /**
     * 数据库用户
     * @return dbUsers
     */
    public String getDbUsers() {
        return dbUsers;
    }

    public void setDbUsers(String dbUsers) {
        this.dbUsers = dbUsers;
    }

    

    public RuleScopeInfo withAllAudit(Boolean allAudit) {
        this.allAudit = allAudit;
        return this;
    }

    


    /**
     * 是否全审计
     * @return allAudit
     */
    public Boolean getAllAudit() {
        return allAudit;
    }

    public void setAllAudit(Boolean allAudit) {
        this.allAudit = allAudit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleScopeInfo ruleScopeInfo = (RuleScopeInfo) o;
        return Objects.equals(this.id, ruleScopeInfo.id) &&
            Objects.equals(this.name, ruleScopeInfo.name) &&
            Objects.equals(this.action, ruleScopeInfo.action) &&
            Objects.equals(this.status, ruleScopeInfo.status) &&
            Objects.equals(this.exceptionIps, ruleScopeInfo.exceptionIps) &&
            Objects.equals(this.sourceIps, ruleScopeInfo.sourceIps) &&
            Objects.equals(this.sourcePorts, ruleScopeInfo.sourcePorts) &&
            Objects.equals(this.dbIds, ruleScopeInfo.dbIds) &&
            Objects.equals(this.dbNames, ruleScopeInfo.dbNames) &&
            Objects.equals(this.dbUsers, ruleScopeInfo.dbUsers) &&
            Objects.equals(this.allAudit, ruleScopeInfo.allAudit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, action, status, exceptionIps, sourceIps, sourcePorts, dbIds, dbNames, dbUsers, allAudit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleScopeInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    exceptionIps: ").append(toIndentedString(exceptionIps)).append("\n");
        sb.append("    sourceIps: ").append(toIndentedString(sourceIps)).append("\n");
        sb.append("    sourcePorts: ").append(toIndentedString(sourcePorts)).append("\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    dbUsers: ").append(toIndentedString(dbUsers)).append("\n");
        sb.append("    allAudit: ").append(toIndentedString(allAudit)).append("\n");
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

