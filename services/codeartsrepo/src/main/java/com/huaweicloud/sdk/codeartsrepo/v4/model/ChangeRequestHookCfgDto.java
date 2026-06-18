package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangeRequestHookCfgDto
 */
public class ChangeRequestHookCfgDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_cfgs")

    private List<WebHookEventCfgDto> eventCfgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_cfgs")

    private List<WebHookBranchCfgDto> projectCfgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_cfgs")

    private List<WebHookBranchCfgDto> branchCfgs = null;

    public ChangeRequestHookCfgDto withEventCfgs(List<WebHookEventCfgDto> eventCfgs) {
        this.eventCfgs = eventCfgs;
        return this;
    }

    public ChangeRequestHookCfgDto addEventCfgsItem(WebHookEventCfgDto eventCfgsItem) {
        if (this.eventCfgs == null) {
            this.eventCfgs = new ArrayList<>();
        }
        this.eventCfgs.add(eventCfgsItem);
        return this;
    }

    public ChangeRequestHookCfgDto withEventCfgs(Consumer<List<WebHookEventCfgDto>> eventCfgsSetter) {
        if (this.eventCfgs == null) {
            this.eventCfgs = new ArrayList<>();
        }
        eventCfgsSetter.accept(this.eventCfgs);
        return this;
    }

    /**
     * **参数解释：** 预留字段，事件触发设置，可为空。
     * @return eventCfgs
     */
    public List<WebHookEventCfgDto> getEventCfgs() {
        return eventCfgs;
    }

    public void setEventCfgs(List<WebHookEventCfgDto> eventCfgs) {
        this.eventCfgs = eventCfgs;
    }

    public ChangeRequestHookCfgDto withProjectCfgs(List<WebHookBranchCfgDto> projectCfgs) {
        this.projectCfgs = projectCfgs;
        return this;
    }

    public ChangeRequestHookCfgDto addProjectCfgsItem(WebHookBranchCfgDto projectCfgsItem) {
        if (this.projectCfgs == null) {
            this.projectCfgs = new ArrayList<>();
        }
        this.projectCfgs.add(projectCfgsItem);
        return this;
    }

    public ChangeRequestHookCfgDto withProjectCfgs(Consumer<List<WebHookBranchCfgDto>> projectCfgsSetter) {
        if (this.projectCfgs == null) {
            this.projectCfgs = new ArrayList<>();
        }
        projectCfgsSetter.accept(this.projectCfgs);
        return this;
    }

    /**
     * **参数解释：** 预留字段，仓库分支规则设置，可为空。
     * @return projectCfgs
     */
    public List<WebHookBranchCfgDto> getProjectCfgs() {
        return projectCfgs;
    }

    public void setProjectCfgs(List<WebHookBranchCfgDto> projectCfgs) {
        this.projectCfgs = projectCfgs;
    }

    public ChangeRequestHookCfgDto withBranchCfgs(List<WebHookBranchCfgDto> branchCfgs) {
        this.branchCfgs = branchCfgs;
        return this;
    }

    public ChangeRequestHookCfgDto addBranchCfgsItem(WebHookBranchCfgDto branchCfgsItem) {
        if (this.branchCfgs == null) {
            this.branchCfgs = new ArrayList<>();
        }
        this.branchCfgs.add(branchCfgsItem);
        return this;
    }

    public ChangeRequestHookCfgDto withBranchCfgs(Consumer<List<WebHookBranchCfgDto>> branchCfgsSetter) {
        if (this.branchCfgs == null) {
            this.branchCfgs = new ArrayList<>();
        }
        branchCfgsSetter.accept(this.branchCfgs);
        return this;
    }

    /**
     * Get branchCfgs
     * @return branchCfgs
     */
    public List<WebHookBranchCfgDto> getBranchCfgs() {
        return branchCfgs;
    }

    public void setBranchCfgs(List<WebHookBranchCfgDto> branchCfgs) {
        this.branchCfgs = branchCfgs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeRequestHookCfgDto that = (ChangeRequestHookCfgDto) obj;
        return Objects.equals(this.eventCfgs, that.eventCfgs) && Objects.equals(this.projectCfgs, that.projectCfgs)
            && Objects.equals(this.branchCfgs, that.branchCfgs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventCfgs, projectCfgs, branchCfgs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeRequestHookCfgDto {\n");
        sb.append("    eventCfgs: ").append(toIndentedString(eventCfgs)).append("\n");
        sb.append("    projectCfgs: ").append(toIndentedString(projectCfgs)).append("\n");
        sb.append("    branchCfgs: ").append(toIndentedString(branchCfgs)).append("\n");
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
