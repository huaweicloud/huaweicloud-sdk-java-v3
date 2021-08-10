package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListMigprojectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migprojects")

    private List<MigprojectsResponseBody> migprojects = null;

    public ListMigprojectsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 查询到的迁移项目的数量 minimum: 0 maximum: 2147483647
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListMigprojectsResponse withMigprojects(List<MigprojectsResponseBody> migprojects) {
        this.migprojects = migprojects;
        return this;
    }

    public ListMigprojectsResponse addMigprojectsItem(MigprojectsResponseBody migprojectsItem) {
        if (this.migprojects == null) {
            this.migprojects = new ArrayList<>();
        }
        this.migprojects.add(migprojectsItem);
        return this;
    }

    public ListMigprojectsResponse withMigprojects(Consumer<List<MigprojectsResponseBody>> migprojectsSetter) {
        if (this.migprojects == null) {
            this.migprojects = new ArrayList<>();
        }
        migprojectsSetter.accept(this.migprojects);
        return this;
    }

    /** 查询到的迁移项目详情
     * 
     * @return migprojects */
    public List<MigprojectsResponseBody> getMigprojects() {
        return migprojects;
    }

    public void setMigprojects(List<MigprojectsResponseBody> migprojects) {
        this.migprojects = migprojects;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMigprojectsResponse listMigprojectsResponse = (ListMigprojectsResponse) o;
        return Objects.equals(this.count, listMigprojectsResponse.count)
            && Objects.equals(this.migprojects, listMigprojectsResponse.migprojects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, migprojects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMigprojectsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    migprojects: ").append(toIndentedString(migprojects)).append("\n");
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
