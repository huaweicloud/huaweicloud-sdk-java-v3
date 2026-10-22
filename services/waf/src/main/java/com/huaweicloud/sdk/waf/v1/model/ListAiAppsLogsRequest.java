package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAiAppsLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_type")

    private String detectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_types")

    private List<String> attackTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_direction")

    private String sortDirection;

    public ListAiAppsLogsRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数解释：** APP ID筛选 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListAiAppsLogsRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释：** 请求ID精确筛选，返回匹配该request_id的检测日志 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAiAppsLogsRequest withDetectType(String detectType) {
        this.detectType = detectType;
        return this;
    }

    /**
     * **参数解释：** 检测类型筛选，可选值：text, image, text_image **约束限制：** 不涉及 **取值范围：** - text: 文本检测 - image: 图片检测 - text_image: 文本图片混合检测 **默认取值：** 不涉及
     * @return detectType
     */
    public String getDetectType() {
        return detectType;
    }

    public void setDetectType(String detectType) {
        this.detectType = detectType;
    }

    public ListAiAppsLogsRequest withAttackTypes(List<String> attackTypes) {
        this.attackTypes = attackTypes;
        return this;
    }

    public ListAiAppsLogsRequest addAttackTypesItem(String attackTypesItem) {
        if (this.attackTypes == null) {
            this.attackTypes = new ArrayList<>();
        }
        this.attackTypes.add(attackTypesItem);
        return this;
    }

    public ListAiAppsLogsRequest withAttackTypes(Consumer<List<String>> attackTypesSetter) {
        if (this.attackTypes == null) {
            this.attackTypes = new ArrayList<>();
        }
        attackTypesSetter.accept(this.attackTypes);
        return this;
    }

    /**
     * **参数解释：** 攻击类型筛选，多个用逗号分隔 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return attackTypes
     */
    public List<String> getAttackTypes() {
        return attackTypes;
    }

    public void setAttackTypes(List<String> attackTypes) {
        this.attackTypes = attackTypes;
    }

    public ListAiAppsLogsRequest withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * **参数解释：** 执行动作筛选，可选值：pass, block, log, desensitize **约束限制：** 不涉及 **取值范围：** - pass: 放行 - block: 拦截 - log: 记录 - desensitize: 脱敏 **默认取值：** 不涉及
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public ListAiAppsLogsRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释：** APP名称筛选，按应用名称精确匹配查询 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListAiAppsLogsRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释：** 开始时间，时间格式为毫秒时间戳 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListAiAppsLogsRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释：** 截止时间，时间格式为毫秒时间戳 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListAiAppsLogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 每页数量，默认10，最大1000 **约束限制：** 最大1000 **取值范围：** 1-1000 **默认取值：** 10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAiAppsLogsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，默认0 **约束限制：** 不涉及 **取值范围：** >=0 **默认取值：** 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAiAppsLogsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释：** 游标标记，标记到ES的request_id字段，传入时忽略offset参数 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAiAppsLogsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * **参数解释：** 排序字段，仅支持timestamp **约束限制：** 仅支持timestamp **取值范围：** - timestamp: 按时间排序 **默认取值：** timestamp
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ListAiAppsLogsRequest withSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    /**
     * **参数解释：** 排序方向，可选值：asc, desc **约束限制：** 不涉及 **取值范围：** - asc: 升序 - desc: 降序 **默认取值：** desc
     * @return sortDirection
     */
    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiAppsLogsRequest that = (ListAiAppsLogsRequest) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.detectType, that.detectType) && Objects.equals(this.attackTypes, that.attackTypes)
            && Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.sortBy, that.sortBy)
            && Objects.equals(this.sortDirection, that.sortDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId,
            requestId,
            detectType,
            attackTypes,
            suggestion,
            appName,
            from,
            to,
            limit,
            offset,
            marker,
            sortBy,
            sortDirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiAppsLogsRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    detectType: ").append(toIndentedString(detectType)).append("\n");
        sb.append("    attackTypes: ").append(toIndentedString(attackTypes)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
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
