package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * pi迭代筛选条件
 */
public class PiInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sprints")

    private List<String> sprints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_id")

    private String piId;

    public PiInfo withSprints(List<String> sprints) {
        this.sprints = sprints;
        return this;
    }

    public PiInfo addSprintsItem(String sprintsItem) {
        if (this.sprints == null) {
            this.sprints = new ArrayList<>();
        }
        this.sprints.add(sprintsItem);
        return this;
    }

    public PiInfo withSprints(Consumer<List<String>> sprintsSetter) {
        if (this.sprints == null) {
            this.sprints = new ArrayList<>();
        }
        sprintsSetter.accept(this.sprints);
        return this;
    }

    /**
     * 迭代列表
     * @return sprints
     */
    public List<String> getSprints() {
        return sprints;
    }

    public void setSprints(List<String> sprints) {
        this.sprints = sprints;
    }

    public PiInfo withPiId(String piId) {
        this.piId = piId;
        return this;
    }

    /**
     * pi的id，层级关系：pi -> 迭代 -> 需求
     * @return piId
     */
    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PiInfo that = (PiInfo) obj;
        return Objects.equals(this.sprints, that.sprints) && Objects.equals(this.piId, that.piId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sprints, piId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PiInfo {\n");
        sb.append("    sprints: ").append(toIndentedString(sprints)).append("\n");
        sb.append("    piId: ").append(toIndentedString(piId)).append("\n");
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
