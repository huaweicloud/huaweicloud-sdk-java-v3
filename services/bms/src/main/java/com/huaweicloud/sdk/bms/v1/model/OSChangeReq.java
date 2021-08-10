package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 切换裸金属服务器操作系统接口请求结构体 */
public class OSChangeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-change")

    private OsChange osChange;

    public OSChangeReq withOsChange(OsChange osChange) {
        this.osChange = osChange;
        return this;
    }

    public OSChangeReq withOsChange(Consumer<OsChange> osChangeSetter) {
        if (this.osChange == null) {
            this.osChange = new OsChange();
            osChangeSetter.accept(this.osChange);
        }

        return this;
    }

    /** Get osChange
     * 
     * @return osChange */
    public OsChange getOsChange() {
        return osChange;
    }

    public void setOsChange(OsChange osChange) {
        this.osChange = osChange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OSChangeReq osChangeReq = (OSChangeReq) o;
        return Objects.equals(this.osChange, osChangeReq.osChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osChange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OSChangeReq {\n");
        sb.append("    osChange: ").append(toIndentedString(osChange)).append("\n");
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
