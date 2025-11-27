package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleSpec
 */
public class RuleSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iamUserIDs")

    private List<String> iamUserIDs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<Content> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public RuleSpec withIamUserIDs(List<String> iamUserIDs) {
        this.iamUserIDs = iamUserIDs;
        return this;
    }

    public RuleSpec addIamUserIDsItem(String iamUserIDsItem) {
        if (this.iamUserIDs == null) {
            this.iamUserIDs = new ArrayList<>();
        }
        this.iamUserIDs.add(iamUserIDsItem);
        return this;
    }

    public RuleSpec withIamUserIDs(Consumer<List<String>> iamUserIDsSetter) {
        if (this.iamUserIDs == null) {
            this.iamUserIDs = new ArrayList<>();
        }
        iamUserIDsSetter.accept(this.iamUserIDs);
        return this;
    }

    /**
     * 权限策略关联的IAM用户信息
     * @return iamUserIDs
     */
    public List<String> getIamUserIDs() {
        return iamUserIDs;
    }

    public void setIamUserIDs(List<String> iamUserIDs) {
        this.iamUserIDs = iamUserIDs;
    }

    public RuleSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 权限策略类型，只允许四种类型：readonly/develop/admin/custom
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleSpec withContents(List<Content> contents) {
        this.contents = contents;
        return this;
    }

    public RuleSpec addContentsItem(Content contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public RuleSpec withContents(Consumer<List<Content>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 权限策略内容
     * @return contents
     */
    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public RuleSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 权限策略描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleSpec that = (RuleSpec) obj;
        return Objects.equals(this.iamUserIDs, that.iamUserIDs) && Objects.equals(this.type, that.type)
            && Objects.equals(this.contents, that.contents) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamUserIDs, type, contents, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSpec {\n");
        sb.append("    iamUserIDs: ").append(toIndentedString(iamUserIDs)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
