package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务的输入配置，必填
 */
public class TaskInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<TaskInputData> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcn")

    private TaskInputVcn vcn;

    public TaskInput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 任务的输入类型，创建时必填，视频源类型为video_source 时 不支持切换为其他的type。创建时可选类型有 obs（对象存储服务存储的文件  仅云上任务支持，支持输出到webhook）， url（指定的文件地址或取流地址  仅云上任务支持，支持输出到webhook）， edgecamera（绑定在IEF的边缘摄像头  仅边缘任务支持，支持输出到webhook）, restful（从自定义的流媒体服务器通过Restful接口获取取流地址  云上和边缘任务均支持，支持输出到webhook）， vcn（VCN设备  仅边缘任务支持）, video_source（使用VIAS平台视频中心管理的视频源，云上和边缘任务均支持）， 建议使用video_source类型，其他类型为了兼容老业务，后续将废弃。  枚举值：  - video_source  - obs (不建议使用，后续废弃)  - url (不建议使用，后续废弃)  - edgecamera (不建议使用，后续废弃)  - restful (不建议使用，后续废弃)  - vcn (不建议使用，后续废弃)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TaskInput withData(List<TaskInputData> data) {
        this.data = data;
        return this;
    }

    public TaskInput addDataItem(TaskInputData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public TaskInput withData(Consumer<List<TaskInputData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 任务的输入详情，必填。针对不同的输入类型有不同的配置。创建时允许填写多路输入，但更新时只允许填写一路输入。 当输入类型为：obs，需要配置 bucket，path ， index 。例如：  \"bucket\": \"aicam\", \"path\": \"3rdpartylicenses.txt\", \"index\": 0  当输入类型为：url，需要配置 url， index 。例如： \"url\": \"https://xxx-xxx.com\", \"index\": 0 当输入类型为：restful，需要配置 certificate_check， rtsp_path_in_response， url， index， headers 。例如：\"certificate_check\": true, \"url\": \"https://hsaij-dasahbi.com\", \"rtsp_path_in_response\": \"data/url\", \"index\": 0, \"headers\": { \"AAA\": \"AAA\" } 当输入类型为：vcn，需要配置 device_id， stream_type， index。例如：\"device_id\": \"21356478954612546874#gdhjkiushdgdksjhslmhscjsckjhdbnk\", \"stream_type\": 1, \"index\": 0 当输入类型为：EdgeCamera，需要配置 id， index 例如：\"id\": \"007cdafc-6000-47ce-b0e3-870b4a0db65e\",\"index\": 0
     * @return data
     */
    public List<TaskInputData> getData() {
        return data;
    }

    public void setData(List<TaskInputData> data) {
        this.data = data;
    }

    public TaskInput withVcn(TaskInputVcn vcn) {
        this.vcn = vcn;
        return this;
    }

    public TaskInput withVcn(Consumer<TaskInputVcn> vcnSetter) {
        if (this.vcn == null) {
            this.vcn = new TaskInputVcn();
            vcnSetter.accept(this.vcn);
        }

        return this;
    }

    /**
     * Get vcn
     * @return vcn
     */
    public TaskInputVcn getVcn() {
        return vcn;
    }

    public void setVcn(TaskInputVcn vcn) {
        this.vcn = vcn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskInput that = (TaskInput) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.data, that.data)
            && Objects.equals(this.vcn, that.vcn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data, vcn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    vcn: ").append(toIndentedString(vcn)).append("\n");
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
