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
public class ListDimensionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

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
     * 业务状态。 枚举值：   - DRAFT: 草稿   - PUBLISH_DEVELOPING: 发布待审批   - PUBLISHED: 已发布   - OFFLINE_DEVELOPING: 下线待审批   - OFFLINE: 已下线   - REJECT: 已驳回 
     */
    public static final class StatusEnum {

        /**
         * Enum DRAFT for value: "DRAFT"
         */
        public static final StatusEnum DRAFT = new StatusEnum("DRAFT");

        /**
         * Enum PUBLISH_DEVELOPING for value: "PUBLISH_DEVELOPING"
         */
        public static final StatusEnum PUBLISH_DEVELOPING = new StatusEnum("PUBLISH_DEVELOPING");

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StatusEnum PUBLISHED = new StatusEnum("PUBLISHED");

        /**
         * Enum OFFLINE_DEVELOPING for value: "OFFLINE_DEVELOPING"
         */
        public static final StatusEnum OFFLINE_DEVELOPING = new StatusEnum("OFFLINE_DEVELOPING");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final StatusEnum OFFLINE = new StatusEnum("OFFLINE");

        /**
         * Enum REJECT for value: "REJECT"
         */
        public static final StatusEnum REJECT = new StatusEnum("REJECT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("DRAFT", DRAFT);
            map.put("PUBLISH_DEVELOPING", PUBLISH_DEVELOPING);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFFLINE_DEVELOPING", OFFLINE_DEVELOPING);
            map.put("OFFLINE", OFFLINE);
            map.put("REJECT", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2_id")

    private String l2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "derivative_ids")

    private List<String> derivativeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fact_logic_id")

    private String factLogicId;

    /**
     * 维度类型。 枚举值： - COMMON: 普通维度 - LOOKUP: 码表维度 - HIERARCHIES: 层级维度 
     */
    public static final class DimensionTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final DimensionTypeEnum COMMON = new DimensionTypeEnum("COMMON");

        /**
         * Enum LOOKUP for value: "LOOKUP"
         */
        public static final DimensionTypeEnum LOOKUP = new DimensionTypeEnum("LOOKUP");

        /**
         * Enum HIERARCHIES for value: "HIERARCHIES"
         */
        public static final DimensionTypeEnum HIERARCHIES = new DimensionTypeEnum("HIERARCHIES");

        private static final Map<String, DimensionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimensionTypeEnum> createStaticFields() {
            Map<String, DimensionTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("LOOKUP", LOOKUP);
            map.put("HIERARCHIES", HIERARCHIES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimensionTypeEnum(String value) {
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
        public static DimensionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DimensionTypeEnum(value));
        }

        public static DimensionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimensionTypeEnum) {
                return this.value.equals(((DimensionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_type")

    private DimensionTypeEnum dimensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_id")

    private String bizCatalogId;

    public ListDimensionsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListDimensionsRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ListDimensionsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按名称或编码模糊查询。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDimensionsRequest withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 按创建者查询。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ListDimensionsRequest withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * 按审核人查询。
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public ListDimensionsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 业务状态。 枚举值：   - DRAFT: 草稿   - PUBLISH_DEVELOPING: 发布待审批   - PUBLISHED: 已发布   - OFFLINE_DEVELOPING: 下线待审批   - OFFLINE: 已下线   - REJECT: 已驳回 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListDimensionsRequest withL2Id(String l2Id) {
        this.l2Id = l2Id;
        return this;
    }

    /**
     * 主题域l2的ID，填写String类型替代Long类型。
     * @return l2Id
     */
    public String getL2Id() {
        return l2Id;
    }

    public void setL2Id(String l2Id) {
        this.l2Id = l2Id;
    }

    public ListDimensionsRequest withDerivativeIds(List<String> derivativeIds) {
        this.derivativeIds = derivativeIds;
        return this;
    }

    public ListDimensionsRequest addDerivativeIdsItem(String derivativeIdsItem) {
        if (this.derivativeIds == null) {
            this.derivativeIds = new ArrayList<>();
        }
        this.derivativeIds.add(derivativeIdsItem);
        return this;
    }

    public ListDimensionsRequest withDerivativeIds(Consumer<List<String>> derivativeIdsSetter) {
        if (this.derivativeIds == null) {
            this.derivativeIds = new ArrayList<>();
        }
        derivativeIdsSetter.accept(this.derivativeIds);
        return this;
    }

    /**
     * 依据复合指标ID列表查维度，填写String类型替代Long类型。
     * @return derivativeIds
     */
    public List<String> getDerivativeIds() {
        return derivativeIds;
    }

    public void setDerivativeIds(List<String> derivativeIds) {
        this.derivativeIds = derivativeIds;
    }

    public ListDimensionsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 时间过滤左边界，与end_time一起使用，只支持时间范围过滤，单边过滤无效。格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListDimensionsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 时间过滤右边界，与begin_time一起使用只支持时间范围过滤，单边过滤无效。格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListDimensionsRequest withFactLogicId(String factLogicId) {
        this.factLogicId = factLogicId;
        return this;
    }

    /**
     * 事实表ID，填写String类型替代Long类型。
     * @return factLogicId
     */
    public String getFactLogicId() {
        return factLogicId;
    }

    public void setFactLogicId(String factLogicId) {
        this.factLogicId = factLogicId;
    }

    public ListDimensionsRequest withDimensionType(DimensionTypeEnum dimensionType) {
        this.dimensionType = dimensionType;
        return this;
    }

    /**
     * 维度类型。 枚举值： - COMMON: 普通维度 - LOOKUP: 码表维度 - HIERARCHIES: 层级维度 
     * @return dimensionType
     */
    public DimensionTypeEnum getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(DimensionTypeEnum dimensionType) {
        this.dimensionType = dimensionType;
    }

    public ListDimensionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页查询条数，即查询Y条数据。默认值50，取值范围[1,100]。
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDimensionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标，即跳过X条数据，仅支持0或limit的整数倍，不满足则向下取整，默认值0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDimensionsRequest withBizCatalogId(String bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
        return this;
    }

    /**
     * 所属的业务分层的ID。
     * @return bizCatalogId
     */
    public String getBizCatalogId() {
        return bizCatalogId;
    }

    public void setBizCatalogId(String bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDimensionsRequest that = (ListDimensionsRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.approver, that.approver) && Objects.equals(this.status, that.status)
            && Objects.equals(this.l2Id, that.l2Id) && Objects.equals(this.derivativeIds, that.derivativeIds)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.factLogicId, that.factLogicId)
            && Objects.equals(this.dimensionType, that.dimensionType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.bizCatalogId, that.bizCatalogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            xProjectId,
            name,
            createBy,
            approver,
            status,
            l2Id,
            derivativeIds,
            beginTime,
            endTime,
            factLogicId,
            dimensionType,
            limit,
            offset,
            bizCatalogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDimensionsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    derivativeIds: ").append(toIndentedString(derivativeIds)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    factLogicId: ").append(toIndentedString(factLogicId)).append("\n");
        sb.append("    dimensionType: ").append(toIndentedString(dimensionType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    bizCatalogId: ").append(toIndentedString(bizCatalogId)).append("\n");
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
