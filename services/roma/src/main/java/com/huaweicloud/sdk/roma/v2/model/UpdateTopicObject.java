package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateTopicObject
 */
public class UpdateTopicObject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_time")
    
    private Integer retentionTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_replication")
    
    private Boolean syncReplication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_message_flush")
    
    private Boolean syncMessageFlush;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sensitive_word")
    
    private String sensitiveWord;

    public UpdateTopicObject withName(String name) {
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

    

    public UpdateTopicObject withRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    


    /**
     * 消息老化时间。默认值为72。取值范围1~720，单位小时。
     * @return retentionTime
     */
    public Integer getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
    }

    

    public UpdateTopicObject withSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
        return this;
    }

    


    /**
     * 是否开启同步复制。
     * @return syncReplication
     */
    public Boolean getSyncReplication() {
        return syncReplication;
    }

    public void setSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
    }

    

    public UpdateTopicObject withSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
        return this;
    }

    


    /**
     * 是否使用同步落盘。
     * @return syncMessageFlush
     */
    public Boolean getSyncMessageFlush() {
        return syncMessageFlush;
    }

    public void setSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
    }

    

    public UpdateTopicObject withDescription(String description) {
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

    

    public UpdateTopicObject withSensitiveWord(String sensitiveWord) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTopicObject updateTopicObject = (UpdateTopicObject) o;
        return Objects.equals(this.name, updateTopicObject.name) &&
            Objects.equals(this.retentionTime, updateTopicObject.retentionTime) &&
            Objects.equals(this.syncReplication, updateTopicObject.syncReplication) &&
            Objects.equals(this.syncMessageFlush, updateTopicObject.syncMessageFlush) &&
            Objects.equals(this.description, updateTopicObject.description) &&
            Objects.equals(this.sensitiveWord, updateTopicObject.sensitiveWord);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, retentionTime, syncReplication, syncMessageFlush, description, sensitiveWord);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicObject {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    syncMessageFlush: ").append(toIndentedString(syncMessageFlush)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sensitiveWord: ").append(toIndentedString(sensitiveWord)).append("\n");
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

