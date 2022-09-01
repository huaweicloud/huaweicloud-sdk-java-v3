package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "details")

    private List<UploadProcessJsonDetail> details = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    @JacksonXmlProperty(localName = "process_status")

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
     * details
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
     * process_status
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadProcessJson uploadProcessJson = (UploadProcessJson) o;
        return Objects.equals(this.details, uploadProcessJson.details)
            && Objects.equals(this.processStatus, uploadProcessJson.processStatus);
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
