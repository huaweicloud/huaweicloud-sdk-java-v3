package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNextflowTaskDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_action")

    private String errorAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exit")

    private Integer exit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_dir")

    private String workDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private String environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private List<String> module = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container")

    private String container;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attempt")

    private Integer attempt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scratch")

    private String scratch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private NextflowTaskExecutionTime executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_requested")

    private NextflowTaskResourceRequested resourceRequested;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_usage")

    private NextflowTaskResourceUsage resourceUsage;

    public ShowNextflowTaskDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * task id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowNextflowTaskDetailResponse withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * task执行命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ShowNextflowTaskDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * task状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowNextflowTaskDetailResponse withErrorAction(String errorAction) {
        this.errorAction = errorAction;
        return this;
    }

    /**
     * task失败后的策略
     * @return errorAction
     */
    public String getErrorAction() {
        return errorAction;
    }

    public void setErrorAction(String errorAction) {
        this.errorAction = errorAction;
    }

    public ShowNextflowTaskDetailResponse withExit(Integer exit) {
        this.exit = exit;
        return this;
    }

    /**
     * task退出状态码
     * @return exit
     */
    public Integer getExit() {
        return exit;
    }

    public void setExit(Integer exit) {
        this.exit = exit;
    }

    public ShowNextflowTaskDetailResponse withWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }

    /**
     * task执行路径
     * @return workDir
     */
    public String getWorkDir() {
        return workDir;
    }

    public void setWorkDir(String workDir) {
        this.workDir = workDir;
    }

    public ShowNextflowTaskDetailResponse withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * task执行的环境变量值
     * @return environment
     */
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public ShowNextflowTaskDetailResponse withModule(List<String> module) {
        this.module = module;
        return this;
    }

    public ShowNextflowTaskDetailResponse addModuleItem(String moduleItem) {
        if (this.module == null) {
            this.module = new ArrayList<>();
        }
        this.module.add(moduleItem);
        return this;
    }

    public ShowNextflowTaskDetailResponse withModule(Consumer<List<String>> moduleSetter) {
        if (this.module == null) {
            this.module = new ArrayList<>();
        }
        moduleSetter.accept(this.module);
        return this;
    }

    /**
     * 子任务运行环境列表
     * @return module
     */
    public List<String> getModule() {
        return module;
    }

    public void setModule(List<String> module) {
        this.module = module;
    }

    public ShowNextflowTaskDetailResponse withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * 容器名称
     * @return container
     */
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public ShowNextflowTaskDetailResponse withAttempt(Integer attempt) {
        this.attempt = attempt;
        return this;
    }

    /**
     * 执行次数
     * @return attempt
     */
    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public ShowNextflowTaskDetailResponse withScratch(String scratch) {
        this.scratch = scratch;
        return this;
    }

    /**
     * 临时工作目录
     * @return scratch
     */
    public String getScratch() {
        return scratch;
    }

    public void setScratch(String scratch) {
        this.scratch = scratch;
    }

    public ShowNextflowTaskDetailResponse withExecutionTime(NextflowTaskExecutionTime executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    public ShowNextflowTaskDetailResponse withExecutionTime(Consumer<NextflowTaskExecutionTime> executionTimeSetter) {
        if (this.executionTime == null) {
            this.executionTime = new NextflowTaskExecutionTime();
            executionTimeSetter.accept(this.executionTime);
        }

        return this;
    }

    /**
     * Get executionTime
     * @return executionTime
     */
    public NextflowTaskExecutionTime getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(NextflowTaskExecutionTime executionTime) {
        this.executionTime = executionTime;
    }

    public ShowNextflowTaskDetailResponse withResourceRequested(NextflowTaskResourceRequested resourceRequested) {
        this.resourceRequested = resourceRequested;
        return this;
    }

    public ShowNextflowTaskDetailResponse withResourceRequested(
        Consumer<NextflowTaskResourceRequested> resourceRequestedSetter) {
        if (this.resourceRequested == null) {
            this.resourceRequested = new NextflowTaskResourceRequested();
            resourceRequestedSetter.accept(this.resourceRequested);
        }

        return this;
    }

    /**
     * Get resourceRequested
     * @return resourceRequested
     */
    public NextflowTaskResourceRequested getResourceRequested() {
        return resourceRequested;
    }

    public void setResourceRequested(NextflowTaskResourceRequested resourceRequested) {
        this.resourceRequested = resourceRequested;
    }

    public ShowNextflowTaskDetailResponse withResourceUsage(NextflowTaskResourceUsage resourceUsage) {
        this.resourceUsage = resourceUsage;
        return this;
    }

    public ShowNextflowTaskDetailResponse withResourceUsage(Consumer<NextflowTaskResourceUsage> resourceUsageSetter) {
        if (this.resourceUsage == null) {
            this.resourceUsage = new NextflowTaskResourceUsage();
            resourceUsageSetter.accept(this.resourceUsage);
        }

        return this;
    }

    /**
     * Get resourceUsage
     * @return resourceUsage
     */
    public NextflowTaskResourceUsage getResourceUsage() {
        return resourceUsage;
    }

    public void setResourceUsage(NextflowTaskResourceUsage resourceUsage) {
        this.resourceUsage = resourceUsage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNextflowTaskDetailResponse that = (ShowNextflowTaskDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.command, that.command)
            && Objects.equals(this.status, that.status) && Objects.equals(this.errorAction, that.errorAction)
            && Objects.equals(this.exit, that.exit) && Objects.equals(this.workDir, that.workDir)
            && Objects.equals(this.environment, that.environment) && Objects.equals(this.module, that.module)
            && Objects.equals(this.container, that.container) && Objects.equals(this.attempt, that.attempt)
            && Objects.equals(this.scratch, that.scratch) && Objects.equals(this.executionTime, that.executionTime)
            && Objects.equals(this.resourceRequested, that.resourceRequested)
            && Objects.equals(this.resourceUsage, that.resourceUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            command,
            status,
            errorAction,
            exit,
            workDir,
            environment,
            module,
            container,
            attempt,
            scratch,
            executionTime,
            resourceRequested,
            resourceUsage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNextflowTaskDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorAction: ").append(toIndentedString(errorAction)).append("\n");
        sb.append("    exit: ").append(toIndentedString(exit)).append("\n");
        sb.append("    workDir: ").append(toIndentedString(workDir)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
        sb.append("    scratch: ").append(toIndentedString(scratch)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    resourceRequested: ").append(toIndentedString(resourceRequested)).append("\n");
        sb.append("    resourceUsage: ").append(toIndentedString(resourceUsage)).append("\n");
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
