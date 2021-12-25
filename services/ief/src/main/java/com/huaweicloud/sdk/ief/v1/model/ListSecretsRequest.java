package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListSecretsRequest {

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
    @JsonProperty(value = "sort")

    private String sort;

    public ListSecretsRequest withIefInstanceId(String iefInstanceId) {
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

    public ListSecretsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 密钥名称，模糊匹配
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSecretsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量，取值范围1~1000，默认值为1000。
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListSecretsRequest withOffset(String offset) {
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

    public ListSecretsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /** 排序方式，可根据名称、创建时间、更新时间排序 枚举值： - name - created_at - updated_at 默认升序，如sort=name，降序：sort=name%3Adesc
     * 
     * @return sort */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecretsRequest listSecretsRequest = (ListSecretsRequest) o;
        return Objects.equals(this.iefInstanceId, listSecretsRequest.iefInstanceId)
            && Objects.equals(this.name, listSecretsRequest.name)
            && Objects.equals(this.limit, listSecretsRequest.limit)
            && Objects.equals(this.offset, listSecretsRequest.offset)
            && Objects.equals(this.sort, listSecretsRequest.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, name, limit, offset, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecretsRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
