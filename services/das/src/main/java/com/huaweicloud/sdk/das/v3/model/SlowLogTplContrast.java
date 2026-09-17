package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 慢日志模板对比结果
 */
public class SlowLogTplContrast {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_of_pre_day")

    private List<SlowSqlTemplate> templateOfPreDay = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_of_cur_day")

    private List<SlowSqlTemplate> templateOfCurDay = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_increase")

    private Boolean executeTimeIncrease;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_wait_increase")

    private Boolean lockWaitIncrease;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_template")

    private Boolean newTemplate;

    public SlowLogTplContrast withTemplateOfPreDay(List<SlowSqlTemplate> templateOfPreDay) {
        this.templateOfPreDay = templateOfPreDay;
        return this;
    }

    public SlowLogTplContrast addTemplateOfPreDayItem(SlowSqlTemplate templateOfPreDayItem) {
        if (this.templateOfPreDay == null) {
            this.templateOfPreDay = new ArrayList<>();
        }
        this.templateOfPreDay.add(templateOfPreDayItem);
        return this;
    }

    public SlowLogTplContrast withTemplateOfPreDay(Consumer<List<SlowSqlTemplate>> templateOfPreDaySetter) {
        if (this.templateOfPreDay == null) {
            this.templateOfPreDay = new ArrayList<>();
        }
        templateOfPreDaySetter.accept(this.templateOfPreDay);
        return this;
    }

    /**
     * 前一日慢日志模板数据列表
     * @return templateOfPreDay
     */
    public List<SlowSqlTemplate> getTemplateOfPreDay() {
        return templateOfPreDay;
    }

    public void setTemplateOfPreDay(List<SlowSqlTemplate> templateOfPreDay) {
        this.templateOfPreDay = templateOfPreDay;
    }

    public SlowLogTplContrast withTemplateOfCurDay(List<SlowSqlTemplate> templateOfCurDay) {
        this.templateOfCurDay = templateOfCurDay;
        return this;
    }

    public SlowLogTplContrast addTemplateOfCurDayItem(SlowSqlTemplate templateOfCurDayItem) {
        if (this.templateOfCurDay == null) {
            this.templateOfCurDay = new ArrayList<>();
        }
        this.templateOfCurDay.add(templateOfCurDayItem);
        return this;
    }

    public SlowLogTplContrast withTemplateOfCurDay(Consumer<List<SlowSqlTemplate>> templateOfCurDaySetter) {
        if (this.templateOfCurDay == null) {
            this.templateOfCurDay = new ArrayList<>();
        }
        templateOfCurDaySetter.accept(this.templateOfCurDay);
        return this;
    }

    /**
     * 当日慢日志模板数据列表
     * @return templateOfCurDay
     */
    public List<SlowSqlTemplate> getTemplateOfCurDay() {
        return templateOfCurDay;
    }

    public void setTemplateOfCurDay(List<SlowSqlTemplate> templateOfCurDay) {
        this.templateOfCurDay = templateOfCurDay;
    }

    public SlowLogTplContrast withExecuteTimeIncrease(Boolean executeTimeIncrease) {
        this.executeTimeIncrease = executeTimeIncrease;
        return this;
    }

    /**
     * 执行耗时是否增长
     * @return executeTimeIncrease
     */
    public Boolean getExecuteTimeIncrease() {
        return executeTimeIncrease;
    }

    public void setExecuteTimeIncrease(Boolean executeTimeIncrease) {
        this.executeTimeIncrease = executeTimeIncrease;
    }

    public SlowLogTplContrast withLockWaitIncrease(Boolean lockWaitIncrease) {
        this.lockWaitIncrease = lockWaitIncrease;
        return this;
    }

    /**
     * 锁等待耗时是否增长
     * @return lockWaitIncrease
     */
    public Boolean getLockWaitIncrease() {
        return lockWaitIncrease;
    }

    public void setLockWaitIncrease(Boolean lockWaitIncrease) {
        this.lockWaitIncrease = lockWaitIncrease;
    }

    public SlowLogTplContrast withNewTemplate(Boolean newTemplate) {
        this.newTemplate = newTemplate;
        return this;
    }

    /**
     * 是否新增模板
     * @return newTemplate
     */
    public Boolean getNewTemplate() {
        return newTemplate;
    }

    public void setNewTemplate(Boolean newTemplate) {
        this.newTemplate = newTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowLogTplContrast that = (SlowLogTplContrast) obj;
        return Objects.equals(this.templateOfPreDay, that.templateOfPreDay)
            && Objects.equals(this.templateOfCurDay, that.templateOfCurDay)
            && Objects.equals(this.executeTimeIncrease, that.executeTimeIncrease)
            && Objects.equals(this.lockWaitIncrease, that.lockWaitIncrease)
            && Objects.equals(this.newTemplate, that.newTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateOfPreDay, templateOfCurDay, executeTimeIncrease, lockWaitIncrease, newTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogTplContrast {\n");
        sb.append("    templateOfPreDay: ").append(toIndentedString(templateOfPreDay)).append("\n");
        sb.append("    templateOfCurDay: ").append(toIndentedString(templateOfCurDay)).append("\n");
        sb.append("    executeTimeIncrease: ").append(toIndentedString(executeTimeIncrease)).append("\n");
        sb.append("    lockWaitIncrease: ").append(toIndentedString(lockWaitIncrease)).append("\n");
        sb.append("    newTemplate: ").append(toIndentedString(newTemplate)).append("\n");
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
