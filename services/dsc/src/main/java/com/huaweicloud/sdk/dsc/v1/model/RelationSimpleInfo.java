package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RelationSimpleInfo
 */
public class RelationSimpleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private Integer riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public RelationSimpleInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 关系信息ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RelationSimpleInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 关系信息名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RelationSimpleInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 关系信息路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RelationSimpleInfo withRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public RelationSimpleInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 关系信息类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelationSimpleInfo relationSimpleInfo = (RelationSimpleInfo) o;
        return Objects.equals(this.id, relationSimpleInfo.id) && Objects.equals(this.name, relationSimpleInfo.name)
            && Objects.equals(this.path, relationSimpleInfo.path)
            && Objects.equals(this.riskLevel, relationSimpleInfo.riskLevel)
            && Objects.equals(this.type, relationSimpleInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, path, riskLevel, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationSimpleInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
