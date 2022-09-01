package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CheckpointExtraInfoResp
 */
public class CheckpointExtraInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_duration")

    @JacksonXmlProperty(localName = "retention_duration")

    private Integer retentionDuration;

    public CheckpointExtraInfoResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckpointExtraInfoResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备份描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckpointExtraInfoResp withRetentionDuration(Integer retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

    /**
     * 备份保留天数
     * @return retentionDuration
     */
    public Integer getRetentionDuration() {
        return retentionDuration;
    }

    public void setRetentionDuration(Integer retentionDuration) {
        this.retentionDuration = retentionDuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointExtraInfoResp checkpointExtraInfoResp = (CheckpointExtraInfoResp) o;
        return Objects.equals(this.name, checkpointExtraInfoResp.name)
            && Objects.equals(this.description, checkpointExtraInfoResp.description)
            && Objects.equals(this.retentionDuration, checkpointExtraInfoResp.retentionDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, retentionDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointExtraInfoResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    retentionDuration: ").append(toIndentedString(retentionDuration)).append("\n");
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
