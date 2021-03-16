package com.huaweicloud.sdk.swr.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.TriggerHistories;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTriggerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_type")
    
    private String appType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application")
    
    private String application;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_name")
    
    private String clusterName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_ns")
    
    private String clusterNs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition")
    
    private String condition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container")
    
    private String container;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator_name")
    
    private String creatorName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable")
    
    private String enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_history")
    
    private List<TriggerHistories> triggerHistory = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_mode")
    
    private String triggerMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_type")
    
    private String triggerType;

    public ShowTriggerResponse withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 触发动作，update
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public ShowTriggerResponse withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * 应用类型，deployments、statefulsets
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    

    public ShowTriggerResponse withApplication(String application) {
        this.application = application;
        return this;
    }

    


    /**
     * 应用名
     * @return application
     */
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    

    public ShowTriggerResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID（cci时为空）
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public ShowTriggerResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    


    /**
     * 集群名（cci时为空）
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    

    public ShowTriggerResponse withClusterNs(String clusterNs) {
        this.clusterNs = clusterNs;
        return this;
    }

    


    /**
     * 应用名所在的namespace
     * @return clusterNs
     */
    public String getClusterNs() {
        return clusterNs;
    }

    public void setClusterNs(String clusterNs) {
        this.clusterNs = clusterNs;
    }

    

    public ShowTriggerResponse withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    


    /**
     * 触发条件，type为all时为.*,type为tag时为tag名,type为regular时为正则表达式
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    

    public ShowTriggerResponse withContainer(String container) {
        this.container = container;
        return this;
    }

    


    /**
     * 需更新的container名，默认为所有container
     * @return container
     */
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    

    public ShowTriggerResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public ShowTriggerResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    


    /**
     * 创建人
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    

    public ShowTriggerResponse withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    


    /**
     * 是否生效
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    

    public ShowTriggerResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 触发器名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowTriggerResponse withTriggerHistory(List<TriggerHistories> triggerHistory) {
        this.triggerHistory = triggerHistory;
        return this;
    }

    
    public ShowTriggerResponse addTriggerHistoryItem(TriggerHistories triggerHistoryItem) {
        this.triggerHistory.add(triggerHistoryItem);
        return this;
    }

    public ShowTriggerResponse withTriggerHistory(Consumer<List<TriggerHistories>> triggerHistorySetter) {
        if(this.triggerHistory == null ){
            this.triggerHistory = new ArrayList<>();
        }
        triggerHistorySetter.accept(this.triggerHistory);
        return this;
    }

    /**
     * 触发器历史
     * @return triggerHistory
     */
    public List<TriggerHistories> getTriggerHistory() {
        return triggerHistory;
    }

    public void setTriggerHistory(List<TriggerHistories> triggerHistory) {
        this.triggerHistory = triggerHistory;
    }

    

    public ShowTriggerResponse withTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }

    


    /**
     * 触发器类型，cce、cci
     * @return triggerMode
     */
    public String getTriggerMode() {
        return triggerMode;
    }

    public void setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
    }

    

    public ShowTriggerResponse withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    


    /**
     * 触发条件，all、tag、regular
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTriggerResponse showTriggerResponse = (ShowTriggerResponse) o;
        return Objects.equals(this.action, showTriggerResponse.action) &&
            Objects.equals(this.appType, showTriggerResponse.appType) &&
            Objects.equals(this.application, showTriggerResponse.application) &&
            Objects.equals(this.clusterId, showTriggerResponse.clusterId) &&
            Objects.equals(this.clusterName, showTriggerResponse.clusterName) &&
            Objects.equals(this.clusterNs, showTriggerResponse.clusterNs) &&
            Objects.equals(this.condition, showTriggerResponse.condition) &&
            Objects.equals(this.container, showTriggerResponse.container) &&
            Objects.equals(this.createdAt, showTriggerResponse.createdAt) &&
            Objects.equals(this.creatorName, showTriggerResponse.creatorName) &&
            Objects.equals(this.enable, showTriggerResponse.enable) &&
            Objects.equals(this.name, showTriggerResponse.name) &&
            Objects.equals(this.triggerHistory, showTriggerResponse.triggerHistory) &&
            Objects.equals(this.triggerMode, showTriggerResponse.triggerMode) &&
            Objects.equals(this.triggerType, showTriggerResponse.triggerType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, appType, application, clusterId, clusterName, clusterNs, condition, container, createdAt, creatorName, enable, name, triggerHistory, triggerMode, triggerType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTriggerResponse {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterNs: ").append(toIndentedString(clusterNs)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    triggerHistory: ").append(toIndentedString(triggerHistory)).append("\n");
        sb.append("    triggerMode: ").append(toIndentedString(triggerMode)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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

