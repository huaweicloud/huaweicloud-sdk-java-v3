package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 节点类型对象 */
public class NodeTypes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Detail detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_name")

    private String specName;

    public NodeTypes withDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    public NodeTypes withDetail(Consumer<Detail> detailSetter) {
        if (this.detail == null) {
            this.detail = new Detail();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /** Get detail
     * 
     * @return detail */
    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public NodeTypes withId(String id) {
        this.id = id;
        return this;
    }

    /** 节点类型ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeTypes withSpecName(String specName) {
        this.specName = specName;
        return this;
    }

    /** Get specName
     * 
     * @return specName */
    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeTypes nodeTypes = (NodeTypes) o;
        return Objects.equals(this.detail, nodeTypes.detail) && Objects.equals(this.id, nodeTypes.id)
            && Objects.equals(this.specName, nodeTypes.specName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, id, specName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTypes {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    specName: ").append(toIndentedString(specName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
