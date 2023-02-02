package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 阶段运行信息
 */
public class StageRun {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_always")

    private Boolean runAlways;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private String parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_select")

    private Boolean isSelect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depends_on")

    private List<String> dependsOn = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre")

    private List<StepRun> pre = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post")

    private List<StepRun> post = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<JobRun> jobs = null;

    public StageRun withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 阶段ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StageRun withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 阶段类型
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public StageRun withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 阶段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StageRun withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 唯一标识
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public StageRun withRunAlways(Boolean runAlways) {
        this.runAlways = runAlways;
        return this;
    }

    /**
     * 是否总是运行
     * @return runAlways
     */
    public Boolean getRunAlways() {
        return runAlways;
    }

    public void setRunAlways(Boolean runAlways) {
        this.runAlways = runAlways;
    }

    public StageRun withParallel(String parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 是否并行
     * @return parallel
     */
    public String getParallel() {
        return parallel;
    }

    public void setParallel(String parallel) {
        this.parallel = parallel;
    }

    public StageRun withIsSelect(Boolean isSelect) {
        this.isSelect = isSelect;
        return this;
    }

    /**
     * 是否选中
     * @return isSelect
     */
    public Boolean getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(Boolean isSelect) {
        this.isSelect = isSelect;
    }

    public StageRun withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 序列号
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public StageRun withDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    public StageRun addDependsOnItem(String dependsOnItem) {
        if (this.dependsOn == null) {
            this.dependsOn = new ArrayList<>();
        }
        this.dependsOn.add(dependsOnItem);
        return this;
    }

    public StageRun withDependsOn(Consumer<List<String>> dependsOnSetter) {
        if (this.dependsOn == null) {
            this.dependsOn = new ArrayList<>();
        }
        dependsOnSetter.accept(this.dependsOn);
        return this;
    }

    /**
     * 依赖
     * @return dependsOn
     */
    public List<String> getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
    }

    public StageRun withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 运行条件
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public StageRun withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StageRun withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public StageRun withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public StageRun withPre(List<StepRun> pre) {
        this.pre = pre;
        return this;
    }

    public StageRun addPreItem(StepRun preItem) {
        if (this.pre == null) {
            this.pre = new ArrayList<>();
        }
        this.pre.add(preItem);
        return this;
    }

    public StageRun withPre(Consumer<List<StepRun>> preSetter) {
        if (this.pre == null) {
            this.pre = new ArrayList<>();
        }
        preSetter.accept(this.pre);
        return this;
    }

    /**
     * 阶段准入
     * @return pre
     */
    public List<StepRun> getPre() {
        return pre;
    }

    public void setPre(List<StepRun> pre) {
        this.pre = pre;
    }

    public StageRun withPost(List<StepRun> post) {
        this.post = post;
        return this;
    }

    public StageRun addPostItem(StepRun postItem) {
        if (this.post == null) {
            this.post = new ArrayList<>();
        }
        this.post.add(postItem);
        return this;
    }

    public StageRun withPost(Consumer<List<StepRun>> postSetter) {
        if (this.post == null) {
            this.post = new ArrayList<>();
        }
        postSetter.accept(this.post);
        return this;
    }

    /**
     * 阶段准出
     * @return post
     */
    public List<StepRun> getPost() {
        return post;
    }

    public void setPost(List<StepRun> post) {
        this.post = post;
    }

    public StageRun withJobs(List<JobRun> jobs) {
        this.jobs = jobs;
        return this;
    }

    public StageRun addJobsItem(JobRun jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public StageRun withJobs(Consumer<List<JobRun>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 任务
     * @return jobs
     */
    public List<JobRun> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobRun> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StageRun stageRun = (StageRun) o;
        return Objects.equals(this.id, stageRun.id) && Objects.equals(this.category, stageRun.category)
            && Objects.equals(this.name, stageRun.name) && Objects.equals(this.identifier, stageRun.identifier)
            && Objects.equals(this.runAlways, stageRun.runAlways) && Objects.equals(this.parallel, stageRun.parallel)
            && Objects.equals(this.isSelect, stageRun.isSelect) && Objects.equals(this.sequence, stageRun.sequence)
            && Objects.equals(this.dependsOn, stageRun.dependsOn) && Objects.equals(this.condition, stageRun.condition)
            && Objects.equals(this.status, stageRun.status) && Objects.equals(this.startTime, stageRun.startTime)
            && Objects.equals(this.endTime, stageRun.endTime) && Objects.equals(this.pre, stageRun.pre)
            && Objects.equals(this.post, stageRun.post) && Objects.equals(this.jobs, stageRun.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            category,
            name,
            identifier,
            runAlways,
            parallel,
            isSelect,
            sequence,
            dependsOn,
            condition,
            status,
            startTime,
            endTime,
            pre,
            post,
            jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StageRun {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    runAlways: ").append(toIndentedString(runAlways)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
        sb.append("    isSelect: ").append(toIndentedString(isSelect)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    pre: ").append(toIndentedString(pre)).append("\n");
        sb.append("    post: ").append(toIndentedString(post)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
