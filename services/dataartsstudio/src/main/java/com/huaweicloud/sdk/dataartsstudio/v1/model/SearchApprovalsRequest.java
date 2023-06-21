package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class SearchApprovalsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private Long bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    /**
     * 查询待审批，已审批
     */
    public static final class ApprovalStatusEnum {

        /**
         * Enum DEVELOPING for value: "DEVELOPING"
         */
        public static final ApprovalStatusEnum DEVELOPING = new ApprovalStatusEnum("DEVELOPING");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final ApprovalStatusEnum FINISHED = new ApprovalStatusEnum("FINISHED");

        private static final Map<String, ApprovalStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApprovalStatusEnum> createStaticFields() {
            Map<String, ApprovalStatusEnum> map = new HashMap<>();
            map.put("DEVELOPING", DEVELOPING);
            map.put("FINISHED", FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApprovalStatusEnum(String value) {
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
        public static ApprovalStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApprovalStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApprovalStatusEnum(value);
            }
            return result;
        }

        public static ApprovalStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApprovalStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApprovalStatusEnum) {
                return this.value.equals(((ApprovalStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_status")

    private ApprovalStatusEnum approvalStatus;

    /**
     * 查询待审批，已审批
     */
    public static final class ApprovalStatusDetailEnum {

        /**
         * Enum DEVELOPING for value: "DEVELOPING"
         */
        public static final ApprovalStatusDetailEnum DEVELOPING = new ApprovalStatusDetailEnum("DEVELOPING");

        /**
         * Enum APPROVED for value: "APPROVED"
         */
        public static final ApprovalStatusDetailEnum APPROVED = new ApprovalStatusDetailEnum("APPROVED");

        /**
         * Enum REJECT for value: "REJECT"
         */
        public static final ApprovalStatusDetailEnum REJECT = new ApprovalStatusDetailEnum("REJECT");

        private static final Map<String, ApprovalStatusDetailEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApprovalStatusDetailEnum> createStaticFields() {
            Map<String, ApprovalStatusDetailEnum> map = new HashMap<>();
            map.put("DEVELOPING", DEVELOPING);
            map.put("APPROVED", APPROVED);
            map.put("REJECT", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApprovalStatusDetailEnum(String value) {
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
        public static ApprovalStatusDetailEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApprovalStatusDetailEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApprovalStatusDetailEnum(value);
            }
            return result;
        }

        public static ApprovalStatusDetailEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApprovalStatusDetailEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApprovalStatusDetailEnum) {
                return this.value.equals(((ApprovalStatusDetailEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_status_detail")

    private ApprovalStatusDetailEnum approvalStatusDetail;

    /**
     * 业务审核类型
     */
    public static final class ApprovalTypeEnum {

        /**
         * Enum PUBLISH for value: "PUBLISH"
         */
        public static final ApprovalTypeEnum PUBLISH = new ApprovalTypeEnum("PUBLISH");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final ApprovalTypeEnum OFFLINE = new ApprovalTypeEnum("OFFLINE");

        private static final Map<String, ApprovalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApprovalTypeEnum> createStaticFields() {
            Map<String, ApprovalTypeEnum> map = new HashMap<>();
            map.put("PUBLISH", PUBLISH);
            map.put("OFFLINE", OFFLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApprovalTypeEnum(String value) {
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
        public static ApprovalTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApprovalTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApprovalTypeEnum(value);
            }
            return result;
        }

        public static ApprovalTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApprovalTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApprovalTypeEnum) {
                return this.value.equals(((ApprovalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_type")

    private ApprovalTypeEnum approvalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private String bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public SearchApprovalsRequest withWorkspace(String workspace) {
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

    public SearchApprovalsRequest withBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 业务定义id
     * @return bizId
     */
    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public SearchApprovalsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按名称或编码模糊查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchApprovalsRequest withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 按创建者查询
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public SearchApprovalsRequest withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * 按审核人查询
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public SearchApprovalsRequest withApprovalStatus(ApprovalStatusEnum approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }

    /**
     * 查询待审批，已审批
     * @return approvalStatus
     */
    public ApprovalStatusEnum getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public SearchApprovalsRequest withApprovalStatusDetail(ApprovalStatusDetailEnum approvalStatusDetail) {
        this.approvalStatusDetail = approvalStatusDetail;
        return this;
    }

    /**
     * 查询待审批，已审批
     * @return approvalStatusDetail
     */
    public ApprovalStatusDetailEnum getApprovalStatusDetail() {
        return approvalStatusDetail;
    }

    public void setApprovalStatusDetail(ApprovalStatusDetailEnum approvalStatusDetail) {
        this.approvalStatusDetail = approvalStatusDetail;
    }

    public SearchApprovalsRequest withApprovalType(ApprovalTypeEnum approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    /**
     * 业务审核类型
     * @return approvalType
     */
    public ApprovalTypeEnum getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(ApprovalTypeEnum approvalType) {
        this.approvalType = approvalType;
    }

    public SearchApprovalsRequest withBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 按业务类型查询
     * @return bizType
     */
    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public SearchApprovalsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 时间过滤左边界,与end_time一起使用,只支持时间范围过滤,单边过滤无效
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public SearchApprovalsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 时间过滤右边界,与begin_time一起使用只支持时间范围过滤,单边过滤无效
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SearchApprovalsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数，即查询Y条数据。默认值50，取值范围[1,100]
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchApprovalsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标，即跳过X条数据，仅支持0或limit的整数倍，不满足则向下取整。默认值0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchApprovalsRequest searchApprovalsRequest = (SearchApprovalsRequest) o;
        return Objects.equals(this.workspace, searchApprovalsRequest.workspace)
            && Objects.equals(this.bizId, searchApprovalsRequest.bizId)
            && Objects.equals(this.name, searchApprovalsRequest.name)
            && Objects.equals(this.createBy, searchApprovalsRequest.createBy)
            && Objects.equals(this.approver, searchApprovalsRequest.approver)
            && Objects.equals(this.approvalStatus, searchApprovalsRequest.approvalStatus)
            && Objects.equals(this.approvalStatusDetail, searchApprovalsRequest.approvalStatusDetail)
            && Objects.equals(this.approvalType, searchApprovalsRequest.approvalType)
            && Objects.equals(this.bizType, searchApprovalsRequest.bizType)
            && Objects.equals(this.beginTime, searchApprovalsRequest.beginTime)
            && Objects.equals(this.endTime, searchApprovalsRequest.endTime)
            && Objects.equals(this.limit, searchApprovalsRequest.limit)
            && Objects.equals(this.offset, searchApprovalsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            bizId,
            name,
            createBy,
            approver,
            approvalStatus,
            approvalStatusDetail,
            approvalType,
            bizType,
            beginTime,
            endTime,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchApprovalsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
        sb.append("    approvalStatusDetail: ").append(toIndentedString(approvalStatusDetail)).append("\n");
        sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
