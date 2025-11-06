package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AggrPrometheusInfo
 */
public class AggrPrometheusInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prometheusIds")

    private List<String> prometheusIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public AggrPrometheusInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 被聚合的账号的projectid。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AggrPrometheusInfo withPrometheusIds(List<String> prometheusIds) {
        this.prometheusIds = prometheusIds;
        return this;
    }

    public AggrPrometheusInfo addPrometheusIdsItem(String prometheusIdsItem) {
        if (this.prometheusIds == null) {
            this.prometheusIds = new ArrayList<>();
        }
        this.prometheusIds.add(prometheusIdsItem);
        return this;
    }

    public AggrPrometheusInfo withPrometheusIds(Consumer<List<String>> prometheusIdsSetter) {
        if (this.prometheusIds == null) {
            this.prometheusIds = new ArrayList<>();
        }
        prometheusIdsSetter.accept(this.prometheusIds);
        return this;
    }

    /**
     * 被聚合的账号下的普罗ID列表。
     * @return prometheusIds
     */
    public List<String> getPrometheusIds() {
        return prometheusIds;
    }

    public void setPrometheusIds(List<String> prometheusIds) {
        this.prometheusIds = prometheusIds;
    }

    public AggrPrometheusInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 被聚合的账号id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AggrPrometheusInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 被聚合的账号名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AggrPrometheusInfo that = (AggrPrometheusInfo) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.prometheusIds, that.prometheusIds)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, prometheusIds, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggrPrometheusInfo {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    prometheusIds: ").append(toIndentedString(prometheusIds)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
