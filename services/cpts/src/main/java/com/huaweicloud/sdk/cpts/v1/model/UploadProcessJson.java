package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * json
 */
public class UploadProcessJson {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<UploadProcessJsonDetail> details = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private Integer processStatus;

    public UploadProcessJson withDetails(List<UploadProcessJsonDetail> details) {
        this.details = details;
        return this;
    }

    public UploadProcessJson addDetailsItem(UploadProcessJsonDetail detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public UploadProcessJson withDetails(Consumer<List<UploadProcessJsonDetail>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 工程导入进度明细信息
     * @return details
     */
    public List<UploadProcessJsonDetail> getDetails() {
        return details;
    }

    public void setDetails(List<UploadProcessJsonDetail> details) {
        this.details = details;
    }

    public UploadProcessJson withProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * 总状态（0：导入中；1：导入完成）
     * minimum: 0
     * maximum: 2147483647
     * @return processStatus
     */
    public Integer getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadProcessJson that = (UploadProcessJson) obj;
        return Objects.equals(this.details, that.details) && Objects.equals(this.processStatus, that.processStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(details, processStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadProcessJson {\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
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
