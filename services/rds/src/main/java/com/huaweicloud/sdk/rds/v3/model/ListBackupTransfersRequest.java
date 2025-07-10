package com.huaweicloud.sdk.rds.v3.model;

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
public class ListBackupTransfersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_field")

    private String orderField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_rule")

    private String orderRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_field")

    private String filterField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_content")

    private String filterContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    /**
     * 转储任务类型，默认为manual manual:手动转储任务 auto:自动转储任务
     */
    public static final class TransferTypeEnum {

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final TransferTypeEnum MANUAL = new TransferTypeEnum("manual");

        /**
         * Enum AUTO for value: "auto"
         */
        public static final TransferTypeEnum AUTO = new TransferTypeEnum("auto");

        private static final Map<String, TransferTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TransferTypeEnum> createStaticFields() {
            Map<String, TransferTypeEnum> map = new HashMap<>();
            map.put("manual", MANUAL);
            map.put("auto", AUTO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TransferTypeEnum(String value) {
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
        public static TransferTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TransferTypeEnum(value));
        }

        public static TransferTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransferTypeEnum) {
                return this.value.equals(((TransferTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_type")

    private TransferTypeEnum transferType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListBackupTransfersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数
     * minimum: 0
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListBackupTransfersRequest withOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }

    /**
     * 排序字段
     * @return orderField
     */
    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public ListBackupTransfersRequest withOrderRule(String orderRule) {
        this.orderRule = orderRule;
        return this;
    }

    /**
     * 排序规则
     * @return orderRule
     */
    public String getOrderRule() {
        return orderRule;
    }

    public void setOrderRule(String orderRule) {
        this.orderRule = orderRule;
    }

    public ListBackupTransfersRequest withFilterField(String filterField) {
        this.filterField = filterField;
        return this;
    }

    /**
     * 筛选字段
     * @return filterField
     */
    public String getFilterField() {
        return filterField;
    }

    public void setFilterField(String filterField) {
        this.filterField = filterField;
    }

    public ListBackupTransfersRequest withFilterContent(String filterContent) {
        this.filterContent = filterContent;
        return this;
    }

    /**
     * 筛选关键字
     * @return filterContent
     */
    public String getFilterContent() {
        return filterContent;
    }

    public void setFilterContent(String filterContent) {
        this.filterContent = filterContent;
    }

    public ListBackupTransfersRequest withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 开始时间戳
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public ListBackupTransfersRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间戳
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListBackupTransfersRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListBackupTransfersRequest withTransferType(TransferTypeEnum transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * 转储任务类型，默认为manual manual:手动转储任务 auto:自动转储任务
     * @return transferType
     */
    public TransferTypeEnum getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferTypeEnum transferType) {
        this.transferType = transferType;
    }

    public ListBackupTransfersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页页码
     * minimum: 1
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBackupTransfersRequest that = (ListBackupTransfersRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.orderField, that.orderField)
            && Objects.equals(this.orderRule, that.orderRule) && Objects.equals(this.filterField, that.filterField)
            && Objects.equals(this.filterContent, that.filterContent) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.transferType, that.transferType) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            orderField,
            orderRule,
            filterField,
            filterContent,
            beginTime,
            endTime,
            xLanguage,
            transferType,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupTransfersRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
        sb.append("    orderRule: ").append(toIndentedString(orderRule)).append("\n");
        sb.append("    filterField: ").append(toIndentedString(filterField)).append("\n");
        sb.append("    filterContent: ").append(toIndentedString(filterContent)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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
