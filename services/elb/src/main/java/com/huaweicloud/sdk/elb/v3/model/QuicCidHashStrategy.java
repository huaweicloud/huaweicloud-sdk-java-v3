package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数解释：后端服务器组基于部分DST CID的多径分发策略
 */
public class QuicCidHashStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "len")

    private Integer len;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public QuicCidHashStrategy withLen(Integer len) {
        this.len = len;
        return this;
    }

    /**
     * 参数解释：仅当负载均衡算法为QUIC_CID的时候才生效，表示hash的时候取CID的长度。 取值范围：1-20 默认取值：3
     * @return len
     */
    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    public QuicCidHashStrategy withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 参数解释：仅当负载均衡算法为QUIC_CID的时候才生效，表示hash的时候取CID的偏移量。 取值范围：0-19 默认取值：1
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuicCidHashStrategy that = (QuicCidHashStrategy) obj;
        return Objects.equals(this.len, that.len) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(len, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuicCidHashStrategy {\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
