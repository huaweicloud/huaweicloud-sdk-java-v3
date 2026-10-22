package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检测日志项
 */
public class LogItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    private String engineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_type")

    private String detectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_content")

    private String detectContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history")

    private List<HistoryItem> history = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_types")

    private List<String> attackTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_resp")

    private String customResp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_details")

    private List<HitDetail> hitDetails = null;

    public LogItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 日志唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LogItem withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 检测时间（毫秒时间戳）
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public LogItem withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public LogItem withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public LogItem withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * 引擎ID
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public LogItem withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * APP ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public LogItem withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * APP名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public LogItem withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public LogItem withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LogItem withDetectType(String detectType) {
        this.detectType = detectType;
        return this;
    }

    /**
     * 检测类型
     * @return detectType
     */
    public String getDetectType() {
        return detectType;
    }

    public void setDetectType(String detectType) {
        this.detectType = detectType;
    }

    public LogItem withDetectContent(String detectContent) {
        this.detectContent = detectContent;
        return this;
    }

    /**
     * 检测内容原文
     * @return detectContent
     */
    public String getDetectContent() {
        return detectContent;
    }

    public void setDetectContent(String detectContent) {
        this.detectContent = detectContent;
    }

    public LogItem withHistory(List<HistoryItem> history) {
        this.history = history;
        return this;
    }

    public LogItem addHistoryItem(HistoryItem historyItem) {
        if (this.history == null) {
            this.history = new ArrayList<>();
        }
        this.history.add(historyItem);
        return this;
    }

    public LogItem withHistory(Consumer<List<HistoryItem>> historySetter) {
        if (this.history == null) {
            this.history = new ArrayList<>();
        }
        historySetter.accept(this.history);
        return this;
    }

    /**
     * 多轮对话历史上下文，与检测内容原文一一对应
     * @return history
     */
    public List<HistoryItem> getHistory() {
        return history;
    }

    public void setHistory(List<HistoryItem> history) {
        this.history = history;
    }

    public LogItem withAttackTypes(List<String> attackTypes) {
        this.attackTypes = attackTypes;
        return this;
    }

    public LogItem addAttackTypesItem(String attackTypesItem) {
        if (this.attackTypes == null) {
            this.attackTypes = new ArrayList<>();
        }
        this.attackTypes.add(attackTypesItem);
        return this;
    }

    public LogItem withAttackTypes(Consumer<List<String>> attackTypesSetter) {
        if (this.attackTypes == null) {
            this.attackTypes = new ArrayList<>();
        }
        attackTypesSetter.accept(this.attackTypes);
        return this;
    }

    /**
     * 检测分类
     * @return attackTypes
     */
    public List<String> getAttackTypes() {
        return attackTypes;
    }

    public void setAttackTypes(List<String> attackTypes) {
        this.attackTypes = attackTypes;
    }

    public LogItem withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 执行动作
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public LogItem withCustomResp(String customResp) {
        this.customResp = customResp;
        return this;
    }

    /**
     * 安全代答
     * @return customResp
     */
    public String getCustomResp() {
        return customResp;
    }

    public void setCustomResp(String customResp) {
        this.customResp = customResp;
    }

    public LogItem withHitDetails(List<HitDetail> hitDetails) {
        this.hitDetails = hitDetails;
        return this;
    }

    public LogItem addHitDetailsItem(HitDetail hitDetailsItem) {
        if (this.hitDetails == null) {
            this.hitDetails = new ArrayList<>();
        }
        this.hitDetails.add(hitDetailsItem);
        return this;
    }

    public LogItem withHitDetails(Consumer<List<HitDetail>> hitDetailsSetter) {
        if (this.hitDetails == null) {
            this.hitDetails = new ArrayList<>();
        }
        hitDetailsSetter.accept(this.hitDetails);
        return this;
    }

    /**
     * 检测命中详情
     * @return hitDetails
     */
    public List<HitDetail> getHitDetails() {
        return hitDetails;
    }

    public void setHitDetails(List<HitDetail> hitDetails) {
        this.hitDetails = hitDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogItem that = (LogItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.engineId, that.engineId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.detectType, that.detectType)
            && Objects.equals(this.detectContent, that.detectContent) && Objects.equals(this.history, that.history)
            && Objects.equals(this.attackTypes, that.attackTypes) && Objects.equals(this.suggestion, that.suggestion)
            && Objects.equals(this.customResp, that.customResp) && Objects.equals(this.hitDetails, that.hitDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            timestamp,
            requestId,
            regionId,
            engineId,
            appId,
            appName,
            tenantId,
            projectId,
            detectType,
            detectContent,
            history,
            attackTypes,
            suggestion,
            customResp,
            hitDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    detectType: ").append(toIndentedString(detectType)).append("\n");
        sb.append("    detectContent: ").append(toIndentedString(detectContent)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
        sb.append("    attackTypes: ").append(toIndentedString(attackTypes)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    customResp: ").append(toIndentedString(customResp)).append("\n");
        sb.append("    hitDetails: ").append(toIndentedString(hitDetails)).append("\n");
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
