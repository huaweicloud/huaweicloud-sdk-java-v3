package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConditionVO
 */
public class ConditionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    /**
     * 限定计算方法。 枚举值：   - LAST_YEAR: 前一年   - CURRENT_YEAR: 本年   - BETWEEN_YEAR: 自定义年区间   - LAST_MONTH: 前一月   - CURRENT_MONTH: 本月   - BETWEEN_MONTH: 自定义月区间   - LAST_DAY: 前一天   - CURRENT_DAY: 本日   - BETWEEN_DAY: 自定义日区间   - LAST_HOUR: 上一小时   - CURRENT_HOUR: 当前小时   - BETWEEN_HOUR: 自定义小时区间   - LAST_MINUTE: 上一分钟   - CURRENT_MINUTE: 当前分钟   - BETWEEN_MINUTE: 自定义分钟区间 
     */
    public static final class ConditionFnEnum {

        /**
         * Enum LAST_YEAR for value: "LAST_YEAR"
         */
        public static final ConditionFnEnum LAST_YEAR = new ConditionFnEnum("LAST_YEAR");

        /**
         * Enum CURRENT_YEAR for value: "CURRENT_YEAR"
         */
        public static final ConditionFnEnum CURRENT_YEAR = new ConditionFnEnum("CURRENT_YEAR");

        /**
         * Enum BETWEEN_YEAR for value: "BETWEEN_YEAR"
         */
        public static final ConditionFnEnum BETWEEN_YEAR = new ConditionFnEnum("BETWEEN_YEAR");

        /**
         * Enum LAST_MONTH for value: "LAST_MONTH"
         */
        public static final ConditionFnEnum LAST_MONTH = new ConditionFnEnum("LAST_MONTH");

        /**
         * Enum CURRENT_MONTH for value: "CURRENT_MONTH"
         */
        public static final ConditionFnEnum CURRENT_MONTH = new ConditionFnEnum("CURRENT_MONTH");

        /**
         * Enum BETWEEN_MONTH for value: "BETWEEN_MONTH"
         */
        public static final ConditionFnEnum BETWEEN_MONTH = new ConditionFnEnum("BETWEEN_MONTH");

        /**
         * Enum LAST_DAY for value: "LAST_DAY"
         */
        public static final ConditionFnEnum LAST_DAY = new ConditionFnEnum("LAST_DAY");

        /**
         * Enum CURRENT_DAY for value: "CURRENT_DAY"
         */
        public static final ConditionFnEnum CURRENT_DAY = new ConditionFnEnum("CURRENT_DAY");

        /**
         * Enum BETWEEN_DAY for value: "BETWEEN_DAY"
         */
        public static final ConditionFnEnum BETWEEN_DAY = new ConditionFnEnum("BETWEEN_DAY");

        /**
         * Enum LAST_HOUR for value: "LAST_HOUR"
         */
        public static final ConditionFnEnum LAST_HOUR = new ConditionFnEnum("LAST_HOUR");

        /**
         * Enum CURRENT_HOUR for value: "CURRENT_HOUR"
         */
        public static final ConditionFnEnum CURRENT_HOUR = new ConditionFnEnum("CURRENT_HOUR");

        /**
         * Enum BETWEEN_HOUR for value: "BETWEEN_HOUR"
         */
        public static final ConditionFnEnum BETWEEN_HOUR = new ConditionFnEnum("BETWEEN_HOUR");

        /**
         * Enum LAST_MINUTE for value: "LAST_MINUTE"
         */
        public static final ConditionFnEnum LAST_MINUTE = new ConditionFnEnum("LAST_MINUTE");

        /**
         * Enum CURRENT_MINUTE for value: "CURRENT_MINUTE"
         */
        public static final ConditionFnEnum CURRENT_MINUTE = new ConditionFnEnum("CURRENT_MINUTE");

        /**
         * Enum BETWEEN_MINUTE for value: "BETWEEN_MINUTE"
         */
        public static final ConditionFnEnum BETWEEN_MINUTE = new ConditionFnEnum("BETWEEN_MINUTE");

        private static final Map<String, ConditionFnEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionFnEnum> createStaticFields() {
            Map<String, ConditionFnEnum> map = new HashMap<>();
            map.put("LAST_YEAR", LAST_YEAR);
            map.put("CURRENT_YEAR", CURRENT_YEAR);
            map.put("BETWEEN_YEAR", BETWEEN_YEAR);
            map.put("LAST_MONTH", LAST_MONTH);
            map.put("CURRENT_MONTH", CURRENT_MONTH);
            map.put("BETWEEN_MONTH", BETWEEN_MONTH);
            map.put("LAST_DAY", LAST_DAY);
            map.put("CURRENT_DAY", CURRENT_DAY);
            map.put("BETWEEN_DAY", BETWEEN_DAY);
            map.put("LAST_HOUR", LAST_HOUR);
            map.put("CURRENT_HOUR", CURRENT_HOUR);
            map.put("BETWEEN_HOUR", BETWEEN_HOUR);
            map.put("LAST_MINUTE", LAST_MINUTE);
            map.put("CURRENT_MINUTE", CURRENT_MINUTE);
            map.put("BETWEEN_MINUTE", BETWEEN_MINUTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionFnEnum(String value) {
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
        public static ConditionFnEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConditionFnEnum(value));
        }

        public static ConditionFnEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionFnEnum) {
                return this.value.equals(((ConditionFnEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_fn")

    private ConditionFnEnum conditionFn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_fn_param")

    private String conditionFnParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_info")

    private ApprovalVO approvalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_time")

    private Integer baseTime;

    public ConditionVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConditionVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public ConditionVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 业务属性。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public ConditionVO withDescription(String description) {
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

    public ConditionVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ConditionVO withConditionFn(ConditionFnEnum conditionFn) {
        this.conditionFn = conditionFn;
        return this;
    }

    /**
     * 限定计算方法。 枚举值：   - LAST_YEAR: 前一年   - CURRENT_YEAR: 本年   - BETWEEN_YEAR: 自定义年区间   - LAST_MONTH: 前一月   - CURRENT_MONTH: 本月   - BETWEEN_MONTH: 自定义月区间   - LAST_DAY: 前一天   - CURRENT_DAY: 本日   - BETWEEN_DAY: 自定义日区间   - LAST_HOUR: 上一小时   - CURRENT_HOUR: 当前小时   - BETWEEN_HOUR: 自定义小时区间   - LAST_MINUTE: 上一分钟   - CURRENT_MINUTE: 当前分钟   - BETWEEN_MINUTE: 自定义分钟区间 
     * @return conditionFn
     */
    public ConditionFnEnum getConditionFn() {
        return conditionFn;
    }

    public void setConditionFn(ConditionFnEnum conditionFn) {
        this.conditionFn = conditionFn;
    }

    public ConditionVO withConditionFnParam(String conditionFnParam) {
        this.conditionFnParam = conditionFnParam;
        return this;
    }

    /**
     * 限定计算参数。
     * @return conditionFnParam
     */
    public String getConditionFnParam() {
        return conditionFnParam;
    }

    public void setConditionFnParam(String conditionFnParam) {
        this.conditionFnParam = conditionFnParam;
    }

    public ConditionVO withStatus(BizStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BizStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BizStatusEnum status) {
        this.status = status;
    }

    public ConditionVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ConditionVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ConditionVO withApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
        return this;
    }

    public ConditionVO withApprovalInfo(Consumer<ApprovalVO> approvalInfoSetter) {
        if (this.approvalInfo == null) {
            this.approvalInfo = new ApprovalVO();
            approvalInfoSetter.accept(this.approvalInfo);
        }

        return this;
    }

    /**
     * Get approvalInfo
     * @return approvalInfo
     */
    public ApprovalVO getApprovalInfo() {
        return approvalInfo;
    }

    public void setApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
    }

    public ConditionVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public ConditionVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
        if (this.newBiz == null) {
            this.newBiz = new BizVersionManageVO();
            newBizSetter.accept(this.newBiz);
        }

        return this;
    }

    /**
     * Get newBiz
     * @return newBiz
     */
    public BizVersionManageVO getNewBiz() {
        return newBiz;
    }

    public void setNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
    }

    public ConditionVO withBaseTime(Integer baseTime) {
        this.baseTime = baseTime;
        return this;
    }

    /**
     * 基准时间。
     * @return baseTime
     */
    public Integer getBaseTime() {
        return baseTime;
    }

    public void setBaseTime(Integer baseTime) {
        this.baseTime = baseTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConditionVO that = (ConditionVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.conditionFn, that.conditionFn)
            && Objects.equals(this.conditionFnParam, that.conditionFnParam) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.approvalInfo, that.approvalInfo) && Objects.equals(this.newBiz, that.newBiz)
            && Objects.equals(this.baseTime, that.baseTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            nameEn,
            nameCh,
            description,
            createBy,
            conditionFn,
            conditionFnParam,
            status,
            createTime,
            updateTime,
            approvalInfo,
            newBiz,
            baseTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    conditionFn: ").append(toIndentedString(conditionFn)).append("\n");
        sb.append("    conditionFnParam: ").append(toIndentedString(conditionFnParam)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
        sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
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
