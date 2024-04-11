package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出结果对象。
 */
public class DsExportResultVOData {

    /**
     * 标识本次导出的唯一值，用于查询导入结果。importing(导出中)、fail(导出失败)、success(导出成功)。
     */
    public static final class StatusEnum {

        /**
         * Enum IMPORTING for value: "importing"
         */
        public static final StatusEnum IMPORTING = new StatusEnum("importing");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("importing", IMPORTING);
            map.put("fail", FAIL);
            map.put("success", SUCCESS);
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
    @JsonProperty(value = "group")

    private BatchOperationVO group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate")

    private String rate;

    public DsExportResultVOData withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 标识本次导出的唯一值，用于查询导入结果。importing(导出中)、fail(导出失败)、success(导出成功)。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DsExportResultVOData withGroup(BatchOperationVO group) {
        this.group = group;
        return this;
    }

    public DsExportResultVOData withGroup(Consumer<BatchOperationVO> groupSetter) {
        if (this.group == null) {
            this.group = new BatchOperationVO();
            groupSetter.accept(this.group);
        }

        return this;
    }

    /**
     * Get group
     * @return group
     */
    public BatchOperationVO getGroup() {
        return group;
    }

    public void setGroup(BatchOperationVO group) {
        this.group = group;
    }

    public DsExportResultVOData withRate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * 当前进度。
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DsExportResultVOData that = (DsExportResultVOData) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.group, that.group)
            && Objects.equals(this.rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, group, rate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DsExportResultVOData {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
