package com.huaweicloud.sdk.bss.v2.model;

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
     * 语言。zh_CN：中文en_US：英文缺省为zh_CN。
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
     * 度量类型。1：货币2：时长3：流量4：数量6：长度7：容量9：行数10：周期11：频率12：个数15：容量*时长16：带宽速率17：容量时长18：查询速率19：带宽速率（1000进制）20：性能测试用量21：面积22：视频23：吞吐量24：分辨率26：通用资源包抵扣单位27：核数*时长28：内存*时长29：IOPS*时长30：吞吐量*时长31：个/时长40：流量（1000进制）41：1K Tokens82：帧98：缓存带宽x时长此参数不携带或携带值为空或携带值为null时，不作为筛选条件。
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
