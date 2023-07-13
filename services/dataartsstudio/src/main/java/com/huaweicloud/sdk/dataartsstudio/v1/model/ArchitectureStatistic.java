package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ArchitectureStatistic
 */
public class ArchitectureStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<ArchitectureStatistic> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ArchitectureStatistic withChildren(List<ArchitectureStatistic> children) {
        this.children = children;
        return this;
    }

    public ArchitectureStatistic addChildrenItem(ArchitectureStatistic childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ArchitectureStatistic withChildren(Consumer<List<ArchitectureStatistic>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子指标
     * @return children
     */
    public List<ArchitectureStatistic> getChildren() {
        return children;
    }

    public void setChildren(List<ArchitectureStatistic> children) {
        this.children = children;
    }

    public ArchitectureStatistic withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 子指标个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ArchitectureStatistic withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public ArchitectureStatistic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
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
        ArchitectureStatistic that = (ArchitectureStatistic) obj;
        return Objects.equals(this.children, that.children) && Objects.equals(this.count, that.count)
            && Objects.equals(this.guid, that.guid) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(children, count, guid, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArchitectureStatistic {\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
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
