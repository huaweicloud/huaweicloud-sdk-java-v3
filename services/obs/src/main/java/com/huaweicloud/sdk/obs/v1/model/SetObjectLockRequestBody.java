package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlBody;

import java.util.Objects;

/**
 * 参数解释： 对象级WORM保护策略配置的容器，Retention是Mode、RetainUntilDate的父节点。 约束限制： 不涉及 取值范围： 请详见Retention参数说明。 默认取值： 不涉及 
 */
@JacksonXmlRootElement(localName = "Retention")
public class SetObjectLockRequestBody extends SdkXmlBody<SetObjectLockRequestBody> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Mode")

    @JacksonXmlProperty(localName = "Mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "RetainUntilDate")

    @JacksonXmlProperty(localName = "RetainUntilDate")

    private Object retainUntilDate;

    public SetObjectLockRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 参数解释： 对象的保护策略。 约束限制： 不涉及 取值范围： COMPLIANCE：合规模式 默认取值： 不涉及 
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public SetObjectLockRequestBody withRetainUntilDate(Object retainUntilDate) {
        this.retainUntilDate = retainUntilDate;
        return this;
    }

    /**
     * 参数解释： 对象的保护期限，时间戳格式，精确到毫秒级，如2015年7月1日13点20分35秒对应的值为1435728035000。 示例：1435728035000 约束限制： 该字段必须晚于当前时间，且仅可延长不能缩短。 取值范围： 不涉及 默认取值： 不涉及 
     * @return retainUntilDate
     */
    public Object getRetainUntilDate() {
        return retainUntilDate;
    }

    public void setRetainUntilDate(Object retainUntilDate) {
        this.retainUntilDate = retainUntilDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetObjectLockRequestBody that = (SetObjectLockRequestBody) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.retainUntilDate, that.retainUntilDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, retainUntilDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetObjectLockRequestBody {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    retainUntilDate: ").append(toIndentedString(retainUntilDate)).append("\n");
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
