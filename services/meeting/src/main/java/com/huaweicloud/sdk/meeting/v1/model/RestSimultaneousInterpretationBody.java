package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开启/关闭同声传译请求体
 */
public class RestSimultaneousInterpretationBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simultaneousInterpretation")

    private Integer simultaneousInterpretation;

    public RestSimultaneousInterpretationBody withSimultaneousInterpretation(Integer simultaneousInterpretation) {
        this.simultaneousInterpretation = simultaneousInterpretation;
        return this;
    }

    /**
     * * 0：停止同声传译 * 1：启动同声传译 
     * minimum: 0
     * maximum: 1
     * @return simultaneousInterpretation
     */
    public Integer getSimultaneousInterpretation() {
        return simultaneousInterpretation;
    }

    public void setSimultaneousInterpretation(Integer simultaneousInterpretation) {
        this.simultaneousInterpretation = simultaneousInterpretation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestSimultaneousInterpretationBody that = (RestSimultaneousInterpretationBody) obj;
        return Objects.equals(this.simultaneousInterpretation, that.simultaneousInterpretation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simultaneousInterpretation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSimultaneousInterpretationBody {\n");
        sb.append("    simultaneousInterpretation: ").append(toIndentedString(simultaneousInterpretation)).append("\n");
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
