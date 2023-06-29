package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 启动裸金属服务器接口请求结构体
 */
public class OsStartBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-start")

    private StartServersInfo osStart;

    public OsStartBody withOsStart(StartServersInfo osStart) {
        this.osStart = osStart;
        return this;
    }

    public OsStartBody withOsStart(Consumer<StartServersInfo> osStartSetter) {
        if (this.osStart == null) {
            this.osStart = new StartServersInfo();
            osStartSetter.accept(this.osStart);
        }

        return this;
    }

    /**
     * Get osStart
     * @return osStart
     */
    public StartServersInfo getOsStart() {
        return osStart;
    }

    public void setOsStart(StartServersInfo osStart) {
        this.osStart = osStart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OsStartBody that = (OsStartBody) obj;
        return Objects.equals(this.osStart, that.osStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osStart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsStartBody {\n");
        sb.append("    osStart: ").append(toIndentedString(osStart)).append("\n");
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
