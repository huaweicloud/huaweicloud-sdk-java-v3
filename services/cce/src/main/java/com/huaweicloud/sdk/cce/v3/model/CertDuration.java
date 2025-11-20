package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群证书有效期
 */
public class CertDuration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    public CertDuration withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释：** 集群证书有效时间 **约束限制：** 不涉及 **取值范围：** -1或[1,1827] > - 最小值为1天，最大值为5年，因此取值范围为1-1827（以天为单位，实际上限取决于5年内闰年的数量，例如5年内存在一个闰年则上限为1826天）； > - 若填-1则为最大值5年。  **默认取值：** 不涉及 
     * minimum: -1
     * maximum: 1827
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertDuration that = (CertDuration) obj;
        return Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertDuration {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
