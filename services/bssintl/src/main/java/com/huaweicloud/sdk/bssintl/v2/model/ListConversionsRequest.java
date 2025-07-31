package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListConversionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_type")

    private Integer measureType;

    public ListConversionsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言，字段预留。默认zh_CN，枚举：zh_CN：中文 en_US：英文
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListConversionsRequest withMeasureType(Integer measureType) {
        this.measureType = measureType;
        return this;
    }

    /**
     * 度量类型。1：货币 2：时长 3：流量 4：数量 7：容量 9：行数 10：周期 11：频率 12：个数 16：带宽速率 19：带宽速率（1000进制） 20：性能测试用量 27：核数*时长 28：内存*时长 29：IOPS*时长 30：吞吐量*时长 31：个/时长 40：流量（1000进制） 41：1K Tokens 108：数量*时长。此参数不携带或携带值为空或携带值为null时，不作为筛选条件；不支持携带值为空串。
     * @return measureType
     */
    public Integer getMeasureType() {
        return measureType;
    }

    public void setMeasureType(Integer measureType) {
        this.measureType = measureType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConversionsRequest that = (ListConversionsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.measureType, that.measureType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, measureType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConversionsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    measureType: ").append(toIndentedString(measureType)).append("\n");
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
