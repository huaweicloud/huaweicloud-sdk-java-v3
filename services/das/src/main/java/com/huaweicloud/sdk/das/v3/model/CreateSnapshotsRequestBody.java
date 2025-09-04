package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSnapshotsRequestBody
 */
public class CreateSnapshotsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<Integer> modules = null;

    public CreateSnapshotsRequestBody withModules(List<Integer> modules) {
        this.modules = modules;
        return this;
    }

    public CreateSnapshotsRequestBody addModulesItem(Integer modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public CreateSnapshotsRequestBody withModules(Consumer<List<Integer>> modulesSetter) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        modulesSetter.accept(this.modules);
        return this;
    }

    /**
     * 需要创建的snapshot类型，0表示元数据锁，1表示innodb等待锁，2表示最近发生的死锁
     * @return modules
     */
    public List<Integer> getModules() {
        return modules;
    }

    public void setModules(List<Integer> modules) {
        this.modules = modules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSnapshotsRequestBody that = (CreateSnapshotsRequestBody) obj;
        return Objects.equals(this.modules, that.modules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotsRequestBody {\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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
