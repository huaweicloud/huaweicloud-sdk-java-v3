package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出作业的请求参数。
 */
public class ExportFlinkJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_dir")

    private String obsDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_selected")

    private Boolean isSelected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_selected")

    private List<Long> jobSelected = null;

    public ExportFlinkJobRequestBody withObsDir(String obsDir) {
        this.obsDir = obsDir;
        return this;
    }

    /**
     * 导出作业文件的OBS保存路径。
     * @return obsDir
     */
    public String getObsDir() {
        return obsDir;
    }

    public void setObsDir(String obsDir) {
        this.obsDir = obsDir;
    }

    public ExportFlinkJobRequestBody withIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
        return this;
    }

    /**
     * 是否导出指定的作业。
     * @return isSelected
     */
    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public ExportFlinkJobRequestBody withJobSelected(List<Long> jobSelected) {
        this.jobSelected = jobSelected;
        return this;
    }

    public ExportFlinkJobRequestBody addJobSelectedItem(Long jobSelectedItem) {
        if (this.jobSelected == null) {
            this.jobSelected = new ArrayList<>();
        }
        this.jobSelected.add(jobSelectedItem);
        return this;
    }

    public ExportFlinkJobRequestBody withJobSelected(Consumer<List<Long>> jobSelectedSetter) {
        if (this.jobSelected == null) {
            this.jobSelected = new ArrayList<>();
        }
        jobSelectedSetter.accept(this.jobSelected);
        return this;
    }

    /**
     * 当is_selected=true时，该参数是待导出作业的作业ID集合。当is_selected=true时，此参数必填。
     * @return jobSelected
     */
    public List<Long> getJobSelected() {
        return jobSelected;
    }

    public void setJobSelected(List<Long> jobSelected) {
        this.jobSelected = jobSelected;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportFlinkJobRequestBody exportFlinkJobRequestBody = (ExportFlinkJobRequestBody) o;
        return Objects.equals(this.obsDir, exportFlinkJobRequestBody.obsDir)
            && Objects.equals(this.isSelected, exportFlinkJobRequestBody.isSelected)
            && Objects.equals(this.jobSelected, exportFlinkJobRequestBody.jobSelected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsDir, isSelected, jobSelected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFlinkJobRequestBody {\n");
        sb.append("    obsDir: ").append(toIndentedString(obsDir)).append("\n");
        sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
        sb.append("    jobSelected: ").append(toIndentedString(jobSelected)).append("\n");
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
