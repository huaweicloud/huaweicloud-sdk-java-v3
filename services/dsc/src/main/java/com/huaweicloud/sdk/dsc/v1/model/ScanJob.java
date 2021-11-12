package com.huaweicloud.sdk.dsc.v1.model;

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

/** ScanJob */
public class ScanJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    /** 任务执行方式 */
    public static final class CycleEnum {

        /** Enum ONCE for value: "ONCE" */
        public static final CycleEnum ONCE = new CycleEnum("ONCE");

        /** Enum DAY for value: "DAY" */
        public static final CycleEnum DAY = new CycleEnum("DAY");

        /** Enum WEEK for value: "WEEK" */
        public static final CycleEnum WEEK = new CycleEnum("WEEK");

        /** Enum MONTH for value: "MONTH" */
        public static final CycleEnum MONTH = new CycleEnum("MONTH");

        private static final Map<String, CycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CycleEnum> createStaticFields() {
            Map<String, CycleEnum> map = new HashMap<>();
            map.put("ONCE", ONCE);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MONTH", MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CycleEnum(String value) {
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
        public static CycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CycleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CycleEnum(value);
            }
            return result;
        }

        public static CycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CycleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CycleEnum) {
                return this.value.equals(((CycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private CycleEnum cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_run_time")

    private Long lastRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_scan_risk")

    private String lastScanRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open")

    private Boolean open;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_groups")

    private List<String> ruleGroups = null;

    /** 任务当前状态 */
    public static final class StatusEnum {

        /** Enum INIT for value: "INIT" */
        public static final StatusEnum INIT = new StatusEnum("INIT");

        /** Enum WAITING for value: "WAITING" */
        public static final StatusEnum WAITING = new StatusEnum("WAITING");

        /** Enum RUNNING for value: "RUNNING" */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /** Enum FAILED for value: "FAILED" */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /** Enum STOPPED for value: "STOPPED" */
        public static final StatusEnum STOPPED = new StatusEnum("STOPPED");

        /** Enum FINISHED for value: "FINISHED" */
        public static final StatusEnum FINISHED = new StatusEnum("FINISHED");

        /** Enum TERMINATED for value: "TERMINATED" */
        public static final StatusEnum TERMINATED = new StatusEnum("TERMINATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("INIT", INIT);
            map.put("WAITING", WAITING);
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("STOPPED", STOPPED);
            map.put("FINISHED", FINISHED);
            map.put("TERMINATED", TERMINATED);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_nlp")

    private Boolean useNlp;

    public ScanJob withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 任务创建时间
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ScanJob withCycle(CycleEnum cycle) {
        this.cycle = cycle;
        return this;
    }

    /** 任务执行方式
     * 
     * @return cycle */
    public CycleEnum getCycle() {
        return cycle;
    }

    public void setCycle(CycleEnum cycle) {
        this.cycle = cycle;
    }

    public ScanJob withId(String id) {
        this.id = id;
        return this;
    }

    /** 任务ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScanJob withLastRunTime(Long lastRunTime) {
        this.lastRunTime = lastRunTime;
        return this;
    }

    /** 任务上一次执行时间
     * 
     * @return lastRunTime */
    public Long getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(Long lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public ScanJob withLastScanRisk(String lastScanRisk) {
        this.lastScanRisk = lastScanRisk;
        return this;
    }

    /** 任务上一次扫描风险等级结果
     * 
     * @return lastScanRisk */
    public String getLastScanRisk() {
        return lastScanRisk;
    }

    public void setLastScanRisk(String lastScanRisk) {
        this.lastScanRisk = lastScanRisk;
    }

    public ScanJob withName(String name) {
        this.name = name;
        return this;
    }

    /** 任务名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScanJob withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    /** 任务开启状态
     * 
     * @return open */
    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public ScanJob withRuleGroups(List<String> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    public ScanJob addRuleGroupsItem(String ruleGroupsItem) {
        if (this.ruleGroups == null) {
            this.ruleGroups = new ArrayList<>();
        }
        this.ruleGroups.add(ruleGroupsItem);
        return this;
    }

    public ScanJob withRuleGroups(Consumer<List<String>> ruleGroupsSetter) {
        if (this.ruleGroups == null) {
            this.ruleGroups = new ArrayList<>();
        }
        ruleGroupsSetter.accept(this.ruleGroups);
        return this;
    }

    /** 任务使用的规则组
     * 
     * @return ruleGroups */
    public List<String> getRuleGroups() {
        return ruleGroups;
    }

    public void setRuleGroups(List<String> ruleGroups) {
        this.ruleGroups = ruleGroups;
    }

    public ScanJob withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 任务当前状态
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ScanJob withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /** SMN服务通知主题
     * 
     * @return topicUrn */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ScanJob withUseNlp(Boolean useNlp) {
        this.useNlp = useNlp;
        return this;
    }

    /** 是否使用了NLP进行扫描
     * 
     * @return useNlp */
    public Boolean getUseNlp() {
        return useNlp;
    }

    public void setUseNlp(Boolean useNlp) {
        this.useNlp = useNlp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScanJob scanJob = (ScanJob) o;
        return Objects.equals(this.createTime, scanJob.createTime) && Objects.equals(this.cycle, scanJob.cycle)
            && Objects.equals(this.id, scanJob.id) && Objects.equals(this.lastRunTime, scanJob.lastRunTime)
            && Objects.equals(this.lastScanRisk, scanJob.lastScanRisk) && Objects.equals(this.name, scanJob.name)
            && Objects.equals(this.open, scanJob.open) && Objects.equals(this.ruleGroups, scanJob.ruleGroups)
            && Objects.equals(this.status, scanJob.status) && Objects.equals(this.topicUrn, scanJob.topicUrn)
            && Objects.equals(this.useNlp, scanJob.useNlp);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(createTime, cycle, id, lastRunTime, lastScanRisk, name, open, ruleGroups, status, topicUrn, useNlp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanJob {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
        sb.append("    lastScanRisk: ").append(toIndentedString(lastScanRisk)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    open: ").append(toIndentedString(open)).append("\n");
        sb.append("    ruleGroups: ").append(toIndentedString(ruleGroups)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    useNlp: ").append(toIndentedString(useNlp)).append("\n");
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
