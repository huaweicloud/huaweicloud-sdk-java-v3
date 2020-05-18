package com.huaweicloud.sdk.cts.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 云日志服务配置
 */
public class Lts  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_lts_enabled")
    
    private Boolean isLtsEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_group_name")
    
    private String logGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_topic_name")
    
    private String logTopicName;

    public Lts withIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
        return this;
    }

    


    /**
     * 是否启用日志服务检索功能。
     * @return isLtsEnabled
     */
    public Boolean getIsLtsEnabled() {
        return isLtsEnabled;
    }

    public void setIsLtsEnabled(Boolean isLtsEnabled) {
        this.isLtsEnabled = isLtsEnabled;
    }

    public Lts withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    


    /**
     * 云审计服务在日志服务中创建的日志组名称。
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public Lts withLogTopicName(String logTopicName) {
        this.logTopicName = logTopicName;
        return this;
    }

    


    /**
     * 云审计服务在日志服务中创建的日志主题名称。
     * @return logTopicName
     */
    public String getLogTopicName() {
        return logTopicName;
    }

    public void setLogTopicName(String logTopicName) {
        this.logTopicName = logTopicName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Lts lts = (Lts) o;
        return Objects.equals(this.isLtsEnabled, lts.isLtsEnabled) &&
            Objects.equals(this.logGroupName, lts.logGroupName) &&
            Objects.equals(this.logTopicName, lts.logTopicName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isLtsEnabled, logGroupName, logTopicName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Lts {\n");
            sb.append("    isLtsEnabled: ").append(toIndentedString(isLtsEnabled)).append("\n");
            sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
            sb.append("    logTopicName: ").append(toIndentedString(logTopicName)).append("\n");
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

