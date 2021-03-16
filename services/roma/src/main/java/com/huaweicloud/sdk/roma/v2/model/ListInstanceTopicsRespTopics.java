package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListInstanceTopicsRespTopics
 */
public class ListInstanceTopicsRespTopics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policiesOnly")
    
    private Boolean policiesOnly;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication")
    
    private Integer replication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition")
    
    private Integer partition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_time")
    
    private Integer retentionTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_message_flush")
    
    private Boolean syncMessageFlush;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_replication")
    
    private Boolean syncReplication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permissions")
    
    private List<String> permissions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="external_configs")
    
    private Object externalConfigs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sensitive_word")
    
    private String sensitiveWord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic_type")
    
    private Integer topicType;

    public ListInstanceTopicsRespTopics withPoliciesOnly(Boolean policiesOnly) {
        this.policiesOnly = policiesOnly;
        return this;
    }

    


    /**
     * 是否只更新策略。
     * @return policiesOnly
     */
    public Boolean getPoliciesOnly() {
        return policiesOnly;
    }

    public void setPoliciesOnly(Boolean policiesOnly) {
        this.policiesOnly = policiesOnly;
    }

    

    public ListInstanceTopicsRespTopics withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListInstanceTopicsRespTopics withReplication(Integer replication) {
        this.replication = replication;
        return this;
    }

    


    /**
     * 副本数，配置数据的可靠性。
     * @return replication
     */
    public Integer getReplication() {
        return replication;
    }

    public void setReplication(Integer replication) {
        this.replication = replication;
    }

    

    public ListInstanceTopicsRespTopics withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    


    /**
     * topic分区数，设置消费的并发数。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    

    public ListInstanceTopicsRespTopics withRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    


    /**
     * 消息老化时间。
     * @return retentionTime
     */
    public Integer getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
    }

    

    public ListInstanceTopicsRespTopics withSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
        return this;
    }

    


    /**
     * 是否使用同步落盘。默认值为false。同步落盘会导致性能降低。
     * @return syncMessageFlush
     */
    public Boolean getSyncMessageFlush() {
        return syncMessageFlush;
    }

    public void setSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
    }

    

    public ListInstanceTopicsRespTopics withSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
        return this;
    }

    


    /**
     * 是否开启同步复制，开启后，客户端生产消息时相应的也要设置acks=-1，否则不生效,默认关闭。
     * @return syncReplication
     */
    public Boolean getSyncReplication() {
        return syncReplication;
    }

    public void setSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
    }

    

    public ListInstanceTopicsRespTopics withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public ListInstanceTopicsRespTopics withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public ListInstanceTopicsRespTopics withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    
    public ListInstanceTopicsRespTopics addPermissionsItem(String permissionsItem) {
        this.permissions.add(permissionsItem);
        return this;
    }

    public ListInstanceTopicsRespTopics withPermissions(Consumer<List<String>> permissionsSetter) {
        if(this.permissions == null ){
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 允许操作的权限。
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    

    public ListInstanceTopicsRespTopics withExternalConfigs(Object externalConfigs) {
        this.externalConfigs = externalConfigs;
        return this;
    }

    


    /**
     * 其他配置。
     * @return externalConfigs
     */
    public Object getExternalConfigs() {
        return externalConfigs;
    }

    public void setExternalConfigs(Object externalConfigs) {
        this.externalConfigs = externalConfigs;
    }

    

    public ListInstanceTopicsRespTopics withDescription(String description) {
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

    

    public ListInstanceTopicsRespTopics withSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord;
        return this;
    }

    


    /**
     * 敏感字段。
     * @return sensitiveWord
     */
    public String getSensitiveWord() {
        return sensitiveWord;
    }

    public void setSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord;
    }

    

    public ListInstanceTopicsRespTopics withTopicType(Integer topicType) {
        this.topicType = topicType;
        return this;
    }

    


    /**
     * topic类型。
     * @return topicType
     */
    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceTopicsRespTopics listInstanceTopicsRespTopics = (ListInstanceTopicsRespTopics) o;
        return Objects.equals(this.policiesOnly, listInstanceTopicsRespTopics.policiesOnly) &&
            Objects.equals(this.name, listInstanceTopicsRespTopics.name) &&
            Objects.equals(this.replication, listInstanceTopicsRespTopics.replication) &&
            Objects.equals(this.partition, listInstanceTopicsRespTopics.partition) &&
            Objects.equals(this.retentionTime, listInstanceTopicsRespTopics.retentionTime) &&
            Objects.equals(this.syncMessageFlush, listInstanceTopicsRespTopics.syncMessageFlush) &&
            Objects.equals(this.syncReplication, listInstanceTopicsRespTopics.syncReplication) &&
            Objects.equals(this.appId, listInstanceTopicsRespTopics.appId) &&
            Objects.equals(this.appName, listInstanceTopicsRespTopics.appName) &&
            Objects.equals(this.permissions, listInstanceTopicsRespTopics.permissions) &&
            Objects.equals(this.externalConfigs, listInstanceTopicsRespTopics.externalConfigs) &&
            Objects.equals(this.description, listInstanceTopicsRespTopics.description) &&
            Objects.equals(this.sensitiveWord, listInstanceTopicsRespTopics.sensitiveWord) &&
            Objects.equals(this.topicType, listInstanceTopicsRespTopics.topicType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policiesOnly, name, replication, partition, retentionTime, syncMessageFlush, syncReplication, appId, appName, permissions, externalConfigs, description, sensitiveWord, topicType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceTopicsRespTopics {\n");
        sb.append("    policiesOnly: ").append(toIndentedString(policiesOnly)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
        sb.append("    syncMessageFlush: ").append(toIndentedString(syncMessageFlush)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    externalConfigs: ").append(toIndentedString(externalConfigs)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sensitiveWord: ").append(toIndentedString(sensitiveWord)).append("\n");
        sb.append("    topicType: ").append(toIndentedString(topicType)).append("\n");
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

