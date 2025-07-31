package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自启动项统计信息
 */
public class AutoLaunchStatisticsResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    public AutoLaunchStatisticsResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 自启动项名称 **取值范围**: 字符长度1-256位 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutoLaunchStatisticsResponseInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 自启动项类型 **取值范围**: - 0：自启动服务 - 1：定时任务 - 2：预加载动态库 - 3：Run注册表键 - 4：开机启动文件夹 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AutoLaunchStatisticsResponseInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释**: 当前自启动项的主机数量 **取值范围**: 最小值0，最大值10000 
     * minimum: 0
     * maximum: 10000
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
        AutoLaunchStatisticsResponseInfo that = (AutoLaunchStatisticsResponseInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoLaunchStatisticsResponseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
