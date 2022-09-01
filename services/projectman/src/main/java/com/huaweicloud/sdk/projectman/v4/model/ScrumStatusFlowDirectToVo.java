package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ScrumStatusFlowDirectToVo
 */
public class ScrumStatusFlowDirectToVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    @JacksonXmlProperty(localName = "status_id")

    private Integer statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private Boolean enabled;

    public ScrumStatusFlowDirectToVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流转数据的uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScrumStatusFlowDirectToVo withStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 状态id
     * @return statusId
     */
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public ScrumStatusFlowDirectToVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 状态名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScrumStatusFlowDirectToVo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启流转
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScrumStatusFlowDirectToVo scrumStatusFlowDirectToVo = (ScrumStatusFlowDirectToVo) o;
        return Objects.equals(this.id, scrumStatusFlowDirectToVo.id)
            && Objects.equals(this.statusId, scrumStatusFlowDirectToVo.statusId)
            && Objects.equals(this.name, scrumStatusFlowDirectToVo.name)
            && Objects.equals(this.enabled, scrumStatusFlowDirectToVo.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statusId, name, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScrumStatusFlowDirectToVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
