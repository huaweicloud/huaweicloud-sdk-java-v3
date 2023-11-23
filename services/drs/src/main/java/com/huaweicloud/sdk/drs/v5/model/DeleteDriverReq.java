package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteDriverReq
 */
public class DeleteDriverReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_names")

    private List<String> driverNames = null;

    public DeleteDriverReq withDriverNames(List<String> driverNames) {
        this.driverNames = driverNames;
        return this;
    }

    public DeleteDriverReq addDriverNamesItem(String driverNamesItem) {
        if (this.driverNames == null) {
            this.driverNames = new ArrayList<>();
        }
        this.driverNames.add(driverNamesItem);
        return this;
    }

    public DeleteDriverReq withDriverNames(Consumer<List<String>> driverNamesSetter) {
        if (this.driverNames == null) {
            this.driverNames = new ArrayList<>();
        }
        driverNamesSetter.accept(this.driverNames);
        return this;
    }

    /**
     * jdbc驱动文件列表，列表长度1-20，driver_name的长度5-64，结尾以.jar结尾。
     * @return driverNames
     */
    public List<String> getDriverNames() {
        return driverNames;
    }

    public void setDriverNames(List<String> driverNames) {
        this.driverNames = driverNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDriverReq that = (DeleteDriverReq) obj;
        return Objects.equals(this.driverNames, that.driverNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDriverReq {\n");
        sb.append("    driverNames: ").append(toIndentedString(driverNames)).append("\n");
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
