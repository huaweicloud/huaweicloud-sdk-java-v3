package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 集群证书有效期
 */
public class ClusterCertDuration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_at")

    private LocalDate expireAt;

    public ClusterCertDuration withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释：** 集群证书有效时间。 **约束限制：** duration和expire_at参数至少需要指定一个，若同时指定则以expire_at参数为准。 **取值范围：** 最小值为1天，最大值为5年，因此取值范围为1-1827（以天为单位，实际上限取决于5年内闰年的数量，例如5年内存在一个闰年则上限为1826天）；若填-1则为最大值5年 **默认取值：** 不涉及
     * minimum: 1
     * maximum: 1827
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ClusterCertDuration withExpireAt(LocalDate expireAt) {
        this.expireAt = expireAt;
        return this;
    }

    /**
     * **参数解释：** 集群证书到期时间。 **约束限制：** duration和expire_at参数至少需要指定一个，若同时指定则以expire_at参数为准。 **取值范围：** 证书到期时间须在当前时间后15分钟至5年之间，参数格式为：2025-01-01 16:00:00 +0000 UTC。 **默认取值：** 不涉及
     * @return expireAt
     */
    public LocalDate getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(LocalDate expireAt) {
        this.expireAt = expireAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterCertDuration that = (ClusterCertDuration) obj;
        return Objects.equals(this.duration, that.duration) && Objects.equals(this.expireAt, that.expireAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, expireAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterCertDuration {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
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
