package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置SQL限流开关请求体
 */
public class SetSqlLimitingSwitchNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_on")

    private Boolean switchOn;

    public SetSqlLimitingSwitchNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public SetSqlLimitingSwitchNewRequestBody withSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
        return this;
    }

    /**
     * 开关状态
     * @return switchOn
     */
    public Boolean getSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetSqlLimitingSwitchNewRequestBody that = (SetSqlLimitingSwitchNewRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.switchOn, that.switchOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, switchOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetSqlLimitingSwitchNewRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    switchOn: ").append(toIndentedString(switchOn)).append("\n");
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
