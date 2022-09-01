package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class JobMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    @JacksonXmlProperty(localName = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    @JacksonXmlProperty(localName = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    @JacksonXmlProperty(localName = "updateTimestamp")

    private String updateTimestamp;

    public JobMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 任务的ID。
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public JobMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * 任务的创建时间。
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public JobMetadata withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * 任务的更新时间。
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobMetadata jobMetadata = (JobMetadata) o;
        return Objects.equals(this.uid, jobMetadata.uid)
            && Objects.equals(this.creationTimestamp, jobMetadata.creationTimestamp)
            && Objects.equals(this.updateTimestamp, jobMetadata.updateTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, creationTimestamp, updateTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobMetadata {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
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
