package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 输出为dis类型时的配置信息
 */
public class TaskOutputDis {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    private List<String> dataCategory = null;

    public TaskOutputDis withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * DIS流名称，选用dis类型输出时必填，校验规则：^[-A-Za-z0-9_]{1,64}$。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public TaskOutputDis withDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    public TaskOutputDis addDataCategoryItem(String dataCategoryItem) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        this.dataCategory.add(dataCategoryItem);
        return this;
    }

    public TaskOutputDis withDataCategory(Consumer<List<String>> dataCategorySetter) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        dataCategorySetter.accept(this.dataCategory);
        return this;
    }

    /**
     * 任务输出数据类别的列表，选填，仅部分服务需要。当输出类型下有这个列表时，表示希望这个输出类型下存放dataCategory列表内的数据。 【例如创建边缘人脸任务API中，输出结果支持data_category参数，取值范围为[FacaImage,OriginImage],分别表示是否发送人脸图和原始图】
     * @return dataCategory
     */
    public List<String> getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskOutputDis that = (TaskOutputDis) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.dataCategory, that.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutputDis {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    dataCategory: ").append(toIndentedString(dataCategory)).append("\n");
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
