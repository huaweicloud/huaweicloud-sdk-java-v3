package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlBackupPolicy;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改备份策略信息
 */
public class MysqlUpdateBackupPolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_policy")
    
    @JacksonXmlProperty(localName = "backup_policy")
    
    private MysqlBackupPolicy backupPolicy;

    public MysqlUpdateBackupPolicyRequest withBackupPolicy(MysqlBackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public MysqlUpdateBackupPolicyRequest withBackupPolicy(Consumer<MysqlBackupPolicy> backupPolicySetter) {
        if(this.backupPolicy == null ){
            this.backupPolicy = new MysqlBackupPolicy();
            backupPolicySetter.accept(this.backupPolicy);
        }
        
        return this;
    }


    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public MysqlBackupPolicy getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(MysqlBackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlUpdateBackupPolicyRequest mysqlUpdateBackupPolicyRequest = (MysqlUpdateBackupPolicyRequest) o;
        return Objects.equals(this.backupPolicy, mysqlUpdateBackupPolicyRequest.backupPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlUpdateBackupPolicyRequest {\n");
        sb.append("    backupPolicy: ").append(toIndentedString(backupPolicy)).append("\n");
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

