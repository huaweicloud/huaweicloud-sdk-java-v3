package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListAppsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    public ListAppsRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /** 铂金版实例ID，专业版实例为空值
     * 
     * @return iefInstanceId */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public ListAppsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 应用模板名称，模糊匹配
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAppsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量，取值范围1~1000，默认为1000
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListAppsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /** 查询的起始位置，取值范围为非负整数，默认为0
     * 
     * @return offset */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListAppsRequest withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /** 通过别名过滤，模糊匹配
     * 
     * @return alias */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ListAppsRequest withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /** public：公共模板，只有管理员才能创建 private：用户创建的应用模板，默认 shared：第三方应用，其他用户共享类型的模板（保留，未实现）
     * 
     * @return visibility */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppsRequest listAppsRequest = (ListAppsRequest) o;
        return Objects.equals(this.iefInstanceId, listAppsRequest.iefInstanceId)
            && Objects.equals(this.name, listAppsRequest.name) && Objects.equals(this.limit, listAppsRequest.limit)
            && Objects.equals(this.offset, listAppsRequest.offset) && Objects.equals(this.alias, listAppsRequest.alias)
            && Objects.equals(this.visibility, listAppsRequest.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, name, limit, offset, alias, visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppsRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
