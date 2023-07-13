package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPauseResumeStutusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_instance_id")

    private String masterInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_instance_id")

    private String slaveInstanceId;

    /**
     * 容灾实例数据同步状态 - NA：实例尚未搭建容灾关系 - NEW：尚未启动的数据同步状态 - SYNCING：数据同步正常进行中 - SUSPENDING：正在暂停数据同步 - SUSPENDED：数据同步已暂停 - RECOVERYING：正在恢复数据同步
     */
    public static final class StatusEnum {

        /**
         * Enum NA for value: "NA"
         */
        public static final StatusEnum NA = new StatusEnum("NA");

        /**
         * Enum NEW for value: "NEW"
         */
        public static final StatusEnum NEW = new StatusEnum("NEW");

        /**
         * Enum SYNCING for value: "SYNCING"
         */
        public static final StatusEnum SYNCING = new StatusEnum("SYNCING");

        /**
         * Enum SUSPENDING for value: "SUSPENDING"
         */
        public static final StatusEnum SUSPENDING = new StatusEnum("SUSPENDING");

        /**
         * Enum SUSPENDED for value: "SUSPENDED"
         */
        public static final StatusEnum SUSPENDED = new StatusEnum("SUSPENDED");

        /**
         * Enum RECOVERYING for value: "RECOVERYING"
         */
        public static final StatusEnum RECOVERYING = new StatusEnum("RECOVERYING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("NA", NA);
            map.put("NEW", NEW);
            map.put("SYNCING", SYNCING);
            map.put("SUSPENDING", SUSPENDING);
            map.put("SUSPENDED", SUSPENDED);
            map.put("RECOVERYING", RECOVERYING);
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
    @JsonProperty(value = "data_sync_indicators")

    private NoSQLDrDateSyncIndicators dataSyncIndicators;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto_and_rpo_indicators")

    private List<NoSQLDrRpoAndRto> rtoAndRpoIndicators = null;

    public ShowPauseResumeStutusResponse withMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
        return this;
    }

    /**
     * 主实例id
     * @return masterInstanceId
     */
    public String getMasterInstanceId() {
        return masterInstanceId;
    }

    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }

    public ShowPauseResumeStutusResponse withSlaveInstanceId(String slaveInstanceId) {
        this.slaveInstanceId = slaveInstanceId;
        return this;
    }

    /**
     * 备实例id
     * @return slaveInstanceId
     */
    public String getSlaveInstanceId() {
        return slaveInstanceId;
    }

    public void setSlaveInstanceId(String slaveInstanceId) {
        this.slaveInstanceId = slaveInstanceId;
    }

    public ShowPauseResumeStutusResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 容灾实例数据同步状态 - NA：实例尚未搭建容灾关系 - NEW：尚未启动的数据同步状态 - SYNCING：数据同步正常进行中 - SUSPENDING：正在暂停数据同步 - SUSPENDED：数据同步已暂停 - RECOVERYING：正在恢复数据同步
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowPauseResumeStutusResponse withDataSyncIndicators(NoSQLDrDateSyncIndicators dataSyncIndicators) {
        this.dataSyncIndicators = dataSyncIndicators;
        return this;
    }

    public ShowPauseResumeStutusResponse withDataSyncIndicators(
        Consumer<NoSQLDrDateSyncIndicators> dataSyncIndicatorsSetter) {
        if (this.dataSyncIndicators == null) {
            this.dataSyncIndicators = new NoSQLDrDateSyncIndicators();
            dataSyncIndicatorsSetter.accept(this.dataSyncIndicators);
        }

        return this;
    }

    /**
     * Get dataSyncIndicators
     * @return dataSyncIndicators
     */
    public NoSQLDrDateSyncIndicators getDataSyncIndicators() {
        return dataSyncIndicators;
    }

    public void setDataSyncIndicators(NoSQLDrDateSyncIndicators dataSyncIndicators) {
        this.dataSyncIndicators = dataSyncIndicators;
    }

    public ShowPauseResumeStutusResponse withRtoAndRpoIndicators(List<NoSQLDrRpoAndRto> rtoAndRpoIndicators) {
        this.rtoAndRpoIndicators = rtoAndRpoIndicators;
        return this;
    }

    public ShowPauseResumeStutusResponse addRtoAndRpoIndicatorsItem(NoSQLDrRpoAndRto rtoAndRpoIndicatorsItem) {
        if (this.rtoAndRpoIndicators == null) {
            this.rtoAndRpoIndicators = new ArrayList<>();
        }
        this.rtoAndRpoIndicators.add(rtoAndRpoIndicatorsItem);
        return this;
    }

    public ShowPauseResumeStutusResponse withRtoAndRpoIndicators(
        Consumer<List<NoSQLDrRpoAndRto>> rtoAndRpoIndicatorsSetter) {
        if (this.rtoAndRpoIndicators == null) {
            this.rtoAndRpoIndicators = new ArrayList<>();
        }
        rtoAndRpoIndicatorsSetter.accept(this.rtoAndRpoIndicators);
        return this;
    }

    /**
     * 切换或倒换RPO和RTO值，仅当请求实例id为主实例时有值
     * @return rtoAndRpoIndicators
     */
    public List<NoSQLDrRpoAndRto> getRtoAndRpoIndicators() {
        return rtoAndRpoIndicators;
    }

    public void setRtoAndRpoIndicators(List<NoSQLDrRpoAndRto> rtoAndRpoIndicators) {
        this.rtoAndRpoIndicators = rtoAndRpoIndicators;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPauseResumeStutusResponse that = (ShowPauseResumeStutusResponse) obj;
        return Objects.equals(this.masterInstanceId, that.masterInstanceId)
            && Objects.equals(this.slaveInstanceId, that.slaveInstanceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.dataSyncIndicators, that.dataSyncIndicators)
            && Objects.equals(this.rtoAndRpoIndicators, that.rtoAndRpoIndicators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterInstanceId, slaveInstanceId, status, dataSyncIndicators, rtoAndRpoIndicators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPauseResumeStutusResponse {\n");
        sb.append("    masterInstanceId: ").append(toIndentedString(masterInstanceId)).append("\n");
        sb.append("    slaveInstanceId: ").append(toIndentedString(slaveInstanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dataSyncIndicators: ").append(toIndentedString(dataSyncIndicators)).append("\n");
        sb.append("    rtoAndRpoIndicators: ").append(toIndentedString(rtoAndRpoIndicators)).append("\n");
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
