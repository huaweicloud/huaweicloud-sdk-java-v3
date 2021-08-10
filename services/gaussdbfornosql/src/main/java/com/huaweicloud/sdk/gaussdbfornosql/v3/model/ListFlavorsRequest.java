package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListFlavorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    public ListFlavorsRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /** 实例所在区域。
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListFlavorsRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /** 数据库类型。 - 取值为“cassandra”，表示查询GaussDB(for Cassandra)数据库实例支持的规格。 - 取值为“mongodb”，表示查询GaussDB(for Mongo)数据库实例支持的规格。 -
     * 取值为“influxdb”，表示查询GaussDB(for Influx)数据库实例支持的规格。 - 如果不传该参数，默认为“cassandra”。
     * 
     * @return engineName */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorsRequest listFlavorsRequest = (ListFlavorsRequest) o;
        return Objects.equals(this.region, listFlavorsRequest.region)
            && Objects.equals(this.engineName, listFlavorsRequest.engineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, engineName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
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
