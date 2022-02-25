package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** QosQualityData */
public class QosQualityData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerid")

    private String peerid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mid")

    private String mid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<TimeFloatValueData> data = null;

    public QosQualityData withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /** 用户id
     * 
     * @return uid */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public QosQualityData withPeerid(String peerid) {
        this.peerid = peerid;
        return this;
    }

    /** 对端的用户ID，为0时表示本端上行数据
     * 
     * @return peerid */
    public String getPeerid() {
        return peerid;
    }

    public void setPeerid(String peerid) {
        this.peerid = peerid;
    }

    public QosQualityData withMid(String mid) {
        this.mid = mid;
        return this;
    }

    /** 指标ID
     * 
     * @return mid */
    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public QosQualityData withData(List<TimeFloatValueData> data) {
        this.data = data;
        return this;
    }

    public QosQualityData addDataItem(TimeFloatValueData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public QosQualityData withData(Consumer<List<TimeFloatValueData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /** 时间戳及相应时间的指标数值列表
     * 
     * @return data */
    public List<TimeFloatValueData> getData() {
        return data;
    }

    public void setData(List<TimeFloatValueData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QosQualityData qosQualityData = (QosQualityData) o;
        return Objects.equals(this.uid, qosQualityData.uid) && Objects.equals(this.peerid, qosQualityData.peerid)
            && Objects.equals(this.mid, qosQualityData.mid) && Objects.equals(this.data, qosQualityData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, peerid, mid, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QosQualityData {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    peerid: ").append(toIndentedString(peerid)).append("\n");
        sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
