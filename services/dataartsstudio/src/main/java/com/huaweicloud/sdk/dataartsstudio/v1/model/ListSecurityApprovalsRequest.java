package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListSecurityApprovalsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer_name")

    private String proposerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_id")

    private String approvalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<Integer> statusList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_start_time")

    private Long applicationStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_end_time")

    private Long applicationEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_desc")

    private Boolean orderByDesc;

    /**
     * 排序参数, START_TIME,END_TIME
     */
    public static final class OrderByEnum {

        /**
         * Enum START_TIME for value: "START_TIME"
         */
        public static final OrderByEnum START_TIME = new OrderByEnum("START_TIME");

        /**
         * Enum END_TIME for value: "END_TIME"
         */
        public static final OrderByEnum END_TIME = new OrderByEnum("END_TIME");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("START_TIME", START_TIME);
            map.put("END_TIME", END_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderByEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OrderByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderByEnum(value));
        }

        public static OrderByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderByEnum) {
                return this.value.equals(((OrderByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private OrderByEnum orderBy;

    public ListSecurityApprovalsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListSecurityApprovalsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecurityApprovalsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * offset
     * minimum: 0
     * maximum: 99999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSecurityApprovalsRequest withProposerName(String proposerName) {
        this.proposerName = proposerName;
        return this;
    }

    /**
     * 申请人名称
     * @return proposerName
     */
    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    public ListSecurityApprovalsRequest withApprovalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }

    /**
     * 工单id
     * @return approvalId
     */
    public String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
    }

    public ListSecurityApprovalsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListSecurityApprovalsRequest withStatusList(List<Integer> statusList) {
        this.statusList = statusList;
        return this;
    }

    public ListSecurityApprovalsRequest addStatusListItem(Integer statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public ListSecurityApprovalsRequest withStatusList(Consumer<List<Integer>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * 工单状态
     * @return statusList
     */
    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }

    public ListSecurityApprovalsRequest withApplicationStartTime(Long applicationStartTime) {
        this.applicationStartTime = applicationStartTime;
        return this;
    }

    /**
     * 申请开始时间
     * minimum: 0
     * maximum: 2147483647
     * @return applicationStartTime
     */
    public Long getApplicationStartTime() {
        return applicationStartTime;
    }

    public void setApplicationStartTime(Long applicationStartTime) {
        this.applicationStartTime = applicationStartTime;
    }

    public ListSecurityApprovalsRequest withApplicationEndTime(Long applicationEndTime) {
        this.applicationEndTime = applicationEndTime;
        return this;
    }

    /**
     * 申请结束时间
     * minimum: 0
     * maximum: 2147483647
     * @return applicationEndTime
     */
    public Long getApplicationEndTime() {
        return applicationEndTime;
    }

    public void setApplicationEndTime(Long applicationEndTime) {
        this.applicationEndTime = applicationEndTime;
    }

    public ListSecurityApprovalsRequest withOrderByDesc(Boolean orderByDesc) {
        this.orderByDesc = orderByDesc;
        return this;
    }

    /**
     * 升降序
     * @return orderByDesc
     */
    public Boolean getOrderByDesc() {
        return orderByDesc;
    }

    public void setOrderByDesc(Boolean orderByDesc) {
        this.orderByDesc = orderByDesc;
    }

    public ListSecurityApprovalsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序参数, START_TIME,END_TIME
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityApprovalsRequest that = (ListSecurityApprovalsRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.proposerName, that.proposerName)
            && Objects.equals(this.approvalId, that.approvalId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.statusList, that.statusList)
            && Objects.equals(this.applicationStartTime, that.applicationStartTime)
            && Objects.equals(this.applicationEndTime, that.applicationEndTime)
            && Objects.equals(this.orderByDesc, that.orderByDesc) && Objects.equals(this.orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            limit,
            offset,
            proposerName,
            approvalId,
            workspaceId,
            statusList,
            applicationStartTime,
            applicationEndTime,
            orderByDesc,
            orderBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityApprovalsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    proposerName: ").append(toIndentedString(proposerName)).append("\n");
        sb.append("    approvalId: ").append(toIndentedString(approvalId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    applicationStartTime: ").append(toIndentedString(applicationStartTime)).append("\n");
        sb.append("    applicationEndTime: ").append(toIndentedString(applicationEndTime)).append("\n");
        sb.append("    orderByDesc: ").append(toIndentedString(orderByDesc)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
