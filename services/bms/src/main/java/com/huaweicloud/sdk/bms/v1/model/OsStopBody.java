package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 关闭裸金属服务器接口请求结构体 */
public class OsStopBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-stop")

    private OsStopBodyType osStop;

    public OsStopBody withOsStop(OsStopBodyType osStop) {
        this.osStop = osStop;
        return this;
    }

    public OsStopBody withOsStop(Consumer<OsStopBodyType> osStopSetter) {
        if (this.osStop == null) {
            this.osStop = new OsStopBodyType();
            osStopSetter.accept(this.osStop);
        }

        return this;
    }

    /** Get osStop
     * 
     * @return osStop */
    public OsStopBodyType getOsStop() {
        return osStop;
    }

    public void setOsStop(OsStopBodyType osStop) {
        this.osStop = osStop;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsStopBody osStopBody = (OsStopBody) o;
        return Objects.equals(this.osStop, osStopBody.osStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osStop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsStopBody {\n");
        sb.append("    osStop: ").append(toIndentedString(osStop)).append("\n");
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
