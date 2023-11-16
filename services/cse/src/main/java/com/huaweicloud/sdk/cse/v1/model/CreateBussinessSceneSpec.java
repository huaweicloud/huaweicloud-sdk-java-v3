package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流量特征描述
 */
public class CreateBussinessSceneSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<CreateBussinessSceneSpecMatches> matches = null;

    public CreateBussinessSceneSpec withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 特征名称
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CreateBussinessSceneSpec withMatches(List<CreateBussinessSceneSpecMatches> matches) {
        this.matches = matches;
        return this;
    }

    public CreateBussinessSceneSpec addMatchesItem(CreateBussinessSceneSpecMatches matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public CreateBussinessSceneSpec withMatches(Consumer<List<CreateBussinessSceneSpecMatches>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 匹配条件定义
     * @return matches
     */
    public List<CreateBussinessSceneSpecMatches> getMatches() {
        return matches;
    }

    public void setMatches(List<CreateBussinessSceneSpecMatches> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBussinessSceneSpec that = (CreateBussinessSceneSpec) obj;
        return Objects.equals(this.alias, that.alias) && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBussinessSceneSpec {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
