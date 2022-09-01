package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobInfo
 */
public class JobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    @JacksonXmlProperty(localName = "nodes")

    private List<Node> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    @JacksonXmlProperty(localName = "schedule")

    private Schedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    @JacksonXmlProperty(localName = "params")

    private List<JobParam> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    @JacksonXmlProperty(localName = "directory")

    private String directory;

    /**
     * Gets or Sets jobType
     */
    public static final class JobTypeEnum {

        /**
         * Enum BATCH for value: "BATCH"
         */
        public static final JobTypeEnum BATCH = new JobTypeEnum("BATCH");

        /**
         * Enum REAL_TIME for value: "REAL_TIME"
         */
        public static final JobTypeEnum REAL_TIME = new JobTypeEnum("REAL_TIME");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("BATCH", BATCH);
            map.put("REAL_TIME", REAL_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            JobTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobTypeEnum(value);
            }
            return result;
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            JobTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobType")

    @JacksonXmlProperty(localName = "jobType")

    private JobTypeEnum jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basicConfig")

    @JacksonXmlProperty(localName = "basicConfig")

    private BasicInfo basicConfig;

    public JobInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobInfo withNodes(List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }

    public JobInfo addNodesItem(Node nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public JobInfo withNodes(Consumer<List<Node>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * Get nodes
     * @return nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public JobInfo withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public JobInfo withSchedule(Consumer<Schedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new Schedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public JobInfo withParams(List<JobParam> params) {
        this.params = params;
        return this;
    }

    public JobInfo addParamsItem(JobParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public JobInfo withParams(Consumer<List<JobParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * Get params
     * @return params
     */
    public List<JobParam> getParams() {
        return params;
    }

    public void setParams(List<JobParam> params) {
        this.params = params;
    }

    public JobInfo withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * Get directory
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public JobInfo withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get jobType
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public JobInfo withBasicConfig(BasicInfo basicConfig) {
        this.basicConfig = basicConfig;
        return this;
    }

    public JobInfo withBasicConfig(Consumer<BasicInfo> basicConfigSetter) {
        if (this.basicConfig == null) {
            this.basicConfig = new BasicInfo();
            basicConfigSetter.accept(this.basicConfig);
        }

        return this;
    }

    /**
     * Get basicConfig
     * @return basicConfig
     */
    public BasicInfo getBasicConfig() {
        return basicConfig;
    }

    public void setBasicConfig(BasicInfo basicConfig) {
        this.basicConfig = basicConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobInfo jobInfo = (JobInfo) o;
        return Objects.equals(this.name, jobInfo.name) && Objects.equals(this.nodes, jobInfo.nodes)
            && Objects.equals(this.schedule, jobInfo.schedule) && Objects.equals(this.params, jobInfo.params)
            && Objects.equals(this.directory, jobInfo.directory) && Objects.equals(this.jobType, jobInfo.jobType)
            && Objects.equals(this.basicConfig, jobInfo.basicConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nodes, schedule, params, directory, jobType, basicConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    basicConfig: ").append(toIndentedString(basicConfig)).append("\n");
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
