package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 全量SQL开关记录
 */
public class SqlTypeRangeConfigResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open")

    private Boolean isOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    public SqlTypeRangeConfigResult withIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    /**
     * **参数解释**: 是否开启全量SQL。 **取值范围**: - true：已开启。 - false：已关闭。
     * @return isOpen
     */
    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public SqlTypeRangeConfigResult withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**: 开关状态持续的开始时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量。 **取值范围**: 不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlTypeRangeConfigResult that = (SqlTypeRangeConfigResult) obj;
        return Objects.equals(this.isOpen, that.isOpen) && Objects.equals(this.beginTime, that.beginTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen, beginTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlTypeRangeConfigResult {\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
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
