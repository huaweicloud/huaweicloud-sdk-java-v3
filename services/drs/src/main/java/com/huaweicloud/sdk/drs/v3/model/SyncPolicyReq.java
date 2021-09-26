package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 设置同步策略请求体 */
public class SyncPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /** 冲突策略。 - ignore：忽略 - overwrite：覆盖 - stop：报错 */
    public static final class ConflictPolicyEnum {

        /** Enum IGNORE for value: "ignore" */
        public static final ConflictPolicyEnum IGNORE = new ConflictPolicyEnum("ignore");

        /** Enum OVERWRITE for value: "overwrite" */
        public static final ConflictPolicyEnum OVERWRITE = new ConflictPolicyEnum("overwrite");

        /** Enum STOP for value: "stop" */
        public static final ConflictPolicyEnum STOP = new ConflictPolicyEnum("stop");

        private static final Map<String, ConflictPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConflictPolicyEnum> createStaticFields() {
            Map<String, ConflictPolicyEnum> map = new HashMap<>();
            map.put("ignore", IGNORE);
            map.put("overwrite", OVERWRITE);
            map.put("stop", STOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConflictPolicyEnum(String value) {
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
        public static ConflictPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConflictPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConflictPolicyEnum(value);
            }
            return result;
        }

        public static ConflictPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConflictPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConflictPolicyEnum) {
                return this.value.equals(((ConflictPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_policy")

    private ConflictPolicyEnum conflictPolicy;

    /** 过滤DDL策略。 */
    public static final class FilterDdlPolicyEnum {

        /** Enum DROP_DATABASE for value: "drop_database" */
        public static final FilterDdlPolicyEnum DROP_DATABASE = new FilterDdlPolicyEnum("drop_database");

        private static final Map<String, FilterDdlPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterDdlPolicyEnum> createStaticFields() {
            Map<String, FilterDdlPolicyEnum> map = new HashMap<>();
            map.put("drop_database", DROP_DATABASE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterDdlPolicyEnum(String value) {
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
        public static FilterDdlPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FilterDdlPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FilterDdlPolicyEnum(value);
            }
            return result;
        }

        public static FilterDdlPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FilterDdlPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterDdlPolicyEnum) {
                return this.value.equals(((FilterDdlPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_ddl_policy")

    private FilterDdlPolicyEnum filterDdlPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_trans")

    private Boolean ddlTrans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_trans")

    private Boolean indexTrans;

    public SyncPolicyReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务ID。
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SyncPolicyReq withConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    /** 冲突策略。 - ignore：忽略 - overwrite：覆盖 - stop：报错
     * 
     * @return conflictPolicy */
    public ConflictPolicyEnum getConflictPolicy() {
        return conflictPolicy;
    }

    public void setConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
    }

    public SyncPolicyReq withFilterDdlPolicy(FilterDdlPolicyEnum filterDdlPolicy) {
        this.filterDdlPolicy = filterDdlPolicy;
        return this;
    }

    /** 过滤DDL策略。
     * 
     * @return filterDdlPolicy */
    public FilterDdlPolicyEnum getFilterDdlPolicy() {
        return filterDdlPolicy;
    }

    public void setFilterDdlPolicy(FilterDdlPolicyEnum filterDdlPolicy) {
        this.filterDdlPolicy = filterDdlPolicy;
    }

    public SyncPolicyReq withDdlTrans(Boolean ddlTrans) {
        this.ddlTrans = ddlTrans;
        return this;
    }

    /** 同步增量是否同步DDL。
     * 
     * @return ddlTrans */
    public Boolean getDdlTrans() {
        return ddlTrans;
    }

    public void setDdlTrans(Boolean ddlTrans) {
        this.ddlTrans = ddlTrans;
    }

    public SyncPolicyReq withIndexTrans(Boolean indexTrans) {
        this.indexTrans = indexTrans;
        return this;
    }

    /** 同步增量是否同步索引。
     * 
     * @return indexTrans */
    public Boolean getIndexTrans() {
        return indexTrans;
    }

    public void setIndexTrans(Boolean indexTrans) {
        this.indexTrans = indexTrans;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncPolicyReq syncPolicyReq = (SyncPolicyReq) o;
        return Objects.equals(this.jobId, syncPolicyReq.jobId)
            && Objects.equals(this.conflictPolicy, syncPolicyReq.conflictPolicy)
            && Objects.equals(this.filterDdlPolicy, syncPolicyReq.filterDdlPolicy)
            && Objects.equals(this.ddlTrans, syncPolicyReq.ddlTrans)
            && Objects.equals(this.indexTrans, syncPolicyReq.indexTrans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, conflictPolicy, filterDdlPolicy, ddlTrans, indexTrans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncPolicyReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    conflictPolicy: ").append(toIndentedString(conflictPolicy)).append("\n");
        sb.append("    filterDdlPolicy: ").append(toIndentedString(filterDdlPolicy)).append("\n");
        sb.append("    ddlTrans: ").append(toIndentedString(ddlTrans)).append("\n");
        sb.append("    indexTrans: ").append(toIndentedString(indexTrans)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
