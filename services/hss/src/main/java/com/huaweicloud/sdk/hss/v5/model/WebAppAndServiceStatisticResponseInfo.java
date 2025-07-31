package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WebAppAndServiceStatisticResponseInfo
 */
public class WebAppAndServiceStatisticResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    public WebAppAndServiceStatisticResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * WebAppAndService资产名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebAppAndServiceStatisticResponseInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * WebAppAndService资产--具备该资产的主机数量
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebAppAndServiceStatisticResponseInfo that = (WebAppAndServiceStatisticResponseInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebAppAndServiceStatisticResponseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
